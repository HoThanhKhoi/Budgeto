package com.example.budgeto.data.repository.user

import com.example.budgeto.data.model.user.UserGeneralInfo
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class UserGeneralInfoRepository @Inject constructor(
    firestore: FirebaseFirestore
) : FirestoreRepository<UserGeneralInfo>(
    firestore = firestore,
    collectionPath = "userGeneralInfos",
    clazz = UserGeneralInfo::class.java
){
}