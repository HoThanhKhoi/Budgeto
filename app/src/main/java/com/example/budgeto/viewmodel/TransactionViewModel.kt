package com.example.budgeto.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.enums.transaction.TransactionType
import com.example.budgeto.data.model.transaction.Transaction
import com.example.budgeto.data.repository.account.AccountRepository
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
    private val transactionRepository: TransactionRepository,
    private val accountRepository: AccountRepository
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

            try
            {
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
            catch (ex: Exception)
            {
                Log.d("Add transaction","error: " + ex.message.toString())
            }

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

    fun fetchTransactionsWithAccountNames(onDataReady: (List<Pair<Transaction, String>>) -> Unit) {
        viewModelScope.launch {
            try {
                if (userId != null) {
                    val transactionList = transactionRepository.getAllTransactions(userId)
                    val accounts = accountRepository.getAllAccount(userId)

                    // Create a map of accountId -> accountName
                    val accountIdToNameMap = accounts.associateBy({ it.id }, { it.name })

                    // Pair each transaction with its account name
                    val transactionsWithAccountNames = transactionList.map { transaction ->
                        transaction to (accountIdToNameMap[transaction.accountId] ?: "Default Account")
                    }

                    onDataReady(transactionsWithAccountNames)
                }
            } catch (ex: Exception) {
                Log.d("FetchTransactions", "Error: ${ex.message}")
            }
        }
    }

//    // Update Transaction
//    fun updateTransaction(transaction: Transaction) {
//        viewModelScope.launch {
//            try {
//                transactionRepository.update(transaction.id, transaction)
//                fetchTransactions() // Refresh the list
//            } catch (ex: Exception) {
//                Log.d("UpdateTransaction", "Error: ${ex.message}")
//            }
//        }
//    }
//
//    // Delete Transaction
//    fun deleteTransaction(transactionId: String) {
//        viewModelScope.launch {
//            try {
//                transactionRepository.delete(transactionId)
//                fetchTransactions() // Refresh the list
//            } catch (ex: Exception) {
//                Log.d("DeleteTransaction", "Error: ${ex.message}")
//            }
//        }
//    }

}