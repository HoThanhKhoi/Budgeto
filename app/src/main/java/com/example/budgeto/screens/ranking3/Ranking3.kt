package com.example.budgeto.screens.ranking3

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
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable


@Composable
fun Ranking3Screen(
    modifier: Modifier = Modifier,

){
    Ranking3(

    )
}

@Composable
fun Ranking3(
    modifier: Modifier = Modifier,
    onBackButtonTapped: () -> Unit = {},
    onXButtonTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Statistics(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = -2.0.dp,
                    y = 570.0.dp
                )
            )
        ) {
            Frame44(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 56.0.dp
                    )
                )
            ) {
                OpenningScreen(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
            }
        }
        WishBanner(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 264.0.dp
                )
            )
        ) {
            Class01(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = -11.0.dp,
                        y = 97.0.dp
                    )
                )
            ) {
                Vector317(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 35.58569388391183.dp,
                            y = 85.00000026226833.dp
                        )
                    )
                )
            }
            Class3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 346.0.dp,
                        y = 97.0.dp
                    )
                )
            ) {
                Vector318(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 13.0.dp,
                            y = 85.0.dp
                        )
                    )
                )
            }
            Class2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 60.0.dp
                    )
                )
            ) {
                Frame36(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 210.0.dp
                        )
                    )
                ) {
                    Christmas(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 10.0.dp,
                                y = 8.0.dp
                            )
                        )
                    )
                    Frame37(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 224.0.dp,
                                y = 5.0.dp
                            )
                        )
                    ) {
                        Arrow2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 5.4853469133377075.dp,
                                    y = 10.999964833259583.dp
                                )
                            )
                        )
                    }
                }
            }
            WishBanner1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 27.0.dp,
                        y = 11.0.dp
                    )
                )
            )
        }
        Hero(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 156.0.dp
                )
            )
        ) {
            Frame35(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 132.0.dp,
                        y = 5.0.dp
                    )
                )
            ) {
                Rectangle63(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 72.0.dp
                        )
                    )
                )
                OverallBalance(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 54.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
                Class101000000VN(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 18.0.dp,
                            y = 35.0.dp
                        )
                    )
                )
            }
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
                        x = -2.0.dp,
                        y = 101.0.dp
                    )
                )
            )
            Frame43(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 22.0.dp,
                        y = 24.0.dp
                    )
                )
            ) {
                Store(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
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
                                x = -0.875244140625.dp,
                                y = -0.875.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                }
                Statistic(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 282.0.dp,
                            y = 9.0.dp
                        )
                    )
                ) {
                    Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Archive(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 87.0.dp,
                            y = 14.0.dp
                        )
                    )
                ) {
                    Vector3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            History(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 254.0.dp,
                        y = 40.0.dp
                    )
                )
            ) {
                Vector5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Vector6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Frame42(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 165.0.dp,
                        y = 6.0.dp
                    )
                )
            ) {
                Vector7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        TopNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 30.0.dp
                )
            )
        ) {
            NameFrame(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 57.0.dp
                    )
                )
            ) {
                Cup(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 196.0.dp,
                            y = 10.0.dp
                        )
                    )
                ) {
                    Class993(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 28.0.dp,
                                y = 3.0.dp
                            )
                        )
                    )
                }
                Cup1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 178.0.dp,
                            y = 5.0.dp
                        )
                    )
                ) {
                    Vector8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector10(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector11(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector12(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector13(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector14(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector15(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector16(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector17(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector18(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector19(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector20(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector21(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector22(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector23(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -2.0.dp,
                                y = -2.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector24(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -2.0.dp,
                                y = -2.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector25(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector26(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -1.0.dp,
                                y = -1.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector27(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector28(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector29(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector30(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector31(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector32(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -1.0.dp,
                                y = -1.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector33(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector34(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Abrabra(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 50.0.dp,
                            y = 13.0.dp
                        )
                    )
                )
                Avatar(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                ) {
                    Layer2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        Class1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            Vector35(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector36(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector37(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector38(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            ClipPathGroup(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                A(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector46(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                                Group(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector47(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector48(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector49(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector50(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector51(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector52(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector53(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                            }
                            Vector39(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector40(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            ClipPathGroup1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                B(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector54(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                                Group1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector55(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 0.0.dp,
                                                y = 0.24770355224609375.dp
                                            )
                                        ).rowWeight(1.0f).columnWeight(1.0f)
                                    )
                                }
                            }
                            Vector41(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector42(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector43(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector44(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector45(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
            }
            Setting(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 300.0.dp,
                        y = 57.0.dp
                    )
                )
            ) {
                IconCog(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 7.0.dp,
                            y = 7.0.dp
                        )
                    )
                ) {
                    Vector56(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Budgetoken(
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
                Ellipse2()
                TxtBudgetoken(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
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
                            x = 2.14306640625.dp,
                            y = 1.1478729248046875.dp
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
        Rectangle65()
        Frame53(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 38.0.dp
                )
            )
        ) {
            Frame86(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 65.0.dp,
                        y = 116.0.dp
                    )
                )
            ) {
                Bronze(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 51.0.dp
                        )
                    )
                )
                Class400(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 66.0.dp
                        )
                    )
                )
            }
            Frame89(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 65.0.dp,
                        y = 241.0.dp
                    )
                )
            ) {
                Potato(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 13.0.dp,
                            y = 51.0.dp
                        )
                    )
                )
                Class200(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 66.0.dp
                        )
                    )
                )
            }
            Frame87(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 116.0.dp
                    )
                )
            ) {
                Gold(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 18.0.dp,
                            y = 51.0.dp
                        )
                    )
                )
                Class1600(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 66.0.dp
                        )
                    )
                )
            }
            Frame90(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 241.0.dp
                    )
                )
            ) {
                Silver(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 51.0.dp
                        )
                    )
                )
                Class800(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 66.0.dp
                        )
                    )
                )
            }
            Frame88(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 102.5.dp,
                        y = 116.0.dp
                    )
                )
            ) {
                Diamond(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 6.0.dp,
                            y = 51.0.dp
                        )
                    )
                )
                Class6400(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 66.0.dp
                        )
                    )
                )
            }
            Frame91(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 102.5.dp,
                        y = 241.0.dp
                    )
                )
            ) {
                Amethyst(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 4.0.dp,
                            y = 51.0.dp
                        )
                    )
                )
                Class3200(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 66.0.dp
                        )
                    )
                )
            }
            Cup2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 62.0.dp,
                        y = 85.0.dp
                    )
                )
            ) {
                Vector57(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Asset15(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Cup3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 62.0.dp,
                        y = 210.0.dp
                    )
                )
            ) {
                Vector58(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Asset14(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Cup4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 85.0.dp
                    )
                )
            ) {
                Vector59(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Asset31(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Cup5(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 210.0.dp
                    )
                )
            ) {
                Vector60(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Asset21(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Cup6(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 262.0.dp,
                        y = 85.0.dp
                    )
                )
            ) {
                Vector61(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Asset52(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Cup7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 262.0.dp,
                        y = 210.0.dp
                    )
                )
            ) {
                Vector62(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Asset42(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Frame58(
                onBackButtonTapped = onBackButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 661.0.dp
                    )
                )
            ) {
                Back(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            Frame54(
                onXButtonTapped = onXButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 332.0.dp,
                        y = 13.0.dp
                    )
                )
            ) {
                Group2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.19669923186302185.dp,
                            y = 0.8033008575439453.dp
                        )
                    )
                ) {
                    Vector319(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 1.651611328125.dp,
                                y = 1.651651293039322.dp
                            )
                        )
                    )
                    Vector320(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 2.75.dp,
                                y = -0.9999976605226255.dp
                            )
                        )
                    )
                }
            }
            LeaderboardDetails(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 44.0.dp,
                        y = 33.0.dp
                    )
                )
            )
            Frame92(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 44.0.dp,
                        y = 352.0.dp
                    )
                )
            ) {
                OneCompletedDailyMission1RankPointAllDailyMissionCompleted1BonusRankPointOneDayNotDoingASingleDailyMissionLose5RankPointLowestRankPoint0YouCouldGetMoreRankPointFromEvents(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 19.0.dp,
                            y = 18.0.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 390, heightDp = 944)
@Composable
private fun Ranking3Preview() {
    MaterialTheme {
        RelayContainer {
            Ranking3(
                onBackButtonTapped = {},
                onXButtonTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun OpenningScreen(modifier: Modifier = Modifier) {
    RelayText(
        content = "Openning Screen",
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
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame44(
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
        modifier = modifier.requiredWidth(204.0.dp).requiredHeight(82.0.dp)
    )
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
        modifier = modifier.requiredWidth(392.0.dp).requiredHeight(274.0.dp)
    )
}

@Composable
fun Vector317(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector_317),
        modifier = modifier.requiredWidth(6.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Class01(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 224,
            green = 224,
            blue = 224
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
        modifier = modifier.requiredWidth(55.0.dp).requiredHeight(183.0.dp)
    )
}

@Composable
fun Vector318(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector_318),
        modifier = modifier.requiredWidth(6.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Class3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 224,
            green = 224,
            blue = 224
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
        modifier = modifier.requiredWidth(55.0.dp).requiredHeight(183.0.dp)
    )
}

@Composable
fun Christmas(modifier: Modifier = Modifier) {
    RelayText(
        content = "Christmas",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Arrow2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_arrow_2),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Frame37(
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
        radius = 18.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(25.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun Frame36(
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
        modifier = modifier.requiredWidth(257.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun Class2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 224,
            green = 224,
            blue = 224
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
        modifier = modifier.requiredWidth(282.0.dp).requiredHeight(257.0.dp)
    )
}

@Composable
fun WishBanner1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Wish banner",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun WishBanner(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(330.0.dp)
    )
}

@Composable
fun Rectangle63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_rectangle_63),
        modifier = modifier.requiredWidth(218.0.dp).requiredHeight(14.0.dp)
    )
}

@Composable
fun OverallBalance(modifier: Modifier = Modifier) {
    RelayText(
        content = "Overall Balance",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class101000000VN(modifier: Modifier = Modifier) {
    RelayText(
        content = "101.000.000 VNĐ",
        fontSize = 20.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
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
        modifier = modifier.requiredWidth(211.0.dp).requiredHeight(81.0.dp)
    )
}

@Composable
fun Hero(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(343.0.dp).requiredHeight(99.0.dp)
    )
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_line_12),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.666748046875.dp,
                top = 2.66668701171875.dp,
                end = 10.666584968566895.dp,
                bottom = 11.999979019165039.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.333251953125.dp,
                top = 9.33331298828125.dp,
                end = 4.18157958984375.dp,
                bottom = 2.66668701171875.dp
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
                start = 27.0.dp,
                top = 11.0.dp,
                end = 285.0.dp,
                bottom = 14.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.510009765625.dp,
                top = 3.9000244140625.dp,
                end = 3.509988784790039.dp,
                bottom = 9.632976531982422.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Statistic(
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
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector3),
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
        vector = painterResource(R.drawable.ranking_3_vector4),
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(57.0.dp)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.083251953125.dp,
                top = 1.08331298828125.dp,
                end = 1.0834102630615234.dp,
                bottom = 1.0833492279052734.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector6),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.583251953125.dp,
                top = 5.41668701171875.dp,
                end = 11.916748046875.dp,
                bottom = 11.916646003723145.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun History(
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
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector7),
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

@Composable
fun Frame42(
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
        modifier = modifier.requiredWidth(61.0.dp).requiredHeight(61.0.dp).relayDropShadow(
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
fun Class993(modifier: Modifier = Modifier) {
    RelayText(
        content = "993",
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
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Cup(
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
        modifier = modifier.requiredWidth(84.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector8),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.09375.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector9),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.03125.dp,
                top = 24.609375.dp,
                end = 12.03125.dp,
                bottom = 4.921875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector10),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.2109375.dp,
                top = 30.078125.dp,
                end = 11.2109375.dp,
                bottom = 4.1015625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector11),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.21875.dp,
                top = 25.9765625.dp,
                end = 14.21875.dp,
                bottom = 6.015625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector12),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.078125.dp,
                top = 18.73046875.dp,
                end = 16.050780296325684.dp,
                bottom = 11.7578125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector13),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.1015625.dp,
                top = 18.73046875.dp,
                end = 16.078125.dp,
                bottom = 11.7578125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector14),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.3984375.dp,
                top = 22.96875.dp,
                end = 13.3984375.dp,
                bottom = 10.390625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector15),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.59375.dp,
                top = 22.96875.dp,
                end = 13.3984375.dp,
                bottom = 10.390625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector16(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector16),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.765625.dp,
                top = 19.4140625.dp,
                end = 14.765625.dp,
                bottom = 13.9453125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector17(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector17),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.07421875.dp,
                top = 19.4140625.dp,
                end = 14.765624523162842.dp,
                bottom = 13.9453125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector18),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.8515625.dp,
                top = 24.0625.dp,
                end = 12.8515625.dp,
                bottom = 10.390625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector19(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector19),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 20.234375.dp,
                top = 24.0625.dp,
                end = 12.8515625.dp,
                bottom = 10.390625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector20(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector20),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.21875.dp,
                top = 18.8671875.dp,
                end = 14.21875.dp,
                bottom = 14.765625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector21),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.21875.dp,
                top = 18.8671875.dp,
                end = 14.21875.dp,
                bottom = 14.765625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector22),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.8671875.dp,
                top = 18.8671875.dp,
                end = 14.21875.dp,
                bottom = 14.765625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector23),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 21.328125.dp,
                top = 10.1171875.dp,
                end = 8.4765625.dp,
                bottom = 19.4140625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector24),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.4765625.dp,
                top = 10.1171875.dp,
                end = 21.328125.dp,
                bottom = 19.4140625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector25),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.03125.dp,
                top = 7.9296875.dp,
                end = 12.03125.dp,
                bottom = 15.3125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector26(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector26),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.671875.dp,
                top = 8.75.dp,
                end = 21.328125.dp,
                bottom = 20.78125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector27(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector27),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.45703125.dp,
                top = 7.9296875.dp,
                end = 12.03125.dp,
                bottom = 15.3125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector28(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector28),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.2109375.dp,
                top = 7.9296875.dp,
                end = 11.2109375.dp,
                bottom = 26.25.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector29(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector29),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 21.6015625.dp,
                top = 7.9296875.dp,
                end = 11.2109375.dp,
                bottom = 26.25.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector30(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector30),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.390625.dp,
                top = 6.8359375.dp,
                end = 10.390625.dp,
                bottom = 27.0703125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector31(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector31),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 22.421875.dp,
                top = 6.8359375.dp,
                end = 10.390625.dp,
                bottom = 27.0703125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector32(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector32),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.671875.dp,
                top = 15.421875.dp,
                end = 21.328125.dp,
                bottom = 18.949218928813934.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector33(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector33),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.16796875.dp,
                top = 5.359375.dp,
                end = 19.8515625.dp,
                bottom = 26.660155773162842.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector34(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector34),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.16259765625.dp,
                top = 11.087890625.dp,
                end = 15.189902782440186.dp,
                bottom = 19.4444637298584.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(35.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun Abrabra(modifier: Modifier = Modifier) {
    RelayText(
        content = "Abrabra",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector35),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.897705078125.dp,
                top = 4.177520751953125.dp,
                end = 8.561765670776367.dp,
                bottom = 8.968406677246094.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector36),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector37(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector37),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.2314453125.dp,
                top = 19.16301727294922.dp,
                end = 4.3704986572265625.dp,
                bottom = 0.0001678466796875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector38(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector38),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.2314453125.dp,
                top = 23.332611083984375.dp,
                end = 4.3704986572265625.dp,
                bottom = 0.00017309188842773438.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector46(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector46),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun A(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector47(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector47),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.14318084716796875.dp,
                end = 15.75291395187378.dp,
                bottom = 5.036615967750549.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector48(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector48),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.7529296875.dp,
                top = 3.23272705078125.dp,
                end = 14.99998426437378.dp,
                bottom = 1.947069764137268.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector49(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector49),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.333984375.dp,
                top = 3.3897857666015625.dp,
                end = 11.418928861618042.dp,
                bottom = 1.7900091409683228.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector50(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector50),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.107666015625.dp,
                top = 5.179801940917969.dp,
                end = 7.645247220993042.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector51(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector51),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.89892578125.dp,
                top = 3.1455307006835938.dp,
                end = 3.8539892435073853.dp,
                bottom = 2.0342642068862915.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector52(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector52),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.498046875.dp,
                top = 3.2252960205078125.dp,
                end = 0.254866361618042.dp,
                bottom = 1.9545007944107056.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector53(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector53),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.7529296875.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 5.179794907569885.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.3525390625.dp,
                top = 0.9408340454101562.dp,
                end = 1.777069091796875.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ClipPathGroup(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.2314453125.dp,
                top = 23.332611083984375.dp,
                end = 4.3704986572265625.dp,
                bottom = 0.00017309188842773438.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector39(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector39),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.282470703125.dp,
                top = 17.021743774414062.dp,
                end = 2.5858240127563477.dp,
                bottom = 7.237176418304443.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector40(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector40),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.322509765625.dp,
                top = 19.379501342773438.dp,
                end = 10.596830368041992.dp,
                bottom = 5.687982082366943.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector54(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector54),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector55(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector55),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.423095703125.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 1.374589443206787.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ClipPathGroup1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.322509765625.dp,
                top = 19.379501342773438.dp,
                end = 10.596830368041992.dp,
                bottom = 5.687982082366943.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector41(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector41),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.616455078125.dp,
                top = 11.980667114257812.dp,
                end = 8.219087600708008.dp,
                bottom = 14.978997230529785.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector42(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector42),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.109619140625.dp,
                top = 4.29345703125.dp,
                end = 8.77364730834961.dp,
                bottom = 9.084831237792969.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector43(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector43),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.99462890625.dp,
                top = 3.1209564208984375.dp,
                end = 7.701695442199707.dp,
                bottom = 17.975016593933105.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector44(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector44),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.133056640625.dp,
                top = 3.06195068359375.dp,
                end = 7.847527503967285.dp,
                bottom = 20.819265365600586.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector45(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector45),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.173583984375.dp,
                top = 1.3389892578125.dp,
                end = 5.907976150512695.dp,
                bottom = 11.054683685302734.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Layer2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.09716796875.dp,
                top = 0.099090576171875.dp,
                end = 0.0.dp,
                bottom = 0.28289222717285156.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun NameFrame(
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
        modifier = modifier.requiredWidth(291.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun Vector56(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector56),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconCog(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(30.49974250793457.dp).requiredHeight(30.5.dp)
    )
}

@Composable
fun Setting(
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
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun Class10993(modifier: Modifier = Modifier) {
    RelayText(
        content = "10.993",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
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
        modifier = modifier.requiredWidth(86.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_ellipse_2),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun TxtBudgetoken(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
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
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Budgetoken(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(104.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle58(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_rectangle_58),
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Class262500(modifier: Modifier = Modifier) {
    RelayText(
        content = "262/500",
        fontSize = 12.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
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
        modifier = modifier.requiredWidth(201.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun Star1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_star_1),
        modifier = modifier.requiredWidth(45.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Class13(modifier: Modifier = Modifier) {
    RelayText(
        content = "13",
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
        modifier = modifier.requiredWidth(219.0.dp).requiredHeight(45.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(110.0.dp)
    )
}

@Composable
fun Rectangle65(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_rectangle_65),
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(944.0.dp)
    )
}

@Composable
fun Bronze(modifier: Modifier = Modifier) {
    RelayText(
        content = "Bronze",
        fontSize = 12.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class400(modifier: Modifier = Modifier) {
    RelayText(
        content = "400+",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame86(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 63,
            red = 255,
            green = 232,
            blue = 190
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(134.0.dp)
    )
}

@Composable
fun Potato(modifier: Modifier = Modifier) {
    RelayText(
        content = "Potato",
        fontSize = 12.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class200(modifier: Modifier = Modifier) {
    RelayText(
        content = "200+",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame89(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 63,
            red = 255,
            green = 232,
            blue = 190
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(111.0.dp)
    )
}

@Composable
fun Gold(modifier: Modifier = Modifier) {
    RelayText(
        content = "Gold",
        fontSize = 12.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class1600(modifier: Modifier = Modifier) {
    RelayText(
        content = "1600+",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame87(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 63,
            red = 255,
            green = 232,
            blue = 190
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(134.0.dp)
    )
}

@Composable
fun Silver(modifier: Modifier = Modifier) {
    RelayText(
        content = "Silver",
        fontSize = 12.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class800(modifier: Modifier = Modifier) {
    RelayText(
        content = "800+",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame90(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 63,
            red = 255,
            green = 232,
            blue = 190
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(111.0.dp)
    )
}

@Composable
fun Diamond(modifier: Modifier = Modifier) {
    RelayText(
        content = "Diamond",
        fontSize = 12.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class6400(modifier: Modifier = Modifier) {
    RelayText(
        content = "6400+",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame88(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 63,
            red = 255,
            green = 232,
            blue = 190
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(134.0.dp)
    )
}

@Composable
fun Amethyst(modifier: Modifier = Modifier) {
    RelayText(
        content = "Amethyst",
        fontSize = 12.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class3200(modifier: Modifier = Modifier) {
    RelayText(
        content = "3200+",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame91(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 63,
            red = 255,
            green = 232,
            blue = 190
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(111.0.dp)
    )
}

@Composable
fun Vector57(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector57),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset15(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.ranking_3_asset_1_5),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.0.dp,
                top = 10.0.dp,
                end = 13.0.dp,
                bottom = 10.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun Vector58(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector58),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset14(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.ranking_3_asset_1_4),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.0.dp,
                top = 10.0.dp,
                end = 13.0.dp,
                bottom = 10.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun Vector59(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector59),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset31(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.ranking_3_asset_3_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.0.dp,
                top = 11.0.dp,
                end = 13.0.dp,
                bottom = 11.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun Vector60(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector60),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset21(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.ranking_3_asset_2_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.0.dp,
                top = 11.0.dp,
                end = 13.0.dp,
                bottom = 12.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun Vector61(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector61),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset52(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.ranking_3_asset_5_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.0.dp,
                top = 10.0.dp,
                end = 12.0.dp,
                bottom = 10.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun Vector62(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector62),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 2.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset42(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.ranking_3_asset_4_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.0.dp,
                top = 10.0.dp,
                end = 13.0.dp,
                bottom = 11.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(70.0.dp).requiredHeight(70.0.dp)
    )
}

@Composable
fun Back(modifier: Modifier = Modifier) {
    RelayText(
        content = "Back",
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
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame58(
    onBackButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onBackButtonTapped).requiredWidth(303.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Vector319(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector_319),
        modifier = modifier.requiredWidth(5.303300768136978.dp).requiredHeight(5.303300768136978.dp)
    )
}

@Composable
fun Vector320(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_3_vector_320),
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
        modifier = modifier.tappable(onTap = onXButtonTapped).requiredWidth(35.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun LeaderboardDetails(modifier: Modifier = Modifier) {
    RelayText(
        content = "Leaderboard Details",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun OneCompletedDailyMission1RankPointAllDailyMissionCompleted1BonusRankPointOneDayNotDoingASingleDailyMissionLose5RankPointLowestRankPoint0YouCouldGetMoreRankPointFromEvents(modifier: Modifier = Modifier) {
    RelayText(
        content = "One completed daily mission = 1 rank point.\n\nAll daily mission completed = 1 bonus rank point.\n\nOne day not doing a single daily mission = lose 5 rank point.\n\nLowest rank point = 0.\n\nYou could get more rank point from events.",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(268.0.dp)
    )
}

@Composable
fun Frame92(
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(283.0.dp)
    )
}

@Composable
fun Frame53(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(752.0.dp)
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
