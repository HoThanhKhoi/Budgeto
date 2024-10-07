package com.example.budgeto.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.budgeto.profile1.Profile1


@Composable
fun ProfileScreen(

    modifier: Modifier = Modifier
) {
    Profile1(
        nameTextContent = "",
        birthdateTextContent = "",
        phoneNumberTextContent = "",
        addressTextContent = "",
        occupationTextContent = "",
        genderTextContent = "",
        onBackToHomepageButtonTapped = {},
        onSignOutButtonTapped = {},
        onHomepageButtonTapped = {},
        onStoreButtonTapped = {},
        onStatisticButtonTapped = {},
        onInventoryButtonTapped = {},
        onHistoryButtonTapped = {},
        onGenderOptionButtonTapped = {},
        onGoogleAccountLinkButtonTapped = {},
        onFacebookAccountLinkButtonTapped = {},
        modifier = modifier
    )
}