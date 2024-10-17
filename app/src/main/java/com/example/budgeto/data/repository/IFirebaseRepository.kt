package com.example.budgeto.data.repository

interface IFirebaseRepository<T> {
    suspend fun getAll(): List<T>
    suspend fun get(id:String): T?
    suspend fun add(item: T): String
    suspend fun update(id: String, item: T)
    suspend fun delete(id: String)

    //sub-collection
    suspend fun addSubcollection(parentId: String, subcollectionPath: String, item: T): String
    suspend fun getSubcollection(parentId: String, subcollectionPath: String): List<T>
}