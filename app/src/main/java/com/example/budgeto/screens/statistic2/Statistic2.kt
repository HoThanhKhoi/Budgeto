package com.example.budgeto.screens.statistic2


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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.budgeto.R
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable


@Composable
fun Statistic2Screen(

    modifier: Modifier = Modifier
){
    Statistics2(
        modifier = modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)
    )
}


@Composable
fun Statistics2(
    modifier: Modifier = Modifier,
    onBackButtonTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Frame63(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 123.0.dp
                )
            )
        ) {
            June(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 175.0.dp,
                        y = 25.0.dp
                    )
                )
            )
            Vector321(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 253.0.dp,
                        y = 30.0.dp
                    )
                )
            )
            Vector322(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 131.626953125.dp,
                        y = 30.0.dp
                    )
                )
            )
        }
        Frame35 {
            OverallBalance(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 143.0.dp,
                        y = 42.0.dp
                    )
                )
            )
            Txt101000VND(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 68.0.dp
                    )
                )
            )
        }
        Expenses(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 209.0.dp
                )
            )
        )
        Txt24percent(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 74.0.dp,
                    y = 327.0.dp
                )
            )
        )
        Frame54(
            onBackButtonTapped = onBackButtonTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 339.0.dp,
                    y = 209.0.dp
                )
            )
        ) {
            Arrow3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 7.0.dp,
                        y = 6.635986328125.dp
                    )
                )
            )
        }
        Frame85(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 461.0.dp
                )
            )
        ) {
            Frame49(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 18.0.dp
                    )
                )
            ) {
                Food(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 58.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt3054000VND(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 226.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt41percent(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 304.0.dp,
                            y = 33.0.dp
                        )
                    )
                )
                Frame74(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 172.99999457994548.dp,
                            y = -74.99998851235466.dp
                        )
                    )
                ) {
                    Rectangle75(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.496916178846732e-7.dp,
                                y = 0.000010403310398032772.dp
                            )
                        )
                    )
                }
                Food1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 10.0.dp,
                            y = 14.0.dp
                        )
                    )
                )
            }
            Frame51(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 162.0.dp
                    )
                )
            ) {
                Health(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 58.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt2005000VND(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 226.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt24percent1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 304.0.dp,
                            y = 33.0.dp
                        )
                    )
                )
                Frame75(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 172.99999457994548.dp,
                            y = -74.99998851235466.dp
                        )
                    )
                ) {
                    Rectangle76(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.496916178846732e-7.dp,
                                y = 0.000010403310398032772.dp
                            )
                        )
                    )
                }
                HeartWithPulse(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 5.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
            Frame50(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 90.0.dp
                    )
                )
            ) {
                Transport(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 58.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt2458000VND(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 227.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt28percent(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 304.0.dp,
                            y = 33.0.dp
                        )
                    )
                )
                Frame76(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 172.99999457994548.dp,
                            y = -74.99998851235466.dp
                        )
                    )
                ) {
                    Rectangle77(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.496916178846732e-7.dp,
                                y = 0.000010403310398032772.dp
                            )
                        )
                    )
                }
                PublicTransportation(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            Frame52(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 234.0.dp
                    )
                )
            ) {
                Cafe(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 58.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt995000VND(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 239.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt11percent(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 304.0.dp,
                            y = 33.0.dp
                        )
                    )
                )
                Frame77(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 172.99999457994548.dp,
                            y = -74.99998851235466.dp
                        )
                    )
                ) {
                    Rectangle78(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.496916178846732e-7.dp,
                                y = 0.000010403310625406448.dp
                            )
                        )
                    )
                }
                Cafe1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 9.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            Frame53(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 306.0.dp
                    )
                )
            ) {
                Entertainment(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 58.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt723000VND(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 240.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt8percent(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 304.0.dp,
                            y = 33.0.dp
                        )
                    )
                )
                Frame78(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 172.99999457994548.dp,
                            y = -74.99998851235466.dp
                        )
                    )
                ) {
                    Rectangle79(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.00001027217604132602.dp,
                                y = 227.0000004808253.dp
                            )
                        )
                    )
                }
                RetroTV(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 7.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            Frame55(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 378.0.dp
                    )
                )
            ) {
                Pets(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 58.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt0VND(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 288.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt0percent(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 304.0.dp,
                            y = 33.0.dp
                        )
                    )
                )
                Frame79(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 172.99999457994548.dp,
                            y = -74.99998851235466.dp
                        )
                    )
                ) {}
                Pets1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 10.0.dp
                        )
                    )
                )
            }
            Frame56(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 450.0.dp
                    )
                )
            ) {
                Family(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 58.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt0VND1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 288.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt0percent1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 304.0.dp,
                            y = 33.0.dp
                        )
                    )
                )
                Frame80(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 172.99999457994548.dp,
                            y = -74.99998851235466.dp
                        )
                    )
                ) {}
                DefendFamily(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 5.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
            Frame57(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 522.0.dp
                    )
                )
            ) {
                Clothes(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 58.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt0VND2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 288.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Txt0percent2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 304.0.dp,
                            y = 33.0.dp
                        )
                    )
                )
                Frame81(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 172.99999457994548.dp,
                            y = -74.99998851235466.dp
                        )
                    )
                ) {}
                Clothes1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
        }
        BarchartXL(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 0.0.dp
                )
            ).columnWeight(1.0f)
        ) {
            Ellipse22(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 74.5.dp
                    )
                )
            )
            Group11(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = -10.0.dp,
                        y = -25.0.dp
                    )
                )
            ) {
                Ellipse27(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 49.44046506640552.dp,
                            y = 33.522895994919054.dp
                        )
                    )
                )
                Ellipse26(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 32.51134012115017.dp,
                            y = 54.299576917142076.dp
                        )
                    )
                )
                Ellipse25(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 27.961611443888614.dp,
                            y = 103.18452709330268.dp
                        )
                    )
                )
                Ellipse24(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 78.95933532714844.dp,
                            y = -0.0000152587890625.dp
                        )
                    )
                )
                Ellipse28(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 45.20835876464844.dp,
                            y = -0.0000152587890625.dp
                        )
                    )
                )
                Ellipse23(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 8.645858764648438.dp,
                            y = 78.95884704589844.dp
                        )
                    )
                )
            }
            Txt41percent1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 155.0.dp,
                        y = 149.0.dp
                    )
                )
            )
            Charttxt28percent(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 169.0.dp,
                        y = 20.0.dp
                    )
                )
            )
            Ellipse29(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 22.0.dp,
                        y = 7.0.dp
                    )
                )
            )
            Ellipse30(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 63.0.dp,
                        y = 48.0.dp
                    )
                )
            )
            Line18(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 80.0.dp,
                        y = 28.0.dp
                    )
                )
            )
            Line19(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 55.87538919013673.dp,
                        y = 33.55273455703127.dp
                    )
                )
            )
            Line20(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 39.844355097166726.dp,
                        y = 43.805421006911956.dp
                    )
                )
            )
            Line21(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 28.703365608128024.dp,
                        y = 112.50000031242394.dp
                    )
                )
            )
            Line22(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 137.994186826666.dp,
                        y = 85.50024414399465.dp
                    )
                )
            )
        }
        BottomNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.BottomStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            Line12(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -3.0.dp,
                        y = 108.0.dp
                    )
                )
            )
            Frame43(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 31.0.dp
                    )
                )
            ) {
                Store(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    Vector1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -0.875.dp,
                                y = -0.875.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -0.875.dp,
                                y = -0.875.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                }
                Archive(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 84.0.dp,
                            y = 14.0.dp
                        )
                    )
                ) {
                    Vector4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                History1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 212.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Vector8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Frame162490(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 293.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Statistic2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 0.5.dp
                        )
                    )
                ) {
                    Vector11(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Statistic(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 298.0.dp,
                        y = 69.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 1184)
@Composable
private fun Statistics2Preview() {
    MaterialTheme {
        RelayContainer {
            Statistics2(
                onBackButtonTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun June(modifier: Modifier = Modifier) {
    RelayText(
        content = "June",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.statistics2.inter,
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
fun Vector321(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector_321),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
    )
}

@Composable
fun Vector322(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector_322),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
    )
}

@Composable
fun Frame63(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 91,
            blue = 228
        ),
        isStructured = false,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(59.0.dp)
    )
}

@Composable
fun OverallBalance(modifier: Modifier = Modifier) {
    RelayText(
        content = "Overall Balance",
        fontFamily = com.example.budgeto.statistics2.inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt101000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "101.000 VNĐ",
        fontSize = 32.0.sp,
        fontFamily = com.example.budgeto.statistics2.inter,
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
fun Frame35(
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
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(136.0.dp)
    )
}

@Composable
fun Expenses(modifier: Modifier = Modifier) {
    RelayText(
        content = "Expenses",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt24percent(modifier: Modifier = Modifier) {
    RelayText(
        content = "24%",
        height = 1.171875.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Arrow3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_arrow_3),
        modifier = modifier.requiredWidth(14.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Frame54(
    onBackButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 91,
            blue = 228
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
        modifier = modifier.tappable(onTap = onBackButtonTapped).requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Food(modifier: Modifier = Modifier) {
    RelayText(
        content = "Food",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt3054000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "3.054.000 VNĐ",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt41percent(modifier: Modifier = Modifier) {
    RelayText(
        content = "41%",
        fontFamily = com.example.budgeto.statistics2.inter,
        color = Color(
            alpha = 255,
            red = 98,
            green = 98,
            blue = 98
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle75(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_rectangle_75),
        modifier = modifier.requiredWidth(105.00000034969162.dp).requiredHeight(8.000009358067246.dp)
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
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(8.00001049041748.dp).requiredHeight(238.0.dp)
    )
}

@Composable
fun Food1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.statistics_2_food),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(36.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Frame49(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Health(modifier: Modifier = Modifier) {
    RelayText(
        content = "Health",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt2005000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "2.005.000 VNĐ",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt24percent1(modifier: Modifier = Modifier) {
    RelayText(
        content = "24%",
        fontFamily = com.example.budgeto.statistics2.inter,
        color = Color(
            alpha = 255,
            red = 98,
            green = 98,
            blue = 98
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle76(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_rectangle_76),
        modifier = modifier.requiredWidth(56.00000034969162.dp).requiredHeight(8.000005308860636.dp)
    )
}

@Composable
fun Frame75(
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
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(8.00001049041748.dp).requiredHeight(238.0.dp)
    )
}

@Composable
fun HeartWithPulse(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.statistics_2_heart_with_pulse),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(45.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Frame51(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Transport(modifier: Modifier = Modifier) {
    RelayText(
        content = "Transport",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt2458000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "2.458.000 VNĐ",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt28percent(modifier: Modifier = Modifier) {
    RelayText(
        content = "28%",
        fontFamily = com.example.budgeto.statistics2.inter,
        color = Color(
            alpha = 255,
            red = 98,
            green = 98,
            blue = 98
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle77(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_rectangle_77),
        modifier = modifier.requiredWidth(69.00000034969162.dp).requiredHeight(8.000005877108833.dp)
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
            red = 244,
            green = 244,
            blue = 244
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
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(8.00001049041748.dp).requiredHeight(238.0.dp)
    )
}

@Composable
fun PublicTransportation(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.statistics_2_public_transportation),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(39.0.dp).requiredHeight(39.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Cafe(modifier: Modifier = Modifier) {
    RelayText(
        content = "Cafe",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt995000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "995.000 VNĐ",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt11percent(modifier: Modifier = Modifier) {
    RelayText(
        content = "11%",
        fontFamily = com.example.budgeto.statistics2.inter,
        color = Color(
            alpha = 255,
            red = 98,
            green = 98,
            blue = 98
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle78(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_rectangle_78),
        modifier = modifier.requiredWidth(18.00000034969071.dp).requiredHeight(8.000001740479092.dp)
    )
}

@Composable
fun Frame77(
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
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(8.00001049041748.dp).requiredHeight(238.0.dp)
    )
}

@Composable
fun Cafe1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.statistics_2_cafe),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(34.0.dp)
    )
}

@Composable
fun Frame52(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Entertainment(modifier: Modifier = Modifier) {
    RelayText(
        content = "Entertainment",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt723000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "723.000 VNĐ",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt8percent(modifier: Modifier = Modifier) {
    RelayText(
        content = "8%",
        fontFamily = com.example.budgeto.statistics2.inter,
        color = Color(
            alpha = 255,
            red = 98,
            green = 98,
            blue = 98
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle79(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_rectangle_79),
        modifier = modifier.requiredWidth(8.000000953674316.dp).requiredHeight(11.0.dp)
    )
}

@Composable
fun Frame78(
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
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(8.00001049041748.dp).requiredHeight(238.0.dp)
    )
}

@Composable
fun RetroTV(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.statistics_2_retro_tv),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(39.0.dp).requiredHeight(39.0.dp)
    )
}

@Composable
fun Frame53(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Pets(modifier: Modifier = Modifier) {
    RelayText(
        content = "Pets",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt0VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 VNĐ",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt0percent(modifier: Modifier = Modifier) {
    RelayText(
        content = "0%",
        fontFamily = com.example.budgeto.statistics2.inter,
        color = Color(
            alpha = 255,
            red = 98,
            green = 98,
            blue = 98
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame79(
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
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(8.00001049041748.dp).requiredHeight(238.0.dp)
    )
}

@Composable
fun Pets1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.statistics_2_pets),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Frame55(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Family(modifier: Modifier = Modifier) {
    RelayText(
        content = "Family",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt0VND1(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 VNĐ",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt0percent1(modifier: Modifier = Modifier) {
    RelayText(
        content = "0%",
        fontFamily = com.example.budgeto.statistics2.inter,
        color = Color(
            alpha = 255,
            red = 98,
            green = 98,
            blue = 98
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame80(
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
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(8.00001049041748.dp).requiredHeight(238.0.dp)
    )
}

@Composable
fun DefendFamily(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.statistics_2_defend_family),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(45.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Frame56(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Clothes(modifier: Modifier = Modifier) {
    RelayText(
        content = "Clothes",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt0VND2(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 VNĐ",
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt0percent2(modifier: Modifier = Modifier) {
    RelayText(
        content = "0%",
        fontFamily = com.example.budgeto.statistics2.inter,
        color = Color(
            alpha = 255,
            red = 98,
            green = 98,
            blue = 98
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame81(
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
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(8.00001049041748.dp).requiredHeight(238.0.dp)
    )
}

@Composable
fun Clothes1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.statistics_2_clothes),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Frame57(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Frame85(
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(601.0.dp)
    )
}

@Composable
fun Ellipse22(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(672.0.dp).requiredHeight(672.0.dp))
}

@Composable
fun Ellipse27(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_ellipse_27),
        modifier = modifier.requiredWidth(157.01449584960938.dp).requiredHeight(157.01449584960938.dp)
    )
}

@Composable
fun Ellipse26(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_ellipse_26),
        modifier = modifier.requiredWidth(157.01449584960938.dp).requiredHeight(157.01449584960938.dp)
    )
}

@Composable
fun Ellipse25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_ellipse_25),
        modifier = modifier.requiredWidth(157.01449584960938.dp).requiredHeight(157.01449584960938.dp)
    )
}

@Composable
fun Ellipse24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_ellipse_24),
        modifier = modifier.requiredWidth(157.91769409179688.dp).requiredHeight(157.91769409179688.dp)
    )
}

@Composable
fun Ellipse28(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_ellipse_28),
        modifier = modifier.requiredWidth(157.91769409179688.dp).requiredHeight(157.91769409179688.dp)
    )
}

@Composable
fun Ellipse23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_ellipse_23),
        modifier = modifier.requiredWidth(157.91769409179688.dp).requiredHeight(157.91769409179688.dp)
    )
}

@Composable
fun Group11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(222.0.dp).requiredHeight(222.0.dp)
    )
}

@Composable
fun Txt41percent1(modifier: Modifier = Modifier) {
    RelayText(
        content = "41%",
        height = 1.171875.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Charttxt28percent(modifier: Modifier = Modifier) {
    RelayText(
        content = "28%",
        height = 1.171875.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Ellipse29(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_ellipse_29),
        modifier = modifier.requiredWidth(159.0.dp).requiredHeight(159.0.dp)
    )
}

@Composable
fun Ellipse30(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_ellipse_30),
        modifier = modifier.requiredWidth(76.0.dp).requiredHeight(76.0.dp)
    )
}

@Composable
fun Line18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_line_18),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line19(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_line_19),
        modifier = modifier.requiredWidth(40.24922180175781.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line20(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_line_20),
        modifier = modifier.requiredWidth(40.3112907409668.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_line_21),
        modifier = modifier.requiredWidth(41.59326934814453.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_line_22),
        modifier = modifier.requiredWidth(43.011627197265625.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun BarchartXL(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 263.0.dp,
                end = 0.0.dp,
                bottom = 750.0.dp
            )
        ).requiredWidth(201.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_line_12),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.69775390625.dp,
                top = 2.666748046875.dp,
                end = 10.697593688964844.dp,
                bottom = 11.999917984008789.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.3486328125.dp,
                top = 9.333251953125.dp,
                end = 4.193857192993164.dp,
                bottom = 2.666748046875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Store(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 19.0.dp,
                top = 13.0.dp,
                end = 293.90697860717773.dp,
                bottom = 12.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector3),
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
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector4),
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
fun Archive(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.08349609375.dp,
                top = 1.083251953125.dp,
                end = 1.0831661224365234.dp,
                bottom = 1.0834102630615234.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector6),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.58349609375.dp,
                top = 5.416748046875.dp,
                end = 11.91650390625.dp,
                bottom = 11.916584968566895.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun History1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(26.0.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 147.0.dp,
                top = 15.0.dp,
                end = 165.05881881713867.dp,
                bottom = 14.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
fun Vector11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_2_vector7),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.509765625.dp,
                top = 3.89990234375.dp,
                end = 3.510232925415039.dp,
                bottom = 9.633098602294922.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Statistic2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(39.0.dp).requiredHeight(39.0.dp)
    )
}

@Composable
fun Frame162490(
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
        modifier = modifier.requiredWidth(54.0.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Statistic(modifier: Modifier = Modifier) {
    RelayText(
        content = "Statistic",
        fontSize = 11.0.sp,
        fontFamily = com.example.budgeto.statistics2.inter,
        height = 1.2102272727272727.em,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(117.0.dp)
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
