package com.example.budgeto.screens.loginscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.budgeto.R
import com.example.budgeto.screensfonts.inter
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.ColumnScopeInstanceImpl.weight
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable


@Composable
fun LoginScreen(
    onLoginButtonTapped: () -> Unit = {},
    onSignUpTapped: () -> Unit,
    email: String,
    onForgotPasswordTapped: () -> Unit,
    password: String,
    onIconEyeTapped: () -> Unit,
    onLoginWithGoogleTapped: () -> Unit,
    onLoginWithFacebookTapped: () -> Unit,
    modifier: Modifier = Modifier
){
    Login(
        onLoginTapped = onLoginButtonTapped,
        onSignUpTapped = onSignUpTapped,
        email = email,
        onForgotPasswordTapped = onForgotPasswordTapped,
        password = password,
        onIconEyeTapped = onIconEyeTapped,
        onLoginWithGoogleTapped = onLoginWithGoogleTapped,
        onLoginWithFacebookTapped = onLoginWithFacebookTapped,
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}


@Composable
fun Login(
    modifier: Modifier = Modifier,
    email: String = "",
    password: String = "",
    onLoginTapped: () -> Unit = {},
    onSignUpTapped: () -> Unit = {},
    onForgotPasswordTapped: () -> Unit = {},
    onIconEyeTapped: () -> Unit = {},
    onLoginWithGoogleTapped: () -> Unit = {},
    onLoginWithFacebookTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Statistics(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 795.0.dp
                )
            )
        ) {}
        BottomNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 731.0.dp
                )
            )
        ) {
            Line12(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 101.0.dp
                    )
                )
            )
        }
        Login(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 84.0.dp
                )
            )
        )
        BottomLink(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 31.0.dp,
                    y = 607.0.dp
                )
            )
        ) {
            DonTHaveAnAccount()
            SignUp(onSignUpTapped = onSignUpTapped)
        }
        SignUpForm(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 274.0.dp
                )
            )
        ) {
            EmailTextBox(modifier = Modifier.rowWeight(1.0f)) {
                PlaceholderRightIcon(modifier = Modifier.rowWeight(1.0f)) {
                    Label(
                        email = email,
                        modifier = Modifier.rowWeight(1.0f)
                    )
                }
            }
            PasswordWrapper(modifier = Modifier.rowWeight(1.0f)) {
                PasswordTextBox(modifier = Modifier.rowWeight(1.0f)) {
                    PlaceholderRightIcon1(modifier = Modifier.rowWeight(1.0f)) {
                        Label1(
                            password = password,
                            modifier = Modifier.rowWeight(1.0f)
                        )
                        IconEye1(onIconEyeTapped = onIconEyeTapped) {
                            Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
                ForgotPasswordLink(
                    onForgotPasswordTapped = onForgotPasswordTapped,
                    modifier = Modifier.rowWeight(1.0f)
                )
            }
        }
        Frame162475(
            onLoginTapped = onLoginTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 432.0.dp
                )
            )
        ) {
            Login1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 150.0.dp,
                        y = 13.0.dp
                    )
                )
            )
        }
        Group99(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 150.0.dp,
                    y = 545.0.dp
                )
            )
        ) {
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
                            x = 15.0.dp,
                            y = 11.0.dp
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
                    y = 515.0.dp
                )
            )
        )
    }
}
//
//@Composable
//fun Login(
//    modifier: Modifier = Modifier,
//    email: String = "",
//    password: String = "",
//    onLoginTapped: () -> Unit = {},
//    onSignUpTapped: () -> Unit = {},
//    onForgotPasswordTapped: () -> Unit = {},
//    onIconEyeTapped: () -> Unit = {},
//    onLoginWithGoogleTapped: () -> Unit = {},
//    onLoginWithFacebookTapped: () -> Unit = {}
//) {
//    // Use BoxWithConstraints to access screen dimensions dynamically
//    BoxWithConstraints(modifier = modifier.fillMaxSize()) {
//        val screenHeight = maxHeight
//        val screenWidth = maxWidth
//
//        // Calculate dynamic offsets based on screen size
//        val bottomNavOffsetY = screenHeight * 0.9f  // 90% from the top
//        val signUpFormOffsetY = screenHeight * 0.35f
//        val loginButtonOffsetY = screenHeight * 0.6f
//        val googleLoginOffsetY = screenHeight * 0.75f
//        val facebookLoginOffsetY = googleLoginOffsetY + 40.dp
//
//        Box(modifier = Modifier.fillMaxSize()) {
//            // Statistics Section at the Top Start
//            Statistics(
//                modifier = Modifier
//                    .align(Alignment.TopStart)
//            ){}
//
//            // Bottom Navigation dynamically offset near the bottom
//            BottomNav(
//                modifier = Modifier
//                    .align(Alignment.BottomCenter)
//                    .offset(y = bottomNavOffsetY)
//            ) {
//                Line12(
//                    modifier = Modifier.fillMaxWidth()
//                )
//            }
//
//            // Sign-Up Form dynamically centered
//            SignUpForm(
//                modifier = Modifier
//                    .offset(y = signUpFormOffsetY)
//            ) {
//                EmailTextBox(modifier = Modifier.weight(1f)) {
//                    PlaceholderRightIcon {
//                        Label(email = email)
//                    }
//                }
//                PasswordWrapper {
//                    PasswordTextBox {
//                        PlaceholderRightIcon1 {
//                            Label1(password = password)
//                            IconEye1(onIconEyeTapped = onIconEyeTapped){}
//                        }
//                    }
//                    ForgotPasswordLink(onForgotPasswordTapped)
//                }
//            }
//
//            // Login Button with dynamic offset
//            Frame162475(
//                onLoginTapped = onLoginTapped,
//                modifier = Modifier
//                    .offset(y = loginButtonOffsetY)
//            ) {
//                Login1(
//                )
//            }
//
//            // Google and Facebook Login Buttons
//            Group99(
//                modifier = Modifier
//                    .offset(y = googleLoginOffsetY)
//            ) {
//                LoginWithGoogle(onLoginWithGoogleTapped) {
//                    Ellipse1()
//                    Ellipse35(
//                        modifier = Modifier
//                            .offset(x = 10.dp, y = 10.dp)
//                    )
//                }
//                LoginWithFacebook(
//                    onLoginWithFacebookTapped = onLoginWithFacebookTapped,
//                    modifier = Modifier
//                        .offset(x = 49.dp)
//                ) {
//                    Ellipse2()
//                    Ellipse36(
//                        modifier = Modifier
//                            .offset(x = -1.dp, y = -1.dp)
//                    )
//                    Vector161(
//                        modifier = Modifier
//                            .offset(x = 15.dp, y = 11.dp)
//                    )
//                }
//            }
//
//            // Bottom Link with Sign-Up Option
//            BottomLink(
//                modifier = Modifier
//                    .align(Alignment.BottomStart)
//                    .padding(start = 31.dp, bottom = 20.dp)
//            ) {
//                DonTHaveAnAccount()
//                SignUp(onSignUpTapped = onSignUpTapped)
//            }
//
//            // "Or Sign-Up With" Text near Google Login
//            OrSignUpWith(
//                modifier = Modifier
//                    .offset(x = 58.dp, y = googleLoginOffsetY - 30.dp)
//            )
//        }
//    }
//}



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
        modifier = modifier.requiredWidth(392.0.dp).requiredHeight(49.0.dp)
    )
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_line_12),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(0.0.dp)
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(113.0.dp)
    )
}

