package com.example.smartlab.screens

import androidx.compose.foundation.BorderStroke
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
import com.example.smartlab.constructhion.CreateText
import com.example.smartlab.ui.theme.SmartLabTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginAndRegistrationScreen(navHostController: NavHostController?) {
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
                CreateText("Вход по E-mail", 14.sp, FontWeight.Normal, Color.Gray)
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
                    onClick = {navHostController!!.navigate("InputCodeInEmail")},
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
                    CreateText("Далее", 20.sp, FontWeight.Normal ,Color(0xFFffffff))
                }
            }
        }
        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
                .padding(bottom = 60.dp)
        ) {
            CreateText("Или войдите с помощью", 15.sp, FontWeight.Normal, Color.Gray)
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(top = 15.dp)
                    .fillMaxWidth(1f)
                    .height(60.dp),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFffffff)),
                border = BorderStroke(
                    1.dp, color = Color(0xFFEBEBEB)
                )
            ) {
                CreateText("Войти с Яндекс", 20.sp, FontWeight.Bold, Color(0xFF000000),
                )
            }
        }
    }
}

@Composable()
@Preview(showBackground = true)
private fun Preview(){
    SmartLabTheme {
        // A surface container using the 'background' color from the theme
        LoginAndRegistrationScreen(null)
    }
}