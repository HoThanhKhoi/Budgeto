package com.example.budgeto.data.repository.account

import com.example.budgeto.data.model.account.Account
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class AccountRepository @Inject constructor(
    firestore: FirebaseFirestore
) : FirestoreRepository(firestore) {

    private val userCollectionPath = "users"
    private val accountCollectionPath = "accounts"

    suspend fun addAccount(
        userId: String,
        account: Account
    ) {
        val accountId = addDocumentToSubcollection(userCollectionPath,userId,accountCollectionPath,account)
        updateSubcollectionField(userCollectionPath,userId,accountCollectionPath,accountId,"id",accountId)
    }

    suspend fun getAllAccounts(userId: String): List<Account> {
        var account = Account()
        return getAllDocumentsFromSubcollection(userCollectionPath,userId,accountCollectionPath, account::class.java)
    }
}