@Composable
fun Login(modifier: Modifier = Modifier) {
    RelayText(
        content = "Login",
        fontSize = 24.0.sp,
        fontFamily = inter,
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
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(327.0.dp)
    )
}

@Composable
fun Label(
    email: String,
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
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun EmailTextBox(
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
    password: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = password,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.625.em,
        letterSpacing = -0.5.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 4.0.dp,
                end = 1.0.dp,
                bottom = 5.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.tappable(onTap = onIconEyeTapped).requiredWidth(24.0.dp).requiredHeight(24.0.dp)
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
        modifier = modifier.height(IntrinsicSize.Min).fillMaxWidth(1.0f)
    )
}

@Composable
fun PasswordTextBox(
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
        modifier = modifier.tappable(onTap = onForgotPasswordTapped).fillMaxWidth(1.0f)
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
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(345.0.dp).requiredHeight(137.0.dp)
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
fun Frame162475(
    onLoginTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        radius = 5.0,
        borderAlignment = BorderAlignment.Outside,
        content = content,
        modifier = modifier.tappable(onTap = onLoginTapped).requiredWidth(343.0.dp).requiredHeight(48.0.dp).relayDropShadow(
            color = Color(
                alpha = 51,
                red = 56,
                green = 65,
                blue = 157
            ),
            borderRadius = 5.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_ellipse_1),
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_ellipse_35),
        modifier = modifier.requiredWidth(18.000003814697266.dp).requiredHeight(18.00002098083496.dp)
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
        modifier = modifier.tappable(onTap = onLoginWithGoogleTapped).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_ellipse_2),
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_ellipse_36),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector161(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_vector_161),
        modifier = modifier.requiredWidth(8.0.dp).requiredHeight(17.0.dp)
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
        modifier = modifier.tappable(onTap = onLoginWithFacebookTapped).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
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
        modifier = modifier.requiredWidth(89.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun OrSignUpWith(modifier: Modifier = Modifier) {
    RelayText(
        content = "or sign up with",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(273.0.dp).requiredHeight(10.0.dp)
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
