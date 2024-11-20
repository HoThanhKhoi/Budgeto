package com.example.budgeto.data.repository.base

import com.example.budgeto.data.repository.base.IFirestoreRepository
import com.example.budgeto.utils.FirestoreQueryBuilder
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

open class FirestoreRepository<T : Any>(
    private val firestore: FirebaseFirestore,
    private val collectionPath: String,
    private val clazz: Class<T>
) : IFirestoreRepository<T> {

    private val collection: CollectionReference = firestore.collection(collectionPath)

    fun query(): FirestoreQueryBuilder<T> {
        return FirestoreQueryBuilder(collection, clazz)
    }

    override suspend fun add(data: T, documentId: String?): String? {
        return try {
            val document = if (documentId != null) {
                collection.document(documentId).set(data).await()
                documentId
            } else {
                val addedDocument = collection.add(data).await()
                addedDocument.id
            }
            document
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun getAll(): List<T>? {
        return try {
            val snapshot = collection.get().await()
            snapshot.toObjects(clazz)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun getById(id: String): T? {
        return try {
            val document = collection.document(id).get().await()
            document.toObject(clazz)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun update(id: String, data: T): Boolean {
        return try {
            collection.document(id).set(data).await()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    override suspend fun delete(id: String): Boolean {
        return try {
            collection.document(id).delete().await()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    suspend fun updateField(id: String, field: String, value: Any): Boolean {
        return try {
            collection.document(id).update(field, value).await()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    override suspend fun queryDocuments(field: String, value: Any): List<T>? {
        return try {
            val snapshot = collection.whereEqualTo(field, value).get().await()
            snapshot.toObjects(clazz)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun getAllByField(field: String, value: Any): List<T>? {
        return try {
            val querySnapshot = collection.whereEqualTo(field, value).get().await()
            querySnapshot.toObjects(clazz)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}


//package com.example.budgeto.data.repository.base
//
//import com.google.firebase.firestore.FirebaseFirestore
//import kotlinx.coroutines.tasks.await
//import javax.inject.Inject
//
//open class FirestoreRepository @Inject constructor(
//    private val firestore: FirebaseFirestore
//) : IFirestoreRepository {
//
//    //region Handle documents in parent collection
//    // 1. Add new document to a collection - if documentId is null then it is random generated
//    override suspend fun <T : Any> add(collectionName: String, item: T, documentId: String?): String {
//        val collectionRef = firestore.collection(collectionName)
//        val documentRef = documentId?.let { collectionRef.document(it) } ?: collectionRef.document()
//        documentRef.set(item).await()
//        return documentRef.id
//    }
//
//    // 2. Get all documents from a parent collection
//    override suspend fun <T : Any> getAll(collectionName: String, clazz: Class<T>): List<T> {
//        val collectionRef = firestore.collection(collectionName)
//        val documents = collectionRef.get().await()
//        return documents.mapNotNull { it.toObject(clazz) }
//    }
//
//    // 3. Get a specific document by ID from parent collection
//    override suspend fun <T : Any> get(collectionName: String, id: String, clazz: Class<T>): T? {
//        val documentRef = firestore.collection(collectionName).document(id)
//        val document = documentRef.get().await()
//        return document.toObject(clazz)
//    }
//
//    // 4. Update a document in parent collection
//    override suspend fun <T : Any> update(collectionName: String, id: String, item: T) {
//        val documentRef = firestore.collection(collectionName).document(id)
//        documentRef.set(item).await()
//    }
//
//    // 5. Delete a document by ID from parent collection
//    override suspend fun delete(collectionName: String, id: String) {
//        val documentRef = firestore.collection(collectionName).document(id)
//        documentRef.delete().await()
//    }
//
//    //6. Update multiple fields in a document from parent collection
//    override suspend fun updateFields(
//        collectionName: String,
//        documentId: String,
//        updates: Map<String, Any>
//    ) {
//        val documentRef = firestore.collection(collectionName).document(documentId)
//        documentRef.update(updates).await()
//    }
//
//    //7. Update one field in a document from parent collection
//    override suspend fun updateField(
//        collectionName: String,
//        documentId: String,
//        field: String,
//        value: Any
//    ) {
//        val documentRef = firestore.collection(collectionName).document(documentId)
//        documentRef.update(field, value).await()
//    }
//    //endregion
//
//    //region Handle documents in sub-collection
//    // 1. Add a sub-collection document (optionally with a subItemId, if null then random generated)
//    override suspend fun <S : Any> addDocumentToSubcollection(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItem: S,
//        subItemId: String?
//    ): String {
//        val subCollectionRef = firestore.collection(parentCollection)
//            .document(parentId)
//            .collection(subcollectionPath)
//        val documentRef = subItemId?.let { subCollectionRef.document(it) } ?: subCollectionRef.document()
//        documentRef.set(subItem).await()
//        return documentRef.id
//    }
//
//    // 2. Get all documents from a sub-collection
//    override suspend fun <S : Any> getAllDocumentsFromSubcollection(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        clazz: Class<S>
//    ): List<S> {
//        val subcollectionRef = firestore.collection(parentCollection)
//            .document(parentId)
//            .collection(subcollectionPath)
//        val documents = subcollectionRef.get().await()
//        return documents.mapNotNull { it.toObject(clazz) }
//    }
//
//    // 3. Get a specific document from a sub-collection by ID
//    override suspend fun <S : Any> getSubcollectionDocument(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String,
//        clazz: Class<S>
//    ): S? {
//        val documentRef = firestore.collection(parentCollection)
//            .document(parentId)
//            .collection(subcollectionPath)
//            .document(subItemId)
//        val document = documentRef.get().await()
//        return document.toObject(clazz)
//    }
//
//    // 4. Delete a sub-collection document by ID
//    override suspend fun deleteSubcollectionDocument(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String
//    ) {
//        val subCollectionRef = firestore.collection(parentCollection)
//            .document(parentId)
//            .collection(subcollectionPath)
//            .document(subItemId)
//        subCollectionRef.delete().await()
//    }
//
//    //5. Update a sub-collection by Id
//    override suspend fun <S : Any> updateSubcollectionDocument(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String,
//        updatedItem: S
//    ) {
//        val documentRef = firestore.collection(parentCollection)
//            .document(parentId)
//            .collection(subcollectionPath)
//            .document(subItemId)
//
//        documentRef.set(updatedItem).await() // Update the document
//    }
//
//    //6. Update multiple fields in a sub-collection document
//    override suspend fun updateSubcollectionFields(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String,
//        updates: Map<String, Any>
//    ) {
//        val documentRef = firestore.collection(parentCollection)
//            .document(parentId)
//            .collection(subcollectionPath)
//            .document(subItemId)
//
//        documentRef.update(updates).await()
//    }
//
//    // 7. Update one field in a sub-collection document
//    override suspend fun updateSubcollectionField(
//        parentCollection: String,
//        parentId: String,
//        subcollectionPath: String,
//        subItemId: String,
//        field: String,
//        value: Any
//    ) {
//        val documentRef = firestore.collection(parentCollection)
//            .document(parentId)
//            .collection(subcollectionPath)
//            .document(subItemId)
//
//        documentRef.update(field, value).await()
//    }
//    //endregion
//}