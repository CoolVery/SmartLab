package com.example.smartlab.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.smartlab.constructhion.CreateText
import com.example.smartlab.constructhion.CreateTextField
import com.example.smartlab.navigation.Navigation
import com.example.smartlab.ui.theme.SmartLabTheme
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputCodeInEmail(navController: NavHostController?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .padding(top = 20.dp, start = 15.dp)
        ) {
            Button(
                onClick = { navController!!.navigate("LoginAndRegistration") },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF5F5F9)
                )
            ) {}
            Icon(
                Icons.Filled.KeyboardArrowLeft,
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.padding(start = 3.dp, top = 4.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            CreateText("Введите код из E-mail", 15.sp, FontWeight.Bold, Color.Black)
            Row(
                modifier = Modifier
                    .padding(start = 80.dp, end = 80.dp, top = 20.dp)
            ) {
                CreateTextField(
                    "", "",
                    Modifier
                        .padding(horizontal = 5.dp)
                        .weight(25f)
                        .height(50.dp), 1, KeyboardType.Number, 13.dp)
                CreateTextField(
                    "", "",
                    Modifier
                        .padding(horizontal = 5.dp)
                        .weight(25f)
                        .height(50.dp), 1, KeyboardType.Number, 13.dp)
                CreateTextField(
                    "", "",
                    Modifier
                        .padding(horizontal = 5.dp)
                        .weight(25f)
                        .height(50.dp), 1, KeyboardType.Number, 13.dp)
                CreateTextField(
                    "", "",
                    Modifier
                        .padding(horizontal = 5.dp)
                        .weight(25f)
                        .height(50.dp), 1, KeyboardType.Number, 13.dp)
            }
            CreateText("Отправить код повторно можно\r\nбудет через ${TimerTicks()} секунд", 15.sp, FontWeight.Normal, Color(0xFF939396), 10.dp, TextAlign.Center, 20.sp)
        }
    }
}
@Composable
fun TimerTicks(): Int{
    var ticks by remember { mutableStateOf(60) }
    LaunchedEffect(Unit) {
        while(true) {
            if(ticks >= 0){
                delay(1.seconds)
                ticks--
            }
            else break
        }
    }
    return ticks
}

@Composable()
@Preview(showBackground = true)
private fun Preview(){
    SmartLabTheme {
        // A surface container using the 'background' color from the theme
        InputCodeInEmail(null)
    }
}