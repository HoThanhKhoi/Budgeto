package com.example.budgeto.data.model.category

import com.example.budgeto.data.enums.category.CategoryStatus
import com.example.budgeto.data.enums.category.CategoryType

data class Category(
    val name: String = "",
    val iconLink: String = "",
    val description: String = "",
    val color: String = "",
    val status: CategoryStatus = CategoryStatus.ACTIVE,
    val userId: String,
)
