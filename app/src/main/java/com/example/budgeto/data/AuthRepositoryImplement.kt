package com.example.budgeto.data

import android.util.Log
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await

class AuthRepositoryImplement(
    private val firebaseAuth: FirebaseAuth // Passing FirebaseAuth manually
) : AuthRepository {

    override fun login(email: String, password: String): Flow<Resource<AuthResult>> {
        return flow {
            Log.d("Login auth", "Try login 1")
            emit(Resource.Loading())
            Log.d("Login auth", "Try login 2")
            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            Log.d("Login auth", "Try login 3")
            emit(Resource.Success(result))
            Log.d("Login auth", "Try login 4")
        }.catch {
            emit(Resource.Error(it.message.toString()))
        }
    }

    override fun signUp(email: String, password: String): Flow<Resource<AuthResult>> {
        return flow {
            emit(Resource.Loading())
            val result = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            emit(Resource.Success(result))
        }.catch {
            emit(Resource.Error(it.message.toString()))
        }
    }

    override fun googleSignIn(credential: AuthCredential): Flow<Resource<AuthResult>> {
        return flow {
            emit(Resource.Loading())
            val result = firebaseAuth.signInWithCredential(credential).await()
            emit(Resource.Success(result))
        }.catch {
            emit(Resource.Error(it.message.toString()))
        }
    }

    override fun getCurrentUser(): FirebaseUser? {
        return firebaseAuth.currentUser
    }

    override fun signOut() {
        firebaseAuth.signOut()
    }

    override fun resetPassword(email: String): Flow<Resource<Void>> {
        return flow {
            emit(Resource.Loading())
            val result = firebaseAuth.sendPasswordResetEmail(email).await()
            emit(Resource.Success(result))
        }.catch {
            emit(Resource.Error(it.message.toString()))
        }
    }
}
