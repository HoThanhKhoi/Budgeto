package com.example.budgeto.data.model

import com.google.firebase.Timestamp

data class User(
    var name: String,
    var createdAt: Timestamp = Timestamp.now(),
    var email: String,
)
