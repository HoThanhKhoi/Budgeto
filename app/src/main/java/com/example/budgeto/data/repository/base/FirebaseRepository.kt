package com.example.budgeto.data.repository.base

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

open class FirestoreRepository<T : Any>(private val collectionPath: String, private val clazz: Class<T>) :
    IFirebaseRepository<T> {
    private val firestore = FirebaseFirestore.getInstance()
    private val collectionRef = firestore.collection(collectionPath)

    override suspend fun add(item: T): String {
        val document = collectionRef.add(item).await()
        return document.id
    }

    override suspend fun get(id: String): T? {
        val document = collectionRef.document(id).get().await()
        return document.toObject(clazz)
    }

    override suspend fun update(id: String, item: T) {
        collectionRef.document(id).set(item).await()
    }

    override suspend fun delete(id: String) {
        collectionRef.document(id).delete().await()
    }

    override suspend fun getAll(): List<T> {
        val documents = collectionRef.get().await()
        return documents.mapNotNull { it.toObject(clazz) }
    }

    //subcollection
    override suspend fun addSubcollection(
        parentId: String,
        subcollectionPath: String,
        item: T
    ): String {
        val subcollectionRef = collectionRef.document(parentId).collection(subcollectionPath)
        val document = subcollectionRef.add(item).await()
        return document.id
    }

    override suspend fun getSubcollection(
        parentId: String,
        subcollectionPath: String
    ): List<T> {
        val subcollectionRef = collectionRef.document(parentId).collection(subcollectionPath)
        val documents = subcollectionRef.get().await()
        return documents.mapNotNull { it.toObject(clazz) }
    }

    // Utility method to traverse nested subcollections
    private fun getNestedCollection(
        parentId: String,
        paths: List<String>
    ): CollectionReference {
        var ref: CollectionReference = collectionRef.document(parentId).collection(paths[0])
        for (i in 1 until paths.size) {
            ref = ref.document(paths[i - 1]).collection(paths[i])
        }
        return ref
    }
}
