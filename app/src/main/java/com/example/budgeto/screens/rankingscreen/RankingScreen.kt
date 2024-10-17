package com.example.budgeto.screens.rankingscreen

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.budgeto.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable


@Composable
fun RankingScreen(
    modifier: Modifier = Modifier,

){
    Ranking1(

    )
}




@Composable
fun Ranking1(
    modifier: Modifier = Modifier,
    onLeaderboardDetailsButtonTapped: () -> Unit = {},
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
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 34.806884765625.dp,
                            y = 33.6988525390625.dp
                        )
                    )
                ) {
                    Vector(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 62.77494812011719.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 53.00503921508789.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 43.44253921508789.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector3(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 36.13432312011719.dp,
                                y = 3.4488525390625.dp
                            )
                        )
                    )
                    Vector4(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 27.84026336669922.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector5(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 17.884281158447266.dp,
                                y = 0.50567626953125.dp
                            )
                        )
                    )
                    Vector6(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 3.7208595275878906.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector7(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -6.14692497253418.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector8(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -13.313276290893555.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector9(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -20.459426879882812.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector10(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -30.412551879882812.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector11(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -40.18246078491211.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector12(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -49.867098331451416.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector13(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -61.34872055053711.dp,
                                y = 0.50567626953125.dp
                            )
                        )
                    )
                }
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
                Vector317Stroke(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 35.58569397133441.dp,
                            y = 85.00000036779699.dp
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
                Vector317Stroke1(
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
                                x = 10.806884765625.dp,
                                y = 10.6988525390625.dp
                            )
                        )
                    ) {
                        Vector14(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 71.772705078125.dp,
                                    y = 3.460235595703125.dp
                                )
                            )
                        )
                        Vector15(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 62.46875.dp,
                                    y = 3.460235595703125.dp
                                )
                            )
                        )
                        Vector16(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 48.2841796875.dp,
                                    y = 3.460235595703125.dp
                                )
                            )
                        )
                        Vector17(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 41.45166015625.dp,
                                    y = 1.482940673828125.dp
                                )
                            )
                        )
                        Vector18(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 32.694580078125.dp,
                                    y = 3.460235595703125.dp
                                )
                            )
                        )
                        Vector19(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 28.630615234375.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector20(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 22.1748046875.dp,
                                    y = 3.4488525390625.dp
                                )
                            )
                        )
                        Vector21(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 12.1904296875.dp,
                                    y = 0.664764404296875.dp
                                )
                            )
                        )
                        Vector22(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.50567626953125.dp
                                )
                            )
                        )
                    }
                    Frame37(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 224.0.dp,
                                y = 5.0.dp
                            )
                        )
                    ) {
                        Arrow2Stroke(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 10.399409589252798.dp,
                                    y = 9.550217208347647.dp
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
                        x = 27.301025390625.dp,
                        y = 13.698863983154297.dp
                    )
                )
            ) {
                Vector23(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 93.196044921875.dp,
                            y = 3.448863983154297.dp
                        )
                    )
                )
                Vector24(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 83.28125.dp,
                            y = 3.4602279663085938.dp
                        )
                    )
                )
                Vector25(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 73.680419921875.dp,
                            y = 3.4602279663085938.dp
                        )
                    )
                )
                Vector26(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 63.727294921875.dp,
                            y = 3.4602279663085938.dp
                        )
                    )
                )
                Vector27(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 54.036865234375.dp,
                            y = 3.4602279663085938.dp
                        )
                    )
                )
                Vector28(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 44.319580078125.dp,
                            y = 0.6647720336914062.dp
                        )
                    )
                )
                Vector29(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 30.586669921875.dp,
                            y = 0.6647720336914062.dp
                        )
                    )
                )
                Vector30(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 21.2158203125.dp,
                            y = 3.4602279663085938.dp
                        )
                    )
                )
                Vector31(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 17.152099609375.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Vector32(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.6647720336914062.dp
                        )
                    )
                )
            }
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
                Rectangle63Stroke(
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
                            x = 54.79052734375.dp,
                            y = 12.678977966308594.dp
                        )
                    )
                ) {
                    Vector33(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 95.36376953125.dp,
                                y = 2.5852279663085938.dp
                            )
                        )
                    )
                    Vector34(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 87.42041015625.dp,
                                y = 2.5852279663085938.dp
                            )
                        )
                    )
                    Vector35(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 79.396240234375.dp,
                                y = 2.5852279663085938.dp
                            )
                        )
                    )
                    Vector36(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 71.067626953125.dp,
                                y = 2.5852279663085938.dp
                            )
                        )
                    )
                    Vector37(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 67.939208984375.dp,
                                y = 0.1392059326171875.dp
                            )
                        )
                    )
                    Vector38(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 59.610595703125.dp,
                                y = 2.5852279663085938.dp
                            )
                        )
                    )
                    Vector39(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 50.927734375.dp,
                                y = 0.1392059326171875.dp
                            )
                        )
                    )
                    Vector40(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 43.616943359375.dp,
                                y = 0.1392059326171875.dp
                            )
                        )
                    )
                    Vector41(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 40.130615234375.dp,
                                y = 0.1392059326171875.dp
                            )
                        )
                    )
                    Vector42(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 31.802001953125.dp,
                                y = 2.5852279663085938.dp
                            )
                        )
                    )
                    Vector43(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 26.855224609375.dp,
                                y = 2.5703125.dp
                            )
                        )
                    )
                    Vector44(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 18.29541015625.dp,
                                y = 2.5852279663085938.dp
                            )
                        )
                    )
                    Vector45(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 10.366943359375.dp,
                                y = 2.6846580505371094.dp
                            )
                        )
                    )
                    Vector46()
                }
                Class101000000VN(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 19.015625.dp,
                            y = 39.255680084228516.dp
                        )
                    )
                ) {
                    Vector47(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 157.8603515625.dp,
                                y = 0.19886398315429688.dp
                            )
                        )
                    )
                    Vector48(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 145.17041015625.dp,
                                y = 0.19886398315429688.dp
                            )
                        )
                    )
                    Vector49(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 129.421142578125.dp,
                                y = 0.19886398315429688.dp
                            )
                        )
                    )
                    Vector50(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 111.555419921875.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector51(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 97.785888671875.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector52(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 84.016357421875.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector53(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 78.907958984375.dp,
                                y = 11.53409194946289.dp
                            )
                        )
                    )
                    Vector54(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 65.461669921875.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector55(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 51.692138671875.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector56(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 37.922607421875.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector57(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 32.814208984375.dp,
                                y = 11.53409194946289.dp
                            )
                        )
                    )
                    Vector58(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 23.5546875.dp,
                                y = 0.19886398315429688.dp
                            )
                        )
                    )
                    Vector59(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 9.778076171875.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector60(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.19886398315429688.dp
                            )
                        )
                    )
                }
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
                Subtract()
                SubtractStroke()
                DailyMission(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.011474609375.dp,
                            y = 11.698860168457031.dp
                        )
                    )
                ) {
                    Vector61(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 51.09521484375.dp,
                                y = 22.460227966308594.dp
                            )
                        )
                    )
                    Vector62(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 40.930419921875.dp,
                                y = 22.460227966308594.dp
                            )
                        )
                    )
                    Vector63(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 36.832275390625.dp,
                                y = 19.0.dp
                            )
                        )
                    )
                    Vector64(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 27.552490234375.dp,
                                y = 22.460227966308594.dp
                            )
                        )
                    )
                    Vector65(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 18.568115234375.dp,
                                y = 22.460227966308594.dp
                            )
                        )
                    )
                    Vector66(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 14.504150390625.dp,
                                y = 19.0.dp
                            )
                        )
                    )
                    Vector67(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 19.664772033691406.dp
                            )
                        )
                    )
                    Vector68(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 28.902099609375.dp,
                                y = 3.573863983154297.dp
                            )
                        )
                    )
                    Vector69(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 25.23583984375.dp,
                                y = 0.6647720336914062.dp
                            )
                        )
                    )
                    Vector70(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 20.785400390625.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector71(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.18603515625.dp,
                                y = 3.4602279663085938.dp
                            )
                        )
                    )
                    Vector72(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.6647720336914062.dp
                            )
                        )
                    )
                }
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
                Ellipse3Stroke()
                Arrow1Stroke(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 14.24345255984349.dp,
                            y = 15.865653745907139.dp
                        )
                    )
                )
            }
            EI(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 11.958740234375.dp,
                        y = 60.8636360168457.dp
                    )
                )
            ) {
                Vector73(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.63671875.dp,
                            y = 0.4090919494628906.dp
                        )
                    )
                )
                Vector74(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 6.501708984375.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Vector75(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.4090919494628906.dp
                        )
                    )
                )
            }
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
            Line12Stroke(
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
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 22.0.dp,
                        y = 24.0.dp
                    )
                )
            ) {
                Store(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    VectorStroke(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                    Vector76(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                    Vector77(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector78(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                Vector79(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Vector80(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                Vector81(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                                x = 28.806640625.dp,
                                y = 6.2044830322265625.dp
                            )
                        )
                    ) {
                        Vector82(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 21.147705078125.dp,
                                    y = 0.00006103515625.dp
                                )
                            )
                        )
                        Vector83(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 10.5625.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector84()
                    }
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
                    Vector85(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                    Vector99(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector100(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector101(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector102(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector103(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector104(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector105(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector106(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector107(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Abrabra(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 50.380615234375.dp,
                            y = 16.363632202148438.dp
                        )
                    )
                ) {
                    Vector108(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 54.363525390625.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector109(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 48.475830078125.dp,
                                y = 2.784088134765625.dp
                            )
                        )
                    )
                    Vector110(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 38.349365234375.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector111(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 28.613525390625.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector112(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 22.725830078125.dp,
                                y = 2.784088134765625.dp
                            )
                        )
                    )
                    Vector113(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 12.599365234375.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector114()
                }
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
                            Vector115(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector116(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            VectorStroke7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector117(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector118(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            ClipPathGroup(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                A(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector126(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                                Group(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector127(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector128(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector129(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector130(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector131(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector132(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector133(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                            }
                            Vector119(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector120(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            ClipPathGroup1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                B(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector134(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                                Group1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector135(
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
                            Vector121(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector122(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector123(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector124(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector125(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                    Vector136(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                                x = 20.8125.dp,
                                y = 6.2044830322265625.dp
                            )
                        )
                    ) {
                        Vector137(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 44.06396484375.dp,
                                    y = 0.00006103515625.dp
                                )
                            )
                        )
                        Vector138(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 33.478515625.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector139(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 22.916015625.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector140(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 18.57958984375.dp,
                                    y = 9.227340698242188.dp
                                )
                            )
                        )
                        Vector141(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 7.822265625.dp,
                                    y = 0.00006103515625.dp
                                )
                            )
                        )
                        Vector142(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.159149169921875.dp
                                )
                            )
                        )
                    }
                }
                Ellipse2()
                Ellipse2Stroke()
                B(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.011474609375.dp,
                            y = 10.363632202148438.dp
                        )
                    )
                )
            }
            Level(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.14306640625.dp,
                        y = 6.1478729248046875.dp
                    )
                )
            ) {
                LevelFrame(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.85693359375.dp,
                            y = 8.852127075195312.dp
                        )
                    )
                ) {
                    Rectangle58()
                    Rectangle58Stroke()
                    Class262500(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 142.8310546875.dp,
                                y = 7.8636322021484375.dp
                            )
                        )
                    ) {
                        Vector143(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 41.7880859375.dp,
                                    y = 0.2897796630859375.dp
                                )
                            )
                        )
                        Vector144(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 34.0419921875.dp,
                                    y = 0.2897796630859375.dp
                                )
                            )
                        )
                        Vector145(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 26.78369140625.dp,
                                    y = 0.409088134765625.dp
                                )
                            )
                        )
                        Vector146(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 21.746826171875.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector147(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 14.98828125.dp,
                                    y = 0.2897796630859375.dp
                                )
                            )
                        )
                        Vector148(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 7.2314453125.dp,
                                    y = 0.2897796630859375.dp
                                )
                            )
                        )
                        Vector149(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.2897796630859375.dp
                                )
                            )
                        )
                    }
                }
                Star1()
                Star1Stroke()
                Class13(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.66943359375.dp,
                            y = 15.056671142578125.dp
                        )
                    )
                ) {
                    Vector150(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 7.84521484375.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector151(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.159088134765625.dp
                            )
                        )
                    )
                }
            }
        }
        Rectangle65()
        Frame53(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 17.0.dp
                )
            )
        ) {
            Subtract1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 23.0.dp,
                        y = 18.0.dp
                    )
                )
            )
            SubtractStroke1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 23.0.dp,
                        y = 18.0.dp
                    )
                )
            )
            Frame58(
                onLeaderboardDetailsButtonTapped = onLeaderboardDetailsButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 550.0.dp
                    )
                )
            ) {
                LeaderboardDetails(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 74.011474609375.dp,
                            y = 13.6988525390625.dp
                        )
                    )
                ) {
                    Vector152(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 74.23715209960938.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector153(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 67.55118560791016.dp,
                                y = 0.664764404296875.dp
                            )
                        )
                    )
                    Vector154(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 63.19733428955078.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector155(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 56.19740295410156.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector156(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 48.575199127197266.dp,
                                y = 1.482940673828125.dp
                            )
                        )
                    )
                    Vector157(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 40.73440170288086.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector158(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 30.232959747314453.dp,
                                y = 0.664764404296875.dp
                            )
                        )
                    )
                    Vector159(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 15.332324981689453.dp,
                                y = 0.664764404296875.dp
                            )
                        )
                    )
                    Vector160(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 7.910560607910156.dp,
                                y = 3.4488525390625.dp
                            )
                        )
                    )
                    Vector161(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -0.5213470458984375.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector162(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -9.887760162353516.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector163(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -19.70170021057129.dp,
                                y = 0.664764404296875.dp
                            )
                        )
                    )
                    Vector164(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -27.901939392089844.dp,
                                y = 3.4488525390625.dp
                            )
                        )
                    )
                    Vector165(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -36.29684829711914.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector166(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -46.35517597198486.dp,
                                y = 0.664764404296875.dp
                            )
                        )
                    )
                    Vector167(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -56.06822204589844.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector168(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -65.31247329711914.dp,
                                y = 3.460235595703125.dp
                            )
                        )
                    )
                    Vector169(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -74.43607497215271.dp,
                                y = 0.664764404296875.dp
                            )
                        )
                    )
                }
            }
            Frame47(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 75.0.dp
                    )
                )
            ) {
                Dododo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 68.2783203125.dp,
                            y = 21.363636016845703.dp
                        )
                    )
                ) {
                    Vector170(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 50.3310546875.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector171(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 40.32666015625.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector172(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 30.6748046875.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector173(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 20.67041015625.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector174(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.0185546875.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector175()
                }
                Frame67(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 211.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Class1260(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 24.7109375.dp,
                                y = 8.678977966308594.dp
                            )
                        )
                    ) {
                        Vector176(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 28.528076171875.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector177(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 19.246337890625.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector178(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 10.487548828125.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector179(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 6.481689453125.dp,
                                    y = 8.073864936828613.dp
                                )
                            )
                        )
                        Vector180(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.1392059326171875.dp
                                )
                            )
                        )
                    }
                }
                Frame68(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.0.dp,
                            y = 11.0.dp
                        )
                    )
                ) {
                    Class1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -0.01704549789428711.dp,
                                y = 8.818181991577148.dp
                            )
                        )
                    )
                }
                Polygon1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.534423828125.dp,
                            y = 19.0.dp
                        )
                    )
                )
                Polygon1Stroke(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.534423828125.dp,
                            y = 19.0.dp
                        )
                    )
                )
                Class21(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 55.553955078125.dp,
                            y = 28.102272033691406.dp
                        )
                    )
                )
                Cup2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 59.5.dp,
                            y = 8.0.dp
                        )
                    )
                ) {
                    Vector181(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Asset21(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Frame60(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 132.0.dp
                    )
                )
            ) {
                Hahaha(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 68.2783203125.dp,
                            y = 21.363636016845703.dp
                        )
                    )
                ) {
                    Vector182(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 48.79833984375.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector183(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 39.582275390625.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector184(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 30.06396484375.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector185(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 20.847900390625.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector186(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.32958984375.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector187()
                }
                Frame69(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 211.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Class1159(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 24.7109375.dp,
                                y = 8.678924560546875.dp
                            )
                        )
                    ) {
                        Vector188(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 25.069091796875.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector189(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 16.199951171875.dp,
                                    y = 0.13925933837890625.dp
                                )
                            )
                        )
                        Vector190(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 9.201171875.dp,
                                    y = 0.13925933837890625.dp
                                )
                            )
                        )
                        Vector191(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 6.481689453125.dp,
                                    y = 8.073917388916016.dp
                                )
                            )
                        )
                        Vector192(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.13925933837890625.dp
                                )
                            )
                        )
                    }
                }
                Frame70(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.0.dp,
                            y = 11.0.dp
                        )
                    )
                ) {
                    Class22(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 0.40480732917785645.dp,
                                y = 8.678977966308594.dp
                            )
                        )
                    )
                }
                Polygon2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.534423828125.dp,
                            y = 19.0.dp
                        )
                    )
                )
                Polygon1Stroke1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.534423828125.dp,
                            y = 19.0.dp
                        )
                    )
                )
                Class10(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.460205078125.dp,
                            y = 28.102272033691406.dp
                        )
                    )
                ) {
                    Vector193(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.772705078125.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector194(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0795440673828125.dp
                            )
                        )
                    )
                }
                Cup3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 59.5.dp,
                            y = 8.0.dp
                        )
                    )
                ) {
                    Vector195(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Asset22(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Frame63(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 303.0.dp
                    )
                )
            ) {
                TaoDo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 67.70458984375.dp,
                            y = 21.363632202148438.dp
                        )
                    )
                ) {
                    Vector196(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 42.27978515625.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector197(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 32.275634765625.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector198(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 18.38916015625.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector199(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 9.2626953125.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector200()
                }
                Frame71(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 211.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Class785(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 24.531982421875.dp,
                                y = 8.678970336914062.dp
                            )
                        )
                    ) {
                        Vector201(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 17.705078125.dp,
                                    y = 0.1392059326171875.dp
                                )
                            )
                        )
                        Vector202(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 8.265380859375.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector203(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.1392059326171875.dp
                                )
                            )
                        )
                    }
                }
                Frame72(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.0.dp,
                            y = 11.0.dp
                        )
                    )
                ) {
                    Class5(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 0.6037447452545166.dp,
                                y = 8.81817626953125.dp
                            )
                        )
                    )
                }
                Polygon3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.534423828125.dp,
                            y = 19.0.dp
                        )
                    )
                )
                Polygon1Stroke2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.534423828125.dp,
                            y = 19.0.dp
                        )
                    )
                )
                Class31(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 54.53125.dp,
                            y = 28.102264404296875.dp
                        )
                    )
                )
                Cup4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    Vector204(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke10(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Asset15(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Frame61(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 189.0.dp
                    )
                )
            ) {
                GoHom(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 67.9033203125.dp,
                            y = 21.204544067382812.dp
                        )
                    )
                ) {
                    Vector205(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 45.363525390625.dp,
                                y = 2.9545440673828125.dp
                            )
                        )
                    )
                    Vector206(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 35.3310546875.dp,
                                y = 2.9545440673828125.dp
                            )
                        )
                    )
                    Vector207(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 26.097900390625.dp,
                                y = 0.159088134765625.dp
                            )
                        )
                    )
                    Vector208(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.8310546875.dp,
                                y = 2.9545440673828125.dp
                            )
                        )
                    )
                    Vector209()
                }
                Frame73(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 211.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Class1005(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 24.7109375.dp,
                                y = 8.678977966308594.dp
                            )
                        )
                    ) {
                        Vector210(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 29.489013671875.dp,
                                    y = 0.1392059326171875.dp
                                )
                            )
                        )
                        Vector211(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 19.696044921875.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector212(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 10.057373046875.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector213(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 6.481689453125.dp,
                                    y = 8.073867797851562.dp
                                )
                            )
                        )
                        Vector214(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.1392059326171875.dp
                                )
                            )
                        )
                    }
                }
                Frame74(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.0.dp,
                            y = 11.0.dp
                        )
                    )
                ) {
                    Class32(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -0.38387560844421387.dp,
                                y = 8.678977966308594.dp
                            )
                        )
                    )
                }
                Polygon4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53443943660528.dp,
                            y = 19.00000039039457.dp
                        )
                    )
                )
                Polygon1Stroke3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53443943660528.dp,
                            y = 19.00000039039457.dp
                        )
                    )
                )
                Class23(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 55.553955078125.dp,
                            y = 28.102272033691406.dp
                        )
                    )
                )
                Cup5(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 59.5.dp,
                            y = 8.0.dp
                        )
                    )
                ) {
                    Vector215(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke11(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Asset23(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Frame64(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 360.0.dp
                    )
                )
            ) {
                OiHong(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 67.9033203125.dp,
                            y = 20.897735595703125.dp
                        )
                    )
                ) {
                    Vector216(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 49.20166015625.dp,
                                y = 3.2613525390625.dp
                            )
                        )
                    )
                    Vector217(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 40.019775390625.dp,
                                y = 3.2613525390625.dp
                            )
                        )
                    )
                    Vector218(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 29.9873046875.dp,
                                y = 3.2613525390625.dp
                            )
                        )
                    )
                    Vector219(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 20.754150390625.dp,
                                y = 0.465911865234375.dp
                            )
                        )
                    )
                    Vector220(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 12.319580078125.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector221(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.30682373046875.dp
                            )
                        )
                    )
                }
                Frame75(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 211.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Class776(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 24.531982421875.dp,
                                y = 8.678985595703125.dp
                            )
                        )
                    ) {
                        Vector222(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 16.84130859375.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector223(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 8.599609375.dp,
                                    y = 0.139190673828125.dp
                                )
                            )
                        )
                        Vector224(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.139190673828125.dp
                                )
                            )
                        )
                    }
                }
                Frame76(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.0.dp,
                            y = 11.0.dp
                        )
                    )
                ) {
                    Class6(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -0.396240234375.dp,
                                y = 8.678985595703125.dp
                            )
                        )
                    )
                }
                Polygon5(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53443943660528.dp,
                            y = 19.00000039039457.dp
                        )
                    )
                )
                Polygon1Stroke4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53443943660528.dp,
                            y = 19.00000039039457.dp
                        )
                    )
                )
                Class4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 54.4375.dp,
                            y = 28.18182373046875.dp
                        )
                    )
                )
                Cup6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    Vector225(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke12(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Asset16(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Frame62(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 246.0.dp
                    )
                )
            ) {
                GoHom1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 67.9033203125.dp,
                            y = 21.204544067382812.dp
                        )
                    )
                ) {
                    Vector226(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 45.363525390625.dp,
                                y = 2.9545440673828125.dp
                            )
                        )
                    )
                    Vector227(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 35.3310546875.dp,
                                y = 2.9545440673828125.dp
                            )
                        )
                    )
                    Vector228(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 26.097900390625.dp,
                                y = 0.159088134765625.dp
                            )
                        )
                    )
                    Vector229(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.8310546875.dp,
                                y = 2.9545440673828125.dp
                            )
                        )
                    )
                    Vector230()
                }
                Frame77(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 211.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Class862(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 24.676025390625.dp,
                                y = 8.678970336914062.dp
                            )
                        )
                    ) {
                        Vector231(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 18.5478515625.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector232(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 9.245849609375.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector233()
                    }
                }
                Frame78(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.0.dp,
                            y = 11.0.dp
                        )
                    )
                ) {
                    Class41(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -0.2248086929321289.dp,
                                y = 8.81817626953125.dp
                            )
                        )
                    )
                }
                Polygon6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53443943660528.dp,
                            y = 19.00000039039457.dp
                        )
                    )
                )
                Polygon1Stroke5(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53443943660528.dp,
                            y = 19.00000039039457.dp
                        )
                    )
                )
                Class11(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 55.460205078125.dp,
                            y = 28.18182373046875.dp
                        )
                    )
                )
                Cup7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 59.5.dp,
                            y = 8.0.dp
                        )
                    )
                ) {
                    Vector234(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke13(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Asset24(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Frame65(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 417.0.dp
                    )
                )
            ) {
                Camcam(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 67.9033203125.dp,
                            y = 21.20452880859375.dp
                        )
                    )
                ) {
                    Vector235(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 53.441650390625.dp,
                                y = 2.954559326171875.dp
                            )
                        )
                    )
                    Vector236(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 43.92333984375.dp,
                                y = 2.954559326171875.dp
                            )
                        )
                    )
                    Vector237(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 34.8623046875.dp,
                                y = 2.954559326171875.dp
                            )
                        )
                    )
                    Vector238(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 21.113525390625.dp,
                                y = 2.954559326171875.dp
                            )
                        )
                    )
                    Vector239(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.59521484375.dp,
                                y = 2.954559326171875.dp
                            )
                        )
                    )
                    Vector240()
                }
                Frame79(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 211.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Class708(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 24.531982421875.dp,
                                y = 8.678985595703125.dp
                            )
                        )
                    ) {
                        Vector241(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 17.890380859375.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector242(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 8.281494140625.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector243(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.139190673828125.dp
                                )
                            )
                        )
                    }
                }
                Frame80(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.0.dp,
                            y = 11.0.dp
                        )
                    )
                ) {
                    Class7(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -0.8959293365478516.dp,
                                y = 8.81817626953125.dp
                            )
                        )
                    )
                }
                Polygon7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53440856933594.dp,
                            y = 17.0.dp
                        )
                    )
                )
                Polygon1Stroke6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53440856933594.dp,
                            y = 17.0.dp
                        )
                    )
                )
                Class51(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 54.573974609375.dp,
                            y = 28.18182373046875.dp
                        )
                    )
                )
                Cup8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    Vector244(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke14(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Asset17(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Frame66(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 474.0.dp
                    )
                )
            ) {
                Chala(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 67.9033203125.dp,
                            y = 21.20452880859375.dp
                        )
                    )
                ) {
                    Vector245(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 34.31396484375.dp,
                                y = 2.954559326171875.dp
                            )
                        )
                    )
                    Vector246(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 30.738525390625.dp,
                                y = 0.159088134765625.dp
                            )
                        )
                    )
                    Vector247(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 21.22021484375.dp,
                                y = 2.954559326171875.dp
                            )
                        )
                    )
                    Vector248(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 12.004150390625.dp,
                                y = 0.159088134765625.dp
                            )
                        )
                    )
                    Vector249()
                }
                Frame81(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 211.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Class694(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 24.666259765625.dp,
                                y = 8.678924560546875.dp
                            )
                        )
                    ) {
                        Vector250(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 18.4892578125.dp,
                                    y = 0.139251708984375.dp
                                )
                            )
                        )
                        Vector251(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 9.281982421875.dp,
                                    y = 0.0.dp
                                )
                            )
                        )
                        Vector252(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.00006103515625.dp
                                )
                            )
                        )
                    }
                }
                Frame82(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.0.dp,
                            y = 11.0.dp
                        )
                    )
                ) {
                    Class8(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -0.37404561042785645.dp,
                                y = 8.678985595703125.dp
                            )
                        )
                    )
                }
                Polygon8(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53440856933594.dp,
                            y = 17.0.dp
                        )
                    )
                )
                Polygon1Stroke7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.53440856933594.dp,
                            y = 17.0.dp
                        )
                    )
                )
                Class21(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.553955078125.dp,
                            y = 28.102264404296875.dp
                        )
                    )
                ) {
                    Vector253(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 4.8125.dp,
                                y = 0.079559326171875.dp
                            )
                        )
                    )
                    Vector254()
                }
                Cup9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    Vector255(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    VectorStroke15(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Asset18(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Global(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.806884765625.dp,
                        y = 29.204544067382812.dp
                    )
                )
            ) {
                Vector256(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 45.9560546875.dp,
                            y = 0.159088134765625.dp
                        )
                    )
                )
                Vector257(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 36.265625.dp,
                            y = 2.9545440673828125.dp
                        )
                    )
                )
                Vector258(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 26.54833984375.dp,
                            y = 0.159088134765625.dp
                        )
                    )
                )
                Vector259(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.338134765625.dp,
                            y = 2.9545440673828125.dp
                        )
                    )
                )
                Vector260(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.3310546875.dp,
                            y = 0.159088134765625.dp
                        )
                    )
                )
                Vector261()
            }
            Frame54(
                onXButtonTapped = onXButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 332.0.dp,
                        y = 18.0.dp
                    )
                )
            ) {
                Group2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.1966988742351532.dp,
                            y = 0.8033008575439453.dp
                        )
                    )
                ) {
                    Vector319Stroke(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.06591796875.dp,
                                y = 3.0658648312091827.dp
                            )
                        )
                    )
                    Vector320Stroke(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 4.164213701090539.dp,
                                y = 0.414214522633662.dp
                            )
                        )
                    )
                }
            }
            Frame59(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 116.0.dp,
                        y = 18.0.dp
                    )
                )
            ) {
                Local(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 33.011474609375.dp,
                            y = 11.363632202148438.dp
                        )
                    )
                ) {
                    Vector262(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 37.51708984375.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector263(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 27.82666015625.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector264(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 18.492919921875.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector265(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.680419921875.dp,
                                y = 2.7954559326171875.dp
                            )
                        )
                    )
                    Vector266()
                }
                Friend(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 136.011474609375.dp,
                            y = 10.698860168457031.dp
                        )
                    )
                ) {
                    Vector267(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 39.271240234375.dp,
                                y = 0.6647720336914062.dp
                            )
                        )
                    )
                    Vector268(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 29.64208984375.dp,
                                y = 3.4602279663085938.dp
                            )
                        )
                    )
                    Vector269(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 19.727294921875.dp,
                                y = 3.4602279663085938.dp
                            )
                        )
                    )
                    Vector270(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.629150390625.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector271(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 9.17333984375.dp,
                                y = 3.4488601684570312.dp
                            )
                        )
                    )
                    Vector272(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.6647720336914062.dp
                            )
                        )
                    )
                }
                Line14Stroke(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun Ranking1Preview() {
    MaterialTheme {
        RelayContainer {
            Ranking1(
                onLeaderboardDetailsButtonTapped = {},
                onXButtonTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector),
        modifier = modifier.requiredWidth(8.045455932617188.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector1),
        modifier = modifier.requiredWidth(8.335227966308594.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector2),
        modifier = modifier.requiredWidth(8.335227966308594.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector3),
        modifier = modifier.requiredWidth(5.2954559326171875.dp).requiredHeight(8.852272987365723.dp)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector4),
        modifier = modifier.requiredWidth(8.19317626953125.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector5),
        modifier = modifier.requiredWidth(9.204551696777344.dp).requiredHeight(11.960227966308594.dp)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector6),
        modifier = modifier.requiredWidth(8.522727966308594.dp).requiredHeight(12.295454978942871.dp)
    )
}

