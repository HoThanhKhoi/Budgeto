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
) : FirestoreRepository(firestore) {

    private val collectionName = "dailySummaries"

    // Calculate and return offline count based on current total users and login count
    private suspend fun calculateAndUpdateOfflineCount(today: String) {
        val offlineCount = calculateOfflineCount()
        updateField(collectionName, today, "offlineCount", offlineCount)
    }

    // Calculate offline count by subtracting login count from total user count
    suspend fun calculateOfflineCount(): Int {
        val today = getCurrentDateString()
        val dailySummary = get(collectionName, today, DailySummary::class.java)
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
        val dailySummary = get(collectionName, today, DailySummary::class.java)

        if (dailySummary != null) {
            if (!dailySummary.userIds.contains(userId)) {
                val updates = mapOf(
                    "userIds" to FieldValue.arrayUnion(userId),
                    "loginCount" to FieldValue.increment(1)
                )
                updateFields(collectionName, today, updates)
                calculateAndUpdateOfflineCount(today) // Recalculate offline count
            }
        } else {
            val newSummary = DailySummary(loginCount = 1, signUpCount = 0, userIds = listOf(userId))
            add(collectionName, newSummary, today)
            calculateAndUpdateOfflineCount(today) // Recalculate offline count
        }
    }

    suspend fun incrementSignUpCount() {
        val today = getCurrentDateString()
        val dailySummary = get(collectionName, today, DailySummary::class.java)

        if (dailySummary != null) {
            updateField(collectionName, today, "signUpCount", FieldValue.increment(1))
        } else {
            val newSummary = DailySummary(loginCount = 0, signUpCount = 1, userIds = listOf())
            add(collectionName, newSummary, today)
        }

        // Update offline count after signup count changes, if it affects total users
        calculateAndUpdateOfflineCount(today)
    }
}