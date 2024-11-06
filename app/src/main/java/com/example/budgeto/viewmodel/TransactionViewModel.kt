package com.example.budgeto.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.enums.transaction.TransactionType
import com.example.budgeto.data.model.transaction.Transaction
import com.example.budgeto.data.repository.transaction.TransactionRepository
import com.google.firebase.Timestamp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TransactionViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val transactionRepository: TransactionRepository
):ViewModel(){

    val userId = authRepository.getCurrentUserId()

    fun addTransaction(
        accountId: String?,
        categoryId: String?,
        amount: Double = 0.0,
        description: String?,
        type: TransactionType,
        note: String?
    ) {
        viewModelScope.launch {
            val createdTime = Timestamp.now()
            val transaction = Transaction(
                accountId = accountId ?: "",
                categoryId = categoryId ?: "",
                amount = amount,
                description = description ?: "",
                type = type,
                createdTime = createdTime,
                date = createdTime.toDate().toString(),
                note = note?: "${type.name} at ${createdTime.toDate()}"
            )

            if (userId != null) {
                transactionRepository.addTransaction(userId, transaction)
            }
        }

    }
}