package com.example.budgeto.navigationLogin

sealed class Screens(val route: String) {
    object SignUpScreen : Screens(route = "SignUp_Screen")
    object LoginScreen : Screens(route = "Login_Screen")

}