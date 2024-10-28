package com.google.relay.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.budgeto.R
import com.example.budgeto.screensfonts.inter
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.ColumnScopeInstanceImpl.align
import org.w3c.dom.Text

class ReusableComponent {

}

@Composable
fun UserInfoTextBox(
    value: String,
    onValueChange: (String) -> Unit, // Callback to update the value
    modifier: Modifier = Modifier,
    placeholder: String,
    visualTransformation: VisualTransformation = VisualTransformation.None, // Default to no transformation
    trailingIcon: @Composable (() -> Unit)? = null // Optional trailing icon
) {
    OutlinedTextField(
        value = value,
        placeholder = {
            Text(
                text = placeholder,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 16.sp,
                    color = Color.Gray,
                    fontFamily = com.example.budgeto.screensfonts.inter,
                    letterSpacing = (-0.5).sp,
                    fontWeight = FontWeight(500),
                    textAlign = TextAlign.Left,
                    lineHeight = 1.625.em
                )
            )
        },
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
fun <T> UserInfoDropDown(
    value: T,
    onValueChange: (T) -> Unit,
    options: List<T>, // The list of options to display in the dropdown
    modifier: Modifier = Modifier,
    placeHolder: String = "",
    label: String = ""
) {
    DropDownField(
        value = value,
        onValueChange = onValueChange,
        options = options,
        modifier = modifier,
        placeHolder = placeHolder,
        label = label
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

@Composable
fun <T> DropDownField(
    value: T,
    onValueChange: (T) -> Unit,
    options: List<T>,
    modifier: Modifier = Modifier,
    placeHolder: String = "",
    label: String = ""
) {
    var expanded by remember { mutableStateOf(false) } // Track dropdown state

    // Use a BoxWithConstraints to capture the width of the `OutlinedTextField`
    BoxWithConstraints(
        modifier = modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        val textFieldWidthInDp = with(LocalDensity.current) { constraints.maxWidth.toDp() } // Convert width to dp

        // The trigger (text field) for the dropdown
        OutlinedTextField(
            value = value.toString(),
            onValueChange = {}, // No direct editing, dropdown controlled
            placeholder = {
                Text(
                    text = if (placeHolder.isNotEmpty()) placeHolder else value.toString(),
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp,
                        color = Color.Gray,
                        fontFamily = com.example.budgeto.screensfonts.inter,
                        letterSpacing = (-0.5).sp,
                        fontWeight = FontWeight(500),
                        textAlign = TextAlign.Left,
                        lineHeight = 1.625.em
                    )
                )
            },
            readOnly = true, // Make it read-only so the user can only select from the dropdown
            label = { if (label.isNotEmpty()) Text(text = label) },
            shape = RoundedCornerShape(10.dp),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.profile_1_vector_321), // Icon for the dropdown
                    contentDescription = "Dropdown icon",
                    modifier = Modifier.clickable { expanded = !expanded } // Toggle dropdown when clicked
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Black,
                unfocusedContainerColor = Color.White,
            ),
            modifier = Modifier.fillMaxWidth()
        )

        // The dropdown menu itself
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.width(textFieldWidthInDp) // Match the width of the OutlinedTextField
        ) {
            // List of selectable items
            options.forEach { option ->
                DropdownMenuItem(
                    onClick = {
                        onValueChange(option) // Callback to update the parent state
                        expanded = false // Close dropdown after selection
                    },
                    text = { Text(option.toString()) } // Display the value as a string
                )
            }
        }
    }
}

@Composable
fun RelayCalculateButton(
    label: String? = null,
    icon: Painter? = null,
    backgroundColor: Color = Color.White,
    borderColor: Color = Color.Black,
    textColor: Color = Color.Black,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 30.sp,
    iconSize: Dp = 32.dp
) {
    RelayContainer(
        backgroundColor = backgroundColor,
        isStructured = false,
        radius = 5.dp.value.toDouble(),
        strokeWidth = 1.dp.value.toDouble(),
        strokeColor = borderColor,
        modifier = modifier
            .tappable(onTap = onClick)
            .requiredWidth(63.dp)
            .requiredHeight(63.dp)
    ) {
        if (icon != null) {
            RelayImage(
                image = icon,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(iconSize).align(Alignment.Center)
            )
        } else if (label != null) {
            RelayText(
                content = label,
                fontSize = fontSize,
                fontFamily = MaterialTheme.typography.bodyMedium.fontFamily,
                fontWeight = FontWeight.Medium,
                color = textColor,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}





