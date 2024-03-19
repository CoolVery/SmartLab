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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
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
import com.example.smartlab.constructhion.CreateText

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun InputCodeInEmail() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Box(
            modifier = Modifier
                .padding(top = 20.dp, start = 15.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
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

            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                .fillMaxSize()
            ){
                CreateText("Введите код из E-mail", 15.sp, FontWeight.Bold, Color.Black)
                Row (
                    modifier = Modifier
                        .padding(start = 80.dp, end = 80.dp)
                ){
                    TextField(
                        value = "",
                        onValueChange = { },
                        modifier = Modifier
                            .padding(0.dp, 0.dp, 15.dp, 0.dp)
                            .weight(25f)
                            .height(50.dp),
                        maxLines = 1,
                        textStyle = TextStyle(
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        shape = RoundedCornerShape(13.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFF5F5F9),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black,
                            unfocusedPlaceholderColor = Color.Gray,
                            disabledTextColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        )
                    )
                    TextField(
                        value = "",
                        onValueChange = { },
                        modifier = Modifier
                            .padding(0.dp, 0.dp, 15.dp, 0.dp)
                            .weight(25f)
                            .height(50.dp),
                        maxLines = 1,
                        textStyle = TextStyle(
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        shape = RoundedCornerShape(13.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFF5F5F9),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black,
                            unfocusedPlaceholderColor = Color.Gray,
                            disabledTextColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        )
                    )
                    TextField(
                        value = "",
                        onValueChange = { },
                        modifier = Modifier
                            .padding(0.dp, 0.dp, 15.dp, 0.dp)
                            .weight(25f)
                            .height(50.dp),
                        maxLines = 1,
                        textStyle = TextStyle(
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        shape = RoundedCornerShape(13.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFF5F5F9),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black,
                            unfocusedPlaceholderColor = Color.Gray,
                            disabledTextColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        )
                    )
                    TextField(
                        value = "",
                        onValueChange = { },
                        modifier = Modifier
                            .padding(0.dp, 0.dp, 15.dp, 0.dp)
                            .weight(25f)
                            .height(50.dp),
                        maxLines = 1,
                        textStyle = TextStyle(
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        shape = RoundedCornerShape(13.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFF5F5F9),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black,
                            unfocusedPlaceholderColor = Color.Gray,
                            disabledTextColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        )

                    )
                }
            }
        }


}