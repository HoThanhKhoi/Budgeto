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
) : ViewModel() {

    // State to hold user's general information
    private val _userGeneralInfo = MutableStateFlow<UserGeneralInfo?>(null)
    val userGeneralInfo: StateFlow<UserGeneralInfo?> = _userGeneralInfo

    // Initialize and fetch user's general info
    init {
        fetchUserGeneralInfo()
    }

    // Fetch user general info from repository
    fun fetchUserGeneralInfo() {
        val currentUser = authRepository.getCurrentUser()
        if (currentUser != null) {
            val userId = currentUser.uid
            viewModelScope.launch {
                try {
                    val generalInfo = userRepository.getUserGeneralInfo(userId)
                    _userGeneralInfo.value = generalInfo
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        } else {
            // Handle the case where there is no logged-in user
            println("No user is currently logged in.")
        }
    }

    // Update specific fields of the user's general info
    fun updateUserGeneralInfoField(
        updateFunction: (UserGeneralInfo) -> UserGeneralInfo
    ) {
        val currentUser = authRepository.getCurrentUser()
        if (currentUser != null) {
            val userId = currentUser.uid
            viewModelScope.launch {
                val currentUserGeneralInfo = _userGeneralInfo.value ?: UserGeneralInfo()
                val updatedGeneralInfo = updateFunction(currentUserGeneralInfo)
                try {
                    userRepository.updateUserGeneralInfo(userId, updatedGeneralInfo)
                    _userGeneralInfo.value = updatedGeneralInfo
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
