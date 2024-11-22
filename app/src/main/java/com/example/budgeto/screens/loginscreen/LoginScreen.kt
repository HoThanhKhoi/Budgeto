package com.example.budgeto.screens.loginscreen

import android.content.Context
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
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
import com.example.budgeto.data.Constant
import com.example.budgeto.screensfonts.inter
import com.example.budgeto.state.LoginState
import com.example.budgeto.utils.ToastUtil
import com.example.budgeto.viewmodel.LoginViewModel
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.GoogleAuthProvider
import com.google.relay.compose.CircularButton
import com.google.relay.compose.ColumnScopeInstanceImpl.align
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.SignUpLoginButton
import com.google.relay.compose.UserInfoTextBox
import com.google.relay.compose.tappable

@Composable
fun LoginScreen(
    email: String = "",
    password: String = "",
    onLoginButtonTapped: () -> Unit = {},
    onSignUpTapped: () -> Unit,
    onForgotPasswordTapped: () -> Unit,
    onLoginWithGoogleTapped: (AuthCredential) -> Unit,
    onLoginWithFacebookTapped: () -> Unit,
    onLogginSuccess: () -> Unit = {},
    modifier: Modifier = Modifier,
    loginViewModel: LoginViewModel
) {
    var localEmail by remember { mutableStateOf(email) }
    var localPassword by remember { mutableStateOf(password) }
    var isPasswordVisible by remember { mutableStateOf(false) }

    val context = LocalContext.current

    // Google Sign-In setup
    val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
        .requestEmail()
        .requestIdToken(Constant.ServerClient)
        .build()
    val googleSignInClient = GoogleSignIn.getClient(context, gso)

    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        val account = GoogleSignIn.getSignedInAccountFromIntent(result.data)
        try {
            val googleAccount = account.getResult(ApiException::class.java)
            Log.d("LoginScreen", "Google Account retrieved: ${googleAccount.email}")
            val credential = GoogleAuthProvider.getCredential(googleAccount.idToken, null)
            loginViewModel.googleLogin(credential) // Pass the credential to ViewModel
        } catch (e: ApiException) {
            Log.e("GoogleSignIn", "Google Sign-In failed: ${e.message}", e)
            ToastUtil.showToastAtTop(context, "Google Sign-In failed: ${e.message}")
        }
    }

    val loginState by loginViewModel.loginState.collectAsState(initial = LoginState())

    // Display Toast for errors
    LaunchedEffect(loginState.isError) {
        loginState.isError?.let { errorMessage ->
            ToastUtil.showToastAtTop(context, errorMessage)
            loginViewModel.resetLoginState() // Clear error after showing
        }
    }

    // Handle navigation on success
    LaunchedEffect(loginState.isSuccess) {
        loginState.isSuccess?.let {
            if (loginViewModel.isUserLoggedIn()) {
                onLogginSuccess()
                ToastUtil.showToastAtTop(context, "Login Successful")
                loginViewModel.resetLoginState()
            }
        }
    }

    fun initiateGoogleSignIn() {
        googleSignInClient.signOut().addOnCompleteListener {
            val signInIntent = googleSignInClient.signInIntent
            launcher.launch(signInIntent)
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Main Login Content
        Login(
            email = localEmail,
            password = localPassword,
            onLoginTapped = {
                loginViewModel.loginUser(localEmail, localPassword)
            },
            onEmailChanged = { localEmail = it },
            onPasswordChange = { localPassword = it },
            isPasswordVisible = isPasswordVisible,
            onTogglePasswordVisibility = { isPasswordVisible = !isPasswordVisible },
            onSignUpTapped = onSignUpTapped,
            onForgotPasswordTapped = onForgotPasswordTapped,
            onLoginWithGoogleTapped = {
                Log.d("LoginScreen", "Google Sign-In button clicked")
                initiateGoogleSignIn()
            },
            onLoginWithFacebookTapped = onLoginWithFacebookTapped,
            modifier = modifier
        )

        // Loading Indicator
        if (loginState.isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}

@Composable
fun Login(
    email: String,
    password: String,
    onEmailChanged: (String) -> Unit = {},
    onPasswordChange: (String) -> Unit = {},
    onTogglePasswordVisibility: () -> Unit = {},
    isPasswordVisible: Boolean,
    onLoginTapped: () -> Unit = {},
    onSignUpTapped: () -> Unit = {},
    onForgotPasswordTapped: () -> Unit = {},
    onLoginWithGoogleTapped: () -> Unit = {},
    onLoginWithFacebookTapped: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    TopLevel(modifier = modifier) {
        LoginText(
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
                    y = 650.0.dp
                )
            )
        ) {
            DonTHaveAnAccount()
            SignUp(onSignUpTapped = onSignUpTapped)
        }
        LoginForm(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 255.0.dp
                )
            )
        ) {
            EmailTextBox(
                email = email,
                onEmailChanged = onEmailChanged,
                modifier = Modifier.rowWeight(1.0f)
            )
            PasswordTextBox(
                password = password,
                onPasswordChanged = onPasswordChange,
                isPasswordVisible = isPasswordVisible,
                onTogglePasswordVisibility = onTogglePasswordVisibility,
                modifier = Modifier
                    .rowWeight(1.0f)
            )
            ForgotPasswordLink(
                onForgotPasswordTapped = onForgotPasswordTapped,
                modifier = Modifier.rowWeight(1.0f)
            )
            LoginButton(
                onLoginTapped = onLoginTapped,
            )
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 40.0.dp
                        ),
                    )
            ) {
                LoginWithGoogleButton(onclick = onLoginWithGoogleTapped)
                Spacer(modifier = Modifier.width(16.dp))
                LoginWithFacebookButton(onclick = onLoginWithFacebookTapped)
            }
        }
        OrLoginWith(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 548.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun LoginPreview() {
    MaterialTheme {
        RelayContainer {
            Login(
                isPasswordVisible = false,
                email = "Email",
                password = "Password",
                onLoginTapped = {},
                onSignUpTapped = {},
                onForgotPasswordTapped = {},
                onLoginWithGoogleTapped = {},
                onLoginWithFacebookTapped = {},
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
        vector = painterResource(R.drawable.login_line_12),
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

//@Composable
//fun Login(modifier: Modifier = Modifier) {
//    RelayText(
//        content = "Login",
//        fontSize = 24.0.sp,
//        fontFamily = inter,
//        height = 1.2102272510528564.em,
//        textAlign = TextAlign.Left,
//        fontWeight = FontWeight(700.0.toInt()),
//        modifier = modifier
//    )
//}

@Composable
fun DonTHaveAnAccount(modifier: Modifier = Modifier) {
    RelayText(
        content = "Already have an account?",
        fontFamily = inter,
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
fun SignUp(
    onSignUpTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Sign Up",
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 0,
            green = 91,
            blue = 228
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.tappable(onTap = onSignUpTapped)
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
fun Label(
    email: String,
    onEmailChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = email,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.625.em,
        letterSpacing = -0.5.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
    OutlinedTextField(
        value = email,
        onValueChange = onEmailChange,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent) // Custom modifier for transparency
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
fun EmailTextBox(
    email: String,
    onEmailChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    UserInfoTextBox(
        value = email,
        onValueChange = onEmailChanged,
        placeholder = "Email",
        modifier = modifier
    )
}

@Composable
fun Label1(
    password: String,
    onPasswordChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    // Display the password using RelayText for styling
    RelayText(
        content = password,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.625.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500),
        maxLines = 1,
        modifier = modifier.fillMaxWidth()
    )
    // Transparent OutlinedTextField for capturing input
    OutlinedTextField(
        value = password,
        onValueChange = onPasswordChange,
        //visualTransformation = PasswordVisualTransformation(), // Hide password text
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent) // Custom modifier for transparency
    )

}


@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_vector),
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
fun IconEye1(
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

    UserInfoTextBox(
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
//@Composable
//fun PasswordTextBox(
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        backgroundColor = Color(
//            alpha = 255,
//            red = 255,
//            green = 255,
//            blue = 255
//        ),
//        mainAxisAlignment = MainAxisAlignment.Start,
//        crossAxisAlignment = CrossAxisAlignment.Start,
//        padding = PaddingValues(
//            start = 20.0.dp,
//            top = 10.0.dp,
//            end = 20.0.dp,
//            bottom = 10.0.dp
//        ),
//        itemSpacing = 10.0,
//        clipToParent = false,
//        radius = 8.0,
//        strokeWidth = 1.0,
//        strokeColor = Color(
//            alpha = 255,
//            red = 0,
//            green = 0,
//            blue = 0
//        ),
//        content = content,
//        modifier = modifier.fillMaxWidth(1.0f)
//    )
//}

@Composable
fun ForgotPasswordLink(
    onForgotPasswordTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Forgot Password?",
        fontFamily = inter,
        height = 1.5.em,
        textAlign = TextAlign.Right,
        italic = true,
        maxLines = -1,
        modifier = modifier
            .tappable(onTap = onForgotPasswordTapped)
            .fillMaxWidth(1.0f)
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
fun LoginForm(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(345.0.dp)

    )
}

@Composable
fun Login1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Login",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.375.em,
        letterSpacing = 0.32.sp,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun LoginButton(
    onLoginTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    SignUpLoginButton(
        onClick = onLoginTapped,
        text = "Login",
        modifier = modifier
    )
}

//@Composable
//fun Frame162475(
//    onLoginTapped: () -> Unit,
//    modifier: Modifier = Modifier,
//    content: @Composable RelayContainerScope.() -> Unit
//) {
//    RelayContainer(
//        backgroundColor = Color(
//            alpha = 255,
//            red = 0,
//            green = 0,
//            blue = 0
//        ),
//        isStructured = false,
//        radius = 5.0,
//        borderAlignment = BorderAlignment.Outside,
//        content = content,
//        modifier = modifier
//            .tappable(onTap = onLoginTapped)
//            .requiredWidth(343.0.dp)
//            .requiredHeight(48.0.dp)
//            .relayDropShadow(
//                color = Color(
//                    alpha = 51,
//                    red = 56,
//                    green = 65,
//                    blue = 157
//                ),
//                borderRadius = 5.0.dp,
//                blur = 4.0.dp,
//                offsetX = 0.0.dp,
//                offsetY = 4.0.dp,
//                spread = 0.0.dp
//            )
//    )
//
//}

@Composable
fun LoginWithGoogleButton(
    onclick: () -> Unit
) {
    CircularButton(
        onClick = onclick,
        icon = painterResource(R.drawable.login_ellipse_35), // Use the appropriate icon
        contentDescription = "Login with Google",
        backgroundColor = Color.Black, // You can customize this color
        size = 40.dp // Match the size from your previous implementation
    )
}

@Composable
fun LoginWithFacebookButton(
    onclick: () -> Unit
) {
    CircularButton(
        onClick = onclick,
        icon = painterResource(R.drawable.login_vector_161), // Use the appropriate icon
        contentDescription = "Login with Facebook",
        backgroundColor = Color.Black, // You can customize this color
        size = 40.dp // Match the size from your previous implementation
    )
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_ellipse_1),
        modifier = modifier
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_ellipse_35),
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
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_ellipse_2),
        modifier = modifier
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_ellipse_36),
        modifier = modifier
            .requiredWidth(24.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector161(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_vector_161),
        modifier = modifier
            .requiredWidth(8.0.dp)
            .requiredHeight(17.0.dp)
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
fun OrLoginWith(modifier: Modifier = Modifier) {
    RelayText(
        content = "or login with",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(273.0.dp)
            .requiredHeight(20.0.dp)
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


@Composable
fun LoginText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Login",
        fontSize = 24.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}
