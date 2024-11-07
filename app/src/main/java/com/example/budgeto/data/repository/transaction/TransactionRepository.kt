package com.example.budgeto.data.repository.transaction

import android.util.Log
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.enums.transaction.TransactionType
import com.example.budgeto.data.model.transaction.Transaction
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.example.budgeto.data.repository.user.UserRepository
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class TransactionRepository @Inject constructor(
    firestore: FirebaseFirestore,
    private val userRepository: UserRepository,
): FirestoreRepository(firestore) {
    private val userCollectionPath = "users"
    private val transactionCollectionPath = "transactions"

    suspend fun addTransaction(userId: String, transaction: Transaction) {
        try {
            addDocumentToSubcollection(
                parentCollection = userCollectionPath,
                parentId = userId,
                subcollectionPath = transactionCollectionPath,
                subItem = transaction
            )
            Log.d("TransactionRepository", "Transaction added successfully")
        } catch (e: Exception) {
            Log.e("TransactionRepository", "Failed to add transaction: ${e.message}")
        }
    }
}