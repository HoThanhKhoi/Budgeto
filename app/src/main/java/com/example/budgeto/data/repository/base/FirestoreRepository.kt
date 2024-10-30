package com.example.budgeto.data.repository.base

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

open class FirestoreRepository @Inject constructor(
    private val firestore: FirebaseFirestore
) : IFirestoreRepository {

    // 1. Add or update a new document to a specific collection (optionally with a document ID)
    override suspend fun <T : Any> add(collectionName: String, item: T, documentId: String?): String {
        val collectionRef = firestore.collection(collectionName)
        val documentRef = documentId?.let { collectionRef.document(it) } ?: collectionRef.document()
        documentRef.set(item).await()
        return documentRef.id
    }

    // 2. Retrieve all documents from a specific collection
    override suspend fun <T : Any> getAll(collectionName: String, clazz: Class<T>): List<T> {
        val collectionRef = firestore.collection(collectionName)
        val documents = collectionRef.get().await()
        return documents.mapNotNull { it.toObject(clazz) }
    }

    // 3. Retrieve a specific document by ID from a collection
    override suspend fun <T : Any> get(collectionName: String, id: String, clazz: Class<T>): T? {
        val documentRef = firestore.collection(collectionName).document(id)
        val document = documentRef.get().await()
        return document.toObject(clazz)
    }

    // 4. Update a document in a collection
    override suspend fun <T : Any> update(collectionName: String, id: String, item: T) {
        val documentRef = firestore.collection(collectionName).document(id)
        documentRef.set(item).await()
    }

    // 5. Delete a document by ID from a collection
    override suspend fun delete(collectionName: String, id: String) {
        val documentRef = firestore.collection(collectionName).document(id)
        documentRef.delete().await()
    }

    // 6. Add or update a sub-collection document (optionally with a subItemId)
    override suspend fun <S : Any> addSubcollection(
        parentCollection: String,
        parentId: String,
        subcollectionPath: String,
        subItem: S,
        subItemId: String?
    ): String {
        val subCollectionRef = firestore.collection(parentCollection)
            .document(parentId)
            .collection(subcollectionPath)
        val documentRef = subItemId?.let { subCollectionRef.document(it) } ?: subCollectionRef.document()
        documentRef.set(subItem).await()
        return documentRef.id
    }

    // 7. Retrieve all documents from a sub-collection
    override suspend fun <S : Any> getAllDocumentsFromSubcollection(
        parentCollection: String,
        parentId: String,
        subcollectionPath: String,
        clazz: Class<S>
    ): List<S> {
        val subcollectionRef = firestore.collection(parentCollection)
            .document(parentId)
            .collection(subcollectionPath)
        val documents = subcollectionRef.get().await()
        return documents.mapNotNull { it.toObject(clazz) }
    }

    override suspend fun <S : Any> getSubcollectionDocument(
        parentCollection: String,
        parentId: String,
        subcollectionPath: String,
        subItemId: String,
        clazz: Class<S>
    ): S? {
        val documentRef = firestore.collection(parentCollection)
            .document(parentId)
            .collection(subcollectionPath)
            .document(subItemId)
        val document = documentRef.get().await()
        return document.toObject(clazz)
    }

    // 8. Delete a sub-collection document
    override suspend fun deleteSubcollectionDocument(
        parentCollection: String,
        parentId: String,
        subcollectionPath: String,
        subItemId: String
    ) {
        val subCollectionRef = firestore.collection(parentCollection)
            .document(parentId)
            .collection(subcollectionPath)
            .document(subItemId)
        subCollectionRef.delete().await()
    }

    override suspend fun <S : Any> updateSubcollectionDocument(
        parentCollection: String,
        parentId: String,
        subcollectionPath: String,
        subItemId: String,
        updatedItem: S
    ) {
        val documentRef = firestore.collection(parentCollection)
            .document(parentId)
            .collection(subcollectionPath)
            .document(subItemId)

        documentRef.set(updatedItem).await() // Update the document
    }
}