@Composable
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector7),
        modifier = modifier.requiredWidth(8.045459747314453.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector8),
        modifier = modifier.requiredWidth(2.613636016845703.dp).requiredHeight(12.30113697052002.dp)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector9),
        modifier = modifier.requiredWidth(8.045455932617188.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector10),
        modifier = modifier.requiredWidth(8.045455932617188.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector11),
        modifier = modifier.requiredWidth(8.335227966308594.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector12),
        modifier = modifier.requiredWidth(8.51136302947998.dp).requiredHeight(12.11363697052002.dp)
    )
}

@Composable
fun Vector13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector13),
        modifier = modifier.requiredWidth(10.897727966308594.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun OpenningScreen(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(133.5951690673828.dp).requiredHeight(15.755682945251465.dp)
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
fun Vector317Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_317_stroke_),
        modifier = modifier.requiredWidth(8.414214134216309.dp).requiredHeight(14.0.dp)
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
fun Vector317Stroke1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_317_stroke_1),
        modifier = modifier.requiredWidth(8.414214134216309.dp).requiredHeight(14.0.dp)
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
fun Vector14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector14),
        modifier = modifier.requiredWidth(7.846595764160156.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector15),
        modifier = modifier.requiredWidth(7.812496185302734.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector16(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector16),
        modifier = modifier.requiredWidth(12.681819915771484.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector17(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector17),
        modifier = modifier.requiredWidth(5.414772033691406.dp).requiredHeight(10.941359519958496.dp)
    )
}

