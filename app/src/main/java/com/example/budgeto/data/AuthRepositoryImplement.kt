package com.example.budgeto.data

import android.util.Log
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
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
            emit(Resource.Loading())
            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            emit(Resource.Success(result))
        }.catch { e ->
            Log.e("AuthRepository", "Login failed with exception: ${e.localizedMessage}", e)
            Log.e("AuthRepository", "Exception type: ${e::class.java.simpleName}")

            // Extract Firebase error code if available
            val errorCode = (e as? FirebaseAuthException)?.errorCode
            Log.e("AuthRepository", "Error code: $errorCode")

            // Map error codes and exceptions to user-friendly messages
            val errorMessage = when (errorCode) {
                "ERROR_INVALID_CREDENTIAL" -> {
                    if (email.isNotEmpty() && password.isNotEmpty()) {
                        // If both email and password are non-empty, assume invalid credentials
                        "Incorrect email or password. Please try again."
                    } else {
                        "Invalid credentials. Please provide a valid email and password."
                    }
                }
                else -> "An unknown error occurred: ${e.localizedMessage ?: "No details available"}"
            }

            emit(Resource.Error(errorMessage))
        }
    }

    override fun signUp(email: String, password: String): Flow<Resource<AuthResult>> {
        return flow {
            emit(Resource.Loading()) // Emit loading state
            val result = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            emit(Resource.Success(result)) // Emit success if sign-up succeeds
        }.catch { e ->
            Log.e("AuthRepository", "Sign-Up failed with exception: ${e.localizedMessage}", e)
            Log.e("AuthRepository", "Exception type: ${e::class.java.simpleName}")

            // Extract Firebase error code if available
            val errorCode = (e as? FirebaseAuthException)?.errorCode
            Log.e("AuthRepository", "Error code: $errorCode")

            // Map Firebase exceptions to user-friendly messages
            val errorMessage = when (errorCode) {
                "ERROR_INVALID_EMAIL" -> "The email address is badly formatted. Please check your email."
                "ERROR_WEAK_PASSWORD" -> "The password is too weak. Please choose a stronger password."
                "ERROR_EMAIL_ALREADY_IN_USE" -> "This email is already registered. Please log in or use a different email."
                else -> "An unknown error occurred: ${e.localizedMessage ?: "No details available"}"
            }

            emit(Resource.Error(errorMessage))
        }
    }

    override fun googleSignIn(credential: AuthCredential): Flow<Resource<AuthResult>> {
        return flow {
            emit(Resource.Loading())
            val result = firebaseAuth.signInWithCredential(credential).await()
            emit(Resource.Success(result))
        }.catch { e ->
            val errorMessage = when (e) {
                is FirebaseAuthInvalidUserException -> "Google account not linked to any user."
                is FirebaseAuthInvalidCredentialsException -> "Google credentials are invalid."
                else -> "Google Sign-In failed: ${e.localizedMessage}"
            }
            Log.e("AuthRepository", errorMessage, e)
            emit(Resource.Error(errorMessage))
        }
    }

    override fun getCurrentUser(): FirebaseUser? {
        return firebaseAuth.currentUser
    }

    override fun signOut() {
        firebaseAuth.signOut()
    }

    override fun getCurrentUserId(): String? {
        val user = getCurrentUser()
        return user?.uid
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
