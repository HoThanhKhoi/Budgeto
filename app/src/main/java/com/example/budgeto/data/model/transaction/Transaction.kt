package com.example.budgeto.data.model.transaction

import com.example.budgeto.data.enums.transaction.TransactionType
import com.google.firebase.Timestamp
import java.text.SimpleDateFormat
import java.util.Locale

data class Transaction(
    val id: String = "",
    val accountId: String = "",
    val categoryId: String = "",
    val amount: Double = 0.0,
    val description: String = "",
    val date: String = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Timestamp.now().toDate()),
    val type: TransactionType = TransactionType.EXPENSE,
    val createdTime: Timestamp = Timestamp.now(),
    val note: String = "${type.name} at ${createdTime.toDate()}",
    val userId: String = ""
)
