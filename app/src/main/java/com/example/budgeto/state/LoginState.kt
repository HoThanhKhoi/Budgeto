package com.example.budgeto.state

data class LoginState (
    val isLoading: Boolean = false,
    val isSuccess: String? = "",
    val isError: String? = ""
)