package com.example.budgeto.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.budgeto.signup.SignUp
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun SignUpScreen(
    onSignUpButtonTapped: () -> Unit = {},
    modifier: Modifier = Modifier
){
    SignUp(
        onSignUpButtonTapped = onSignUpButtonTapped,
        fullName = "Full Name",
        email = "Email",
        onForgotPasswordLinkTapped = {},
        password = "Password",
        onLoginButtonTapped = {},
        onIconEyeTapped = {},
        onLoginWithFacebookTapped = {},
        onLoginWithGoogleTapped = {},
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f)
    )

}