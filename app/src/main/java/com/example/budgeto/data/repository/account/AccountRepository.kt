package com.example.budgeto.data.repository.account

import android.util.Log
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
    suspend fun addAccount(account: Account) {
        var accountId = add(account)
        Log.d("Add account", "Account ID: $accountId")
        if (accountId != null) {
            updateField(
                id = accountId,
                field = "id",
                value = accountId
            )
        }
    }

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

    suspend fun addAmountToBalance(accountId: String, amount: Double): Boolean {
        return addAmountToField(accountId, "balance", amount)
    }

    suspend fun addAmountToIncome(accountId: String, amount: Double): Boolean {
        return addAmountToField(accountId, "income", amount)
    }

    suspend fun addAmountToExpense(accountId: String, amount: Double): Boolean {
        return addAmountToField(accountId, "expense", amount)
    }
}