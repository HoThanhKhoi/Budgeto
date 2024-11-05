package com.example.budgeto.data.model.dailySummary

import com.google.firebase.Timestamp

data class DailySummary(
    val loginCount: Int = 0,
    val signUpCount: Int = 0,
    val offlineCount: Int = 0,
    val userIds: List<String> = listOf()
)