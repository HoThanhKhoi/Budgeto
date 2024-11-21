package com.example.budgeto.data.model.transfer

import com.google.firebase.Timestamp

data class Transfer(
    val id: String = "",
    val fromAccountId: String = "",
    val toAccountId: String = "",
    val amount: Double = 0.0,
    val description: String = "",
    val date: Timestamp = Timestamp.now(),
)