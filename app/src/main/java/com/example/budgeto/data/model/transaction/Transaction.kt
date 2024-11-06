package com.example.budgeto.data.model.transaction

import com.example.budgeto.data.enums.transaction.TransactionType
import com.google.firebase.Timestamp

data class Transaction(
    val accountId: String = "",
    val categoryId: String = "",
    val amount: Double = 0.0,
    val description: String = "",
    val date: String = Timestamp.now().toDate().toString(),
    val type: TransactionType = TransactionType.EXPENSE,
    val createdTime: Timestamp = Timestamp.now(),
    val note: String = "${type.name} at ${createdTime.toDate()}"
)
