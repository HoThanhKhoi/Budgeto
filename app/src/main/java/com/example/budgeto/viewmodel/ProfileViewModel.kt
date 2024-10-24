package com.example.budgeto.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.model.GeneralInfo
import com.example.budgeto.data.repository.user.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val userRepository: UserRepository
): ViewModel(){
    private val _generalInfo = MutableStateFlow<GeneralInfo?>(null)
    val generalInfo: StateFlow<GeneralInfo?> = _generalInfo

    fun fetchUserGeneralInfo(userId: String) {
        viewModelScope.launch {
            try {
                val generalInfo = userRepository.getUserGeneralInfo(userId)
                _generalInfo.value = generalInfo
            }
            catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun updateUserGeneralInfo(userId: String, updatedGeneralInfo: GeneralInfo) {
        viewModelScope.launch {
            try {
                userRepository.updateUserGeneralInfo(userId, updatedGeneralInfo)
                // Refresh the StateFlow after updating the data
                fetchUserGeneralInfo(userId)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}