package com.example.budgeto.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.model.account.Account
import com.example.budgeto.data.model.user.UserMoneyInfo
import com.example.budgeto.data.repository.account.AccountRepository
import com.example.budgeto.data.repository.user.UserRepository
import com.example.budgeto.state.AddAccountState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AccountViewModel @Inject constructor(
    private val accountRepository: AccountRepository,
    private val authRepository: AuthRepository
) : ViewModel() {

    val userId = authRepository.getCurrentUserId()
    var accountList = mutableStateOf<List<Account>>(emptyList())
    var userMoneyInfo = mutableStateOf<UserMoneyInfo?>(null)

    var addAccountState = mutableStateOf(AddAccountState())

    init {
        fetchAllAccounts()
    }

    fun addNewAccountToFireStore(
        accountName: String = "",
        accountBalance: Int = 0,
        accountExpense: Int = 0,
        accountIncome: Int = 0,
        accountIconLink: String = "",
        accountCurrency: String = ""
    ) {
        viewModelScope.launch {
            try {
                if (userId == null) {
                    Log.d("Add account", "User ID is null, cannot add account.")
                    addAccountState.value = AddAccountState(error = "User ID not found.")
                    return@launch
                }

                if (accountName.isNullOrEmpty()) {
                    Log.d("Add account", "Account name is null or empty, cannot add account.")
                    addAccountState.value = AddAccountState(error = "Account name cannot be empty.")
                    return@launch
                }

                val existingAccount = accountRepository.getAccountByName(userId, accountName)
                if (existingAccount != null && existingAccount.name == accountName) {
                    addAccountState.value = AddAccountState(error = "Account name already exists.")
                    return@launch
                }

                Log.d("Add account", "Account name is not null, can add account.")
                val account = Account(
                    name = accountName,
                    balance = accountBalance.toDouble(),
                    expense = accountExpense.toDouble(),
                    income = accountIncome.toDouble(),
                    iconLink = accountIconLink,
                    currency = accountCurrency,
                    userId = userId
                )

                accountRepository.addAccount(account = account)
                Log.d("Add account", "Account added successfully.")
                addAccountState.value = AddAccountState(success = true)

                fetchAllAccounts()


            } catch (e: Exception) {
                addAccountState.value = addAccountState.value.copy(isLoading = false)
                // Capture the exception and set an error message
                Log.d("Add account", "error: " + e.message.toString())
            } finally {
                addAccountState.value = addAccountState.value.copy(isLoading = false)
            }
        }
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
                    // Fetch accounts from the repository and update the state
//                    val moneyInfo = userRepository.getUserMoneyInfo(userId)
//
//                    if (moneyInfo != null) {
//                        userMoneyInfo.value = moneyInfo
//                    }
//                    else
//                    {
//                        Log.d("Get money info", "User money info is null, cannot retrieve accounts.")
//                    }
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

    fun updateAccount(
        accountId: String,
        accountName: String? = null,
        accountBalance: Int? = null,
        accountExpense: Int? = null,
        accountIncome: Int? = null,
        accountIconLink: String? = null,
        accountCurrency: String? = null
    ) {
        viewModelScope.launch {
            try {
                val existingAccount = accountRepository.getById(accountId)
                if (existingAccount == null) {
                    println("Account with ID $accountId does not exist.")
                    addAccountState.value = AddAccountState(error = "Account not found.")
                    return@launch
                }

                val updates = mapOf(
                    "name" to accountName,
                    "balance" to accountBalance,
                    "expense" to accountExpense,
                    "income" to accountIncome,
                    "iconLink" to accountIconLink,
                    "currency" to accountCurrency
                ).filterValues { it != null }

                if (updates.isEmpty()) {
                    println("No updates provided for account $accountId.")
                    return@launch
                }

                // Apply updates
                println("Updating account $accountId with updates: $updates")
                updates.forEach { (field, value) ->
                    accountRepository.updateField(accountId, field, value!!)
                }

                // Success
                println("Account $accountId updated successfully.")
                addAccountState.value = AddAccountState(success = true)

                // Refresh account list
                fetchAllAccounts()

            } catch (e: Exception) {
                println("Error updating account: ${e.message}")
                addAccountState.value = AddAccountState(error = "Failed to update account.")
            }
        }
    }
}