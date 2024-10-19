package com.example.budgeto.data.repository.user

import com.example.budgeto.data.repository.base.FirestoreRepository
import com.example.budgeto.data.model.User
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class UserRepository @Inject constructor(
    firestore: FirebaseFirestore
) : FirestoreRepository<User>(firestore,"users", User::class.java) {
    override suspend fun addSubcollection(
        parentId: String,
        subcollectionPath: String,
        item: User
    ): String {
        return super.addSubcollection(parentId, subcollectionPath, item)
    }
}