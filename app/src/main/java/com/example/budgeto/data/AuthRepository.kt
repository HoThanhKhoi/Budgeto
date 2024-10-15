package com.example.budgeto.data

import kotlinx.coroutines.flow.Flow
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult

interface AuthRepository {
    fun login(email: String, password: String): Flow<Resource<AuthResult>>
    fun signUp(email: String, password: String): Flow<Resource<AuthResult>>

    fun googleSignIn(credential: AuthCredential): Flow<Resource<AuthResult>>
}