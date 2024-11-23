package com.example.budgeto.viewmodel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.model.user.UserGeneralInfo
import com.example.budgeto.data.model.user.User
import com.example.budgeto.data.model.user.UserGameInfo
import com.example.budgeto.data.model.user.UserMoneyInfo
import com.example.budgeto.data.repository.dailySummary.DailySummaryRepository
import com.example.budgeto.data.repository.user.UserGameInfoRepository
import com.example.budgeto.data.repository.user.UserGeneralInfoRepository
import com.example.budgeto.data.repository.user.UserMoneyInfoRepository
import com.example.budgeto.data.repository.user.UserRepository
import com.example.budgeto.state.GoogleLoginState
import com.example.budgeto.state.LoginState
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: AuthRepository,
    private val userRepository: UserRepository,
    private val dailySummaryRepository: DailySummaryRepository,
    private val userGeneralInfoRepository: UserGeneralInfoRepository,
    private val userGameInfoRepository: UserGameInfoRepository,
    private val userMoneyInfoRepository: UserMoneyInfoRepository
) : ViewModel() {

    private val _loginState = MutableStateFlow(LoginState())
    val loginState = _loginState.asStateFlow()

    private val _googleState = MutableStateFlow(GoogleLoginState())
    val googleState = _googleState.asStateFlow()

    fun isUserLoggedIn(): Boolean {
        return repository.getCurrentUser() != null
    }

    fun getCurrentUser(): FirebaseUser? {
        return repository.getCurrentUser()
    }

    fun loginUser(email: String, password: String) = viewModelScope.launch {
        // Validate credentials
        val validationError = validateCredentials(email, password)
        if (validationError != null) {
            _loginState.value = LoginState(isError = validationError)
            return@launch
        }

        Log.d("Login success", "loginUser called with email: $email and password: $password")
        repository.login(email, password).collect { result ->
            when (result) {
                is Resource.Success -> {
                    val userId = result.data?.user?.uid

                    userId?.let {
                        logDailyActivity(it)
                    }

                    _loginState.value = LoginState(isSuccess = "Login success")
                }

                is Resource.Loading -> {
                    Log.d("Login loading", "Loading...")
                }

                is Resource.Error -> {
                    Log.d("Login error", "Login failed with error: ${result.message}")

                    // Customize error message for email and password issues
                    val errorMessage = when {
                        result.message?.contains("no user record") == true -> {
                            "Email not found. Please check your email."
                        }
                        result.message?.contains("password is invalid") == true -> {
                            "Incorrect password. Please try again."
                        }
                        else -> result.message ?: "An unknown error occurred"
                    }

                    _loginState.value = LoginState(isError = errorMessage)
                }
            }
        }
    }


    fun googleLogin(credential: AuthCredential) = viewModelScope.launch {
        Log.d("Login with google", "Google login")
        repository.googleSignIn(credential).collect { result ->
            when (result) {
                is Resource.Success -> {
                    val firebaseUser = result.data?.user
                    firebaseUser?.let {
                        val userId = firebaseUser.uid
                        val userInFirestore = userRepository.getById(userId)

                        if (userInFirestore == null) {
                            addNewUserToFirestore(firebaseUser)
                        }

                        logDailyActivity(userId)
                        _loginState.value = LoginState(isSuccess = "Login success")
                    }
                }

                is Resource.Loading -> {
                    _googleState.value = GoogleLoginState(loading = true)
                }

                is Resource.Error -> {
                    _loginState.value = LoginState(isError = result.message)
                }
            }
        }
    }

    private suspend fun addNewUserToFirestore(firebaseUser: FirebaseUser) {
        val userGeneralInfo = UserGeneralInfo(
            email = firebaseUser.email ?: "",
            fullName = firebaseUser.displayName ?: "",
            imgURL = firebaseUser.photoUrl?.toString() ?: ""
        )

        val userGameInfo = UserGameInfo(
            rankPoint = 0,
            budgetoken = 0,
            totalExp = 0,
            level = 0
        )

        val userMoneyInfo = UserMoneyInfo(
            totalBalance = 0.0,
            totalExpense = 0.0,
            totalIncome = 0.0
        )

        val userId = firebaseUser.uid
        val user = User(userId = firebaseUser.uid)
        userRepository.add(user, documentId = userId)
        userGeneralInfoRepository.add(userGeneralInfo, documentId = userId)
        userGameInfoRepository.add(userGameInfo, documentId = userId)
        userMoneyInfoRepository.add(userMoneyInfo, documentId = userId)
    }

    fun resetLoginState() {
        _loginState.value = LoginState()
    }

    suspend fun logDailyActivity(userId: String) {
        userRepository.updateUserLastSignInTime(userId)
        dailySummaryRepository.incrementLoginCount(userId)
    }

    fun logDailyActivityModelScope(userId: String)
    {
        viewModelScope.launch {
            userRepository.updateUserLastSignInTime(userId)
            logDailyActivity(userId)
        }
    }

    fun validateCredentials(email: String, password: String): String? {
        if (email.isBlank() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return "Invalid email format"
        }
        if (password.length < 6) {
            return "Password must be at least 6 characters long"
        }
        return null // No validation errors
    }
}
