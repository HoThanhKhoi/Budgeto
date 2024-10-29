package com.example.budgeto

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BudgetoApplication: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}