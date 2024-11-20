package com.example.budgeto.state

data class AddAccountState(
    val error: String? = null,
    val isLoading: Boolean = false,
    val success: Boolean = false
)
