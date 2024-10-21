package com.example.budgeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import com.example.budgeto.ui.theme.BudgetoTheme
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BudgetoTheme {
                BudgetoApp()

//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    NavigationGraph(modifier = Modifier.padding(innerPadding), authViewModel = authViewModel)
//                }
            }
        }
    }
}