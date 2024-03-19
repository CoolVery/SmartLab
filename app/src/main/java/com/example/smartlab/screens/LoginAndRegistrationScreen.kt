package com.example.smartlab.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
@Composable
fun CreateText(textInput: String, fontSizeText: TextUnit, fontWeightText: FontWeight?, TextColor : Color) {
    Text(
        text = textInput,
        fontSize = fontSizeText,
        fontWeight = fontWeightText,
        color = TextColor)
}
@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginAndRegistrationScreen() {
    val email = remember { mutableStateOf("") }
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .weight(2f)
                .padding(top = 80.dp)
                .fillMaxWidth()
        ) {
            CreateText("✋  Добро пожаловать!", 24.sp, FontWeight.Bold, Color.Black)
            CreateText("Войдите, чтобы пользоваться функциями приложения", 15.sp, null, Color.Black)
        }
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
        ) {
            Column{
                CreateText("Вход по E-mail", 14.sp, FontWeight.Bold, Color.Gray)
                TextField(
                    value = email.value,
                    onValueChange = {newText -> email.value = newText},
                    placeholder = {Text("example@mail")},
                    textStyle = TextStyle(
                        fontSize = 15.sp
                    ),
                    maxLines = 1,
                    singleLine = true,
                    shape = RoundedCornerShape(13.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFF5F5F9),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black,
                        unfocusedPlaceholderColor = Color.Gray,
                        disabledTextColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Button(
                    onClick = {},
                    enabled = email.value.isNotEmpty(),
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        disabledContainerColor = Color(0xFFC9D4FB),
                        containerColor = Color(0xFF1A6FEE)),
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .height(55.dp)
                        .fillMaxWidth()
                ) {
                    Text(text = "Далее", fontSize = 20.sp, color = Color(0xFFffffff))
                }
            }


        }
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
        ) {
            CreateText("✋  Добро пожаловать!", 24.sp, FontWeight.Bold, Color.Black)
        }
    }



}