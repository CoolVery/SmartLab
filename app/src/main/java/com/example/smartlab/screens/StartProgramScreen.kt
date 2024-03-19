package com.example.smartlab.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.smartlab.R
import com.example.smartlab.constructhion.CreateText
import kotlinx.coroutines.delay
import org.w3c.dom.Text

@Composable
fun SwitchingThePage(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
        // portrait mode
        LaunchedEffect(key1 = true) {
            // Customize the delay time
            delay(1500L)
            navController.navigate("LoginAndRegistration") {
                popUpTo("StartProgram") //удаляет страницу и стека, чтобы не было возможности вернуться к этому экрану
                {
                    inclusive = true
                }
            }
        }
    }
}

fun InstallationBackgroundColumn(): Brush {
    return Brush.linearGradient(
        colors = listOf(
            Color(android.graphics.Color.parseColor("#70bce3")),
            Color(android.graphics.Color.parseColor("#5c97e0")),
            Color(android.graphics.Color.parseColor("#517de4")),
            Color(android.graphics.Color.parseColor("#3f66ea")),
            Color(android.graphics.Color.parseColor("#2856f2")),
            Color(android.graphics.Color.parseColor("#2856f2")),
            Color(android.graphics.Color.parseColor("#3f66ea")),
            Color(android.graphics.Color.parseColor("#517de4")),
            Color(android.graphics.Color.parseColor("#5c97e0")),
            Color(android.graphics.Color.parseColor("#70bce3")),
        )
    )
}

@Composable
fun StartProgramScreen(navController: NavHostController) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(brush = InstallationBackgroundColumn())
    ){
        Row {
            CreateText("Смартлаб", 30.sp, FontWeight.Bold, Color.White)

            Image(
                bitmap = ImageBitmap.imageResource(R.drawable.shape),
                contentDescription = "Иконка",
                modifier = Modifier
                    .size(45.dp, 40.dp)
                    .padding(start = 10.dp)
            )
        }

    }
    SwitchingThePage(navController)
}