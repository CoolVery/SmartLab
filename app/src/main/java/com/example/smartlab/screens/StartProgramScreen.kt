package com.example.smartlab.screens

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun SwitchingThePage(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
        // portrait mode
        LaunchedEffect(key1 = true) {
            // Customize the delay time
            delay(1500L)
            navController.navigate("StartScreen") {
                popUpTo("FirstScreen") //удаляет страницу и стека, чтобы не было возможности вернуться к этому экрану
                {
                    inclusive = true
                }
            }
        }
    }
}

@Composable
fun StartProgramScreen(navController: NavHostController) {
    SwitchingThePage(navController)
}