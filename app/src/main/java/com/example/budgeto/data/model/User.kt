package com.example.budgeto.data.model

import com.example.budgeto.data.enums.UserGender
import com.example.budgeto.data.enums.UserStatus
import com.google.firebase.Timestamp

data class User(
    val userId: String = "",
    val createdAt: Timestamp = Timestamp.now(),
    val status: UserStatus = UserStatus.ACTIVE,
    val generalInfo: GeneralInfo = GeneralInfo(),
)

data class GeneralInfo(
    val fullName: String = "",
    val email: String = "",
    val phone: String = "",
    val address: String = "",
    val gender: UserGender = UserGender.NONE,
    val occupation: String = "",
    val googleLink: String = "",
    val facebookLink: String = "",
)

data class GameInfo(
    val rankPoint: Int = 0,
    val budgetoken: Int = 0,
    val totalExp: Int = 0,
    val level: Int = 0,
)