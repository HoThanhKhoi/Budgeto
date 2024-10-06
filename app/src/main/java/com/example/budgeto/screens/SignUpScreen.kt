package com.example.budgeto.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.budgeto.signup.SignUp
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier
){
    SignUp(
        signUp = {},
        onLoginButtonTapped = {},
        fullName = "Full Name",
        email = "Email",
        onForgotPasswordLinkTapped = {},
        password = "Password",
        onIconEyeTapped = {},
        onLoginWithFacebookTapped = {},
        onLoginWithGoogleTapped = {},
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )

}