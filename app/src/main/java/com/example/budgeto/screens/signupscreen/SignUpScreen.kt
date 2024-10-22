package com.example.budgeto.screens.signupscreen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.budgeto.R
import com.example.budgeto.state.SignUpState
import com.example.budgeto.viewmodel.SignUpViewModel
import com.google.relay.compose.BoxScopeInstance.boxAlign
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.ColumnScopeInstanceImpl.align
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable
import com.google.relay.compose.ReusableComponent
import com.google.relay.compose.SignUpLoginButton
import com.google.relay.compose.SignUpLoginTextBox


@Composable
fun SignUpScreen(
    onSignUpButtonTapped: () -> Unit = {},
    fullName: String,
    email: String,
    password: String,
    onForgotPasswordLinkTapped: () -> Unit = {},
    onLoginButtonTapped: () -> Unit = {},
    onIconEyeTapped: () -> Unit = {},
    onLoginWithFacebookTapped: () -> Unit = {},
    onLoginWithGoogleTapped: () -> Unit = {},
    modifier: Modifier = Modifier,
    signUpViewModel: SignUpViewModel// inject view model
) {
    var localFullName by remember { mutableStateOf(fullName) }
    var localEmail by remember { mutableStateOf(email) }
    var localPassword by remember { mutableStateOf(password) }

    var isPasswordVisible by remember { mutableStateOf(false) }

    val signUpState by signUpViewModel.signUpState.collectAsState(initial = SignUpState())

    SignUpText(
        onSignUpButtonTapped = {
            onSignUpButtonTapped()
            signUpViewModel.registerUser(localEmail, localPassword)
        },
        fullName = localFullName,
        email = localEmail,
        password = localPassword,
        isPasswordVisible = isPasswordVisible,
        onTogglePasswordVisibility = { isPasswordVisible = !isPasswordVisible },
        onFullNameChanged = { localFullName = it },
        onEmailChanged = { localEmail = it },
        onPasswordChanged = { localPassword = it },
        onForgotPasswordLinkTapped = onForgotPasswordLinkTapped,
        onLoginButtonTapped = onLoginButtonTapped,
        onIconEyeTapped = onIconEyeTapped,
        onLoginWithFacebookTapped = onLoginWithFacebookTapped,
        onLoginWithGoogleTapped = onLoginWithGoogleTapped,
        modifier = modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)
    )
}


@Composable
fun SignUpText(
    modifier: Modifier = Modifier,
    fullName: String = "",
    email: String = "",
    password: String = "",
    isPasswordVisible: Boolean = false,
    onFullNameChanged: (String) -> Unit = {},
    onEmailChanged: (String) -> Unit = {},
    onPasswordChanged: (String) -> Unit = {},
    onSignUpButtonTapped: () -> Unit = {},
    onLoginButtonTapped: () -> Unit = {},
    onForgotPasswordLinkTapped: () -> Unit = {},
    onTogglePasswordVisibility: () -> Unit = {},
    onIconEyeTapped: () -> Unit = {},
    onLoginWithFacebookTapped: () -> Unit = {},
    onLoginWithGoogleTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        SignUpText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 93.0.dp
                )
            )
        )
        BottomLink(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 31.0.dp,
                    y = 642.0.dp
                )
            )
        ) {
            DonTHaveAnAccount()
            LoginButton(onLoginButtonTapped = onLoginButtonTapped)
        }
        SignUpForm(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.dp,
                    y = 255.0.dp
                )
            )
        ) {
            FullnameTextBox(
                fullName = fullName,
                modifier = Modifier
                    .rowWeight(1.0f),
                onFullNameChanged = onFullNameChanged
            )
            EmailTextBox(
                email = email,
                modifier = Modifier,
                onEmailChanged = onEmailChanged
            )
            PasswordTextBox(
                password = password,
                onPasswordChanged = onPasswordChanged,
                isPasswordVisible = isPasswordVisible,
                onTogglePasswordVisibility = onTogglePasswordVisibility,
                modifier = Modifier
                    .rowWeight(1.0f)
            )

            ForgotPasswordLink(
                onForgotPasswordLinkTapped = onForgotPasswordLinkTapped,
                modifier = Modifier
            )

            SignUpButton(
                onSignUpButtonTapped = {
                    onSignUpButtonTapped()
                },
            )
        }
    }

    Group99(
        modifier = Modifier.boxAlign(
            alignment = Alignment.TopStart,
            offset = DpOffset(
                x = 150.0.dp,
                y = 580.0.dp
            )
        )
    ) {
        LoginWithFacebook(
            onLoginWithFacebookTapped = onLoginWithFacebookTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 49.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            Ellipse2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Ellipse36(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.0.dp,
                        y = -1.0.dp
                    )
                )
            )
            Vector161(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 11.0.dp
                    )
                )
            )
        }
        LoginWithGoogle(onLoginWithGoogleTapped = onLoginWithGoogleTapped) {
            Ellipse1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Ellipse35(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 10.0.dp,
                        y = 10.0.dp
                    )
                )
            )
        }
    }
    OrSignUpWith(
        modifier = Modifier.boxAlign(
            alignment = Alignment.TopStart,
            offset = DpOffset(
                x = 58.0.dp,
                y = 548.0.dp
            )
        )
    )
}


