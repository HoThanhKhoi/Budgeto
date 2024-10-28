package com.example.budgeto.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.model.user.UserGeneralInfo
import com.example.budgeto.data.repository.user.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val userRepository: UserRepository,
    private val authRepository: AuthRepository
): ViewModel(){
    private val _User_generalInfo = MutableStateFlow<UserGeneralInfo?>(null)
    val userGeneralInfo: StateFlow<UserGeneralInfo?> = _User_generalInfo

    init {
        fetchUserGeneralInfo()
    }

    fun fetchUserGeneralInfo() {
        val currentUser = authRepository.getCurrentUser()
        if (currentUser != null) {
            val userId = currentUser.uid
            viewModelScope.launch {
                try {
                    val generalInfo = userRepository.getUserGeneralInfo(userId)
                    _User_generalInfo.value = generalInfo
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        } else {
            // Handle the case where there is no logged-in user
            println("No user is currently logged in.")
        }
    }

    fun updateUserGeneralInfoField(
        updateFunction: (UserGeneralInfo) -> UserGeneralInfo
    ) {
        val currentUser = authRepository.getCurrentUser()
        if (currentUser != null) {
            val userId = currentUser.uid
            viewModelScope.launch {
                val currentUserGeneralInfo = _User_generalInfo.value ?: UserGeneralInfo()
                val updatedGeneralInfo = updateFunction(currentUserGeneralInfo)
                try {
                    userRepository.updateUserGeneralInfo(userId, updatedGeneralInfo)
                    _User_generalInfo.value = updatedGeneralInfo
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        } else {
            // Handle the case where there is no logged-in user
            println("Cannot update: No user is currently logged in.")
        }
    }
}