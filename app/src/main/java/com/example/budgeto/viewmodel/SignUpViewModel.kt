package com.example.budgeto.viewmodel

import android.util.Log
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
import com.example.budgeto.state.SignUpState
import com.example.budgeto.utils.Resource
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val userRepository: UserRepository,
    private val userGeneralInfoRepository: UserGeneralInfoRepository,
    private val userGameInfoRepository: UserGameInfoRepository,
    private val userMoneyInfoRepository: UserMoneyInfoRepository,
    private val dailySummaryRepository: DailySummaryRepository // Inject DailySummaryRepository
) : ViewModel() {

    val _signUpState = Channel<SignUpState>()
    val signUpState = _signUpState.receiveAsFlow()

    fun registerUser(email: String, password: String, fullname: String) = viewModelScope.launch {
        authRepository.signUp(email, password).collect { result ->
            when (result) {
                is Resource.Success -> {
                    val firebaseUser = result.data?.user
                    firebaseUser?.let {
                        addNewUserToFirestore(it, fullname)
                        dailySummaryRepository.incrementSignUpCount()
                        _signUpState.send(SignUpState(isSuccess = "Sign Up success"))
                    } ?: run {
                        _signUpState.send(SignUpState(isError = "Failed to retrieve Firebase user"))
                    }
                }

                is Resource.Loading -> {
                    _signUpState.send(SignUpState(isLoading = true))
                }

                is Resource.Error -> {
                    _signUpState.send(SignUpState(isError = result.message))
                }
            }
        }
    }

    private suspend fun addNewUserToFirestore(firebaseUser: FirebaseUser, fullname: String) {
        val userGeneralInfo = UserGeneralInfo(
            email = firebaseUser.email.toString(),
            fullName = fullname,
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
}