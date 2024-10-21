package com.example.budgeto.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.state.LoginState
import com.example.budgeto.utils.Resource
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class LoginViewModel(
    //private val repository: AuthRepository // Passing repository manually
) : ViewModel() {

    private val _loginState = MutableStateFlow(LoginState()) // Initialize with default values
    val loginState: StateFlow<LoginState> = _loginState

    fun loginUser(email: String, password: String) {
        viewModelScope.launch {
            _loginState.value = LoginState(isLoading = true) // Start loading
            try {
                // Simulate login logic (replace this with your actual login logic)
                if (email == "test@test.com" && password == "123") {
                    _loginState.value = LoginState(isSuccess = "Login successful!") // Success case
                } else {
                    _loginState.value = LoginState(isError = "Invalid email or password") // Error case
                }
            } catch (e: Exception) {
                _loginState.value = LoginState(isError = "Login failed: ${e.message}") // Handle exceptions
            }
        }
    }
//    private val _loginState = Channel<LoginState>()
//    val loginState = _loginState.receiveAsFlow()
//
//    fun loginUser(email: String, password: String) = viewModelScope.launch {
//        repository.login(email, password).collect { result ->
//            when (result) {
//                is Resource.Success -> {
//                    _loginState.send(LoginState(isSuccess = "Login success"))
//                }
//                is Resource.Loading -> {
//                    _loginState.send(LoginState(isLoading = true))
//                }
//                is Resource.Error -> {
//                    _loginState.send(LoginState(isError = result.message))
//                }
//            }
//        }
//    }
//
//    fun signUpUser(email: String, password: String) = viewModelScope.launch {
//        repository.signUp(email, password).collect { result ->
//            when (result) {
//                is Resource.Success -> {
//                    _loginState.send(LoginState(isSuccess = "Sign up success"))
//                }
//                is Resource.Loading -> {
//                    _loginState.send(LoginState(isLoading = true))
//                }
//                is Resource.Error -> {
//                    _loginState.send(LoginState(isError = result.message))
//                }
//            }
//        }
//    }
}
