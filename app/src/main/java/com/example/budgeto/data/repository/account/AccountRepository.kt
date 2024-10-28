package com.example.budgeto.data.repository.account

import android.accounts.Account
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class AccountRepository @Inject constructor(
    firestore: FirebaseFirestore
) : FirestoreRepository(firestore) {

    private val userCollectionPath = "users"
    private val accountCollectionPath = "accounts"

    suspend fun getAccount(accountId: String): Account? {

    }

    suspend fun addAccount(
        account: Account,
        userId: String
    ) {
        addSubcollection(userCollectionPath,userId,accountCollectionPath,account)
    }



}