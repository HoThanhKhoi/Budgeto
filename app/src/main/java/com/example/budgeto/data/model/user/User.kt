package com.example.budgeto.data.model.user

import com.example.budgeto.data.enums.user.UserStatus
import com.google.firebase.Timestamp

data class User(
    val userId: String = "",
    val createdAt: Timestamp = Timestamp.now(),
    val status: UserStatus = UserStatus.ACTIVE,
    val lastSignInTime: Timestamp = Timestamp.now()
)