@Composable
fun Vector18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector18),
        modifier = modifier.requiredWidth(7.846591949462891.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector19(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector19),
        modifier = modifier.requiredWidth(2.613636016845703.dp).requiredHeight(12.30113697052002.dp)
    )
}

@Composable
fun Vector20(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector20),
        modifier = modifier.requiredWidth(5.295454025268555.dp).requiredHeight(8.852272987365723.dp)
    )
}

@Composable
fun Vector21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector21),
        modifier = modifier.requiredWidth(8.079630851745605.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector22),
        modifier = modifier.requiredWidth(10.471590995788574.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun Christmas(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(79.61932373046875.dp).requiredHeight(12.47159194946289.dp)
    )
}

@Composable
fun Arrow2Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_arrow_2_stroke_),
        modifier = modifier.requiredWidth(14.0.dp).requiredHeight(14.727922439575195.dp)
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
fun Vector23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector23),
        modifier = modifier.requiredWidth(5.2954559326171875.dp).requiredHeight(8.852272987365723.dp)
    )
}

@Composable
fun Vector24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector24),
        modifier = modifier.requiredWidth(8.335227966308594.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector25),
        modifier = modifier.requiredWidth(8.045455932617188.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector26(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector26),
        modifier = modifier.requiredWidth(8.045455932617188.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector27(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector27),
        modifier = modifier.requiredWidth(7.812496185302734.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector28(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector28),
        modifier = modifier.requiredWidth(8.511363983154297.dp).requiredHeight(11.778409004211426.dp)
    )
}

@Composable
fun Vector29(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector29),
        modifier = modifier.requiredWidth(8.079629898071289.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector30(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector30),
        modifier = modifier.requiredWidth(7.846590042114258.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector31(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector31),
        modifier = modifier.requiredWidth(2.613636016845703.dp).requiredHeight(12.30113697052002.dp)
    )
}

@Composable
fun Vector32(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector32),
        modifier = modifier.requiredWidth(15.97159194946289.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun WishBanner1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(98.49148559570312.dp).requiredHeight(12.471592903137207.dp)
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
        vector = painterResource(R.drawable.ranking_1_rectangle_63),
        modifier = modifier.requiredWidth(218.0.dp).requiredHeight(14.0.dp)
    )
}

