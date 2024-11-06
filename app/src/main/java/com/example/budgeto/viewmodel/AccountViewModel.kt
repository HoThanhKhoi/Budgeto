package com.example.budgeto.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.AuthRepositoryImplement
import com.example.budgeto.data.model.account.Account
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

    fun addNewAccountToFireStore(
        accountName:String = "",
        accountBalance:Int = 0,
        accountExpense:Int = 0,
        accountIncome:Int = 0,
        accountIconLink:String = "",
        accountCurrency:String = "")
    {
        viewModelScope.launch {
            try {
                if (userId != null) {
                    val account = Account(
                        name = accountName,
                        balance = accountBalance.toDouble(),
                        expense = accountExpense.toDouble(),
                        income = accountIncome.toDouble(),
                        iconLink = accountIconLink,
                        currency = accountCurrency
                    )
                    accountRepository.addAccount(userId = userId, account = account)
                } else {
                    Log.d("Add account", "User ID is null, cannot add account.")
                }
            } catch (e: Exception) {
                // Capture the exception and set an error message
                Log.d("Add account", e.message.toString())

            }
        }
    }

}