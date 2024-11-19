package com.example.budgeto.data.repository.base

interface IFirestoreRepository<T> {
    suspend fun add(data: T, documentId: String? = null): String?
    suspend fun getAll(): List<T>?
    suspend fun getById(id: String): T?
    suspend fun update(id: String, data: Map<String, Any>): Boolean
    suspend fun delete(id: String): Boolean
    suspend fun queryDocuments(field: String, value: Any): List<T>?
}

//package com.example.budgeto.data.repository.base
//
//interface IFirestoreRepository {
//
//    //region Handle documents in parent collection
//    // 1. Add new document to a collection - if documentId is null then it is random generated
//    suspend fun <T : Any> add(collectionName: String, item: T, documentId: String? = null): String
//
//    // 2. Get all documents from a parent collection
//    suspend fun <T : Any> getAll(collectionName: String, clazz: Class<T>): List<T>
//
//    // 3. Get a specific document by ID from parent collection
//    suspend fun <T : Any> get(collectionName: String, id: String, clazz: Class<T>): T?
//
//    // 4. Update a document in parent collection
//    suspend fun <T : Any> update(collectionName: String, id: String, item: T)
//
//    // 5. Delete a document by ID from parent collection
//    suspend fun delete(collectionName: String, id: String)
//
//    // 6. Update multiple fields in a document from parent collection
//    suspend fun updateFields(collectionName: String, documentId: String, updates: Map<String, Any>)
//
//    // 7. Update one field in a document from parent collection
//    suspend fun updateField(collectionName: String, documentId: String, field: String, value: Any)
//    //endregion
//
//    //region Handle documents in sub-collection
//    // 1. Add a sub-collection document (optionally with a subItemId, if null then random generated)
//    suspend fun <S : Any> addDocumentToSubcollection(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItem: S,
//        subItemId: String? = null): String
//
//    // 2. Get all documents from a sub-collection
//    suspend fun <S : Any> getAllDocumentsFromSubcollection(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        clazz: Class<S>): List<S>
//
//    // 3. Get a specific document from a sub-collection by ID
//    suspend fun <S : Any> getSubcollectionDocument(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String,
//        clazz: Class<S>
//    ): S?
//
//    // 4. Delete a sub-collection document by ID
//    suspend fun deleteSubcollectionDocument(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String
//    )
//
//    // 5. Update a sub-collection by Id
//    suspend fun <S : Any> updateSubcollectionDocument(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String,
//        updatedItem: S
//    )
//
//    // 6. Update multiple fields in a sub-collection document
//    suspend fun updateSubcollectionFields(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String,
//        updates: Map<String, Any>
//    )
//
//    // 7. Update one field in a sub-collection document
//    suspend fun updateSubcollectionField(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String,
//        field: String,
//        value: Any
//    )
//    //endregion
//}