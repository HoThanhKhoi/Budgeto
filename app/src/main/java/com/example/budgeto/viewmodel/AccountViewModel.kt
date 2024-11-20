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
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AccountViewModel @Inject constructor(
    private val accountRepository: AccountRepository,
    private val userRepository: UserRepository,
    private val authRepository: AuthRepository
) : ViewModel() {

    val userId = authRepository.getCurrentUserId()
    var accountList = mutableStateOf<List<Account>>(emptyList())
    var userMoneyInfo = mutableStateOf<UserMoneyInfo?>(null)

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
                if (userId != null) {
                    if(accountName.isNullOrEmpty())
                    {
                        Log.d("Add account", "Account name is null, cannot add account.")
                    }
                    else
                    {
                        val account = Account(
                            name = accountName,
                            balance = accountBalance.toDouble(),
                            expense = accountExpense.toDouble(),
                            income = accountIncome.toDouble(),
                            iconLink = accountIconLink,
                            currency = accountCurrency,
                            userId = userId
                        )

                        accountRepository.add(documentId = userId, data = account)
                        fetchAllAccounts()
                    }
                } else {
                    Log.d("Add account", "User ID is null, cannot add account.")
                }
            } catch (e: Exception) {
                // Capture the exception and set an error message
                Log.d("Add account", e.message.toString())
            }
        }
    }

    fun fetchAllAccounts() {
        viewModelScope.launch {
            try {
                if (userId != null) {
                    // Fetch accounts from the repository and update the state
                    accountList.value = accountRepository.getAllByField("userId", userId)?.toList() ?: emptyList()
                } else {
                    Log.d("Get all accounts", "User ID is null, cannot retrieve accounts.")
                }
            } catch (e: Exception) {
                // Handle any errors that occur during data fetching
                Log.d("Get all accounts", e.message.toString())
            }
        }
    }

    fun fetchUserMoneyInfo(){
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


            }
            catch (
                e: Exception
            ) {
                // Handle any errors that occur during data fetching
                Log.d("Get money info", e.message.toString())
            }
        }
    }
}