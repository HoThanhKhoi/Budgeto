package com.example.budgeto.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.budgeto.signup.SignUp
import com.example.budgeto.store1.Store1
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun StoreScreen(
    onStoreButtonTapped: () -> Unit = {},
    onInventoryButtonTapped: () -> Unit = {},
    onStatisticButtonTapped: () -> Unit = {},
    onHomepageButtonTapped: () -> Unit = {},
    onHistoryButtonTapped: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Store1(
        onStoreButtonTapped = onStoreButtonTapped,
        onInventoryButtonTapped = onInventoryButtonTapped,
        onStatisticButtonTapped = onStatisticButtonTapped,
        onHomepageButtonTapped = onHomepageButtonTapped,
        onHistoryButtonTapped = onHistoryButtonTapped,
        modifier = modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)
    )
}