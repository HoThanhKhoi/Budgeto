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
    suspend fun addAmountToBalance(userId: String, amount: Double): Boolean {
        return addAmountToField(userId, "totalBalance", amount)
    }

    suspend fun addAmountToIncome(userId: String, amount: Double): Boolean {
        return addAmountToField(userId, "totalIncome", amount)
    }

    suspend fun addAmountToExpense(userId: String, amount: Double): Boolean {
        return addAmountToField(userId, "totalExpense", amount)
    }
}