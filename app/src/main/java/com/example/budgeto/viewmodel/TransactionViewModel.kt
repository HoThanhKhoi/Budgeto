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
import com.example.budgeto.data.repository.user.UserMoneyInfoRepository
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
    private val accountRepository: AccountRepository,
    private val userMoneyInfoRepository: UserMoneyInfoRepository
) : ViewModel() {

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
                if(authRepository.getCurrentUserId() == null || accountId == null || categoryId == null)
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
                    type = type,
                    createdTime = Timestamp.now(),
                    date = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Timestamp.now().toDate()),
                    note = note ?: "${type.name} at ${createdTime.toDate()}",
                    userId = authRepository.getCurrentUserId()?:""
                )

                transactionRepository.addTransaction(transaction)

                recalculateData(accountId)

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
                if(authRepository.getCurrentUserId() != null)
                {
                    transactions = transactionRepository.getAllTransactions(authRepository.getCurrentUserId()?:"")
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
                if (authRepository.getCurrentUserId() != null) {
                    val transactionList = transactionRepository.getAllTransactions(authRepository.getCurrentUserId()?:"")
                    val accounts = accountRepository.getAllAccount(authRepository.getCurrentUserId()?:"")

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

    fun updateTransaction(transactionId: String, updatedTransaction: Transaction) {
        viewModelScope.launch {
            try {
                if (authRepository.getCurrentUserId() == null) return@launch

                val transaction = transactionRepository.getById(transactionId)
                val accountId = transaction?.accountId

                val isUpdated = transactionRepository.update(transactionId, updatedTransaction)

                if (isUpdated) {
                    recalculateData(accountId)
                    fetchTransactions() // Refresh the transaction list
                    Log.d("UpdateTransaction", "Transaction updated successfully")
                } else {
                    Log.d("UpdateTransaction", "Failed to update the transaction")
                }
            } catch (ex: Exception) {
                Log.d("UpdateTransaction", "Error: ${ex.message}")
            }
        }
    }

    fun deleteTransaction(transactionId: String) {
        viewModelScope.launch {
            try {
                if (authRepository.getCurrentUserId() == null) return@launch

                val transaction = transactionRepository.getById(transactionId)
                val accountId = transaction?.accountId

                val isDeleted = transactionRepository.delete(transactionId)

                if (isDeleted) {
                    recalculateData(accountId)
                    fetchTransactions() // Refresh the transaction list
                    Log.d("DeleteTransaction", "Transaction deleted successfully")
                } else {
                    Log.d("DeleteTransaction", "Failed to delete the transaction")
                }
            } catch (ex: Exception) {
                Log.d("DeleteTransaction", "Error: ${ex.message}")
            }
        }
    }

    private fun recalculateAccountData(accountId: String?){
        viewModelScope.launch {
            Log.d("Recalculate account data", "Account ID: $accountId")
            var transactionListByAccount = transactionRepository.getAllTransactionsByAccountId(accountId?:"")

            Log.d("Recalculate account data", "Transaction list size: ${transactionListByAccount.size}")

            var accountTotalBalance = 0.0
            var accountTotalIncome = 0.0
            var accountTotalExpense = 0.0

            for(transaction in transactionListByAccount){
                if(transaction.type == TransactionType.INCOME){
                    accountTotalIncome += transaction.amount
                    accountTotalBalance += transaction.amount
                }
                else {
                    accountTotalExpense += transaction.amount
                    accountTotalBalance -= transaction.amount
                }
            }

            Log.d("Recalculate account data", "Total balance: $accountTotalBalance")
            Log.d("Recalculate account data", "Total income: $accountTotalIncome")
            Log.d("Recalculate account data", "Total expense: $accountTotalExpense")

            accountRepository.updateField(
                id = accountId?:"",
                field = "balance",
                value = accountTotalBalance
            )

            accountRepository.updateField(
                id = accountId?:"",
                field = "income",
                value = accountTotalIncome
            )

            accountRepository.updateField(
                id = accountId?:"",
                field = "expense",
                value = accountTotalExpense
            )
        }
    }

    private fun recalculateMoneyInfoData() {
        viewModelScope.launch {
            var transactionList = transactionRepository.getAllTransactions(authRepository.getCurrentUserId()?:"")

            var totalBalance = 0.0
            var totalIncome = 0.0
            var totalExpense = 0.0

            for(transaction in transactionList){
                if(transaction.type == TransactionType.INCOME){
                    totalIncome += transaction.amount
                    totalBalance += transaction.amount
                }
                else {
                    totalExpense += transaction.amount
                    totalBalance -= transaction.amount
                    }

            }

            userMoneyInfoRepository.updateField(
                id = authRepository.getCurrentUserId()?:"",
                field = "totalBalance",
                value = totalBalance
            )
            userMoneyInfoRepository.updateField(
                id = authRepository.getCurrentUserId()?:"",
                field = "totalIncome",
                value = totalIncome
            )
            userMoneyInfoRepository.updateField(
                id = authRepository.getCurrentUserId()?:"",
                field = "totalExpense",
                value = totalExpense
            )
        }
    }

    private fun recalculateData(accountId:String?)
    {
        recalculateAccountData(accountId)
        recalculateMoneyInfoData()
    }
}