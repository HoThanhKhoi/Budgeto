package com.example.budgeto.data.repository.base

interface IFirestoreRepository {

    // General operations
    suspend fun <T : Any> getAll(collectionName: String, clazz: Class<T>): List<T>
    suspend fun <T : Any> get(collectionName: String, id: String, clazz: Class<T>): T?
    suspend fun <T : Any> add(collectionName: String, item: T, documentId: String? = null): String
    suspend fun <T : Any> update(collectionName: String, id: String, item: T)
    suspend fun delete(collectionName: String, id: String)

    // Sub-collection operations
    suspend fun <S : Any> getSubcollectionDocument(
        parentCollection: String,
        parentId: String,
        subcollectionPath: String,
        subItemId: String,
        clazz: Class<S>
    ): S?
    suspend fun <S : Any> addSubcollection(parentCollection: String, parentId: String, subcollectionPath: String, subItem: S, subItemId: String? = null): String
    suspend fun <S : Any> getAllDocumentsFromSubcollection(parentCollection: String, parentId: String, subcollectionPath: String, clazz: Class<S>): List<S>
    suspend fun deleteSubcollectionDocument(parentCollection: String, parentId: String, subcollectionPath: String, subItemId: String
    )
}