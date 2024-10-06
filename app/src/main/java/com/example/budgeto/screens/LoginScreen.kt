package com.example.budgeto.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.budgeto.login.Login
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun LoginScreen(
    onLoginButtonTapped: () -> Unit = {},
    modifier: Modifier = Modifier
){
    Login(
        onLoginTapped = onLoginButtonTapped,
        onSignUpTapped = {},
        email = "Email",
        onForgotPasswordTapped = {},
        password = "Password",
        onIconEyeTapped = {},
        onLoginWithGoogleTapped = {},
        onLoginWithFacebookTapped = {},
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}