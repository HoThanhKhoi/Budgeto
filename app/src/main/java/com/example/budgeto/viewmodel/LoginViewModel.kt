package com.example.budgeto.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.state.GoogleLoginState
import com.example.budgeto.state.LoginState
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.AuthCredential
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val repository: AuthRepository) : ViewModel() {
    val _loginState = Channel<LoginState>()
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
                    _googleState.value = GoogleLoginState(success = result.data)
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
}