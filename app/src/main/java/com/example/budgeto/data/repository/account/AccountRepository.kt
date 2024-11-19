package com.example.budgeto.data.repository.account

import com.example.budgeto.data.model.account.Account
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class AccountRepository @Inject constructor(
    firestore: FirebaseFirestore
) : FirestoreRepository<Account>(
    firestore = firestore,
    collectionPath = "accounts",
    Account::class.java
) {

}