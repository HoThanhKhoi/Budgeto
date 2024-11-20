package com.example.budgeto.data.repository.account

import com.example.budgeto.data.model.account.Account
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import javax.inject.Inject

class AccountRepository @Inject constructor(
    firestore: FirebaseFirestore
) : FirestoreRepository<Account>(
    firestore = firestore,
    collectionPath = "accounts",
    Account::class.java
) {
    suspend fun getAllAccount(userId: String): List<Account>{
        return query()
            .whereEqualTo("userId", userId)
            .orderBy("createdTime", Query.Direction.DESCENDING)
            .get()
    }

    suspend fun getAccountByName(userId: String, accountName: String): Account? {
        return query()
            .whereEqualTo("userId", userId)
            .whereEqualTo("name", accountName)
            .get()
            .firstOrNull()
    }

}