@Composable
fun Rectangle63Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_rectangle_63_stroke_),
        modifier = modifier.requiredWidth(218.0.dp).requiredHeight(14.0.dp)
    )
}

@Composable
fun Vector33(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector33),
        modifier = modifier.requiredWidth(6.910514831542969.dp).requiredHeight(7.8899149894714355.dp)
    )
}

@Composable
fun Vector34(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector34),
        modifier = modifier.requiredWidth(6.6967315673828125.dp).requiredHeight(7.8899149894714355.dp)
    )
}

@Composable
fun Vector35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector35),
        modifier = modifier.requiredWidth(6.3735809326171875.dp).requiredHeight(7.735795497894287.dp)
    )
}

@Composable
fun Vector36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector36),
        modifier = modifier.requiredWidth(6.348724365234375.dp).requiredHeight(7.904829502105713.dp)
    )
}

@Composable
fun Vector37(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector37),
        modifier = modifier.requiredWidth(1.4865036010742188.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Vector38(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector38),
        modifier = modifier.requiredWidth(6.348724365234375.dp).requiredHeight(7.904829502105713.dp)
    )
}

@Composable
fun Vector39(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector39),
        modifier = modifier.requiredWidth(7.338069915771484.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Vector40(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector40),
        modifier = modifier.requiredWidth(1.4865036010742188.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Vector41(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector41),
        modifier = modifier.requiredWidth(1.4865036010742188.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Vector42(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector42),
        modifier = modifier.requiredWidth(6.348720550537109.dp).requiredHeight(7.904829502105713.dp)
    )
}

@Composable
fun Vector43(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector43),
        modifier = modifier.requiredWidth(4.086647033691406.dp).requiredHeight(7.750710487365723.dp)
    )
}

