package com.example.smartlab.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LoginAndRegistrationScreen(navController: NavHostController) {
    Text(
        text = "✋  Добро пожаловать!",
        fontSize = 24.sp,
        modifier = Modifier.padding(20.dp, 0.dp, 0.dp, 30.dp),
        fontWeight = FontWeight.Bold
    )
}