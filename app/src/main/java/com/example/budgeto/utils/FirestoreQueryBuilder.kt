package com.example.budgeto.utils

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.Query
import kotlinx.coroutines.tasks.await

class FirestoreQueryBuilder<T : Any>(
    private val collection: CollectionReference,
    private val clazz: Class<T>
) {
    private var query: Query = collection

    // Add a filter
    fun whereEqualTo(field: String, value: Any): FirestoreQueryBuilder<T> {
        query = query.whereEqualTo(field, value)
        return this
    }

    fun whereGreaterThan(field: String, value: Any): FirestoreQueryBuilder<T> {
        query = query.whereGreaterThan(field, value)
        return this
    }

    fun whereLessThan(field: String, value: Any): FirestoreQueryBuilder<T> {
        query = query.whereLessThan(field, value)
        return this
    }

    // Add ordering
    fun orderBy(field: String, direction: Query.Direction = Query.Direction.ASCENDING): FirestoreQueryBuilder<T> {
        query = query.orderBy(field, direction)
        return this
    }

    // Add limit
    fun limit(count: Long): FirestoreQueryBuilder<T> {
        query = query.limit(count)
        return this
    }

    // Execute the query and return results
    suspend fun get(): List<T> {
        val snapshot = query.get().await()
        return snapshot.toObjects(clazz)
    }
}