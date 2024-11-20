package com.example.budgeto.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.enums.transaction.TransactionType
import com.example.budgeto.data.model.transaction.Transaction
import com.example.budgeto.data.repository.transaction.TransactionRepository
import com.google.firebase.Timestamp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
class TransactionViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val transactionRepository: TransactionRepository
) : ViewModel() {

    val userId = authRepository.getCurrentUserId()
    var transactions: List<Transaction> = emptyList()

    init {
        fetchTransactions()
    }

    fun addTransaction(
        accountId: String?,
        categoryId: String?,
        amount: Double = 0.0,
        description: String?,
        type: TransactionType,
        note: String?
    ) {
        viewModelScope.launch {

            if(userId == null)
            {
                return@launch
            }

            val createdTime = Timestamp.now()
            if(amount == 0.0)
            {
                return@launch
            }

            val transaction = Transaction(
                accountId = accountId?:"",
                categoryId = categoryId?:"",
                amount = amount,
                description = description?:"",
                type = TransactionType.EXPENSE,
                createdTime = Timestamp.now(),
                date = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Timestamp.now().toDate()),
                note = note ?: "${type.name} at ${createdTime.toDate()}",
                userId = userId?:""
            )

            transactionRepository.add(transaction)
            fetchTransactions()
        }
    }

    fun fetchTransactions() {
        viewModelScope.launch {
            try {
                if(userId != null)
                {
                    transactions = transactionRepository.getAllTransactions(userId)
                }
            }
            catch (ex: Exception)
            {
                Log.d("Get all transactions","error: " + ex.message.toString())
            }

        }
    }
}