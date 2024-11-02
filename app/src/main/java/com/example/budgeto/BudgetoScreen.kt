package com.example.budgeto

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.budgeto.screens.accountscreen.AccountScreen
import com.example.budgeto.screens.homepagescreen.HomepageScreen
import com.example.budgeto.screens.loginscreen.LoginScreen
import com.example.budgeto.screens.openingscreen.OpeningScreenExpensesInputScreen
import com.example.budgeto.screens.profilescreen.ProfileScreen
import com.example.budgeto.screens.signuploginscreen.SignUpLoginScreen
import com.example.budgeto.screens.signupscreen.SignUpScreen
import com.example.budgeto.screens.storescreen.StoreScreen
import com.example.budgeto.viewmodel.SignUpViewModel
import com.example.budgeto.viewmodel.LoginViewModel
import com.example.budgeto.viewmodel.ProfileViewModel

enum class BudgetoScreenEnum(@StringRes val title: Int) {
    Start(title = R.string.SignUpLoginScreen),
    Login(title = R.string.LoginScreen),
    SignUp(title = R.string.SignUpScreen),
    OpeningScreen(title = R.string.OpeningScreenExpensesInputScreen),
    HomepageScreen(title = R.string.HomepageScreen),
    ProfileScreen(title = R.string.ProfileScreen),
    StoreScreen(title = R.string.StoreScreen),
    InventoryScreen(title = R.string.InventoryScreen),
    HistoryScreen(title = R.string.HistoryScreen),
    StatisticScreen(title = R.string.StatisticScreen),
    AccountScreen(title = R.string.AccountScreen)
}

@Composable
fun BudgetoApp(
    navController: NavHostController = rememberNavController(),
    //loginViewModel: LoginViewModel = hiltViewModel()
) {
    Scaffold() { innerPadding ->
        val loginViewModel: LoginViewModel = hiltViewModel()
        val isUserLoggedIn by remember { mutableStateOf(loginViewModel.isUserLoggedIn()) }
        NavHost(
            navController = navController,
              //startDestination = BudgetoScreenEnum.Start.name,
//            startDestination = if (isUserLoggedIn) BudgetoScreenEnum.ProfileScreen.name else BudgetoScreenEnum.Start.name,
              startDestination = BudgetoScreenEnum.AccountScreen.name,
//            startDestination = BudgetoScreenEnum.ProfileScreen.name,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ) {
            composable(route = BudgetoScreenEnum.Start.name) {
                SignUpLoginScreen(
                    onSignUpTapped = { navController.navigate(BudgetoScreenEnum.SignUp.name) },
                    onLoginTapped = { navController.navigate(BudgetoScreenEnum.Login.name) }
                )
//                OpeningScreenExpensesInputScreen()
            }
            composable(route = BudgetoScreenEnum.SignUp.name) {
                val signUpViewModel: SignUpViewModel = hiltViewModel()
                SignUpScreen(
                    signUpViewModel = signUpViewModel,
                    onSignUpButtonTapped = {
                        navController.navigate(BudgetoScreenEnum.Login.name)
                    },

                    onLoginButtonTapped = { navController.navigate(BudgetoScreenEnum.Login.name) },
                    onForgotPasswordLinkTapped = {},
                    onIconEyeTapped = {},
                    onLoginWithFacebookTapped = {},
                    onLoginWithGoogleTapped = {},
                )
            }
            composable(route = BudgetoScreenEnum.Login.name) {

                val loginViewModel: LoginViewModel = hiltViewModel()
                LoginScreen(
                    loginViewModel = loginViewModel,
                    onLoginButtonTapped = {
                        navController.navigate(BudgetoScreenEnum.ProfileScreen.name)
                        //navController.navigate(BudgetoScreenEnum.OpeningScreen.name)
                    },

                    onSignUpTapped = { navController.navigate(BudgetoScreenEnum.SignUp.name) },
                    onForgotPasswordTapped = {},
                    onLoginWithFacebookTapped = {},
                    onLoginWithGoogleTapped = {}
                )
            }
            composable(route = BudgetoScreenEnum.OpeningScreen.name) {
                OpeningScreenExpensesInputScreen(
                )
            }
            composable(route = BudgetoScreenEnum.HomepageScreen.name) {
                HomepageScreen(
                    onProfileButtonTapped = { navController.navigate(BudgetoScreenEnum.ProfileScreen.name) },
                    onStoreButtonTapped = { navController.navigate(BudgetoScreenEnum.StoreScreen.name) },
                    onInventoryButtonTapped = { navController.navigate(BudgetoScreenEnum.InventoryScreen.name) },
                    onHistoryButtonTapped = { navController.navigate(BudgetoScreenEnum.HistoryScreen.name) },
                    onStatisticButtonTapped = { navController.navigate(BudgetoScreenEnum.StatisticScreen.name) },

                )
            }
            composable(route = BudgetoScreenEnum.ProfileScreen.name) {
                val profileViewModel: ProfileViewModel = hiltViewModel()
                ProfileScreen(
                    viewModel = profileViewModel,
                )
            }
            composable(route = BudgetoScreenEnum.StoreScreen.name) {
                StoreScreen(
                    onHomepageButtonTapped = { navController.navigate(BudgetoScreenEnum.HomepageScreen.name) },
                    onStoreButtonTapped = { navController.navigate(BudgetoScreenEnum.StoreScreen.name) },
                    onInventoryButtonTapped = { navController.navigate(BudgetoScreenEnum.InventoryScreen.name) },
                    onHistoryButtonTapped = { navController.navigate(BudgetoScreenEnum.HistoryScreen.name) },
                    onStatisticButtonTapped = { navController.navigate(BudgetoScreenEnum.StatisticScreen.name) },
                )
            }

            composable(route = BudgetoScreenEnum.AccountScreen.name) {
                AccountScreen()
            }

        }

    }
}
