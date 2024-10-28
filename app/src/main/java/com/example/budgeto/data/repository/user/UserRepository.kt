package com.example.budgeto.data.repository.user

import com.example.budgeto.data.model.user.UserGameInfo
import com.example.budgeto.data.model.user.UserGeneralInfo
import com.example.budgeto.data.model.user.MoneyInfo
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.example.budgeto.data.model.user.User
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class UserRepository @Inject constructor(
    firestore: FirebaseFirestore
) : FirestoreRepository(firestore) {

    private val usersCollectionPath = "users" // Firestore collection name for users
    private val infoCollectionPath = "info"

    // Add a new user document
    suspend fun addUser(
        user: User,
        userGeneralInfo: UserGeneralInfo = UserGeneralInfo(),
        userGameInfo: UserGameInfo = UserGameInfo(),
        moneyInfo: MoneyInfo = MoneyInfo()
    ): String {
        val userId = add(usersCollectionPath, user, user.userId) // Using userId as the document ID
        addGeneralInfo(userId, userGeneralInfo)
        addGameInfo(userId, userGameInfo)
        addMoneyInfo(userId, moneyInfo)
        return userId
    }

    // Retrieve a user by their userId
    suspend fun getUser(userId: String): User? {
        return get(usersCollectionPath, userId, User::class.java)
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
        return addSubcollection(usersCollectionPath, userId, infoCollectionPath, userGameInfo, "gameInfo")
    }

    suspend fun addGeneralInfo(userId: String, userGeneralInfo: UserGeneralInfo) : String{
        return addSubcollection(usersCollectionPath, userId, infoCollectionPath, userGeneralInfo, "generalInfo")
    }

    suspend fun addMoneyInfo(userId: String, moneyInfo: MoneyInfo) : String {
        return addSubcollection(usersCollectionPath, userId, infoCollectionPath, moneyInfo, "moneyInfo")
    }

    // Retrieve all gameInfo documents for a specific user (though there might be only one)
    suspend fun getGameInfo(userId: String): List<UserGameInfo> {
        return getSubcollection(usersCollectionPath, userId, "gameInfo", UserGameInfo::class.java)
    }

    suspend fun getUserGeneralInfo(userId: String): UserGeneralInfo? {
        val userGeneralInfoList = getSubcollection(usersCollectionPath, userId, infoCollectionPath, UserGeneralInfo::class.java)
        return if (userGeneralInfoList.isNotEmpty()) userGeneralInfoList[0] else null
    }

    suspend fun updateUserGeneralInfo(userId: String, updatedUserGeneralInfo: UserGeneralInfo) {
        try {
            // Use addGeneralInfo to add or update the user's GeneralInfo
            addGeneralInfo(userId, updatedUserGeneralInfo)
            println("User's GeneralInfo updated successfully.")
        } catch (e: Exception) {
            e.printStackTrace()
            println("Failed to update User's GeneralInfo: ${e.message}")
        }
    }
}