@Composable
fun Vector44(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector44),
        modifier = modifier.requiredWidth(6.910511016845703.dp).requiredHeight(7.8899149894714355.dp)
    )
}

@Composable
fun Vector45(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector45),
        modifier = modifier.requiredWidth(7.134234428405762.dp).requiredHeight(7.636363983154297.dp)
    )
}

@Composable
fun Vector46(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector46),
        modifier = modifier.requiredWidth(9.172584533691406.dp).requiredHeight(10.460227966308594.dp)
    )
}

@Composable
fun OverallBalance(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(102.27433013916016.dp).requiredHeight(10.490056991577148.dp)
    )
}

@Composable
fun Vector47(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector47),
        modifier = modifier.requiredWidth(14.289764404296875.dp).requiredHeight(14.545454978942871.dp)
    )
}

@Composable
fun Vector48(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector48),
        modifier = modifier.requiredWidth(12.16619873046875.dp).requiredHeight(14.545454978942871.dp)
    )
}

@Composable
fun Vector49(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector49),
        modifier = modifier.requiredWidth(13.998580932617188.dp).requiredHeight(14.545454978942871.dp)
    )
}

@Composable
fun Vector50(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector50),
        modifier = modifier.requiredWidth(11.747303009033203.dp).requiredHeight(15.063921928405762.dp)
    )
}

@Composable
fun Vector51(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector51),
        modifier = modifier.requiredWidth(11.747303009033203.dp).requiredHeight(15.063921928405762.dp)
    )
}

@Composable
fun Vector52(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector52),
        modifier = modifier.requiredWidth(11.747303009033203.dp).requiredHeight(15.063921928405762.dp)
    )
}

@Composable
fun Vector53(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector53),
        modifier = modifier.requiredWidth(3.409088134765625.dp).requiredHeight(3.394887924194336.dp)
    )
}

@Composable
fun Vector54(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector54),
        modifier = modifier.requiredWidth(11.747303009033203.dp).requiredHeight(15.063921928405762.dp)
    )
}

@Composable
fun Vector55(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector55),
        modifier = modifier.requiredWidth(11.747303009033203.dp).requiredHeight(15.063921928405762.dp)
    )
}

@Composable
fun Vector56(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector56),
        modifier = modifier.requiredWidth(11.747303009033203.dp).requiredHeight(15.063921928405762.dp)
    )
}

@Composable
fun Vector57(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector57),
        modifier = modifier.requiredWidth(3.4090919494628906.dp).requiredHeight(3.394887924194336.dp)
    )
}

@Composable
fun Vector58(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector58),
        modifier = modifier.requiredWidth(6.491477966308594.dp).requiredHeight(14.545454978942871.dp)
    )
}

@Composable
fun Vector59(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector59),
        modifier = modifier.requiredWidth(11.747300148010254.dp).requiredHeight(15.063921928405762.dp)
    )
}

@Composable
fun Vector60(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector60),
        modifier = modifier.requiredWidth(6.4914774894714355.dp).requiredHeight(14.545454978942871.dp)
    )
}

@Composable
fun Class101000000VN(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(172.15020751953125.dp).requiredHeight(15.063921928405762.dp)
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
fun Subtract(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_subtract),
        modifier = modifier.requiredWidth(124.0.dp).requiredHeight(81.0.dp)
    )
}

@Composable
fun SubtractStroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_subtract_stroke_),
        modifier = modifier.requiredWidth(124.0.dp).requiredHeight(81.0.dp)
    )
}

@Composable
fun Vector61(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector61),
        modifier = modifier.requiredWidth(8.045455932617188.dp).requiredHeight(8.84090805053711.dp)
    )
}

@Composable
fun Vector62(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector62),
        modifier = modifier.requiredWidth(8.59090805053711.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector63),
        modifier = modifier.requiredWidth(2.613636016845703.dp).requiredHeight(12.301136016845703.dp)
    )
}

@Composable
fun Vector64(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector64),
        modifier = modifier.requiredWidth(7.846590042114258.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector65(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector65),
        modifier = modifier.requiredWidth(7.846590042114258.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector66(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector66),
        modifier = modifier.requiredWidth(2.613636016845703.dp).requiredHeight(12.301136016845703.dp)
    )
}

@Composable
fun Vector67(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector67),
        modifier = modifier.requiredWidth(12.613636016845703.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector68(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector68),
        modifier = modifier.requiredWidth(8.829544067382812.dp).requiredHeight(12.000000953674316.dp)
    )
}

@Composable
fun Vector69(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector69),
        modifier = modifier.requiredWidth(2.4204540252685547.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector70(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector70),
        modifier = modifier.requiredWidth(2.613636016845703.dp).requiredHeight(12.30113697052002.dp)
    )
}

@Composable
fun Vector71(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector71),
        modifier = modifier.requiredWidth(7.8125.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector72(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector72),
        modifier = modifier.requiredWidth(9.818181991577148.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun DailyMission(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(59.140625.dp).requiredHeight(31.47159194946289.dp)
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
        vector = painterResource(R.drawable.ranking_1_ellipse_3),
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Ellipse3Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_ellipse_3_stroke_),
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Arrow1Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_arrow_1_stroke_),
        modifier = modifier.requiredWidth(19.69180679321289.dp).requiredHeight(14.727922439575195.dp)
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
fun Vector73(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector73),
        modifier = modifier.requiredWidth(1.3167610168457031.dp).requiredHeight(8.727272987365723.dp)
    )
}

@Composable
fun Vector74(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector74),
        modifier = modifier.requiredWidth(3.950284481048584.dp).requiredHeight(10.448863983154297.dp)
    )
}

@Composable
fun Vector75(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector75),
        modifier = modifier.requiredWidth(5.5227274894714355.dp).requiredHeight(8.727272987365723.dp)
    )
}

@Composable
fun EI(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(12.953479766845703.dp).requiredHeight(10.448863983154297.dp)
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
fun Line12Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_line_12_stroke_),
        modifier = modifier.requiredWidth(154.0.dp).requiredHeight(4.0.dp)
    )
}

@Composable
fun VectorStroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.791748046875.dp,
                top = 1.79168701171875.dp,
                end = 9.791584968566895.dp,
                bottom = 11.124979019165039.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.458251953125.dp,
                top = 8.45831298828125.dp,
                end = 3.3062877655029297.dp,
                bottom = 1.79168701171875.dp
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
fun Vector76(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector76),
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
fun Vector77(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector77),
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
fun Vector78(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector78),
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
fun Vector79(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector79),
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
fun Vector80(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector80),
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
fun Vector81(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector81),
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
fun Vector82(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector82),
        modifier = modifier.requiredWidth(8.892101287841797.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun Vector83(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector83),
        modifier = modifier.requiredWidth(8.994376182556152.dp).requiredHeight(11.954607009887695.dp)
    )
}

@Composable
fun Vector84(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector84),
        modifier = modifier.requiredWidth(8.994377136230469.dp).requiredHeight(11.954607009887695.dp)
    )
}

@Composable
fun Class993(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(30.039886474609375.dp).requiredHeight(11.954607009887695.dp)
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
fun Vector85(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector85),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.09375.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_2),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.09375.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector86(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector86),
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
fun Vector87(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector87),
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
fun Vector88(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector88),
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
fun Vector89(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector89),
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
fun Vector90(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector90),
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
fun Vector91(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector91),
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
fun Vector92(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector92),
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
fun Vector93(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector93),
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
fun Vector94(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector94),
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
fun Vector95(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector95),
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
fun Vector96(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector96),
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
fun Vector97(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector97),
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
fun Vector98(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector98),
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
fun Vector99(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector99),
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
fun VectorStroke3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 19.328125.dp,
                top = 8.1171875.dp,
                end = 6.4765625.dp,
                bottom = 17.4140625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.4765625.dp,
                top = 8.1171875.dp,
                end = 19.328125.dp,
                bottom = 17.4140625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector100(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector100),
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
fun VectorStroke5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.671875.dp,
                top = 7.75.dp,
                end = 20.328125.dp,
                bottom = 19.78125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector101(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector101),
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
fun Vector102(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector102),
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
fun Vector103(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector103),
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
fun Vector104(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector104),
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
fun Vector105(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector105),
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
fun VectorStroke6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_6),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.671875.dp,
                top = 14.421875.dp,
                end = 20.328125.dp,
                bottom = 17.94921898841858.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector106(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector106),
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
fun Vector107(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector107),
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
fun Vector108(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector108),
        modifier = modifier.requiredWidth(7.812496185302734.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector109(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector109),
        modifier = modifier.requiredWidth(5.2954559326171875.dp).requiredHeight(8.852272987365723.dp)
    )
}

@Composable
fun Vector110(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector110),
        modifier = modifier.requiredWidth(8.511363983154297.dp).requiredHeight(11.778409004211426.dp)
    )
}

