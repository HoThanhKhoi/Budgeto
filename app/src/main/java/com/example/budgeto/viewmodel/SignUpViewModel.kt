package com.example.budgeto.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.model.user.UserGeneralInfo
import com.example.budgeto.data.model.user.User
import com.example.budgeto.data.repository.user.UserRepository
import com.example.budgeto.state.SignUpState
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val userRepository: UserRepository
): ViewModel() {

    val _signUpState = Channel<SignUpState>()
    val signUpState = _signUpState.receiveAsFlow()

    fun registerUser(email: String, password: String, fullname: String) = viewModelScope.launch {

        authRepository.signUp(email, password).collect { result ->
            when (result) {
                is Resource.Success -> {
                    Log.d("SignUpButton", "Signup button presses")

                    val firebaseUser = result.data?.user
                    firebaseUser?.let {
                        addNewUserToFirestore(it, fullname)
                        _signUpState.send(SignUpState(isSuccess = "Sign Up success"))
                    }?:run {
                        _signUpState.send(SignUpState(isError = "Failed to retrieve Firebase user"))
                    }

                }
                is Resource.Loading -> {
                    _signUpState.send(SignUpState(isLoading = true))
                }

                is Resource.Error -> {
                    _signUpState.send(SignUpState(isError = result.message))
                    Log.d("Error", "Signup button presses")

                }
            }
        }
    }

    private suspend fun addNewUserToFirestore(firebaseUser: FirebaseUser, fullname: String)
    {
        val userGeneralInfo = UserGeneralInfo(
            email = firebaseUser.email.toString(),
            fullName = fullname
        )

        val user = User(
            userId = firebaseUser.uid,
        )

        userRepository.addUser(user, userGeneralInfo)
    }
}