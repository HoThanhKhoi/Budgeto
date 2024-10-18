package com.example.budgeto.tmpNavigation

sealed class Screens(val route: String) {
    object SignUpScreen : Screens(route = "SignUp_Screen")
    object SignInScreen : Screens(route = "SignIn_Screen")

}