package com.example.budgeto.data.repository.transaction

import android.util.Log
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.enums.transaction.TransactionType
import com.example.budgeto.data.model.transaction.Transaction
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.example.budgeto.data.repository.user.UserRepository
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import javax.inject.Inject

class TransactionRepository @Inject constructor(
    firestore: FirebaseFirestore,
    private val userRepository: UserRepository,
) : FirestoreRepository<Transaction>
    (
    firestore = firestore,
    collectionPath = "transactions",
    Transaction::class.java
) {
    suspend fun getAllTransactions(userId: String): List<Transaction>
    {
        return query()
            .whereEqualTo("userId", userId)
            .orderBy("createdTime", Query.Direction.DESCENDING)
            .get()
    }
}