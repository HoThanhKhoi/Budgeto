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

    override suspend fun getFieldValue(documentId: String, fieldName: String): Any? {
        return try {
            val documentSnapshot = collection.document(documentId).get().await()
            if (documentSnapshot.exists()) {
                documentSnapshot.get(fieldName)
            } else {
                null // Document does not exist
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null // Handle exceptions (e.g., network issues)
        }
    }

    override suspend fun addAmountToField(documentId: String, fieldName: String, amount: Double): Boolean {
        return try {
            val documentRef = collection.document(documentId)
            val documentSnapshot = documentRef.get().await()
            if (documentSnapshot.exists()) {
                val currentAmount = documentSnapshot.getDouble(fieldName) ?: 0.0
                val newAmount = currentAmount + amount
                documentRef.update(fieldName, newAmount).await()
                true
                } else {
                false
            }
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }
}