package com.example.smartlab.constructhion

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

@Composable
fun CreateText(textInput: String, fontSizeText: TextUnit, fontWeightText: FontWeight?, TextColor : Color) {
    Text(
        text = textInput,
        fontSize = fontSizeText,
        fontWeight = fontWeightText,
        color = TextColor)
}
@Composable
fun CreateText(textInput: String, fontSizeText: TextUnit, fontWeightText: FontWeight?, TextColor : Color, pad : Dp) {
    Text(
        text = textInput,
        fontSize = fontSizeText,
        fontWeight = fontWeightText,
        color = TextColor,
        modifier = Modifier
            .padding(bottom = pad))
}