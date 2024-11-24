package com.example.budgeto.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.enums.category.CategoryStatus
import com.example.budgeto.data.enums.category.CategoryType
import com.example.budgeto.data.model.category.Category
import com.example.budgeto.data.repository.category.CategoryRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class CategoryViewModel @Inject constructor(
    private val categoryRepository: CategoryRepository,
    private val authRepository: AuthRepository
) : ViewModel() {

    val userId = authRepository.getCurrentUserId()
    var categories: List<Category> = emptyList()

    fun addCategory(
        name: String,
        iconLink: String = "",
        description: String = "",
        color: String = "#FFFFFF",
        type: CategoryType
    ) {
        viewModelScope.launch {
            try {
                if (userId == null || name.isBlank()) {
                    return@launch
                }

                val category = Category(
                    categoryId = "",
                    name = name,
                    iconLink = iconLink,
                    description = description,
                    color = color,
                    status = CategoryStatus.ACTIVE,
                    userId = userId
                )


                categoryRepository.addCategory(category)

                fetchCategories()
            } catch (ex: Exception) {
                Log.d("AddCategory", "Error: ${ex.message}")
            }
        }
    }

    fun fetchCategories() {
        viewModelScope.launch {
            try {
                if (userId != null) {
                    categories = categoryRepository.getAllCategories(userId)
                }
            } catch (ex: Exception) {
                Log.d("FetchCategories", "Error: ${ex.message}")
            }
        }
    }
}