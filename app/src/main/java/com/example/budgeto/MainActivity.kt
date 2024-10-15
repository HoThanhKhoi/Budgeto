package com.example.budgeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.budgeto.navigationLogin.NavigationGraph
import com.example.budgeto.ui.theme.BudgetoTheme
import com.example.budgeto_figma_to_code_test01.BudgetoApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            BudgetoTheme {
//                BudgetoApp()
//            }
            NavigationGraph()
        }
    }
}