@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun SignUpPreview() {
    MaterialTheme {
        RelayContainer {
            SignUpText(
                onSignUpButtonTapped = {},
                onLoginButtonTapped = {},
                fullName = "Full Name",
                email = "Email",
                onForgotPasswordLinkTapped = {},
                password = "Password",
                onIconEyeTapped = {},
                onLoginWithFacebookTapped = {},
                onLoginWithGoogleTapped = {},
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Statistics(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(392.0.dp)
            .requiredHeight(49.0.dp)
    )
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_line_12),
        modifier = modifier
            .requiredWidth(150.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun BottomNav(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(113.0.dp)
    )
}

@Composable
fun SignUpText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sign up",
        fontSize = 24.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun DonTHaveAnAccount(modifier: Modifier = Modifier) {
    RelayText(
        content = "Already have an account?",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 130,
            green = 120,
            blue = 157
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun LoginButton(
    onLoginButtonTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Login",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 0,
            green = 91,
            blue = 228
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.tappable(onTap = onLoginButtonTapped)
    )
}

@Composable
fun BottomLink(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .height(IntrinsicSize.Min)
            .requiredWidth(327.0.dp)
    )
}

@Composable
fun FullnameTextBox(
    fullName: String,
    onFullNameChanged: (String) -> Unit, // Callback to update full name
    modifier: Modifier = Modifier
) {
    SignUpLoginTextBox(
        value = fullName,
        placeholder = "Full Name",
        onValueChange = onFullNameChanged,
        modifier = modifier
    )
}

@Composable
fun PlaceholderRightIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 24.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .height(IntrinsicSize.Min)
            .fillMaxWidth(1.0f)
    )
}

@Composable
fun FullNameTexBox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(
            start = 20.0.dp,
            top = 10.0.dp,
            end = 20.0.dp,
            bottom = 10.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 8.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Label1(
    email: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = email,
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.625.em,
        letterSpacing = -0.5.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun PlaceholderRightIcon1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 24.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .height(IntrinsicSize.Min)
            .fillMaxWidth(1.0f)
    )
}

@Composable
fun EmailTextBox(
    email: String,
    onEmailChanged: (String) -> Unit, // Callback to update email
    modifier: Modifier = Modifier
) {
    SignUpLoginTextBox(
        value = email,
        onValueChange = onEmailChanged,
        placeholder = "Email",
        modifier = modifier
    )
}

@Composable
fun Label2(
    password: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = password,
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.625.em,
        letterSpacing = -0.5.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_vector),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 1.0.dp,
                    top = 4.0.dp,
                    end = 1.0.dp,
                    bottom = 5.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun IconEye2(
    onIconEyeTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .tappable(onTap = onIconEyeTapped)
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun PlaceholderRightIcon2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 24.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .height(IntrinsicSize.Min)
            .fillMaxWidth(1.0f)
    )
}

