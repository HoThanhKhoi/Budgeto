package com.example.budgeto.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.model.account.Account
import com.example.budgeto.data.model.user.UserMoneyInfo
import com.example.budgeto.data.repository.account.AccountRepository
import com.example.budgeto.data.repository.transaction.TransactionRepository
import com.example.budgeto.data.repository.user.UserMoneyInfoRepository
import com.example.budgeto.state.AddAccountState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AccountViewModel @Inject constructor(
    private val accountRepository: AccountRepository,
    private val authRepository: AuthRepository,
    private val userMoneyInfoRepository: UserMoneyInfoRepository,
) : ViewModel() {

    val userId = authRepository.getCurrentUserId()
    var accountList = mutableStateOf<List<Account>>(emptyList())
    var userMoneyInfo = mutableStateOf<UserMoneyInfo?>(null)

    var addAccountState = mutableStateOf(AddAccountState())

    init {
        fetchAllAccounts()
        fetchUserMoneyInfo()
    }

    fun resetAddAccountState()
    {
        addAccountState.value = AddAccountState()
    }

    fun fetchAllAccounts() {
        viewModelScope.launch {
            try {
                if (userId != null) {
                    // Fetch accounts from the repository and update the state
                    Log.d("Get all accounts", "User ID is not null, retrieving accounts.")
                    accountList.value = accountRepository.getAllAccount(userId) ?: emptyList()
                } else {
                    Log.d("Get all accounts", "User ID is null, cannot retrieve accounts.")
                }
            } catch (e: Exception) {
                // Handle any errors that occur during data fetching
                Log.d("Get all accounts", e.message.toString())
            }
        }
    }

    fun fetchUserMoneyInfo() {
        viewModelScope.launch {
            try {
                if (userId != null) {
                    val moneyInfo = userMoneyInfoRepository.getById(userId)

                    if (moneyInfo != null) {
                        userMoneyInfo.value = moneyInfo
                        Log.d("Get money info", "Money info retrieved successfully.")
                    } else {
                        Log.d("Get money info", "Money info not found.")
                    }
                } else {
                    Log.d("Get money info", "User ID is null, cannot retrieve accounts.")
                }


            } catch (
                e: Exception
            ) {
                // Handle any errors that occur during data fetching
                Log.d("Get money info", e.message.toString())
            }
        }
    }

    fun addAccount(
        accountName: String = "",
        accountBalance: Double?,
        accountExpense: Double? = null,
        accountIncome: Double? = null,
        accountIconLink: String = "",
        accountCurrency: String = ""
    ) {
        viewModelScope.launch {
            try {
                if (userId == null) {
                    addAccountState.value = AddAccountState(error = "User ID not found.")
                    return@launch
                }

                // Validate input
                val validationError = validateAccountInput(accountName, accountBalance)
                if (validationError != null) {
                    addAccountState.value = AddAccountState(error = validationError)
                    return@launch
                }

                val existingAccount = accountRepository.getAccountByName(userId, accountName)
                if (existingAccount != null && existingAccount.name == accountName) {
                    addAccountState.value = AddAccountState(error = "Account name already exists.")
                    return@launch
                }

                val account = Account(
                    name = accountName,
                    balance = accountBalance?: 0.0,
                    expense = accountExpense ?: 0.0,
                    income = accountIncome ?: 0.0,
                    iconLink = accountIconLink,
                    currency = accountCurrency,
                    userId = userId
                )

                accountRepository.addAccount(account)
                addAccountState.value = AddAccountState(success = "Add new account successfully")
                fetchAllAccounts()
            } catch (e: Exception) {
                addAccountState.value = AddAccountState(error = "Failed to add account.")
            }
        }
    }


    fun updateAccount(
        accountId: String,
        accountName: String? = null,
        accountBalance: Double? = null,
        accountExpense: Double? = null,
        accountIncome: Double? = null,
        accountIconLink: String? = null,
        accountCurrency: String? = null
    ) {
        viewModelScope.launch {
            try {
                // Validation: Check if account exists
                val existingAccount = accountRepository.getById(accountId)
                if (existingAccount == null) {
                    addAccountState.value = AddAccountState(error = "Account not found.")
                    return@launch
                }

                // Validate input
                val validationError = validateAccountInput(accountName, accountBalance)
                if (validationError != null) {
                    addAccountState.value = AddAccountState(error = validationError)
                    return@launch
                }

                // Prepare updates
                val updates = mapOf(
                    "name" to accountName,
                    "balance" to accountBalance,
                    "expense" to accountExpense,
                    "income" to accountIncome,
                    "iconLink" to accountIconLink,
                    "currency" to accountCurrency
                ).filterValues { it != null } // Remove null values

                if (updates.isEmpty()) {
                    addAccountState.value = AddAccountState(error = "No updates provided.")
                    return@launch
                }

                updates.forEach { (field, value) ->
                    accountRepository.updateField(accountId, field, value!!)
                }

                addAccountState.value = AddAccountState(success = "Update account successfully")
                fetchAllAccounts()
            } catch (e: Exception) {
                addAccountState.value = AddAccountState(error = "Failed to update account.")
            }
        }
    }

    private fun validateAccountInput(
        accountName: String?,
        accountBalance: Double?
    ): String? {
        if (accountName.isNullOrEmpty()) {
            return "Account name cannot be empty."
        }
        if (accountBalance == null) {
            return "Account balance must be in number format."
        }
        if (accountBalance < 0) {
            return "Account balance must be positive."
        }
        return null // No validation errors
    }
}