package com.example.budgeto.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.budgeto.R
import com.example.budgeto.screens.accountscreen.Account1
import com.google.relay.compose.BoxScopeInstance.boxAlign
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

@Composable
fun BudgetoBottomNav(
    navController: NavHostController,
    onHomepageButtonTapped: () -> Unit = {},
    onStoreButtonTapped: () -> Unit = {},
    onInventoryButtonTapped: () -> Unit = {},
    onHistoryButtonTapped: () -> Unit = {},
    onStatisticButtonTapped: () -> Unit = {}
) {
    //region navigation bar
    BottomNav(
        modifier = Modifier.boxAlign(
            alignment = Alignment.TopStart,
            offset = DpOffset(
                x = 0.0.dp,
                y = 0.0.dp
            )
        ).fillMaxWidth()
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
        Frame43(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 24.0.dp
                )
            )
        ) {
            Store(
                onStoreButtonTapped = onStoreButtonTapped,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            ) {
                Vector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -0.875.dp,
                            y = -0.875.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
                Vector1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -0.875.dp,
                            y = -0.875.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
            }
            Statistic(
                onStatisticButtonTapped = onStatisticButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 282.0.dp,
                        y = 9.0.dp
                    )
                )
            ) {
                Vector2(
                    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                )
            }
            Archive(
                onInventoryButtonTapped = onInventoryButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 87.0.dp,
                        y = 14.0.dp
                    )
                )
            ) {
                Vector3(
                    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                )
                Vector4(
                    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                )
            }
            History(
                onHistoryButtonTapped = onHistoryButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 231.0.dp,
                        y = 16.0.dp
                    )
                )
            ) {
                Vector5(
                    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                )
                Vector6(
                    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                )
            }
        }
        Frame42(
            onHomepageButtonTapped = onHomepageButtonTapped,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 7.dp)
        ) {
            Vector7(
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
    //endregion
}

@Composable
fun BudgetoBottomNavBarPreview() {
    // Using a fake NavController for the preview
    val fakeNavController = rememberNavController()

    BudgetoBottomNav(
        navController = fakeNavController,
        onHomepageButtonTapped = { /* Simulate action for preview */ },
        onStoreButtonTapped = { /* Simulate action for preview */ },
        onInventoryButtonTapped = { /* Simulate action for preview */ },
        onHistoryButtonTapped = { /* Simulate action for preview */ },
        onStatisticButtonTapped = { /* Simulate action for preview */ }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomNavBar() {
    BudgetoBottomNavBarPreview()
}
//region navigation component
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
        modifier = modifier.fillMaxWidth(   ).requiredHeight(113.0.dp)
    )
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_line_12),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Frame43(
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
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(345.0.dp).requiredHeight(57.0.dp)
    )
}

@Composable
fun Store(
    onStoreButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 27.07861328125.dp,
                top = 11.0.dp,
                end = 285.82836532592773.dp,
                bottom = 14.0.dp
            )
        ).tappable(onTap = onStoreButtonTapped).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.69775390625.dp,
                top = 2.66668701171875.dp,
                end = 10.697593688964844.dp,
                bottom = 11.999979019165039.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.3486328125.dp,
                top = 9.33331298828125.dp,
                end = 4.193857192993164.dp,
                bottom = 2.66668701171875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Statistic(
    onStatisticButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onStatisticButtonTapped).requiredWidth(39.0.dp).requiredHeight(39.0.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.509765625.dp,
                top = 3.9000244140625.dp,
                end = 3.510232925415039.dp,
                bottom = 9.632976531982422.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Archive(
    onInventoryButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onInventoryButtonTapped).requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.75.dp,
                top = 11.25.dp,
                end = 3.75.dp,
                bottom = 3.75.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.875.dp,
                top = 3.75.dp,
                end = 1.875.dp,
                bottom = 13.125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun History(
    onHistoryButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onHistoryButtonTapped).requiredWidth(26.0.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.08349609375.dp,
                top = 1.08331298828125.dp,
                end = 1.0831661224365234.dp,
                bottom = 1.0833492279052734.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector6),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.58349609375.dp,
                top = 5.41668701171875.dp,
                end = 11.91650390625.dp,
                bottom = 11.916646003723145.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Frame42(
    onHomepageButtonTapped: () -> Unit,
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
        radius = 50.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.tappable(onTap = onHomepageButtonTapped).requiredWidth(61.0.dp).requiredHeight(61.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 80,
                green = 78,
                blue = 30
            ),
            borderRadius = 50.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector7),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.0.dp,
                top = 15.0.dp,
                end = 14.058818817138672.dp,
                bottom = 18.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

//endregion
