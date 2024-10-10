package com.example.budgeto.screens.dailymissionscreen

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
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable


@Composable
fun DailyMissionScreen(
    modifier: Modifier = Modifier,

){
    DailyMission1(

    )
}

@Composable
fun DailyMission1(
    modifier: Modifier = Modifier,
    onClaimBonusTapped: () -> Unit = {},
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
            LeftBanner(
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
            RightBanner(
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
            CenterBanner(
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
            DailyMissionGroup(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 5.0.dp
                    )
                )
            ) {
                DailyMission(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
            }
            Button(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 86.0.dp,
                        y = 55.0.dp
                    )
                )
            ) {
                Ellipse3()
                Arrow1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 9.15409697765108.dp,
                            y = 17.49998497090428.dp
                        )
                    )
                )
            }
            EI(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 11.0.dp,
                        y = 58.0.dp
                    )
                )
            )
        }
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
                History(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 232.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Vector5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
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
                    Txt10993(
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
                    Txt262over500(
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
                Txt13(
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
                    y = 0.0.dp
                )
            )
        ) {
            Frame58(
                onClaimBonusTapped = onClaimBonusTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 203.0.dp
                    )
                )
            ) {
                ClaimBonus(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            Frame47(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 82.0.dp
                    )
                )
            ) {
                InputExpense(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 32.0.dp,
                            y = 22.0.dp
                        )
                    )
                )
                InputIncome(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 32.0.dp,
                            y = 59.0.dp
                        )
                    )
                )
                Rectangle67(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 95.0.dp
                        )
                    )
                )
                Star6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 13.881591796875.dp,
                            y = 25.881546020507812.dp
                        )
                    )
                )
                Star7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 13.881591796875.dp,
                            y = 62.88154602050781.dp
                        )
                    )
                )
                Frame65(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 167.0.dp,
                            y = 23.0.dp
                        )
                    )
                ) {
                    Class01(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 44.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                }
                Frame67(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 167.0.dp,
                            y = 60.0.dp
                        )
                    )
                ) {
                    Class11(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 44.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                }
                Cup2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 261.0.dp,
                            y = 17.0.dp
                        )
                    )
                ) {
                    Vector57(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector58(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector59(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector60(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector61(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector62(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector63(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector64(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector65(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector66(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector67(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector68(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector69(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector70(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector71(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector72(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -2.0.dp,
                                y = -2.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector73(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -2.0.dp,
                                y = -2.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector74(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector75(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -1.0.dp,
                                y = -1.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector76(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector77(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector78(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector79(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector80(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector81(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -1.0.dp,
                                y = -1.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector82(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector83(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Cup3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 261.0.dp,
                            y = 54.0.dp
                        )
                    )
                ) {
                    Vector84(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector85(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector86(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector87(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector88(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector89(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector90(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector91(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector92(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector93(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector94(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector95(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector96(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector97(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector98(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector99(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -2.0.dp,
                                y = -2.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector100(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -2.0.dp,
                                y = -2.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector101(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector102(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -1.0.dp,
                                y = -1.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector103(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector104(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector105(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector106(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector107(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector108(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -1.0.dp,
                                y = -1.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector109(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector110(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            DailyMissions(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 44.0.dp,
                        y = 46.0.dp
                    )
                )
            )
            Frame54(
                onXButtonTapped = onXButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 339.0.dp,
                        y = 18.0.dp
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
                                y = -1.0000017136384702.dp
                            )
                        )
                    )
                }
            }
        }
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun DailyMission1Preview() {
    MaterialTheme {
        RelayContainer {
            DailyMission1(
                onClaimBonusTapped = {},
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
        fontFamily = com.example.budgeto.dailymission1.inter,
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
        vector = painterResource(R.drawable.daily_mission_1_vector_317),
        modifier = modifier.requiredWidth(6.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun LeftBanner(
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
        vector = painterResource(R.drawable.daily_mission_1_vector_318),
        modifier = modifier.requiredWidth(6.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun RightBanner(
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
        fontFamily = com.example.budgeto.dailymission1.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Arrow2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_arrow_2),
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
fun CenterBanner(
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
        fontFamily = com.example.budgeto.dailymission1.inter,
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
        vector = painterResource(R.drawable.daily_mission_1_rectangle_63),
        modifier = modifier.requiredWidth(218.0.dp).requiredHeight(14.0.dp)
    )
}

@Composable
fun OverallBalance(modifier: Modifier = Modifier) {
    RelayText(
        content = "Overall Balance",
        fontFamily = com.example.budgeto.dailymission1.inter,
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
        fontFamily = com.example.budgeto.dailymission1.inter,
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
fun DailyMission(modifier: Modifier = Modifier) {
    RelayText(
        content = "Daily\nMission",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
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
fun DailyMissionGroup(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(124.0.dp).requiredHeight(81.0.dp)
    )
}

@Composable
fun Ellipse3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_ellipse_3),
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Arrow1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_arrow_1),
        modifier = modifier.requiredWidth(17.69180679321289.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Button(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun EI(modifier: Modifier = Modifier) {
    RelayText(
        content = "E/I",
        fontSize = 12.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
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
        vector = painterResource(R.drawable.daily_mission_1_line_12),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector),
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
        vector = painterResource(R.drawable.daily_mission_1_vector1),
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
        vector = painterResource(R.drawable.daily_mission_1_vector2),
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
        vector = painterResource(R.drawable.daily_mission_1_vector3),
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
        vector = painterResource(R.drawable.daily_mission_1_vector4),
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
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector5),
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
        vector = painterResource(R.drawable.daily_mission_1_vector6),
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
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector7),
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
        fontFamily = com.example.budgeto.dailymission1.inter,
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
        vector = painterResource(R.drawable.daily_mission_1_vector8),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.09375.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector9),
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
        vector = painterResource(R.drawable.daily_mission_1_vector10),
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
        vector = painterResource(R.drawable.daily_mission_1_vector11),
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
        vector = painterResource(R.drawable.daily_mission_1_vector12),
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
        vector = painterResource(R.drawable.daily_mission_1_vector13),
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
        vector = painterResource(R.drawable.daily_mission_1_vector14),
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
        vector = painterResource(R.drawable.daily_mission_1_vector15),
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
        vector = painterResource(R.drawable.daily_mission_1_vector16),
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
        vector = painterResource(R.drawable.daily_mission_1_vector17),
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
        vector = painterResource(R.drawable.daily_mission_1_vector18),
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
        vector = painterResource(R.drawable.daily_mission_1_vector19),
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
        vector = painterResource(R.drawable.daily_mission_1_vector20),
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
        vector = painterResource(R.drawable.daily_mission_1_vector21),
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
        vector = painterResource(R.drawable.daily_mission_1_vector22),
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
        vector = painterResource(R.drawable.daily_mission_1_vector23),
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
        vector = painterResource(R.drawable.daily_mission_1_vector24),
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
        vector = painterResource(R.drawable.daily_mission_1_vector25),
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
        vector = painterResource(R.drawable.daily_mission_1_vector26),
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
        vector = painterResource(R.drawable.daily_mission_1_vector27),
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
        vector = painterResource(R.drawable.daily_mission_1_vector28),
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
        vector = painterResource(R.drawable.daily_mission_1_vector29),
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
        vector = painterResource(R.drawable.daily_mission_1_vector30),
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
        vector = painterResource(R.drawable.daily_mission_1_vector31),
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
        vector = painterResource(R.drawable.daily_mission_1_vector32),
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
        vector = painterResource(R.drawable.daily_mission_1_vector33),
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
        vector = painterResource(R.drawable.daily_mission_1_vector34),
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
        fontFamily = com.example.budgeto.dailymission1.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector35),
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
        vector = painterResource(R.drawable.daily_mission_1_vector36),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector37(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector37),
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
        vector = painterResource(R.drawable.daily_mission_1_vector38),
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
        vector = painterResource(R.drawable.daily_mission_1_vector46),
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
        vector = painterResource(R.drawable.daily_mission_1_vector47),
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
        vector = painterResource(R.drawable.daily_mission_1_vector48),
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
        vector = painterResource(R.drawable.daily_mission_1_vector49),
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
        vector = painterResource(R.drawable.daily_mission_1_vector50),
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
        vector = painterResource(R.drawable.daily_mission_1_vector51),
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
        vector = painterResource(R.drawable.daily_mission_1_vector52),
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
        vector = painterResource(R.drawable.daily_mission_1_vector53),
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
        vector = painterResource(R.drawable.daily_mission_1_vector39),
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
        vector = painterResource(R.drawable.daily_mission_1_vector40),
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
        vector = painterResource(R.drawable.daily_mission_1_vector54),
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
        vector = painterResource(R.drawable.daily_mission_1_vector55),
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
        vector = painterResource(R.drawable.daily_mission_1_vector41),
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
        vector = painterResource(R.drawable.daily_mission_1_vector42),
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
        vector = painterResource(R.drawable.daily_mission_1_vector43),
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
        vector = painterResource(R.drawable.daily_mission_1_vector44),
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
        vector = painterResource(R.drawable.daily_mission_1_vector45),
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
        vector = painterResource(R.drawable.daily_mission_1_vector56),
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
fun Txt10993(modifier: Modifier = Modifier) {
    RelayText(
        content = "10.993",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
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
        vector = painterResource(R.drawable.daily_mission_1_ellipse_2),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun TxtBudgetoken(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
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
        vector = painterResource(R.drawable.daily_mission_1_rectangle_58),
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Txt262over500(modifier: Modifier = Modifier) {
    RelayText(
        content = "262/500",
        fontSize = 12.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
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
        vector = painterResource(R.drawable.daily_mission_1_star_1),
        modifier = modifier.requiredWidth(45.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Txt13(modifier: Modifier = Modifier) {
    RelayText(
        content = "13",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
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
        vector = painterResource(R.drawable.daily_mission_1_rectangle_65),
        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(845.0.dp)
    )
}

@Composable
fun ClaimBonus(modifier: Modifier = Modifier) {
    RelayText(
        content = "Claim Bonus",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame58(
    onClaimBonusTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
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
        modifier = modifier.tappable(onTap = onClaimBonusTapped).requiredWidth(303.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun InputExpense(modifier: Modifier = Modifier) {
    RelayText(
        content = "Input Expense",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun InputIncome(modifier: Modifier = Modifier) {
    RelayText(
        content = "Input Income",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle67(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_rectangle_67),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Star6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_star_6),
        modifier = modifier.requiredWidth(15.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Star7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_star_7),
        modifier = modifier.requiredWidth(15.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Class01(modifier: Modifier = Modifier) {
    RelayText(
        content = "0/1",
        fontSize = 11.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
        height = 1.2102272727272727.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame65(
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
        modifier = modifier.requiredWidth(106.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Class11(modifier: Modifier = Modifier) {
    RelayText(
        content = "1/1",
        fontSize = 11.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
        height = 1.2102272727272727.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
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
            red = 248,
            green = 223,
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
        modifier = modifier.requiredWidth(106.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Vector57(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector57),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 0.9375.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector58(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector58),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.3125.dp,
                top = 21.09375.dp,
                end = 10.3125.dp,
                bottom = 4.21875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector59(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector59),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.609375.dp,
                top = 25.78125.dp,
                end = 9.609375.dp,
                bottom = 3.515625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector60(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector60),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.1875.dp,
                top = 22.265625.dp,
                end = 12.1875.dp,
                bottom = 5.15625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector61(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector61),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.78125.dp,
                top = 16.0546875.dp,
                end = 13.757811784744263.dp,
                bottom = 10.078125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector62(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector62),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.515625.dp,
                top = 16.0546875.dp,
                end = 13.78125.dp,
                bottom = 10.078125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector63),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.484375.dp,
                top = 19.6875.dp,
                end = 11.484375.dp,
                bottom = 8.90625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector64(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector64),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.9375.dp,
                top = 19.6875.dp,
                end = 11.484375.dp,
                bottom = 8.90625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector65(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector65),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.65625.dp,
                top = 16.640625.dp,
                end = 12.65625.dp,
                bottom = 11.953125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector66(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector66),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.4921875.dp,
                top = 16.640625.dp,
                end = 12.656249642372131.dp,
                bottom = 11.953125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector67(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector67),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.015625.dp,
                top = 20.625.dp,
                end = 11.015625.dp,
                bottom = 8.90625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector68(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector68),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 17.34375.dp,
                top = 20.625.dp,
                end = 11.015625.dp,
                bottom = 8.90625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector69(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector69),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.1875.dp,
                top = 16.171875.dp,
                end = 12.1875.dp,
                bottom = 12.65625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector70(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector70),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.1875.dp,
                top = 16.171875.dp,
                end = 12.1875.dp,
                bottom = 12.65625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector71(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector71),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.171875.dp,
                top = 16.171875.dp,
                end = 12.1875.dp,
                bottom = 12.65625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector72(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector72),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.28125.dp,
                top = 8.671875.dp,
                end = 7.265625.dp,
                bottom = 16.640625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector73(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector73),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.265625.dp,
                top = 8.671875.dp,
                end = 18.28125.dp,
                bottom = 16.640625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector74(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector74),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.3125.dp,
                top = 6.796875.dp,
                end = 10.3125.dp,
                bottom = 13.125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector75(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector75),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.71875.dp,
                top = 7.5.dp,
                end = 18.28125.dp,
                bottom = 17.8125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector76(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector76),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.8203125.dp,
                top = 6.796875.dp,
                end = 10.3125.dp,
                bottom = 13.125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector77(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector77),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.609375.dp,
                top = 6.796875.dp,
                end = 9.609375.dp,
                bottom = 22.5.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector78(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector78),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.515625.dp,
                top = 6.796875.dp,
                end = 9.609375.dp,
                bottom = 22.5.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector79(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector79),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.90625.dp,
                top = 5.859375.dp,
                end = 8.90625.dp,
                bottom = 23.203125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector80(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector80),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 19.21875.dp,
                top = 5.859375.dp,
                end = 8.90625.dp,
                bottom = 23.203125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector81(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector81),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.71875.dp,
                top = 13.21875.dp,
                end = 18.28125.dp,
                bottom = 16.242187678813934.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector82(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector82),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.4296875.dp,
                top = 4.59375.dp,
                end = 17.015625.dp,
                bottom = 22.851562023162842.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector83(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector83),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.99658203125.dp,
                top = 9.50390625.dp,
                end = 13.01984691619873.dp,
                bottom = 16.666683197021484.dp
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
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Vector84(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector84),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 0.9375.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector85(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector85),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.3125.dp,
                top = 21.09375.dp,
                end = 10.3125.dp,
                bottom = 4.21875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector86(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector86),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.609375.dp,
                top = 25.78125.dp,
                end = 9.609375.dp,
                bottom = 3.515625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector87(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector87),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.1875.dp,
                top = 22.265625.dp,
                end = 12.1875.dp,
                bottom = 5.15625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector88(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector88),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.78125.dp,
                top = 16.0546875.dp,
                end = 13.757811784744263.dp,
                bottom = 10.078125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector89(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector89),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.515625.dp,
                top = 16.0546875.dp,
                end = 13.78125.dp,
                bottom = 10.078125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector90(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector90),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.484375.dp,
                top = 19.6875.dp,
                end = 11.484375.dp,
                bottom = 8.90625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector91(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector91),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.9375.dp,
                top = 19.6875.dp,
                end = 11.484375.dp,
                bottom = 8.90625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector92(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector92),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.65625.dp,
                top = 16.640625.dp,
                end = 12.65625.dp,
                bottom = 11.953125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector93(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector93),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.4921875.dp,
                top = 16.640625.dp,
                end = 12.656249642372131.dp,
                bottom = 11.953125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector94(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector94),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.015625.dp,
                top = 20.625.dp,
                end = 11.015625.dp,
                bottom = 8.90625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector95(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector95),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 17.34375.dp,
                top = 20.625.dp,
                end = 11.015625.dp,
                bottom = 8.90625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector96(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector96),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.1875.dp,
                top = 16.171875.dp,
                end = 12.1875.dp,
                bottom = 12.65625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector97(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector97),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.1875.dp,
                top = 16.171875.dp,
                end = 12.1875.dp,
                bottom = 12.65625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector98(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector98),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.171875.dp,
                top = 16.171875.dp,
                end = 12.1875.dp,
                bottom = 12.65625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector99(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector99),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.28125.dp,
                top = 8.671875.dp,
                end = 7.265625.dp,
                bottom = 16.640625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector100(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector100),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.265625.dp,
                top = 8.671875.dp,
                end = 18.28125.dp,
                bottom = 16.640625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector101(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector101),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.3125.dp,
                top = 6.796875.dp,
                end = 10.3125.dp,
                bottom = 13.125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector102(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector102),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.71875.dp,
                top = 7.5.dp,
                end = 18.28125.dp,
                bottom = 17.8125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector103(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector103),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.8203125.dp,
                top = 6.796875.dp,
                end = 10.3125.dp,
                bottom = 13.125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector104(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector104),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.609375.dp,
                top = 6.796875.dp,
                end = 9.609375.dp,
                bottom = 22.5.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector105(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector105),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.515625.dp,
                top = 6.796875.dp,
                end = 9.609375.dp,
                bottom = 22.5.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector106(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector106),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.90625.dp,
                top = 5.859375.dp,
                end = 8.90625.dp,
                bottom = 23.203125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector107(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector107),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 19.21875.dp,
                top = 5.859375.dp,
                end = 8.90625.dp,
                bottom = 23.203125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector108(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector108),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.71875.dp,
                top = 13.21875.dp,
                end = 18.28125.dp,
                bottom = 16.242187678813934.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector109(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector109),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.4296875.dp,
                top = 4.59375.dp,
                end = 17.015625.dp,
                bottom = 22.851562023162842.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector110(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector110),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.99658203125.dp,
                top = 9.50390625.dp,
                end = 13.01984691619873.dp,
                bottom = 16.666683197021484.dp
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
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(30.0.dp)
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(104.0.dp).relayDropShadow(
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
fun DailyMissions(modifier: Modifier = Modifier) {
    RelayText(
        content = "Daily Missions",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.dailymission1.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector319(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector_319),
        modifier = modifier.requiredWidth(5.303300768136978.dp).requiredHeight(5.303300768136978.dp)
    )
}

@Composable
fun Vector320(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.daily_mission_1_vector_320),
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
fun Frame53(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(296.0.dp)
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
