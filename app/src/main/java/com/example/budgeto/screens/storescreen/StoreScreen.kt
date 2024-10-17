package com.example.budgeto.screens.storescreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
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
import com.example.budgeto.screensfonts.inter
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

@Composable
fun StoreScreen(
    onStoreButtonTapped: () -> Unit = {},
    onInventoryButtonTapped: () -> Unit = {},
    onStatisticButtonTapped: () -> Unit = {},
    onHomepageButtonTapped: () -> Unit = {},
    onHistoryButtonTapped: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Store1(
        onStoreButtonTapped = onStoreButtonTapped,
        onInventoryButtonTapped = onInventoryButtonTapped,
        onStatisticButtonTapped = onStatisticButtonTapped,
        onHomepageButtonTapped = onHomepageButtonTapped,
        onHistoryButtonTapped = onHistoryButtonTapped,
        modifier = modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)
    )
}



@Composable
fun Store1(
    modifier: Modifier = Modifier,
    onStoreButtonTapped: () -> Unit = {},
    onInventoryButtonTapped: () -> Unit = {},
    onStatisticButtonTapped: () -> Unit = {},
    onHomepageButtonTapped: () -> Unit = {},
    onHistoryButtonTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        TopNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 30.0.dp
                )
            )
        ) {
            B(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 240.0.dp,
                        y = 10.0.dp
                    )
                )
            ) {
                Frame33(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 18.0.dp,
                            y = 5.0.dp
                        )
                    )
                ) {
                    Class10993(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 20.0.dp,
                                y = 3.0.dp
                            )
                        )
                    )
                }
                Group33608 {
                    Ellipse2()
                    B1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.0.dp,
                                y = 7.0.dp
                            )
                        )
                    )
                }
            }
            Level(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = -2.0.dp,
                        y = 5.0.dp
                    )
                )
            ) {
                LevelFrame(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 18.0.dp,
                            y = 10.0.dp
                        )
                    )
                ) {
                    Rectangle58()
                    Class262500(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 142.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Star1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 2.14300537109375.dp,
                            y = 1.1478271484375.dp
                        )
                    )
                )
                Class13(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 13.0.dp,
                            y = 13.0.dp
                        )
                    )
                )
            }
        }
        Frame69(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 137.0.dp
                )
            )
        ) {
            BudgetoPass(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 21.0.dp
                    )
                )
            )
            Star6(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 37.423919677734375.dp,
                        y = 23.6439208984375.dp
                    )
                )
            )
            Star7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 294.4239196777344.dp,
                        y = 23.6439208984375.dp
                    )
                )
            )
            Frame70(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 55.0.dp
                    )
                )
            ) {}
            Frame71(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 18.0.dp,
                        y = 78.0.dp
                    )
                )
            ) {}
            Frame72(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 18.0.dp,
                        y = 153.0.dp
                    )
                )
            ) {}
            Frame73(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 18.0.dp,
                        y = 228.0.dp
                    )
                )
            ) {}
            Frame74(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 336.0.dp,
                        y = 63.0.dp
                    )
                )
            ) {
                Rectangle75(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 87.0.dp
                        )
                    )
                )
            }
            BananaGoCrazy(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 95.0.dp,
                        y = 78.0.dp
                    )
                )
            )
            BimbimEscapeRoom(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 95.0.dp,
                        y = 153.0.dp
                    )
                )
            )
            BimbimEscapeRoom1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 95.0.dp,
                        y = 228.0.dp
                    )
                )
            )
            FunnyBananaIsGoingCrazyHaveFunWithThisGuys(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 95.0.dp,
                        y = 102.0.dp
                    )
                )
            )
            TurningIntoABimbimDuringThisEscapeAttempt(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 95.0.dp,
                        y = 177.0.dp
                    )
                )
            )
            TurningIntoABimbimDuringThisEscapeAttempt1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 95.0.dp,
                        y = 252.0.dp
                    )
                )
            )
            Rectangle74(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 246.0.dp
                    )
                )
            )
            Txt10dolar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 260.0.dp
                    )
                )
            )
        }
        BudgetoStore(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 102.0.dp
                )
            )
        )
        BottomNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 876.0.dp
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
            Frame43(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 24.0.dp
                    )
                )
            ) {
                Archive(
                    onInventoryButtonTapped = onInventoryButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 98.0.dp,
                            y = 14.0.dp
                        )
                    )
                ) {
                    Vector2(modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f))
                    Vector3(modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f))
                }
                Vector(
                    onStatisticButtonTapped = onStatisticButtonTapped,
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                )
                Vector1(
                    onHomepageButtonTapped = onHomepageButtonTapped,
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                )
                TxtStore(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 33.0.dp,
                            y = 38.0.dp
                        )
                    )
                )
                History(
                    onHistoryButtonTapped = onHistoryButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 228.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Vector4(modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f))
                    Vector5(modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f))
                }
            }
            Frame162485(
                onStoreButtonTapped = onStoreButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 42.0.dp,
                        y = 6.0.dp
                    )
                )
            ) {
                StoreIcon(modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)) {
                    Vector6(
                        modifier = Modifier
                            .boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -0.875.dp,
                                    y = -0.875.dp
                                )
                            )
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector7(
                        modifier = Modifier
                            .boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -0.87518310546875.dp,
                                    y = -0.875.dp
                                )
                            )
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                }
            }
        }
        Frame50(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 460.0.dp
                )
            )
        ) {
            Topup(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -7.0.dp,
                        y = 11.0.dp
                    )
                )
            )
        }
        Frame75(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 517.0.dp
                )
            )
        ) {
            Rectangle94(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = -4.0.dp,
                        y = 129.0.dp
                    )
                )
            )
            Class25BudgetoToken(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 3.0.dp,
                        y = 16.0.dp
                    )
                )
            )
            Txt5dolar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 136.0.dp
                    )
                )
            )
            Group33609(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 37.0.dp,
                        y = 82.0.dp
                    )
                )
            ) {
                Ellipse3()
                B2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
        }
        Frame78(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 694.0.dp
                )
            )
        ) {
            Txt100dolar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 133.0.dp
                    )
                )
            )
            Class500BudgetoToken(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 3.0.dp,
                        y = 15.0.dp
                    )
                )
            )
            Group33610(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 37.0.dp,
                        y = 80.0.dp
                    )
                )
            ) {
                Ellipse5()
                B3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
        }
        Frame76(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 517.0.dp
                )
            )
        ) {
            Txt20dolar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 135.0.dp
                    )
                )
            )
            Class100BudgetoToken(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 16.0.dp
                    )
                )
            )
            Group33611(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 37.0.dp,
                        y = 82.0.dp
                    )
                )
            ) {
                Ellipse6()
                B4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
        }
        Frame79(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 694.0.dp
                )
            )
        ) {
            Txt500dolar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 133.0.dp
                    )
                )
            )
            Class2500BudgetoToken(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 15.0.dp
                    )
                )
            )
            Group33612(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 37.0.dp,
                        y = 80.0.dp
                    )
                )
            ) {
                Ellipse7()
                B5(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
        }
        Frame77(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 260.0.dp,
                    y = 517.0.dp
                )
            )
        ) {
            Txt50dolar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 134.0.dp
                    )
                )
            )
            Class250BudgetoToken(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 16.0.dp
                    )
                )
            )
            Group33613(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 38.0.dp,
                        y = 82.0.dp
                    )
                )
            ) {
                Ellipse8()
                B6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
        }
        Frame80(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 260.0.dp,
                    y = 694.0.dp
                )
            )
        ) {
            Txt1000dolar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 133.0.dp
                    )
                )
            )
            Class5000BudgetoToken(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 15.0.dp
                    )
                )
            )
            Group33614(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 38.0.dp,
                        y = 80.0.dp
                    )
                )
            ) {
                Ellipse9()
                B7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
        }
        Group166(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 102.0.dp,
                    y = 690.0.dp
                )
            )
        ) {
            Rectangle93()
            Txt100(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 11.0.dp
                    )
                )
            )
        }
        Group163(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 342.0.dp,
                    y = 513.0.dp
                )
            )
        ) {
            Rectangle95()
            Txt50(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 6.0.dp,
                        y = 10.0.dp
                    )
                )
            )
        }
        Group164(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 342.0.dp,
                    y = 690.0.dp
                )
            )
        ) {
            Rectangle96()
            Txt1000(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 11.0.dp
                    )
                )
            )
        }
        Group165(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 219.0.dp,
                    y = 513.0.dp
                )
            )
        ) {
            Rectangle97()
            Txt20(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 7.0.dp,
                        y = 10.0.dp
                    )
                )
            )
        }
        Group167(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 219.0.dp,
                    y = 690.0.dp
                )
            )
        ) {
            Rectangle98()
            Txt500(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 3.0.dp,
                        y = 11.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 989)
@Composable
private fun Store1Preview() {
    MaterialTheme {
        RelayContainer {
            Store1(
                onStoreButtonTapped = {},
                onInventoryButtonTapped = {},
                onStatisticButtonTapped = {},
                onHomepageButtonTapped = {},
                onHistoryButtonTapped = {},
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Class10993(modifier: Modifier = Modifier) {
    RelayText(
        content = "10.993",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame33(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier
            .requiredWidth(86.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_ellipse_2),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun B1(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group33608(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun B(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(104.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle58(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_rectangle_58),
        modifier = modifier
            .requiredWidth(131.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Class262500(modifier: Modifier = Modifier) {
    RelayText(
        content = "262/500",
        fontSize = 12.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun LevelFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier
            .requiredWidth(201.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun Star1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_star_1),
        modifier = modifier
            .requiredWidth(45.0.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun Class13(modifier: Modifier = Modifier) {
    RelayText(
        content = "13",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Level(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(219.0.dp)
            .requiredHeight(45.0.dp)
    )
}

@Composable
fun TopNav(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(50.0.dp)
    )
}

@Composable
fun BudgetoPass(modifier: Modifier = Modifier) {
    RelayText(
        content = "Budgeto Pass",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Star6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_star_6),
        modifier = modifier
            .requiredWidth(19.0.dp)
            .requiredHeight(19.0.dp)
    )
}

@Composable
fun Star7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_star_7),
        modifier = modifier
            .requiredWidth(19.0.dp)
            .requiredHeight(19.0.dp)
    )
}

@Composable
fun Frame70(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 233,
            green = 87,
            blue = 62
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
        modifier = modifier
            .requiredWidth(361.0.dp)
            .requiredHeight(8.0.dp)
    )
}

@Composable
fun Frame71(
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
        modifier = modifier
            .requiredWidth(60.0.dp)
            .requiredHeight(60.0.dp)
    )
}

@Composable
fun Frame72(
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
        modifier = modifier
            .requiredWidth(60.0.dp)
            .requiredHeight(60.0.dp)
    )
}

@Composable
fun Frame73(
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
        modifier = modifier
            .requiredWidth(60.0.dp)
            .requiredHeight(60.0.dp)
    )
}

@Composable
fun Rectangle75(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_rectangle_75),
        modifier = modifier
            .requiredWidth(8.0.dp)
            .requiredHeight(78.0.dp)
    )
}

@Composable
fun Frame74(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 244,
            green = 244,
            blue = 244
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(8.0.dp)
            .requiredHeight(216.0.dp)
    )
}

@Composable
fun BananaGoCrazy(modifier: Modifier = Modifier) {
    RelayText(
        content = "Banana go crazy!",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun BimbimEscapeRoom(modifier: Modifier = Modifier) {
    RelayText(
        content = "Bimbim escape room ",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun BimbimEscapeRoom1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Bimbim escape room ",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun FunnyBananaIsGoingCrazyHaveFunWithThisGuys(modifier: Modifier = Modifier) {
    RelayText(
        content = "Funny Banana is going crazy.\nHave fun with this guys.",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TurningIntoABimbimDuringThisEscapeAttempt(modifier: Modifier = Modifier) {
    RelayText(
        content = "Turning into a Bimbim during \nthis escape attempt",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TurningIntoABimbimDuringThisEscapeAttempt1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Turning into a Bimbim during \nthis escape attempt",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle74(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_rectangle_74),
        modifier = modifier
            .requiredWidth(357.0.dp)
            .requiredHeight(44.0.dp)
    )
}

@Composable
fun Txt10dolar(modifier: Modifier = Modifier) {
    RelayText(
        content = "\$10",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame69(
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
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(301.0.dp)
    )
}

@Composable
fun BudgetoStore(modifier: Modifier = Modifier) {
    RelayText(
        content = "Budgeto Store",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_line_12),
        modifier = modifier
            .requiredWidth(150.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_vector2),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 3.75.dp,
                    top = 11.25.dp,
                    end = 3.75.dp,
                    bottom = 3.75.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_vector3),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 1.875.dp,
                    top = 3.75.dp,
                    end = 1.875.dp,
                    bottom = 13.125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .tappable(onTap = onInventoryButtonTapped)
            .requiredWidth(30.0.dp)
            .requiredHeight(30.0.dp)
    )
}

@Composable
fun Vector(
    onStatisticButtonTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_vector),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 289.0.dp,
                    top = 16.0.dp,
                    end = 24.01999855041504.dp,
                    bottom = 15.533000946044922.dp
                )
            )
            .tappable(onTap = onStatisticButtonTapped)
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(
    onHomepageButtonTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_vector1),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 162.0.dp,
                    top = 14.0.dp,
                    end = 152.0.dp,
                    bottom = 17.0.dp
                )
            )
            .tappable(onTap = onHomepageButtonTapped)
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun TxtStore(modifier: Modifier = Modifier) {
    RelayText(
        content = "Store",
        fontSize = 11.0.sp,
        fontFamily = inter,
        height = 1.2102272727272727.em,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_vector4),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 1.083343505859375.dp,
                    top = 1.083251953125.dp,
                    end = 1.0833187103271484.dp,
                    bottom = 1.0834102630615234.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_vector5),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 7.583343505859375.dp,
                    top = 5.416748046875.dp,
                    end = 11.916656494140625.dp,
                    bottom = 11.916584968566895.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .tappable(onTap = onHistoryButtonTapped)
            .requiredWidth(26.0.dp)
            .requiredHeight(26.0.dp)
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
        modifier = modifier
            .requiredWidth(345.0.dp)
            .requiredHeight(57.0.dp)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_vector6),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 11.031982421875.dp,
                    top = 2.75.dp,
                    end = 11.031970024108887.dp,
                    bottom = 12.374998092651367.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_vector7),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 5.5159912109375.dp,
                    top = 9.625.dp,
                    end = 4.324701309204102.dp,
                    bottom = 2.75.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun StoreIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 10.52947998046875.dp,
                    top = 7.428466796875.dp,
                    end = 10.374591827392578.dp,
                    bottom = 13.571533203125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Frame162485(
    onStoreButtonTapped: () -> Unit,
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
        modifier = modifier
            .tappable(onTap = onStoreButtonTapped)
            .requiredWidth(54.0.dp)
            .requiredHeight(54.0.dp)
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
fun Topup(modifier: Modifier = Modifier) {
    RelayText(
        content = "Topup",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame50(
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
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(41.0.dp)
    )
}

@Composable
fun Rectangle94(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier
        .requiredWidth(118.0.dp)
        .requiredHeight(37.0.dp))
}

@Composable
fun Class25BudgetoToken(modifier: Modifier = Modifier) {
    RelayText(
        content = "25\nBudgeto Token",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp)
    )
}

@Composable
fun Txt5dolar(modifier: Modifier = Modifier) {
    RelayText(
        content = "5\$",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Ellipse3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_ellipse_3),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun B2(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group33609(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame75(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier
            .requiredWidth(107.0.dp)
            .requiredHeight(166.0.dp)
    )
}

@Composable
fun Txt100dolar(modifier: Modifier = Modifier) {
    RelayText(
        content = "100\$",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class500BudgetoToken(modifier: Modifier = Modifier) {
    RelayText(
        content = "500\nBudgeto Token",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp)
    )
}

@Composable
fun Ellipse5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_ellipse_4),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun B3(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group33610(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame78(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier
            .requiredWidth(107.0.dp)
            .requiredHeight(166.0.dp)
    )
}

@Composable
fun Txt20dolar(modifier: Modifier = Modifier) {
    RelayText(
        content = "20\$",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class100BudgetoToken(modifier: Modifier = Modifier) {
    RelayText(
        content = "100\nBudgeto Token",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp)
    )
}

@Composable
fun Ellipse6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_ellipse_5),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun B4(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group33611(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame76(
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
        modifier = modifier
            .requiredWidth(107.0.dp)
            .requiredHeight(166.0.dp)
    )
}

@Composable
fun Txt500dolar(modifier: Modifier = Modifier) {
    RelayText(
        content = "500\$",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class2500BudgetoToken(modifier: Modifier = Modifier) {
    RelayText(
        content = "2500\nBudgeto Token",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp)
    )
}

@Composable
fun Ellipse7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_ellipse_6),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun B5(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group33612(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame79(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier
            .requiredWidth(107.0.dp)
            .requiredHeight(166.0.dp)
    )
}

@Composable
fun Txt50dolar(modifier: Modifier = Modifier) {
    RelayText(
        content = "50\$",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class250BudgetoToken(modifier: Modifier = Modifier) {
    RelayText(
        content = "250\nBudgeto Token",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp)
    )
}

@Composable
fun Ellipse8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_ellipse_7),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun B6(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group33613(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame77(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier
            .requiredWidth(107.0.dp)
            .requiredHeight(166.0.dp)
    )
}

@Composable
fun Txt1000dolar(modifier: Modifier = Modifier) {
    RelayText(
        content = "1000\$",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class5000BudgetoToken(modifier: Modifier = Modifier) {
    RelayText(
        content = "5000\nBudgeto Token",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp)
    )
}

@Composable
fun Ellipse9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_ellipse_8),
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun B7(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group33614(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame80(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier
            .requiredWidth(107.0.dp)
            .requiredHeight(166.0.dp)
    )
}

@Composable
fun Rectangle93(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_rectangle_93),
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Txt100(modifier: Modifier = Modifier) {
    RelayText(
        content = "+100",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group166(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 30.0,
        content = content,
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Rectangle95(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_rectangle_94),
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Txt50(modifier: Modifier = Modifier) {
    RelayText(
        content = "+50",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group163(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 30.0,
        content = content,
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Rectangle96(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_rectangle_95),
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Txt1000(modifier: Modifier = Modifier) {
    RelayText(
        content = "+1000",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group164(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 30.0,
        content = content,
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Rectangle97(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_rectangle_96),
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Txt20(modifier: Modifier = Modifier) {
    RelayText(
        content = "+20",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group165(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 30.0,
        content = content,
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Rectangle98(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.store_1_rectangle_97),
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Txt500(modifier: Modifier = Modifier) {
    RelayText(
        content = "+500",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Group167(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 30.0,
        content = content,
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
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
