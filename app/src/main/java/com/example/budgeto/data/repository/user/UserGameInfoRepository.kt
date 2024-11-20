package com.example.budgeto.data.repository.user

import com.example.budgeto.data.model.user.UserGameInfo
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class UserGameInfoRepository @Inject constructor(
    firestore: FirebaseFirestore
): FirestoreRepository<UserGameInfo>(
    firestore = firestore,
    collectionPath = "userGameInfos",
    clazz = UserGameInfo::class.java
) {
}