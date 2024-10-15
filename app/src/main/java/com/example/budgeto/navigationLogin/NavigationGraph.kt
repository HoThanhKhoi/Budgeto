package com.example.budgeto.navigationLogin

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.budgeto.screens.LoginScreen
import com.example.budgeto.screens.SignUpScreen

@Composable
fun NavigationGraph(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = Screens.LoginScreen.route
    ) {
        composable(route = Screens.SignUpScreen.route) {
            SignUpScreen()
        }
        composable(route = Screens.LoginScreen.route) {
            LoginScreen()
        }

    }

}