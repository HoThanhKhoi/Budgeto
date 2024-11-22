package com.example.budgeto.data.repository.user

import com.example.budgeto.data.model.user.User
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class UserRepository @Inject constructor(
    firestore: FirebaseFirestore,
) : FirestoreRepository<User>(
    firestore = firestore,
    collectionPath = "users",
    clazz = User::class.java
){
    suspend fun countUsers(): Int {
        val users = getAll() ?: return 0
        return users.size
    }

    suspend fun updateUserLastSignInTime(id: String)
    {
        updateField(id, "lastSignInTime", Timestamp.now())
    }
}