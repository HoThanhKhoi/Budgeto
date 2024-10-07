package com.example.budgeto.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.budgeto.homepage02.Homepage02
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight


@Composable
fun HomepageScreen(
    onProfileButtonTapped: () -> Unit = {},
    onStoreButtonTapped: () -> Unit = {},
    onInventoryButtonTapped: () -> Unit = {},
    onHistoryButtonTapped: () -> Unit = {},
    onStatisticButtonTapped: () -> Unit = {},

    modifier: Modifier = Modifier
){
    Homepage02(
    onNewOperationButtonTapped = {},
    onBudgetoPassButtonTapped = {},
    onEventsButtonTapped = {},
    onLeftBannerTapped = {},
    onRightBannerTapped = {},
    onMainBannerTapped = {},
    onAccountsButtonTapped = {},
    onDailyMissionButtonTapped = {},
    onStoreButtonTapped = onStoreButtonTapped,
    onStatisticButtonTapped = onStatisticButtonTapped,
    onInventoryButtonTapped = onInventoryButtonTapped,
    onHistoryButtonTapped = onHistoryButtonTapped,
    onSettingButtonTapped = {},
    onRankButtonTapped = {},
    onProfileButtonTapped = onProfileButtonTapped,
    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f),
    )
}