@Composable
fun Vector111(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector111),
        modifier = modifier.requiredWidth(7.812498092651367.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector112(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector112),
        modifier = modifier.requiredWidth(5.295454025268555.dp).requiredHeight(8.852272987365723.dp)
    )
}

@Composable
fun Vector113(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector113),
        modifier = modifier.requiredWidth(8.511363983154297.dp).requiredHeight(11.778409004211426.dp)
    )
}

@Composable
fun Vector114(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector114),
        modifier = modifier.requiredWidth(11.198863983154297.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Abrabra(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(62.17613983154297.dp).requiredHeight(11.801137924194336.dp)
    )
}

@Composable
fun Vector115(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector115),
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
fun Vector116(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector116),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_7),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector117(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector117),
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
fun Vector118(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector118),
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
fun Vector126(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector126),
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
fun Vector127(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector127),
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
fun Vector128(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector128),
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
fun Vector129(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector129),
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
fun Vector130(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector130),
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
fun Vector131(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector131),
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
fun Vector132(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector132),
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
fun Vector133(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector133),
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
fun Vector119(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector119),
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
fun Vector120(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector120),
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
fun Vector134(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector134),
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
fun Vector135(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector135),
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
fun Vector121(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector121),
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
fun Vector122(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector122),
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
fun Vector123(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector123),
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
fun Vector124(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector124),
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
fun Vector125(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector125),
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
fun Vector136(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector136),
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
fun Vector137(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector137),
        modifier = modifier.requiredWidth(8.89210319519043.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun Vector138(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector138),
        modifier = modifier.requiredWidth(8.99437427520752.dp).requiredHeight(11.954607009887695.dp)
    )
}

@Composable
fun Vector139(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector139),
        modifier = modifier.requiredWidth(8.994376182556152.dp).requiredHeight(11.954607009887695.dp)
    )
}

@Composable
fun Vector140(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector140),
        modifier = modifier.requiredWidth(2.7272720336914062.dp).requiredHeight(2.715909004211426.dp)
    )
}

@Composable
fun Vector141(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector141),
        modifier = modifier.requiredWidth(9.397841453552246.dp).requiredHeight(12.05113697052002.dp)
    )
}

@Composable
fun Vector142(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector142),
        modifier = modifier.requiredWidth(5.193181991577148.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Class10993(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(52.956024169921875.dp).requiredHeight(12.05119800567627.dp)
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
        vector = painterResource(R.drawable.ranking_1_ellipse_2),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Ellipse2Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_ellipse_2_stroke_),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun B(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_b),
        modifier = modifier.requiredWidth(8.977272987365723.dp).requiredHeight(11.636363983154297.dp)
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
        vector = painterResource(R.drawable.ranking_1_rectangle_58),
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle58Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_rectangle_58_stroke_),
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Vector143(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector143),
        modifier = modifier.requiredWidth(6.396308898925781.dp).requiredHeight(8.991477012634277.dp)
    )
}

@Composable
fun Vector144(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector144),
        modifier = modifier.requiredWidth(6.396308898925781.dp).requiredHeight(8.991477012634277.dp)
    )
}

@Composable
fun Vector145(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector145),
        modifier = modifier.requiredWidth(5.863683700561523.dp).requiredHeight(8.846590995788574.dp)
    )
}

@Composable
fun Vector146(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector146),
        modifier = modifier.requiredWidth(3.9502830505371094.dp).requiredHeight(10.448863983154297.dp)
    )
}

@Composable
fun Vector147(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector147),
        modifier = modifier.requiredWidth(5.752840995788574.dp).requiredHeight(8.846590995788574.dp)
    )
}

@Composable
fun Vector148(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector148),
        modifier = modifier.requiredWidth(6.213068008422852.dp).requiredHeight(8.966090202331543.dp)
    )
}

@Composable
fun Vector149(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector149),
        modifier = modifier.requiredWidth(5.752840995788574.dp).requiredHeight(8.846590995788574.dp)
    )
}

@Composable
fun Class262500(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.184303283691406.dp).requiredHeight(10.448863983154297.dp)
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
        vector = painterResource(R.drawable.ranking_1_star_1),
        modifier = modifier.requiredWidth(40.71400833129883.dp).requiredHeight(42.704254150390625.dp)
    )
}

@Composable
fun Star1Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_star_1_stroke_),
        modifier = modifier.requiredWidth(40.71400833129883.dp).requiredHeight(42.704254150390625.dp)
    )
}

@Composable
fun Vector150(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector150),
        modifier = modifier.requiredWidth(8.892101287841797.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun Vector151(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector151),
        modifier = modifier.requiredWidth(5.193181991577148.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Class13(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(16.737272262573242.dp).requiredHeight(11.954545974731445.dp)
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
        modifier = modifier.requiredWidth(216.8570098876953.dp).requiredHeight(42.704254150390625.dp)
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
        vector = painterResource(R.drawable.ranking_1_rectangle_65),
        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(845.0.dp)
    )
}

@Composable
fun Subtract1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_subtract1),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(599.0.dp)
    )
}

@Composable
fun SubtractStroke1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_subtract_stroke_1),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(599.0.dp)
    )
}

@Composable
fun Vector152(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector152),
        modifier = modifier.requiredWidth(7.846588134765625.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector153(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector153),
        modifier = modifier.requiredWidth(2.4204559326171875.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector154(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector154),
        modifier = modifier.requiredWidth(2.6136322021484375.dp).requiredHeight(12.30113697052002.dp)
    )
}

@Composable
fun Vector155(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector155),
        modifier = modifier.requiredWidth(7.8125.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector156(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector156),
        modifier = modifier.requiredWidth(5.414772033691406.dp).requiredHeight(10.941359519958496.dp)
    )
}

@Composable
fun Vector157(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector157),
        modifier = modifier.requiredWidth(8.335227966308594.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector158(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector158),
        modifier = modifier.requiredWidth(9.818183898925781.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector159(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector159),
        modifier = modifier.requiredWidth(8.505683898925781.dp).requiredHeight(11.778409004211426.dp)
    )
}

@Composable
fun Vector160(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector160),
        modifier = modifier.requiredWidth(5.2954559326171875.dp).requiredHeight(8.852272987365723.dp)
    )
}

@Composable
fun Vector161(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector161),
        modifier = modifier.requiredWidth(7.8125.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector162(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector162),
        modifier = modifier.requiredWidth(8.590904235839844.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector163(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector163),
        modifier = modifier.requiredWidth(8.511363983154297.dp).requiredHeight(11.778409004211426.dp)
    )
}

@Composable
fun Vector164(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector164),
        modifier = modifier.requiredWidth(5.2954559326171875.dp).requiredHeight(8.852272987365723.dp)
    )
}

@Composable
fun Vector165(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector165),
        modifier = modifier.requiredWidth(8.335227966308594.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector166(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector166),
        modifier = modifier.requiredWidth(8.505681991577148.dp).requiredHeight(11.778409004211426.dp)
    )
}

@Composable
fun Vector167(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector167),
        modifier = modifier.requiredWidth(7.8125.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector168(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector168),
        modifier = modifier.requiredWidth(8.335227966308594.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector169(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector169),
        modifier = modifier.requiredWidth(7.448864459991455.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun LeaderboardDetails(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(156.32101440429688.dp).requiredHeight(12.471592903137207.dp)
    )
}

@Composable
fun Frame58(
    onLeaderboardDetailsButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onLeaderboardDetailsButtonTapped).requiredWidth(303.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Vector170(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector170),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector171(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector171),
        modifier = modifier.requiredWidth(7.971591949462891.dp).requiredHeight(11.806818962097168.dp)
    )
}

@Composable
fun Vector172(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector172),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector173(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector173),
        modifier = modifier.requiredWidth(7.971591949462891.dp).requiredHeight(11.806818962097168.dp)
    )
}

@Composable
fun Vector174(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector174),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector175(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector175),
        modifier = modifier.requiredWidth(9.36363697052002.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Dododo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(58.46732711791992.dp).requiredHeight(11.812500953674316.dp)
    )
}

@Composable
fun Vector176(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector176),
        modifier = modifier.requiredWidth(8.223112106323242.dp).requiredHeight(10.544744491577148.dp)
    )
}

@Composable
fun Vector177(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector177),
        modifier = modifier.requiredWidth(7.875.dp).requiredHeight(10.460282325744629.dp)
    )
}

@Composable
fun Vector178(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector178),
        modifier = modifier.requiredWidth(7.357954978942871.dp).requiredHeight(10.321022987365723.dp)
    )
}

@Composable
fun Vector179(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector179),
        modifier = modifier.requiredWidth(2.3863635063171387.dp).requiredHeight(2.376420021057129.dp)
    )
}

@Composable
fun Vector180(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector180),
        modifier = modifier.requiredWidth(4.544034004211426.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Class1260(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(36.75128936767578.dp).requiredHeight(10.544744491577148.dp)
    )
}

@Composable
fun Frame67(
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Class1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_1),
        modifier = modifier.requiredWidth(4.544034004211426.dp).requiredHeight(10.181818008422852.dp)
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
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Polygon1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_1),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Polygon1Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_1_stroke_),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Class21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_2),
        modifier = modifier.requiredWidth(3.8352272510528564.dp).requiredHeight(5.8977274894714355.dp)
    )
}