@Composable
fun PasswordTextBox(
    password: String,
    onPasswordChanged: (String) -> Unit, // Callback to update password
    modifier: Modifier = Modifier,
    isPasswordVisible: Boolean = false, // Option to toggle visibility
    onTogglePasswordVisibility: () -> Unit // Callback to toggle visibility
) {
    val image = if (isPasswordVisible)
        ImageVector.vectorResource(id = R.drawable.sign_up_vector) // Visible state
    else
        ImageVector.vectorResource(id = R.drawable.login_vector) // Hidden state

    SignUpLoginTextBox(
        value = password,
        onValueChange = onPasswordChanged,
        placeholder = "Password",
        visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            IconButton(onClick = onTogglePasswordVisibility) {
                Icon(imageVector = image, contentDescription = null)
            }
        },
        modifier = modifier
    )
}

@Composable
fun ForgotPasswordLink(
    onForgotPasswordLinkTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Forgot Password?",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.5.em,
        textAlign = TextAlign.Right,
        italic = true,
        maxLines = -1,
        modifier = modifier
            .tappable(onTap = onForgotPasswordLinkTapped)
            .fillMaxWidth(1.0f)
            .padding(end = 5.dp)
    )
}

@Composable
fun PasswordWrapper(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.End,
        crossAxisAlignment = CrossAxisAlignment.End,
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun SignUpForm(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 0.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(345.0.dp)
            .wrapContentHeight()
    )
}

@Composable
fun SignUpButtonText(modifier: Modifier = Modifier) {
    Text(
        text = "Sign up", // Button text
        fontSize = 16.sp,
        color = Color.White, // Text color
        modifier = modifier
            .padding(horizontal = 16.dp), // Padding inside the button
        letterSpacing = 0.32.sp,
        fontWeight = FontWeight(600)
    )
}

@Composable
fun SignUpButton(
    onSignUpButtonTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    SignUpLoginButton(
        onClick = onSignUpButtonTapped,
        modifier = modifier,
        text = "Sign up"
    )
//    Button(
//        onClick = onSignUpButtonTapped,
//        modifier = modifier
//            .fillMaxWidth(0.9f) // Make the button responsive by filling 90% of the width
//            .height(80.dp) // Keep the height fixed to ensure button looks good
//            .padding(vertical = 16.dp) // Add padding to make space around the button
//            .align(Alignment.CenterHorizontally), // Center the button horizontally
//        shape = RoundedCornerShape(5.dp), // Maintain the rounded corners
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Black // Button background color
//        ),
//        elevation = ButtonDefaults.buttonElevation( // Add elevation for shadow effect
//            defaultElevation = 4.dp
//        )
//    ) {
//        SignUpButtonText() // Call the text composable inside the button
//    }
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_ellipse_2),
        modifier = modifier
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_ellipse_36),
        modifier = modifier
            .requiredWidth(26.0.dp)
            .requiredHeight(26.0.dp)
    )
}

@Composable
fun Vector161(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_vector_161),
        modifier = modifier
            .requiredWidth(9.0.dp)
            .requiredHeight(18.0.dp)
    )
}

@Composable
fun LoginWithFacebook(
    onLoginWithFacebookTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .tappable(onTap = onLoginWithFacebookTapped)
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_ellipse_1),
        modifier = modifier
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_ellipse_35),
        modifier = modifier
            .requiredWidth(18.000003814697266.dp)
            .requiredHeight(18.00002098083496.dp)
    )
}

@Composable
fun LoginWithGoogle(
    onLoginWithGoogleTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .tappable(onTap = onLoginWithGoogleTapped)
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Group99(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(89.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun OrSignUpWith(modifier: Modifier = Modifier) {
    RelayText(
        content = "or sign up with",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(273.0.dp)
            .requiredHeight(10.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}
