package com.example.budgeto.data.model

import com.example.budgeto.data.enums.UserGender
import com.example.budgeto.data.enums.UserStatus
import com.google.firebase.Timestamp

data class User(
    val userId: String = "",
    val fullName: String = "",
    val email: String = "",
    val gender: UserGender = UserGender.MALE,
    val hiddenInfo: HiddenInfo = HiddenInfo(),
    val generalInfo: GeneralInfo = GeneralInfo(),
    val gameInfo: GameInfo = GameInfo()
)

data class HiddenInfo(
    val createdAt: Timestamp = Timestamp.now(),
    val password: String = "",
    val status: UserStatus = UserStatus.ACTIVE
)

data class GeneralInfo(
    val phone: String = "",
    val address: String = "",
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