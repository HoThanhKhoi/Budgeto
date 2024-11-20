package com.example.budgeto.data.repository.user

import com.example.budgeto.data.model.user.UserMoneyInfo
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class UserMoneyInfoRepository @Inject constructor(
    firestore: FirebaseFirestore
) : FirestoreRepository<UserMoneyInfo>(
    firestore = firestore,
    collectionPath = "userMoneyInfos",
    clazz = UserMoneyInfo::class.java
) {
    suspend fun updateBalance(userId: String, newBalance: Double) {
        updateField(userId, "totalBalance", newBalance)
    }

    suspend fun updateExpense(userId: String, newExpense: Double) {
        updateField(userId, "totalExpense", newExpense)
    }

    suspend fun updateIncome(userId: String, newIncome: Double) {
        updateField(userId, "totalIncome", newIncome)
    }
}