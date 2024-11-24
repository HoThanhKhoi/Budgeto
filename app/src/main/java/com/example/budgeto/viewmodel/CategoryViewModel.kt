package com.example.budgeto.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.enums.category.CategoryStatus
import com.example.budgeto.data.enums.category.CategoryType
import com.example.budgeto.data.model.category.Category
import com.example.budgeto.data.model.transaction.Transaction
import com.example.budgeto.data.repository.category.CategoryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    private val categoryRepository: CategoryRepository,
    private val authRepository: AuthRepository
) : ViewModel() {

    val userId = authRepository.getCurrentUserId()

    private val _categories = MutableStateFlow<List<Category>>(emptyList())
    val categories: StateFlow<List<Category>> = _categories
    init {
        fetchCategories()
    }

    fun addCategory(
        name: String,
        iconLink: String = "",
        description: String = "",
        color: String = "#FFFFFF",
        status: CategoryStatus
    ) {
        viewModelScope.launch {
            try {
                if (userId == null || name.isBlank()) {
                    return@launch
                }

                val category = Category(
                    name = name,
                    iconLink = iconLink,
                    description = description,
                    color = color,
                    status = status,
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
                    val fetchedCategories = categoryRepository.getAllCategories(userId)
                    _categories.value = fetchedCategories // Update StateFlow
                    Log.d("FetchCategories", "Fetched categories: $fetchedCategories")
                }
            } catch (ex: Exception) {
                Log.d("FetchCategories", "Error: ${ex.message}")
            }
        }
    }

    fun updateCategory(categoryId: String, updatedCategory: Category) {
        viewModelScope.launch {
            try {
                if (userId == null) return@launch

                val isUpdated = categoryRepository.update(categoryId, updatedCategory)
                if (isUpdated) {
                    fetchCategories() // Refresh the transaction list
                    Log.d("UpdateCategory", "Category updated successfully")
                } else {
                    Log.d("UpdateCategory", "Failed to update the category")
                }
            } catch (ex: Exception) {
                Log.d("UpdateCategory", "Error: ${ex.message}")
            }
        }
    }

    fun deleteCategory(categoryId: String) {
        viewModelScope.launch {
            try {
                categoryRepository.delete(categoryId)
                fetchCategories() // Refresh the list after deletion
            } catch (ex: Exception) {
                Log.d("DeleteCategory", "Error: ${ex.message}")
            }
        }
    }
}