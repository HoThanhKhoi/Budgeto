package com.example.budgeto.viewmodel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.model.user.UserGeneralInfo
import com.example.budgeto.data.model.user.User
import com.example.budgeto.data.repository.user.UserRepository
import com.example.budgeto.state.GoogleLoginState
import com.example.budgeto.state.LoginState
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: AuthRepository,
    private val userRepository: UserRepository
) : ViewModel() {
    private val _loginState = MutableStateFlow(LoginState())
    val loginState = _loginState.asStateFlow()

    val _googleState = mutableStateOf(GoogleLoginState())
    val googleState: State<GoogleLoginState> = _googleState

    fun isUserLoggedIn(): Boolean{
        return repository.getCurrentUser() != null
    }

    fun loginUser(email: String, password: String) = viewModelScope.launch {
        Log.d("Login", "loginUser called with email: $email and password: $password")
        repository.login(email, password).collect { result ->
            when (result) {
                is Resource.Success -> {
                    Log.d("Login", "Login success with user ID: ${result.data?.user?.uid}")
                    _loginState.value = LoginState(isSuccess = "Login success") // Emit success state
                }
                is Resource.Loading -> {
                    Log.d("Login", "Loading...")
                }
                is Resource.Error -> {
                    Log.d("Login", "Login fail with error: ${result.message}")
                    _loginState.value = LoginState(isError = result.message) // Emit error state
                }
            }
        }
    }

    fun googleLogin(credential: AuthCredential) = viewModelScope.launch {
        Log.d("Login with google", "Google login")

        repository.googleSignIn(credential).collect { result ->
            when (result) {
                is Resource.Success -> {
                    val firebaseUser = result.data?.user
                    firebaseUser?.let {
                        val userId = firebaseUser.uid
                        val userInFirestore = userRepository.getUser(userId)

                        if (userInFirestore == null) {
                            addNewUserToFirestore(firebaseUser)
                        }

                        Log.d("Login with google", "Login success with user ID: $userId")
                        _loginState.value = LoginState(isSuccess = "Login success") // Emit success state
                    }
                }

                is Resource.Loading -> {
                    _googleState.value = GoogleLoginState(loading = true)
                }

                is Resource.Error -> {
                    _loginState.value = LoginState(isError = result.message)
                }
            }

        }
    }

    private suspend fun addNewUserToFirestore(firebaseUser: FirebaseUser) {
        val userGeneralInfo = UserGeneralInfo(
            email = firebaseUser.email ?: "",
            fullName = firebaseUser.displayName ?: "",
            imgURL = firebaseUser.photoUrl?.toString() ?: ""
        )

        val user = User(
            userId = firebaseUser.uid,
        )

        userRepository.addUser(user, userGeneralInfo)
    }

    fun resetLoginState() {
        _loginState.value = LoginState() // Reset to idle state
    }
}
