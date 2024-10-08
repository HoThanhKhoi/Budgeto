package com.example.budgeto_figma_to_code_test01

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.budgeto.R
import com.example.budgeto.screens.HomepageScreen
import com.example.budgeto.screens.LoginScreen
import com.example.budgeto.screens.OpeningScreenExpensesInputScreen
import com.example.budgeto.screens.ProfileScreen
import com.example.budgeto.screens.SignUpLoginScreen
import com.example.budgeto.screens.SignUpScreen
import com.example.budgeto.screens.StoreScreen

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
}

@Composable
fun BudgetoApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold () { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = BudgetoScreenEnum.Start.name,
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
            }
            composable(route = BudgetoScreenEnum.SignUp.name) {
                SignUpScreen(
                    onSignUpButtonTapped = { navController.navigate(BudgetoScreenEnum.HomepageScreen.name) },
                )
            }
            composable(route = BudgetoScreenEnum.Login.name) {
                LoginScreen(
                    onLoginButtonTapped = { navController.navigate(BudgetoScreenEnum.OpeningScreen.name) },
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
                ProfileScreen(
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
        }

    }
}