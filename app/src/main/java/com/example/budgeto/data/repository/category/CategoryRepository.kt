package com.example.budgeto.data.repository.category

import android.util.Log
import com.example.budgeto.data.model.category.Category
import com.example.budgeto.data.repository.base.FirestoreRepository
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class CategoryRepository @Inject constructor(
    firestore: FirebaseFirestore
): FirestoreRepository<Category>(
    firestore = firestore,
    collectionPath = "category",
    clazz = Category::class.java
) {
    suspend fun addCategory(category: Category) {
        var categoryId = add(category)
        Log.d("Add category", "Category ID: $categoryId")

        if (categoryId != null) {
            updateField(
                id = categoryId,
                field = "id",
                value = categoryId
            )
        }
    }

    suspend fun getAllCategories(userId: String): List<Category> {
        return query()
            .whereEqualTo("userId", userId)
            .get()
    }


}