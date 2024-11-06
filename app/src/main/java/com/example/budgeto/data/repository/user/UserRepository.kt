package com.example.budgeto.data.repository.user

import android.util.Log
import com.example.budgeto.data.model.user.UserGameInfo
import com.example.budgeto.data.model.user.UserGeneralInfo
import com.example.budgeto.data.model.user.UserMoneyInfo
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.example.budgeto.data.model.user.User
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class UserRepository @Inject constructor(
    firestore: FirebaseFirestore,
) : FirestoreRepository(firestore) {
    private val usersCollectionPath = "users" // Firestore collection name for users
    private val infoCollectionPath = "info"
    private val loginLogsCollectionPath = "loginLogs"

    suspend fun getAllUsers() : List<User> {
        val users = getAll(usersCollectionPath, User::class.java)
        return users
    }

    suspend fun countUsers(): Int {
        val users = getAllUsers()
        return users.size
    }

    // Add a new user document
    suspend fun addUser(
        user: User,
        userGeneralInfo: UserGeneralInfo = UserGeneralInfo(),
        userGameInfo: UserGameInfo = UserGameInfo(),
        userMoneyInfo: UserMoneyInfo = UserMoneyInfo()
    ): String {
        val userId = add(usersCollectionPath, user, user.userId) // Using userId as the document ID
        addGeneralInfo(userId, userGeneralInfo)
        addGameInfo(userId, userGameInfo)
        addMoneyInfo(userId, userMoneyInfo)
        return userId
    }

    // Retrieve a user by their userId
    suspend fun getUser(userId: String): User? {
        return get(usersCollectionPath, userId, User::class.java)
    }

    suspend fun updateUserLastSignInTime(userId: String) {
        updateField(usersCollectionPath, userId, "lastSignInTime", Timestamp.now())
    }

    // Update a user's document
    suspend fun updateUser(userId: String, user: User) {
        update(usersCollectionPath, userId, user)
    }

    // Delete a user by their userId
    suspend fun deleteUser(userId: String) {
        delete(usersCollectionPath, userId)
    }

    // Add or update gameInfo in a sub-collection for a specific user
    suspend fun addGameInfo(userId: String, userGameInfo: UserGameInfo) : String{
        return addDocumentToSubcollection(usersCollectionPath, userId, infoCollectionPath, userGameInfo, "gameInfo")
    }

    suspend fun addGeneralInfo(userId: String, userGeneralInfo: UserGeneralInfo) : String{
        return addDocumentToSubcollection(usersCollectionPath, userId, infoCollectionPath, userGeneralInfo, "generalInfo")
    }

    suspend fun addMoneyInfo(userId: String, userMoneyInfo: UserMoneyInfo) : String {
        return addDocumentToSubcollection(usersCollectionPath, userId, infoCollectionPath, userMoneyInfo, "moneyInfo")
    }

    suspend fun getUserGeneralInfo(userId: String): UserGeneralInfo? {
        return try {
            val generalInfo = getSubcollectionDocument(usersCollectionPath, userId, infoCollectionPath, "generalInfo", UserGeneralInfo::class.java)
            Log.d("UserRepository", "GeneralInfo: $generalInfo")
            generalInfo
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    suspend fun updateUserGeneralInfo(userId: String, updatedUserGeneralInfo: UserGeneralInfo) {
        try {
            updateSubcollectionDocument(usersCollectionPath, userId, infoCollectionPath, "generalInfo", updatedUserGeneralInfo)
            Log.d("UserRepository", "User's GeneralInfo updated successfully.")
        } catch (e: Exception) {
            e.printStackTrace()
            Log.e("UserRepository", "Failed to update User's GeneralInfo: ${e.message}")
        }
    }

    suspend fun getUserMoneyInfo(userId: String): UserMoneyInfo? {
        return try {
            val userMoneyInfo = getSubcollectionDocument(usersCollectionPath, userId, infoCollectionPath, "moneyInfo", UserMoneyInfo::class.java)
            Log.d("UserRepository", "MoneyInfo: $userMoneyInfo")
            userMoneyInfo
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}