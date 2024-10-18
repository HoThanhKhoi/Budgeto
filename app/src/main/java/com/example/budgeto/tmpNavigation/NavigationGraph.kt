package com.example.budgeto.tmpNavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.budgeto.screens.demo.SignInScreen
import com.example.budgeto.screens.demo.SignUpScreen
import com.example.budgeto.viewmodel.AuthViewModel

//import com.example.budgeto.screens.SignUpScreen

@Composable
fun NavigationGraph(
    modifier: Modifier = Modifier, authViewModel: AuthViewModel
) {
//    NavHost(
//        navController = navController,
//        startDestination = Screens.SignInScreen.route
//    ) {
////        composable(route = Screens.SignUpScreen.route) {
////            SignUpScreen()
////        }
//        composable(route = Screens.SignInScreen.route) {
//            SignInScreen()
//        }
//
//    }
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "signin", builder =  {
        composable("signin") {
            SignInScreen(modifier, navController, authViewModel)
        }
        composable("signup") {
            SignUpScreen()
        }
    })

}