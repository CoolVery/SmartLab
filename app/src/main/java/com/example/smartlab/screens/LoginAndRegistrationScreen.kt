package com.example.smartlab.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
@Composable
fun CreateText(textInput: String, fontSizeText: TextUnit, fontWeightText: FontWeight?) {
    Text(
        text = textInput,
        fontSize = fontSizeText,
        fontWeight = fontWeightText)
}
@Composable
fun LoginAndRegistrationScreen(navController: NavHostController) {
    Column {
        CreateText("✋  Добро пожаловать!", 24.sp, FontWeight.Bold)
        CreateText("Войдите, чтобы пользоваться функциями приложения", 15.sp, null)
    }


}