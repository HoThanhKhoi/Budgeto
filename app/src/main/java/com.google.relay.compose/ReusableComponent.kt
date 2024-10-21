package com.google.relay.compose

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

class ReusableComponent {

}

@Composable
fun SignUpLoginTextBox(
    value: String,
    onValueChange: (String) -> Unit, // Callback to update the value
    modifier: Modifier = Modifier,
    visualTransformation: VisualTransformation = VisualTransformation.None, // Default to no transformation
    trailingIcon: @Composable (() -> Unit)? = null // Optional trailing icon
) {
    OutlinedTextField(
        value = value,
        placeholder = { Text(text = "Enter your text") }, // Generic placeholder
        shape = RoundedCornerShape(10.dp),
        onValueChange = onValueChange,
        textStyle = androidx.compose.ui.text.TextStyle(
            fontSize = 16.sp,
            color = Color.DarkGray,
            fontFamily = com.example.budgeto.screensfonts.inter, // Keeping the original font family
            letterSpacing = (-0.5).sp,
            fontWeight = FontWeight(500),
            textAlign = TextAlign.Left,
            lineHeight = 1.625.em
        ),
        visualTransformation = visualTransformation, // Use visual transformation from parameters
        trailingIcon = trailingIcon, // Use the trailing icon if provided
        modifier = modifier
            .fillMaxWidth()
            .padding(4.dp)
            .border(1.dp, color = Color.DarkGray, shape = RoundedCornerShape(10.dp)),
    )
}