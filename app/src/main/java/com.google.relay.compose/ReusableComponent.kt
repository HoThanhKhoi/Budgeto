package com.google.relay.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.ColumnScopeInstanceImpl.align

class ReusableComponent {

}

@Composable
fun UserInfoTextBox(
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

@Composable
fun SignUpLoginButton(
    onClick: () -> Unit,
    text: String = "",
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth(0.9f) // Make the button responsive by filling 90% of the width
            .height(80.dp) // Keep the height fixed to ensure button looks good
            .padding(vertical = 16.dp) // Add padding to make space around the button
            .align(Alignment.CenterHorizontally), // Center the button horizontally
        shape = RoundedCornerShape(5.dp), // Maintain the rounded corners
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black // Button background color
        ),
        elevation = ButtonDefaults.buttonElevation( // Add elevation for shadow effect
            defaultElevation = 4.dp
        )
    ) {
        SignUpLoginButtonText(text = text) // Call the text composable inside the button
    }
}

@Composable
fun SignUpLoginButtonText(
    text: String = "",
    modifier: Modifier = Modifier
) {
    Text(
        text = text, // Button text
        fontSize = 16.sp,
        color = Color.White, // Text color
        modifier = modifier
            .padding(horizontal = 16.dp), // Padding inside the button
        letterSpacing = 0.32.sp,
        fontWeight = FontWeight(600)
    )
}

@Composable
fun CircularButton(
    onClick: () -> Unit,
    icon: Painter, // Pass the vector icon you want to display
    contentDescription: String,
    modifier: Modifier = Modifier,
    size: Dp = 40.dp, // Define a standard size for both buttons
    backgroundColor: Color = Color.White // Customize the background color
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(size) // Set the size of the button
            .background(backgroundColor, shape = CircleShape) // Set the background color and make it circular
    ) {
        Icon(
            painter = icon,
            contentDescription = contentDescription,
            modifier = Modifier.size(size * 0.6f), // Scale the icon to fit inside the button
            tint = Color.Unspecified // Keep the original color of the icon
        )
    }
}