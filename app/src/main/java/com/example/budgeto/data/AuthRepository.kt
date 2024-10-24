package com.example.budgeto.data

import kotlinx.coroutines.flow.Flow
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseUser

interface AuthRepository {
    fun login(email: String, password: String): Flow<Resource<AuthResult>>
    fun signUp(email: String, password: String): Flow<Resource<AuthResult>>

    fun googleSignIn(credential: AuthCredential): Flow<Resource<AuthResult>>

    fun getCurrentUser(): FirebaseUser?
    fun signOut()
    fun resetPassword(email: String): Flow<Resource<Void>>
}