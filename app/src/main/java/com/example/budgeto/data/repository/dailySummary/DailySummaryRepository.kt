package com.example.budgeto.data.repository.dailySummary

import androidx.hilt.navigation.compose.hiltViewModel
import com.example.budgeto.data.model.dailySummary.DailySummary
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.example.budgeto.data.repository.user.UserRepository
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

class DailySummaryRepository @Inject constructor(
    firestore: FirebaseFirestore,
    private val userRepository: UserRepository
) : FirestoreRepository<DailySummary>(
    firestore = firestore,
    collectionPath = "dailySummaries",
    DailySummary::class.java
) {

    private val collectionName = "dailySummaries"

    // Calculate and return offline count based on current total users and login count
    private suspend fun calculateAndUpdateOfflineCount(today: String) {
        val offlineCount = calculateOfflineCount()
        updateField(today, "offlineCount", offlineCount)
    }

    // Calculate offline count by subtracting login count from total user count
    suspend fun calculateOfflineCount(): Int {
        val today = getCurrentDateString()
        val dailySummary = getById(today)
        val loginCount = dailySummary?.loginCount ?: 0
        val totalUserCount = userRepository.countUsers()
        return totalUserCount - loginCount
    }

    private fun getCurrentDateString(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return dateFormat.format(Date())
    }

    suspend fun incrementLoginCount(userId: String) {
        val today = getCurrentDateString()
        val dailySummary = getById(today)

        if (dailySummary != null) {
            if (!dailySummary.userIds.contains(userId)) {
                updateField(today, "loginCount", FieldValue.increment(1))
                updateField(today, "userIds", FieldValue.arrayUnion(userId))
            }
        } else {
            val newSummary = DailySummary(loginCount = 1, signUpCount = 0, userIds = listOf(userId))
            add(data = newSummary, documentId = today)
            calculateAndUpdateOfflineCount(today) // Recalculate offline count
        }
    }

    suspend fun incrementSignUpCount() {
        val today = getCurrentDateString()
        val dailySummary = getById(today)

        if (dailySummary != null) {
            updateField(today, "signUpCount", FieldValue.increment(1))
        } else {
            val newSummary = DailySummary(loginCount = 0, signUpCount = 1, userIds = listOf())
            add(newSummary, today)
        }

        // Update offline count after signup count changes, if it affects total users
        calculateAndUpdateOfflineCount(today)
    }
}