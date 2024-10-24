package com.example.budgeto.data.repository.user

import com.example.budgeto.data.model.GameInfo
import com.example.budgeto.data.model.GeneralInfo
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.example.budgeto.data.model.User
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class UserRepository @Inject constructor(
    firestore: FirebaseFirestore
) : FirestoreRepository(firestore) {

    private val usersCollection = "users" // Firestore collection name for users
    private val generalInfoCollection = "generalInfo"
    private val gameInfoCollection = "gameInfo"

    // Add a new user document
    suspend fun addUser(user: User): String {
        return add(usersCollection, user, user.userId) // Using userId as the document ID
    }

    // Retrieve a user by their userId
    suspend fun getUser(userId: String): User? {
        return get(usersCollection, userId, User::class.java)
    }

    // Update a user's document
    suspend fun updateUser(userId: String, user: User) {
        update(usersCollection, userId, user)
    }

    // Delete a user by their userId
    suspend fun deleteUser(userId: String) {
        delete(usersCollection, userId)
    }

    // Add or update gameInfo in a sub-collection for a specific user
    suspend fun addGameInfo(userId: String, gameInfo: GameInfo) {
        addSubcollection(usersCollection, userId, gameInfoCollection, gameInfo, "gameInfo")
    }

    suspend fun addGeneralInfo(userId: String, generalInfo: GeneralInfo) {
        addSubcollection(usersCollection, userId, generalInfoCollection, generalInfo, "generalInfo")
    }

    // Retrieve all gameInfo documents for a specific user (though there might be only one)
    suspend fun getGameInfo(userId: String): List<GameInfo> {
        return getSubcollection(usersCollection, userId, "gameInfo", GameInfo::class.java)
    }

    suspend fun getUserGeneralInfo(userId: String): GeneralInfo? {
        val generalInfoList = getSubcollection(usersCollection, userId, generalInfoCollection, GeneralInfo::class.java)
        return if (generalInfoList.isNotEmpty()) generalInfoList[0] else null
    }
}