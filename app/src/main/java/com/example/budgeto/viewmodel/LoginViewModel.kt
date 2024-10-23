package com.example.budgeto.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.model.GameInfo
import com.example.budgeto.data.model.GeneralInfo
import com.example.budgeto.data.model.User
import com.example.budgeto.data.repository.user.UserRepository
import com.example.budgeto.state.GoogleLoginState
import com.example.budgeto.state.LoginState
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: AuthRepository,
    private val userRepository: UserRepository
) : ViewModel() {
    private val _loginState = Channel<LoginState>()
    val loginState = _loginState.receiveAsFlow()

    val _googleState = mutableStateOf(GoogleLoginState())
    val googleState: State<GoogleLoginState> = _googleState

    fun loginUser(email: String, password: String) = viewModelScope.launch {
        repository.login(email, password).collect { result ->
            when (result) {
                is Resource.Success -> {
                    _loginState.send(LoginState(isSuccess = "Login success"))
                }

                is Resource.Loading -> {
                    _loginState.send(LoginState(isLoading = true))
                }

                is Resource.Error -> {
                    _loginState.send(LoginState(isError = result.message))
                }
            }
        }
    }

    fun googleLogin(credential: AuthCredential) = viewModelScope.launch {
        repository.googleSignIn(credential).collect { result ->
            when (result) {
                is Resource.Success -> {
                    val firebaseUser = result.data?.user
                    firebaseUser?.let {
                        // Check if the user exists in Firestore
                        val userId = firebaseUser.uid
                        val userInFirestore = userRepository.getUser(userId)

                        if (userInFirestore == null) {
                            // If the user doesn't exist in Firestore, create a new user document
                            addNewUserToFirestore(firebaseUser)
                        }
                        _googleState.value = GoogleLoginState(success = result.data)
                    }
                }

                is Resource.Loading -> {
                    _googleState.value = GoogleLoginState(loading = true)
                }

                is Resource.Error -> {
                    _googleState.value = GoogleLoginState(error = result.message!!)
                }
            }

        }
    }

    private suspend fun addNewUserToFirestore(firebaseUser: FirebaseUser) {
        val generalInfo = GeneralInfo(
            email = firebaseUser.email ?: "",
            fullName = firebaseUser.displayName ?: "",
            imgURL = firebaseUser.photoUrl?.toString() ?: ""
        )

        val gameInfo = GameInfo()

        val user = User(
            userId = firebaseUser.uid,
        )

        userRepository.addUser(user)
        userRepository.addGeneralInfo(userId = firebaseUser.uid, generalInfo = generalInfo)
        userRepository.addGameInfo(userId = firebaseUser.uid, gameInfo = gameInfo)
    }

}
