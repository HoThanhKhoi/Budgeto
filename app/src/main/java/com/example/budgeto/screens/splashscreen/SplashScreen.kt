package com.example.budgeto.screens.splashscreen

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.budgeto.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
){
    Splash(

    )
}


@Composable
fun Splash(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Group113(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 0.0.dp
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
private fun SplashPreview() {
    MaterialTheme {
        RelayContainer {
            Splash(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Asset11(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.splash_asset_1_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(175.0.dp).requiredHeight(180.0.dp)
    )
}

@Composable
fun Asset81(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.splash_asset_8_1),
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
