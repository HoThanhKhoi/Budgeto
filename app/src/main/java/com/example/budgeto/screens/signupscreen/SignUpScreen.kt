package com.example.budgeto.screens.signupscreen

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.budgeto.R
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
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
fun SignUpScreen(
    onSignUpButtonTapped: () -> Unit = {},
    modifier: Modifier = Modifier
){
    SignUp(
        onSignUpButtonTapped = onSignUpButtonTapped,
        fullName = "Full Name",
        email = "Email",
        onForgotPasswordLinkTapped = {},
        password = "Password",
        onLoginButtonTapped = {},
        onIconEyeTapped = {},
        onLoginWithFacebookTapped = {},
        onLoginWithGoogleTapped = {},
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}


@Composable
fun SignUp(
    modifier: Modifier = Modifier,
    fullName: String = "",
    email: String = "",
    password: String = "",
    onSignUpButtonTapped: () -> Unit = {},
    onLoginButtonTapped: () -> Unit = {},
    onForgotPasswordLinkTapped: () -> Unit = {},
    onIconEyeTapped: () -> Unit = {},
    onLoginWithFacebookTapped: () -> Unit = {},
    onLoginWithGoogleTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Statistics(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = -2.0.dp,
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
                        x = -2.0.dp,
                        y = 101.0.dp
                    )
                )
            )
        }
        SignUp(
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
                    x = -0.5.dp,
                    y = 255.0.dp
                )
            )
        ) {
            FullNameTexBox(modifier = Modifier.rowWeight(1.0f)) {
                PlaceholderRightIcon(modifier = Modifier.rowWeight(1.0f)) {
                    Label(
                        fullName = fullName,
                        modifier = Modifier.rowWeight(1.0f)
                    )
                }
            }
            EmailTextBox(modifier = Modifier.rowWeight(1.0f)) {
                PlaceholderRightIcon1(modifier = Modifier.rowWeight(1.0f)) {
                    Label1(
                        email = email,
                        modifier = Modifier.rowWeight(1.0f)
                    )
                }
            }
            PasswordWrapper(modifier = Modifier.rowWeight(1.0f)) {
                PasswordTextBox(modifier = Modifier.rowWeight(1.0f)) {
                    PlaceholderRightIcon2(modifier = Modifier.rowWeight(1.0f)) {
                        Label2(
                            password = password,
                            modifier = Modifier.rowWeight(1.0f)
                        )
                        IconEye2(onIconEyeTapped = onIconEyeTapped) {
                            Vector4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
                ForgotPasswordLink(
                    onForgotPasswordLinkTapped = onForgotPasswordLinkTapped,
                    modifier = Modifier.rowWeight(1.0f)
                )
            }
        }
        Frame162475(
            onSignUpButtonTapped = onSignUpButtonTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 478.0.dp
                )
            )
        ) {
            SignUp1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 142.0.dp,
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
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun SignUpPreview() {
    MaterialTheme {
        RelayContainer {
            SignUp(
                onSignUpButtonTapped = {},
                onLoginButtonTapped = {},
                fullName = "Full Name",
                email = "Email",
                onForgotPasswordLinkTapped = {},
                password = "Password",
                onIconEyeTapped = {},
                onLoginWithFacebookTapped = {},
                onLoginWithGoogleTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
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
        modifier = modifier.requiredWidth(392.0.dp).requiredHeight(49.0.dp)
    )
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_line_12),
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
fun SignUp(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sign up",
        fontSize = 24.0.sp,
        fontFamily = com.example.budgeto.signup.inter,
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
        fontFamily = com.example.budgeto.signup.inter,
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
        fontFamily = com.example.budgeto.signup.inter,
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
        modifier = modifier.height(IntrinsicSize.Min).requiredWidth(327.0.dp)
    )
}

@Composable
fun Label(
    fullName: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = fullName,
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.signup.inter,
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
        fontFamily = com.example.budgeto.signup.inter,
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
fun Label2(
    password: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = password,
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.signup.inter,
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
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_vector),
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
fun IconEye2(
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
    onForgotPasswordLinkTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Forgot Password?",
        fontFamily = com.example.budgeto.signup.inter,
        height = 1.5.em,
        textAlign = TextAlign.Right,
        italic = true,
        maxLines = -1,
        modifier = modifier.tappable(onTap = onForgotPasswordLinkTapped).fillMaxWidth(1.0f)
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
        modifier = modifier.requiredWidth(345.0.dp).requiredHeight(219.0.dp)
    )
}

@Composable
fun SignUp1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sign up",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.signup.inter,
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
    onSignUpButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onSignUpButtonTapped).requiredWidth(343.0.dp).requiredHeight(48.0.dp).relayDropShadow(
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
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_ellipse_2),
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_ellipse_36),
        modifier = modifier.requiredWidth(26.0.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun Vector161(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_vector_161),
        modifier = modifier.requiredWidth(9.0.dp).requiredHeight(18.0.dp)
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
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_ellipse_1),
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Ellipse35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_ellipse_35),
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
        fontFamily = com.example.budgeto.signup.inter,
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
