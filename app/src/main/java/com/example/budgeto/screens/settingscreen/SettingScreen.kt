package com.example.budgeto.screens.settingscreen

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
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
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable


@Composable
fun SettingScreen(
    onXButtonTapped: () -> Unit = {},
    modifier: Modifier = Modifier
){
    Setting1(
        onXButtonTapped = onXButtonTapped,
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}


@Composable
fun Setting1(
    modifier: Modifier = Modifier,
    onXButtonTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Frame47(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 82.0.dp
                )
            )
        ) {
            GeneralSettings(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Frame48(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 56.0.dp
                    )
                )
            ) {
                Language(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame52(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 175.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    English(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                    Vector321(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 114.0000000655675.dp,
                                y = 7.000000139330046.dp
                            )
                        )
                    )
                }
            }
            Frame49(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 115.0.dp
                    )
                )
            ) {
                DefaultCurrency(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame53(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 175.0.dp,
                            y = 15.0.dp
                        )
                    )
                ) {
                    VN(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                    Vector322(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 114.0000000655675.dp,
                                y = 6.9999972783071005.dp
                            )
                        )
                    )
                }
            }
            Frame50(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 174.0.dp
                    )
                )
            ) {
                DateFormat(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame57(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 175.0.dp,
                            y = 15.0.dp
                        )
                    )
                ) {
                    MmDdYyyy(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                    Vector323(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 114.0000000655675.dp,
                                y = 6.999996324632788.dp
                            )
                        )
                    )
                }
            }
            Frame51(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 233.0.dp
                    )
                )
            ) {
                FirstDayOfTheWeek(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                FirstDayOfTheMonth(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 42.0.dp
                        )
                    )
                )
                FirstMonthOfTheYear(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 68.0.dp
                        )
                    )
                )
                Monday(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 239.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Class1st(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 279.0.dp,
                            y = 42.0.dp
                        )
                    )
                )
                January(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 239.0.dp,
                            y = 68.0.dp
                        )
                    )
                )
            }
            Rectangle67(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 353.0.dp
                    )
                )
            )
        }
        Frame56(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 681.0.dp
                )
            )
        ) {
            CategorySettings(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Frame58(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 56.0.dp
                    )
                )
            ) {
                Account(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame69(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 175.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Default(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                    Vector324(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 114.0000000655675.dp,
                                y = 7.000000139330032.dp
                            )
                        )
                    )
                }
            }
            Frame59(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -81.5.dp,
                        y = 115.0.dp
                    )
                )
            ) {
                Food(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Class0(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                Food1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 6.0.dp,
                            y = 10.0.dp
                        )
                    )
                )
            }
            Frame60(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -81.5.dp,
                        y = 183.0.dp
                    )
                )
            ) {
                Entertainments(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Class01(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                RetroTV(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 4.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            Frame61(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -81.5.dp,
                        y = 251.0.dp
                    )
                )
            ) {
                Health(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Class02(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                HeartWithPulse(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            Frame62(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -81.5.dp,
                        y = 319.0.dp
                    )
                )
            ) {
                Family(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Class03(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                DefendFamily(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
            Frame63(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 82.5.dp,
                        y = 115.0.dp
                    )
                )
            ) {
                Cafe(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Class04(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                Cafe1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 14.0.dp
                        )
                    )
                )
            }
            Frame65(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 82.5.dp,
                        y = 183.0.dp
                    )
                )
            ) {
                Transport(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Class05(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                PublicTransportation(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            Frame66(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 82.5.dp,
                        y = 251.0.dp
                    )
                )
            ) {
                Pets(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Class06(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                Pets1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 4.0.dp,
                            y = 4.0.dp
                        )
                    )
                )
            }
            Frame67(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 82.5.dp,
                        y = 319.0.dp
                    )
                )
            ) {
                Clothes(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
                Class07(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                Clothes1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 4.0.dp,
                            y = 10.0.dp
                        )
                    )
                )
            }
            Rectangle68(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 464.0.dp
                    )
                )
            )
            Frame68(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 395.0.dp
                    )
                )
            ) {
                ApplyToAll(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame70(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 223.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Apply(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 22.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                }
            }
        }
        Frame55(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 467.0.dp
                )
            )
        ) {
            NotificationSettings(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Frame71(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 56.0.dp
                    )
                )
            ) {
                DailyMissionsReminder(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame73(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 258.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Rectangle71(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 29.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                }
            }
            Frame72(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 115.0.dp
                    )
                )
            ) {
                EventNotification(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame74(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 258.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Rectangle72(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 2.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                }
            }
            Rectangle69(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 182.0.dp
                    )
                )
            )
        }
        Setting(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 33.0.dp
                )
            )
        )
        Frame54(
            onXButtonTapped = onXButtonTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 339.0.dp,
                    y = 29.0.dp
                )
            )
        ) {
            Group2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.30330076813697815.dp,
                        y = 0.3033008575439453.dp
                    )
                )
            ) {
                Vector319(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 1.6513671875.dp,
                            y = 1.6516436636447906.dp
                        )
                    )
                )
                Vector320(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 2.75.dp,
                            y = -0.9999978989412046.dp
                        )
                    )
                )
            }
        }
        Frame64(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 378.0.dp,
                    y = 82.0.dp
                )
            )
        ) {
            Rectangle73(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 6.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 1184)
@Composable
private fun Setting1Preview() {
    MaterialTheme {
        RelayContainer {
            Setting1(
                onXButtonTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun GeneralSettings(modifier: Modifier = Modifier) {
    RelayText(
        content = "General Settings",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Language(modifier: Modifier = Modifier) {
    RelayText(
        content = "Language",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun English(modifier: Modifier = Modifier) {
    RelayText(
        content = "English",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector321(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_321),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
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
        radius = 50.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Frame48(
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun DefaultCurrency(modifier: Modifier = Modifier) {
    RelayText(
        content = "Default Currency",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun VN(modifier: Modifier = Modifier) {
    RelayText(
        content = "VNĐ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector322(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_322),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
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
        radius = 50.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(22.0.dp)
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun DateFormat(modifier: Modifier = Modifier) {
    RelayText(
        content = "Date Format",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun MmDdYyyy(modifier: Modifier = Modifier) {
    RelayText(
        content = "mm/dd/yyyy",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector323(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_323),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
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
        radius = 50.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(22.0.dp)
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun FirstDayOfTheWeek(modifier: Modifier = Modifier) {
    RelayText(
        content = "First day of the week",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun FirstDayOfTheMonth(modifier: Modifier = Modifier) {
    RelayText(
        content = "First day of the month",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun FirstMonthOfTheYear(modifier: Modifier = Modifier) {
    RelayText(
        content = "First month of the year",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Monday(modifier: Modifier = Modifier) {
    RelayText(
        content = "Monday",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class1st(modifier: Modifier = Modifier) {
    RelayText(
        content = "1st",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun January(modifier: Modifier = Modifier) {
    RelayText(
        content = "January",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(103.0.dp)
    )
}

@Composable
fun Rectangle67(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_67),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Frame47(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(360.0.dp).relayDropShadow(
            color = Color(
                alpha = 38,
                red = 0,
                green = 0,
                blue = 0
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
fun CategorySettings(modifier: Modifier = Modifier) {
    RelayText(
        content = "Category Settings",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Account(modifier: Modifier = Modifier) {
    RelayText(
        content = "Account",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "Default",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector324(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_324),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
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
        radius = 50.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Frame58(
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Food(modifier: Modifier = Modifier) {
    RelayText(
        content = "Food",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class0(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 đ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 168,
            green = 168,
            blue = 168
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Food1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.setting_1_food),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Frame59(
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
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Entertainments(modifier: Modifier = Modifier) {
    RelayText(
        content = "Entertainments",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class01(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 đ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 168,
            green = 168,
            blue = 168
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun RetroTV(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.setting_1_retro_tv),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(39.0.dp).requiredHeight(39.0.dp)
    )
}

@Composable
fun Frame60(
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
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Health(modifier: Modifier = Modifier) {
    RelayText(
        content = "Health",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class02(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 đ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 168,
            green = 168,
            blue = 168
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun HeartWithPulse(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.setting_1_heart_with_pulse),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(45.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Frame61(
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
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Family(modifier: Modifier = Modifier) {
    RelayText(
        content = "Family",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class03(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 đ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 168,
            green = 168,
            blue = 168
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun DefendFamily(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.setting_1_defend_family),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(45.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Frame62(
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
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Cafe(modifier: Modifier = Modifier) {
    RelayText(
        content = "Cafe",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class04(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 đ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 168,
            green = 168,
            blue = 168
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Cafe1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.setting_1_cafe),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(34.0.dp)
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
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Transport(modifier: Modifier = Modifier) {
    RelayText(
        content = "Transport",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class05(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 đ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 168,
            green = 168,
            blue = 168
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun PublicTransportation(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.setting_1_public_transportation),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(39.0.dp).requiredHeight(39.0.dp)
    )
}

@Composable
fun Frame65(
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
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Pets(modifier: Modifier = Modifier) {
    RelayText(
        content = "Pets",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class06(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 đ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 168,
            green = 168,
            blue = 168
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Pets1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.setting_1_pets),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Frame66(
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
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Clothes(modifier: Modifier = Modifier) {
    RelayText(
        content = "Clothes",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class07(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 đ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 168,
            green = 168,
            blue = 168
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Clothes1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.setting_1_clothes),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Frame67(
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
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Rectangle68(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_68),
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun ApplyToAll(modifier: Modifier = Modifier) {
    RelayText(
        content = "Apply to all",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Apply(modifier: Modifier = Modifier) {
    RelayText(
        content = "Apply",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
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
            red = 248,
            green = 223,
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
        modifier = modifier.requiredWidth(84.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Frame68(
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(474.0.dp).relayDropShadow(
            color = Color(
                alpha = 38,
                red = 0,
                green = 0,
                blue = 0
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
fun NotificationSettings(modifier: Modifier = Modifier) {
    RelayText(
        content = "Notification Settings",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun DailyMissionsReminder(modifier: Modifier = Modifier) {
    RelayText(
        content = "Daily Missions Reminder",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle71(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_71),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
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
            red = 248,
            green = 223,
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
        modifier = modifier.requiredWidth(49.0.dp).requiredHeight(22.0.dp)
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun EventNotification(modifier: Modifier = Modifier) {
    RelayText(
        content = "Event Notification",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle72(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_72),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Frame74(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier.requiredWidth(49.0.dp).requiredHeight(22.0.dp)
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Rectangle69(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_69),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(189.0.dp).relayDropShadow(
            color = Color(
                alpha = 38,
                red = 0,
                green = 0,
                blue = 0
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
fun Setting(modifier: Modifier = Modifier) {
    RelayText(
        content = "Setting",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector319(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_319),
        modifier = modifier.requiredWidth(5.303300768136978.dp).requiredHeight(5.303300768136978.dp)
    )
}

@Composable
fun Vector320(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_320),
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(7.5.dp)
    )
}

@Composable
fun Group2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = -45.00000098057549f).requiredWidth(7.5.dp).requiredHeight(7.5.dp)
    )
}

@Composable
fun Frame54(
    onXButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onXButtonTapped).requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Rectangle73(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_73),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(110.0.dp)
    )
}

@Composable
fun Frame64(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 127,
            red = 224,
            green = 224,
            blue = 224
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(1102.0.dp)
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
