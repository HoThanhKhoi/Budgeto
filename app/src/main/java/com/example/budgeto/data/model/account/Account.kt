package com.example.budgeto.data.model.account

import com.example.budgeto.data.enums.account.AccountStatus

data class Account(
    val id: String = "",
    val name: String = "",
    val balance: Double = 0.0,
    val income: Double = 0.0,
    val expense: Double = 0.0,
    val iconLink: String = "",
    val currency: String = "",
    val status: AccountStatus = AccountStatus.ACTIVE,
    val userId: String
)