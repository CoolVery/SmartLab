package com.example.smartlab.constructhion

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreateText(
    textInput: String,
    fontSizeText: TextUnit,
    fontWeightText: FontWeight?,
    TextColor: Color
) {
    Text(
        text = textInput,
        fontSize = fontSizeText,
        fontWeight = fontWeightText,
        color = TextColor
    )
}

@Composable
fun CreateText(
    textInput: String,
    fontSizeText: TextUnit,
    fontWeightText: FontWeight?,
    TextColor: Color,
    pad: Dp
) {
    Text(
        text = textInput,
        fontSize = fontSizeText,
        fontWeight = fontWeightText,
        color = TextColor,
        modifier = Modifier
            .padding(bottom = pad)
    )
}

@Composable
fun CreateTextField(
    valueTF: String, onValueChangeTF: Unit, modifierTF: Modifier, maxLinesTF: Int,
    keyboardTypeTF: KeyboardType, shapeTF: Dp
) {
    TextField(
        value = valueTF,
        onValueChange = { onValueChangeTF },
        maxLines = maxLinesTF,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardTypeTF),
        shape = RoundedCornerShape(shapeTF),
        colors = ColorsTF(),
        textStyle = TextStyleTF()
        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColorsTF(): TextFieldColors {
    return TextFieldDefaults.textFieldColors(
        containerColor = Color(0xFFF5F5F9),
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        cursorColor = Color.Black,
        unfocusedPlaceholderColor = Color.Gray,
        disabledTextColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent
    )
}
fun TextStyleTF(): TextStyle{
    return TextStyle(
        fontSize = 18.sp,
        textAlign = TextAlign.Center
    )
}