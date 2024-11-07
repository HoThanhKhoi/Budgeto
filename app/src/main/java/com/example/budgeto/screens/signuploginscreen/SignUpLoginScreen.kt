package com.example.budgeto.screens.signuploginscreen

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.budgeto.R
import com.example.budgeto.screensfonts.inter
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable


@Composable
fun SignUpLoginScreen(
    modifier: Modifier = Modifier,
    onSignUpTapped: () -> Unit = {},
    onLoginTapped: () -> Unit = {}
){
    SignUpLogin(
        onSignUpButtonTapped = onSignUpTapped,
        onLoginButtonTapped = onLoginTapped,
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}

@Composable
fun SignUpLogin(
    modifier: Modifier = Modifier,
    onSignUpButtonTapped: () -> Unit = {},
    onLoginButtonTapped: () -> Unit = {}
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
        Frame162475(
            onSignUpButtonTapped = onSignUpButtonTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 522.0.dp
                )
            )
        ) {
            SignUp(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.dp,
                        y = 0.dp
                    )
                )
            )
        }
        Frame162476(
            onLoginButtonTapped = onLoginButtonTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 580.0.dp
                )
            )
        ) {
            Login(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.dp,
                        y = 0.dp
                    )
                )
            )
        }
        Group113(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 206.0.dp
                )
            )
        ) {
            Asset11(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 25.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Asset81(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 193.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun SignUpLoginPreview() {
    MaterialTheme {
        RelayContainer {
            SignUpLogin(
                onSignUpButtonTapped = {},
                onLoginButtonTapped = {},
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
        vector = painterResource(R.drawable.sign_up_login_line_12),
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
fun Login(modifier: Modifier = Modifier) {
    RelayText(
        content = "Login",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.375.em,
        letterSpacing = 0.32.sp,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame162476(
    onLoginButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 5.0,
        strokeWidth = 1.0,
        borderAlignment = BorderAlignment.Outside,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.tappable(onTap = onLoginButtonTapped).requiredWidth(343.0.dp).requiredHeight(48.0.dp).relayDropShadow(
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
fun Asset11(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_up_login_asset_1_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(175.0.dp).requiredHeight(180.0.dp)
    )
}

@Composable
fun Asset81(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_up_login_asset_8_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(225.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun Group113(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(225.0.dp).requiredHeight(256.0.dp)
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
