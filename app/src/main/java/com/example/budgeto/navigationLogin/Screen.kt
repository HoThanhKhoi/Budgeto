package com.example.budgeto.navigationLogin

sealed class Screens(val route: String) {
    object SignUpScreen : Screens(route = "SignUpScreen")
    object LoginScreen : Screens(route = "LoginScreen")

}