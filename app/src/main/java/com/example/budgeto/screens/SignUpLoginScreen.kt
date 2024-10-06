package com.example.budgeto.screens

import androidx.compose.runtime.Composable
import com.example.budgeto.signuplogin.SignUpLogin
import androidx.compose.ui.Modifier
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun SignUpLoginScreen(
    modifier: Modifier = Modifier,
    onSignUpTapped: () -> Unit = {},
    onLoginTapped: () -> Unit = {}
){
    SignUpLogin(
        onSignUpButtonTapped = onSignUpTapped,
        onLoginButtonTapped = onLoginTapped,
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}