@Composable
fun Vector181(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector181),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_8),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_asset_2_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.05712890625.dp,
                top = 5.971427917480469.dp,
                end = 7.057157516479492.dp,
                bottom = 6.514287948608398.dp
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
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector182(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector182),
        modifier = modifier.requiredWidth(7.255680084228516.dp).requiredHeight(9.034090995788574.dp)
    )
}

@Composable
fun Vector183(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector183),
        modifier = modifier.requiredWidth(7.3579559326171875.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector184(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector184),
        modifier = modifier.requiredWidth(7.255681991577148.dp).requiredHeight(9.034090995788574.dp)
    )
}

@Composable
fun Vector185(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector185),
        modifier = modifier.requiredWidth(7.357954025268555.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector186(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector186),
        modifier = modifier.requiredWidth(7.255681037902832.dp).requiredHeight(9.034090995788574.dp)
    )
}

@Composable
fun Vector187(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector187),
        modifier = modifier.requiredWidth(9.318181991577148.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Hahaha(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(56.05397415161133.dp).requiredHeight(11.829546928405762.dp)
    )
}

@Composable
fun Vector188(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector188),
        modifier = modifier.requiredWidth(7.870082378387451.dp).requiredHeight(10.460281372070312.dp)
    )
}

@Composable
fun Vector189(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector189),
        modifier = modifier.requiredWidth(7.48727560043335.dp).requiredHeight(10.321023941040039.dp)
    )
}

@Composable
fun Vector190(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector190),
        modifier = modifier.requiredWidth(4.544034004211426.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Vector191(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector191),
        modifier = modifier.requiredWidth(2.3863635063171387.dp).requiredHeight(2.376420021057129.dp)
    )
}

@Composable
fun Vector192(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector192),
        modifier = modifier.requiredWidth(4.544034004211426.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Class1159(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(32.93927764892578.dp).requiredHeight(10.460282325744629.dp)
    )
}

@Composable
fun Frame69(
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Class22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_2_1),
        modifier = modifier.requiredWidth(7.357954502105713.dp).requiredHeight(10.321022987365723.dp)
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
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Polygon2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_2),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Polygon1Stroke1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_1_stroke_1),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Vector193(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector193),
        modifier = modifier.requiredWidth(4.264204502105713.dp).requiredHeight(5.99431848526001.dp)
    )
}

@Composable
fun Vector194(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector194),
        modifier = modifier.requiredWidth(2.3068182468414307.dp).requiredHeight(5.818181991577148.dp)
    )
}

@Composable
fun Class10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(8.036931991577148.dp).requiredHeight(5.99431848526001.dp)
    )
}

@Composable
fun Vector195(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector195),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_9),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_asset_2_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.05712890625.dp,
                top = 5.971427917480469.dp,
                end = 7.057157516479492.dp,
                bottom = 6.514287948608398.dp
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
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector196(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector196),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector197(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector197),
        modifier = modifier.requiredWidth(7.971591949462891.dp).requiredHeight(11.806818962097168.dp)
    )
}

@Composable
fun Vector198(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector198),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector199(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector199),
        modifier = modifier.requiredWidth(7.255681037902832.dp).requiredHeight(9.034090995788574.dp)
    )
}

@Composable
fun Vector200(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector200),
        modifier = modifier.requiredWidth(9.005681991577148.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun TaoDo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(50.416194915771484.dp).requiredHeight(11.829546928405762.dp)
    )
}

@Composable
fun Vector201(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector201),
        modifier = modifier.requiredWidth(7.48727560043335.dp).requiredHeight(10.321023941040039.dp)
    )
}

@Composable
fun Vector202(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector202),
        modifier = modifier.requiredWidth(7.899858474731445.dp).requiredHeight(10.460227966308594.dp)
    )
}

@Composable
fun Vector203(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector203),
        modifier = modifier.requiredWidth(7.144176483154297.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Class785(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(25.192354202270508.dp).requiredHeight(10.46022891998291.dp)
    )
}

@Composable
fun Frame71(
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Class5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_5),
        modifier = modifier.requiredWidth(7.487274646759033.dp).requiredHeight(10.321023941040039.dp)
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
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Polygon3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_3),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Polygon1Stroke2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_1_stroke_2),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Class31(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_3),
        modifier = modifier.requiredWidth(4.110825061798096.dp).requiredHeight(5.9772725105285645.dp)
    )
}

@Composable
fun Vector204(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector204),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_10),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_asset_1_5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.86474609375.dp,
                top = 3.8918914794921875.dp,
                end = 5.837957382202148.dp,
                bottom = 4.864864349365234.dp
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
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 193.0.dp,
                top = 9.0.dp,
                end = 74.0.dp,
                bottom = 5.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector205(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector205),
        modifier = modifier.requiredWidth(11.863639831542969.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector206(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector206),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector207(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector207),
        modifier = modifier.requiredWidth(7.357954025268555.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector208(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector208),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector209(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector209),
        modifier = modifier.requiredWidth(10.130681991577148.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun GoHom(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(57.227272033691406.dp).requiredHeight(11.971592903137207.dp)
    )
}

@Composable
fun Vector210(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector210),
        modifier = modifier.requiredWidth(7.48727560043335.dp).requiredHeight(10.321023941040039.dp)
    )
}

@Composable
fun Vector211(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector211),
        modifier = modifier.requiredWidth(8.223112106323242.dp).requiredHeight(10.544744491577148.dp)
    )
}

@Composable
fun Vector212(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector212),
        modifier = modifier.requiredWidth(8.223111152648926.dp).requiredHeight(10.544744491577148.dp)
    )
}

@Composable
fun Vector213(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector213),
        modifier = modifier.requiredWidth(2.3863635063171387.dp).requiredHeight(2.376420021057129.dp)
    )
}

@Composable
fun Vector214(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector214),
        modifier = modifier.requiredWidth(4.544034004211426.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Class1005(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(36.97626495361328.dp).requiredHeight(10.544744491577148.dp)
    )
}

@Composable
fun Frame73(
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Class32(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_3_1),
        modifier = modifier.requiredWidth(7.780588626861572.dp).requiredHeight(10.460227966308594.dp)
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
            red = 38,
            green = 205,
            blue = 45
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
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Polygon4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_4),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Polygon1Stroke3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_1_stroke_3),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Class23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_2_2),
        modifier = modifier.requiredWidth(3.8352272510528564.dp).requiredHeight(5.8977274894714355.dp)
    )
}

@Composable
fun Vector215(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector215),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_11),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_asset_2_3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.05712890625.dp,
                top = 5.971427917480469.dp,
                end = 7.057157516479492.dp,
                bottom = 6.514287948608398.dp
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
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector216(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector216),
        modifier = modifier.requiredWidth(7.977272033691406.dp).requiredHeight(12.295454978942871.dp)
    )
}

@Composable
fun Vector217(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector217),
        modifier = modifier.requiredWidth(7.284091949462891.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector218(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector218),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector219(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector219),
        modifier = modifier.requiredWidth(7.357954025268555.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector220(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector220),
        modifier = modifier.requiredWidth(2.1477279663085938.dp).requiredHeight(12.102272987365723.dp)
    )
}

@Composable
fun Vector221(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector221),
        modifier = modifier.requiredWidth(10.482954978942871.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun OiHong(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(57.178977966308594.dp).requiredHeight(15.556818962097168.dp)
    )
}

@Composable
fun Vector222(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector222),
        modifier = modifier.requiredWidth(7.875.dp).requiredHeight(10.460282325744629.dp)
    )
}

@Composable
fun Vector223(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector223),
        modifier = modifier.requiredWidth(7.1441755294799805.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Vector224(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector224),
        modifier = modifier.requiredWidth(7.144176483154297.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Class776(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.716262817382812.dp).requiredHeight(10.460282325744629.dp)
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Class6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_6),
        modifier = modifier.requiredWidth(7.875.dp).requiredHeight(10.460282325744629.dp)
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
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Polygon5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_5),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Polygon1Stroke4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_1_stroke_4),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Class4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_4),
        modifier = modifier.requiredWidth(4.3664774894714355.dp).requiredHeight(5.818181991577148.dp)
    )
}

@Composable
fun Vector225(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector225),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_12),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset16(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_asset_1_6),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.86474609375.dp,
                top = 3.89190673828125.dp,
                end = 5.837957382202148.dp,
                bottom = 4.864849090576172.dp
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
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 193.0.dp,
                top = 9.0.dp,
                end = 74.0.dp,
                bottom = 5.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Frame64(
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector226(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector226),
        modifier = modifier.requiredWidth(11.863639831542969.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector227(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector227),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector228(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector228),
        modifier = modifier.requiredWidth(7.357954025268555.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector229(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector229),
        modifier = modifier.requiredWidth(8.136363983154297.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector230(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector230),
        modifier = modifier.requiredWidth(10.130681991577148.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun GoHom1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(57.227272033691406.dp).requiredHeight(11.971592903137207.dp)
    )
}

@Composable
fun Vector231(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector231),
        modifier = modifier.requiredWidth(7.357954025268555.dp).requiredHeight(10.321022987365723.dp)
    )
}

@Composable
fun Vector232(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector232),
        modifier = modifier.requiredWidth(7.875.dp).requiredHeight(10.460282325744629.dp)
    )
}

