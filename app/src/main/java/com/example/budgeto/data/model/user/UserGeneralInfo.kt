package com.example.budgeto.data.model.user

import com.example.budgeto.data.enums.user.UserGender

data class UserGeneralInfo(
    val fullName: String = "",
    val dateOfBirth: String = "",
    val email: String = "",
    val phone: String = "",
    val address: String = "",
    val gender: UserGender = UserGender.NONE,
    val occupation: String = "",
    val googleLink: String = "",
    val facebookLink: String = "",
    val imgURL: String = ""
)