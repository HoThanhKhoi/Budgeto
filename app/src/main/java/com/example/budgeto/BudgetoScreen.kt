package com.example.budgeto

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.budgeto.screens.BudgetoBottomNav
import com.example.budgeto.screens.accountscreen.AccountScreen
import com.example.budgeto.screens.historyscreen.HistoryScreen
import com.example.budgeto.screens.homepagescreen.HomepageScreen
import com.example.budgeto.screens.inventoryscreen.InventoryScreen
import com.example.budgeto.screens.loginscreen.LoginScreen
import com.example.budgeto.screens.openingscreen.OpeningScreenExpensesInputScreen
import com.example.budgeto.screens.profilescreen.ProfileScreen
import com.example.budgeto.screens.settingscreen.SettingScreen
import com.example.budgeto.screens.signuploginscreen.SignUpLoginScreen
import com.example.budgeto.screens.signupscreen.SignUpScreen
import com.example.budgeto.screens.statisticscreen.StatisticScreen
import com.example.budgeto.screens.storescreen.StoreScreen
import com.example.budgeto.viewmodel.AccountViewModel
import com.example.budgeto.viewmodel.SignUpViewModel
import com.example.budgeto.viewmodel.LoginViewModel
import com.example.budgeto.viewmodel.OpeningScreenViewModel
import com.example.budgeto.viewmodel.ProfileViewModel
import com.example.budgeto.viewmodel.TransactionViewModel

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
    AccountScreen(title = R.string.AccountScreen),
    SettingsScreen(title = R.string.SettingsScreen),
}

@Composable
fun BudgetoApp(
    navController: NavHostController = rememberNavController()

) {
    val screensWithBottomNav = setOf(
        BudgetoScreenEnum.HomepageScreen.name,
        BudgetoScreenEnum.StoreScreen.name,
        BudgetoScreenEnum.InventoryScreen.name,
        BudgetoScreenEnum.HistoryScreen.name,
        BudgetoScreenEnum.StatisticScreen.name,
        BudgetoScreenEnum.ProfileScreen.name,
        BudgetoScreenEnum.AccountScreen.name,
    )

    val loginViewModel: LoginViewModel = hiltViewModel()
    val signUpViewModel: SignUpViewModel = hiltViewModel()
    val openingScreenViewModel: OpeningScreenViewModel = hiltViewModel()
    val accountViewModel: AccountViewModel = hiltViewModel()
    val profileViewModel: ProfileViewModel = hiltViewModel()
    val transactionViewModel: TransactionViewModel = hiltViewModel()

    val isUserLoggedIn by remember { mutableStateOf(loginViewModel.isUserLoggedIn()) }
    var hasNavigatedToHome by remember { mutableStateOf(false) }

    Scaffold(
        bottomBar = {
            val currentBackStackEntry = navController.currentBackStackEntryAsState().value
            val currentScreen = currentBackStackEntry?.destination?.route

            if (currentScreen != null && (currentScreen.startsWith(BudgetoScreenEnum.HomepageScreen.name) || currentScreen in screensWithBottomNav)) {
                BudgetoBottomNav(
                    navController = navController,
                    onHomepageButtonTapped = { navController.navigate("${BudgetoScreenEnum.HomepageScreen.name}/false") },
                    onStoreButtonTapped = { navController.navigate(BudgetoScreenEnum.StoreScreen.name) },
                    onInventoryButtonTapped = { navController.navigate(BudgetoScreenEnum.InventoryScreen.name) },
                    onHistoryButtonTapped = { navController.navigate(BudgetoScreenEnum.HistoryScreen.name) },
                    onStatisticButtonTapped = { navController.navigate(BudgetoScreenEnum.StatisticScreen.name) }
                )
            }
        }
    ) { innerPadding ->
        LaunchedEffect(isUserLoggedIn) {
            if (isUserLoggedIn && !hasNavigatedToHome) {
                hasNavigatedToHome = true // Prevents repeated navigation
                navController.navigate("${BudgetoScreenEnum.HomepageScreen.name}/true") {
                    popUpTo(BudgetoScreenEnum.Login.name) { inclusive = true }
                }
            }
        }

        NavHost(
            navController = navController,
//              startDestination = BudgetoScreenEnum.Start.name,
                startDestination = BudgetoScreenEnum.Start.name,
//              startDestination = BudgetoScreenEnum.AccountScreen.name,
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
            }
            composable(route = BudgetoScreenEnum.SignUp.name) {
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
                LoginScreen(
                    loginViewModel = loginViewModel,
                    onLoginButtonTapped = {

                    },

                    onLogginSucess = {
                        navController.navigate("${BudgetoScreenEnum.HomepageScreen.name}/true") {
                            popUpTo(BudgetoScreenEnum.Login.name) { inclusive = true }
                        }
                    },

                    onSignUpTapped = { navController.navigate(BudgetoScreenEnum.SignUp.name) },
                    onForgotPasswordTapped = {},
                    onLoginWithFacebookTapped = {},
                    onLoginWithGoogleTapped = {}
                )
            }
//            composable(route = BudgetoScreenEnum.OpeningScreen.name) {
//                OpeningScreenExpensesInputScreen(
//                    onCloseCalculator = {
//                        navController.navigate(BudgetoScreenEnum.ProfileScreen.name)
////                        navController.navigate("${BudgetoScreenEnum.HomepageScreen.name}/false") {
////                            popUpTo(BudgetoScreenEnum.Login.name) { inclusive = true }
////                        }
//                    },
//                    transactionViewModel = transactionViewModel,
//                    openingScreenViewModel = openingScreenViewModel,
//                )
//            }
            composable(route = "${BudgetoScreenEnum.HomepageScreen.name}/{showBottomSheetInitially}") { backStackEntry ->
                val showBottomSheetInitially =
                    backStackEntry.arguments?.getString("showBottomSheetInitially") == "true"

                HomepageScreen(
                    onProfileButtonTapped = { navController.navigate(BudgetoScreenEnum.ProfileScreen.name) },
                    onAccountsButtonTapped = { navController.navigate(BudgetoScreenEnum.AccountScreen.name) },
                    onSettingButtonTapped = { navController.navigate(BudgetoScreenEnum.SettingsScreen.name) },
                    showBottomSheetInitially = showBottomSheetInitially,
                    transactionViewModel = transactionViewModel
                )
            }
            composable(route = BudgetoScreenEnum.ProfileScreen.name) {
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

            composable(route = BudgetoScreenEnum.InventoryScreen.name) {
                InventoryScreen()
            }

            composable(route = BudgetoScreenEnum.HistoryScreen.name) {
                HistoryScreen(
                    transactionViewModel = transactionViewModel
                )
            }

            composable(route = BudgetoScreenEnum.StatisticScreen.name) {
                StatisticScreen()
            }

            composable(route = BudgetoScreenEnum.AccountScreen.name) {
                AccountScreen(
                    accountViewModel = accountViewModel
                )
            }

            composable(route = BudgetoScreenEnum.SettingsScreen.name) {
                SettingScreen()
            }

        }

    }
}
