package com.example.budgeto.data.repository.user

import com.example.budgeto.data.model.User
import com.example.budgeto.data.repository.base.FirestoreRepository

class UserRepository : FirestoreRepository<User>("users", User::class.java) {
    override suspend fun addSubcollection(
        parentId: String,
        subcollectionPath: String,
        item: User
    ): String {
        return super.addSubcollection(parentId, subcollectionPath, item)
    }
}