@Composable
fun Vector233(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector233),
        modifier = modifier.requiredWidth(7.899857997894287.dp).requiredHeight(10.460227966308594.dp)
    )
}

@Composable
fun Class862(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(25.905717849731445.dp).requiredHeight(10.460282325744629.dp)
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Class41(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_4_1),
        modifier = modifier.requiredWidth(8.208097457885742.dp).requiredHeight(10.181818008422852.dp)
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
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Polygon6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_6),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Polygon1Stroke5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_1_stroke_5),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Class11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_1_1),
        modifier = modifier.requiredWidth(2.3068182468414307.dp).requiredHeight(5.818181991577148.dp)
    )
}

@Composable
fun Vector234(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector234),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_13),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.1875.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_asset_2_4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.05712890625.dp,
                top = 5.971435546875.dp,
                end = 7.057157516479492.dp,
                bottom = 6.514280319213867.dp
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
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector235(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector235),
        modifier = modifier.requiredWidth(11.863639831542969.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector236(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector236),
        modifier = modifier.requiredWidth(7.255680084228516.dp).requiredHeight(9.034090995788574.dp)
    )
}

@Composable
fun Vector237(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector237),
        modifier = modifier.requiredWidth(7.653408050537109.dp).requiredHeight(9.017045021057129.dp)
    )
}

@Composable
fun Vector238(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector238),
        modifier = modifier.requiredWidth(11.863637924194336.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector239(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector239),
        modifier = modifier.requiredWidth(7.255681037902832.dp).requiredHeight(9.034090995788574.dp)
    )
}

@Composable
fun Vector240(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector240),
        modifier = modifier.requiredWidth(10.039772987365723.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun Camcam(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(65.3053970336914.dp).requiredHeight(11.988638877868652.dp)
    )
}

@Composable
fun Vector241(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector241),
        modifier = modifier.requiredWidth(7.899858474731445.dp).requiredHeight(10.460227966308594.dp)
    )
}

@Composable
fun Vector242(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector242),
        modifier = modifier.requiredWidth(8.223111152648926.dp).requiredHeight(10.544744491577148.dp)
    )
}

@Composable
fun Vector243(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector243),
        modifier = modifier.requiredWidth(7.144176483154297.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Class708(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(25.790128707885742.dp).requiredHeight(10.544744491577148.dp)
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Class7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_7),
        modifier = modifier.requiredWidth(7.144176483154297.dp).requiredHeight(10.181818008422852.dp)
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
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Polygon7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_7),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Polygon1Stroke6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_1_stroke_6),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Class51(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_5_1),
        modifier = modifier.requiredWidth(3.9091238975524902.dp).requiredHeight(5.897727012634277.dp)
    )
}

@Composable
fun Vector244(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector244),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_14),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset17(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_asset_1_7),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.86474609375.dp,
                top = 3.89190673828125.dp,
                end = 5.837957382202148.dp,
                bottom = 4.864849090576172.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 193.0.dp,
                top = 9.0.dp,
                end = 74.0.dp,
                bottom = 5.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector245(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector245),
        modifier = modifier.requiredWidth(7.255680084228516.dp).requiredHeight(9.034090995788574.dp)
    )
}

@Composable
fun Vector246(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector246),
        modifier = modifier.requiredWidth(1.698862075805664.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector247(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector247),
        modifier = modifier.requiredWidth(7.255681991577148.dp).requiredHeight(9.034090995788574.dp)
    )
}

@Composable
fun Vector248(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector248),
        modifier = modifier.requiredWidth(7.357954025268555.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector249(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector249),
        modifier = modifier.requiredWidth(10.039772987365723.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun Chala(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(41.56959915161133.dp).requiredHeight(11.988638877868652.dp)
    )
}

@Composable
fun Vector250(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector250),
        modifier = modifier.requiredWidth(8.20809555053711.dp).requiredHeight(10.181818008422852.dp)
    )
}

@Composable
fun Vector251(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector251),
        modifier = modifier.requiredWidth(7.870079517364502.dp).requiredHeight(10.460281372070312.dp)
    )
}

@Composable
fun Vector252(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector252),
        modifier = modifier.requiredWidth(7.875.dp).requiredHeight(10.460282325744629.dp)
    )
}

@Composable
fun Class694(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(26.69744300842285.dp).requiredHeight(10.460335731506348.dp)
    )
}

@Composable
fun Frame81(
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
        modifier = modifier.requiredWidth(80.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Class8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_8),
        modifier = modifier.requiredWidth(7.899857997894287.dp).requiredHeight(10.460227966308594.dp)
    )
}

@Composable
fun Frame82(
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
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Polygon8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_8),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Polygon1Stroke7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_polygon_1_stroke_7),
        modifier = modifier.requiredWidth(8.93118667602539.dp).requiredHeight(8.0.dp)
    )
}

@Composable
fun Vector253(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector253),
        modifier = modifier.requiredWidth(2.3068180084228516.dp).requiredHeight(5.818181991577148.dp)
    )
}

@Composable
fun Vector254(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector254),
        modifier = modifier.requiredWidth(3.8352272510528564.dp).requiredHeight(5.8977274894714355.dp)
    )
}

@Composable
fun Class21(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(7.119318008422852.dp).requiredHeight(5.897727966308594.dp)
    )
}

@Composable
fun Vector255(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector255),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_stroke_15),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Asset18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_asset_1_8),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.86474609375.dp,
                top = 3.89190673828125.dp,
                end = 5.837957382202148.dp,
                bottom = 4.864849090576172.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 193.0.dp,
                top = 9.0.dp,
                end = 74.0.dp,
                bottom = 5.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector256(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector256),
        modifier = modifier.requiredWidth(2.4204559326171875.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector257(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector257),
        modifier = modifier.requiredWidth(7.812496185302734.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector258(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector258),
        modifier = modifier.requiredWidth(8.511363983154297.dp).requiredHeight(11.778409004211426.dp)
    )
}

@Composable
fun Vector259(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector259),
        modifier = modifier.requiredWidth(8.590909957885742.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector260(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector260),
        modifier = modifier.requiredWidth(2.420454978942871.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector261(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector261),
        modifier = modifier.requiredWidth(10.528409957885742.dp).requiredHeight(11.954545974731445.dp)
    )
}

@Composable
fun Global(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.37642288208008.dp).requiredHeight(11.965911865234375.dp)
    )
}

@Composable
fun Vector319Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_319_stroke_),
        modifier = modifier.requiredWidth(8.1317278444767.dp).requiredHeight(8.1317278444767.dp)
    )
}

@Composable
fun Vector320Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector_320_stroke_),
        modifier = modifier.requiredWidth(2.0.dp).requiredHeight(9.5.dp)
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
        modifier = modifier.graphicsLayer(rotationZ = -45.00000098057549f).requiredWidth(9.5.dp).requiredHeight(9.5.dp)
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
fun Vector262(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector262),
        modifier = modifier.requiredWidth(2.4204559326171875.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Vector263(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector263),
        modifier = modifier.requiredWidth(7.812498092651367.dp).requiredHeight(9.005681991577148.dp)
    )
}

@Composable
fun Vector264(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector264),
        modifier = modifier.requiredWidth(8.193181991577148.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector265(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector265),
        modifier = modifier.requiredWidth(8.590909957885742.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector266(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector266),
        modifier = modifier.requiredWidth(7.448864459991455.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Local(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(39.937503814697266.dp).requiredHeight(11.806818962097168.dp)
    )
}

@Composable
fun Vector267(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector267),
        modifier = modifier.requiredWidth(8.505683898925781.dp).requiredHeight(11.778409004211426.dp)
    )
}

@Composable
fun Vector268(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector268),
        modifier = modifier.requiredWidth(8.045454025268555.dp).requiredHeight(8.840909004211426.dp)
    )
}

@Composable
fun Vector269(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector269),
        modifier = modifier.requiredWidth(8.335227966308594.dp).requiredHeight(9.011363983154297.dp)
    )
}

@Composable
fun Vector270(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector270),
        modifier = modifier.requiredWidth(2.613636016845703.dp).requiredHeight(12.30113697052002.dp)
    )
}

@Composable
fun Vector271(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector271),
        modifier = modifier.requiredWidth(5.295454978942871.dp).requiredHeight(8.852272987365723.dp)
    )
}

@Composable
fun Vector272(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_vector272),
        modifier = modifier.requiredWidth(7.704545497894287.dp).requiredHeight(11.636363983154297.dp)
    )
}

@Composable
fun Friend(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(47.77698516845703.dp).requiredHeight(12.47159194946289.dp)
    )
}

@Composable
fun Line14Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_1_line_14_stroke_),
        modifier = modifier.requiredWidth(19.0.dp).requiredHeight(1.0.dp)
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
        modifier = modifier.requiredWidth(214.0.dp).requiredHeight(35.0.dp)
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(626.0.dp)
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

