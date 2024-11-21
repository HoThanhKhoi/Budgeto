package com.example.budgeto.data.repository.base

interface IFirestoreRepository<T> {
    suspend fun add(data: T, documentId: String? = null): String?
    suspend fun getAll(): List<T>?
    suspend fun getById(id: String): T?
    suspend fun update(id: String, data: T): Boolean
    suspend fun delete(id: String): Boolean
    suspend fun queryDocuments(field: String, value: Any): List<T>?
    suspend fun getAllByField(field: String, value: Any): List<T>?
}

