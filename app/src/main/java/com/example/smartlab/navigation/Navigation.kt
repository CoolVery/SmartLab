package com.example.smartlab.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smartlab.screens.InputCodeInEmail
import com.example.smartlab.screens.LoginAndRegistrationScreen
import com.example.smartlab.screens.StartProgramScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "StartProgram")
    {
        composable("StartProgram") {
            StartProgramScreen(navController)
        }
        composable("LoginAndRegistration") {
            LoginAndRegistrationScreen(navController)
        }
        composable("InputCodeInEmail") {
            InputCodeInEmail(navController)
        }

    }
}