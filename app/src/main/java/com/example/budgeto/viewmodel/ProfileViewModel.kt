package com.example.budgeto.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.model.user.UserGeneralInfo
import com.example.budgeto.data.repository.user.UserGeneralInfoRepository
import com.example.budgeto.data.repository.user.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val userGeneralInfoRepository: UserGeneralInfoRepository
) : ViewModel() {

    // State to hold user's general information
    private val _userGeneralInfo = MutableStateFlow<UserGeneralInfo?>(null)
    val userGeneralInfo: StateFlow<UserGeneralInfo?> = _userGeneralInfo

    private val userId = authRepository.getCurrentUserId()

    // Initialize and fetch user's general info
    init {
        fetchUserGeneralInfo()
    }

    // Fetch user general info from repository
    fun fetchUserGeneralInfo() {
        if (userId != null) {
            viewModelScope.launch {
                try {
                    val generalInfo = userGeneralInfoRepository.getById(userId)
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
        if(userId != null) {
            viewModelScope.launch {
                val currentUserGeneralInfo = _userGeneralInfo.value ?: UserGeneralInfo()
                val updatedGeneralInfo = updateFunction(currentUserGeneralInfo)
                try {
                    userGeneralInfoRepository.update(userId, updatedGeneralInfo)
                    _userGeneralInfo.value = updatedGeneralInfo
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }
}
