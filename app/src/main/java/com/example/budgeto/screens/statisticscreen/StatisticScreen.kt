package com.example.budgeto.screens.statisticscreen

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
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow

@Composable
fun StatisticScreen(
    modifier: Modifier = Modifier,

){
    Statistics1(
        modifier = modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)
    )
}


@Composable
fun Statistics1(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        BottomNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 1227.0.dp
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
                                x = -0.875244140625.dp,
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
                        x = 131.626708984375.dp,
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
        Trend(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 209.0.dp
                )
            )
        )
        Frame81(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 242.0.dp
                )
            )
        ) {
            Line15(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 64.00001215176687.dp
                    )
                )
            )
            Line16(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 110.00001215176687.dp
                    )
                )
            )
            Line17(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 43.0.dp,
                        y = 155.00001215176687.dp
                    )
                )
            )
            Group9(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 16.99993896484375.dp,
                        y = 56.0.dp
                    )
                )
            ) {
                Colam1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 40.0.dp
                        )
                    )
                ) {
                    Rectangle6()
                    Rectangle7(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 13.316574096679688.dp,
                                y = 59.342041015625.dp
                            )
                        )
                    )
                }
                Colam2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 34.39208984375.dp,
                            y = 10.302734375.dp
                        )
                    )
                ) {
                    Rectangle8(modifier = Modifier.columnWeight(1.0f))
                    Rectangle9(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 13.15023136138916.dp,
                                y = 0.00000762939453125.dp
                            )
                        ).columnWeight(1.0f)
                    )
                }
                Colam3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 68.78466796875.dp,
                            y = 20.08740234375.dp
                        )
                    )
                ) {
                    Rectangle10(modifier = Modifier.columnWeight(1.0f))
                    Rectangle11(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 13.150016784667969.dp,
                                y = 0.0000591278076171875.dp
                            )
                        ).columnWeight(1.0f)
                    )
                }
                Colam4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 103.1767578125.dp,
                            y = 38.7666015625.dp
                        )
                    )
                ) {
                    Rectangle12(modifier = Modifier.columnWeight(1.0f))
                    Rectangle13(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 13.34221363067627.dp,
                                y = 0.0.dp
                            )
                        ).columnWeight(1.0f)
                    )
                }
                Colam5(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 137.5693359375.dp,
                            y = 75.23529815673828.dp
                        )
                    )
                ) {
                    Rectangle14(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = -0.00002288818359375.dp
                            )
                        ).columnWeight(1.0f)
                    )
                    Rectangle15(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 13.149839401245117.dp,
                                y = 0.0.dp
                            )
                        ).columnWeight(1.0f)
                    )
                }
                Colam6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 171.9619140625.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Rectangle16(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0000400543212890625.dp
                            )
                        ).columnWeight(1.0f)
                    )
                    Rectangle17(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 13.0380859375.dp,
                                y = 0.0.dp
                            )
                        ).columnWeight(1.0f)
                    )
                }
                Colam7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 206.35400390625.dp,
                            y = 34.31879425048828.dp
                        )
                    )
                ) {
                    Rectangle18(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0000133514404296875.dp
                            )
                        ).columnWeight(1.0f)
                    )
                    Rectangle19(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 13.150131225585938.dp,
                                y = 0.0.dp
                            )
                        ).columnWeight(1.0f)
                    )
                }
                Colam8(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 240.74609375.dp,
                            y = 4.0762939453125.dp
                        )
                    )
                ) {
                    Rectangle20(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = -0.00005054473876953125.dp
                            )
                        ).columnWeight(1.0f)
                    )
                    Rectangle21(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 13.149935722351074.dp,
                                y = 0.0.dp
                            )
                        ).columnWeight(1.0f)
                    )
                }
            }
            TxtVND(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 29.0.dp
                    )
                )
            )
            Txt2M(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 19.0.dp,
                        y = 56.0.dp
                    )
                )
            )
            Txt1M(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 19.0.dp,
                        y = 101.0.dp
                    )
                )
            )
            Txt0(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 19.0.dp,
                        y = 146.0.dp
                    )
                )
            )
            Txt30(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 312.0.dp,
                        y = 208.0.dp
                    )
                )
            )
            Txt25(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 229.0.dp,
                        y = 208.0.dp
                    )
                )
            )
            Txt20(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 125.0.dp,
                        y = 208.0.dp
                    )
                )
            )
            Txt15(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 55.0.dp,
                        y = 208.0.dp
                    )
                )
            )
            Frame74(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 171.49999219575957.dp,
                        y = 67.50000013289144.dp
                    )
                )
            ) {
                Rectangle75(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 254.00000034969162.dp,
                            y = 0.00001499300628893252.dp
                        )
                    )
                )
            }
        }
        Frame83(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = 507.0.dp
                )
            )
        ) {
            Rectangle76(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 175.0.dp,
                        y = 119.0.dp
                    )
                )
            )
            MonthSBalance(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 120.0.dp
                    )
                )
            )
            Expense(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 68.0.dp
                    )
                )
            )
            Income(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 18.0.dp
                    )
                )
            )
            Txt4000000VND(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 183.0.dp,
                        y = 129.0.dp
                    )
                )
            )
            TxtMinus1000000VND(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 190.0.dp,
                        y = 68.0.dp
                    )
                )
            )
            Txt5000000VND(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 184.0.dp,
                        y = 18.0.dp
                    )
                )
            )
            Vector324(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 15.5927734375.dp,
                        y = 49.107666015625.dp
                    )
                )
            )
            Vector325(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.5.dp,
                        y = 101.5.dp
                    )
                )
            )
        }
        Frame47(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 700.0.dp
                )
            )
        ) {
            Income1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Frame51(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 242.0.dp,
                        y = 20.0.dp
                    )
                )
            ) {
                Details(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 2.0.dp
                        )
                    )
                )
                Vector323(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 72.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
            Rectangle67(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 240.0.dp
                    )
                )
            )
            Txt24percent(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 51.0.dp,
                        y = 125.0.dp
                    )
                )
            )
            BarchartXL(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
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
                            x = -10.000244140625.dp,
                            y = -25.0.dp
                        )
                    )
                ) {
                    Ellipse27(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 49.44022092578052.dp,
                                y = 33.522895994919054.dp
                            )
                        )
                    )
                    Ellipse26(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 32.51134012115017.dp,
                                y = 54.299698987454576.dp
                            )
                        )
                    )
                    Ellipse25(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 27.961367303263614.dp,
                                y = 103.18464916361518.dp
                            )
                        )
                    )
                    Ellipse24(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 78.95909118652344.dp,
                                y = -0.0001373291015625.dp
                            )
                        )
                    )
                    Ellipse28(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 45.20787048339844.dp,
                                y = -0.0001373291015625.dp
                            )
                        )
                    )
                    Ellipse23(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 8.645858764648438.dp,
                                y = 78.95860290527344.dp
                            )
                        )
                    )
                }
                Txt41percent(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 155.0.dp,
                            y = 149.0.dp
                        )
                    )
                )
                Txt28percent(
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
        }
        Frame84(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 968.0.dp
                )
            )
        ) {
            Expense1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Frame52(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 242.0.dp,
                        y = 20.0.dp
                    )
                )
            ) {
                Details1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 2.0.dp
                        )
                    )
                )
                Vector326(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 72.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
            Rectangle68(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 240.0.dp
                    )
                )
            )
            BarchartXL1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                Ellipse31(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 74.5.dp
                        )
                    )
                )
                Group12(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -10.000244140625.dp,
                            y = -25.0.dp
                        )
                    )
                ) {
                    Ellipse34(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 49.44022092578052.dp,
                                y = 33.522895994919054.dp
                            )
                        )
                    )
                    Ellipse35(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 32.51134012115017.dp,
                                y = 54.299698987454576.dp
                            )
                        )
                    )
                    Ellipse36(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 27.961367303263614.dp,
                                y = 103.18464916361518.dp
                            )
                        )
                    )
                    Ellipse37(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 78.95909118652344.dp,
                                y = -0.0001373291015625.dp
                            )
                        )
                    )
                    Ellipse38(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 45.20787048339844.dp,
                                y = -0.0001373291015625.dp
                            )
                        )
                    )
                    Ellipse39(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 8.645858764648438.dp,
                                y = 78.95860290527344.dp
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
                Txt28percent1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 169.0.dp,
                            y = 20.0.dp
                        )
                    )
                )
                Ellipse32(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 22.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
                Ellipse33(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 63.0.dp,
                            y = 48.0.dp
                        )
                    )
                )
                Line19(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 80.0.dp,
                            y = 28.0.dp
                        )
                    )
                )
                Line23(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 55.87538919013673.dp,
                            y = 33.55273455703127.dp
                        )
                    )
                )
                Line24(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 39.844355097166726.dp,
                            y = 43.805421006911956.dp
                        )
                    )
                )
                Line25(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 28.703365608128024.dp,
                            y = 112.50000031242394.dp
                        )
                    )
                )
                Line26(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 137.994186826666.dp,
                            y = 85.50024414399465.dp
                        )
                    )
                )
            }
            Txt24percent1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 51.0.dp,
                        y = 120.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 1344)
@Composable
private fun Statistics1Preview() {
    MaterialTheme {
        RelayContainer {
            Statistics1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_12),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_vector1),
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
        vector = painterResource(R.drawable.statistics_1_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.348876953125.dp,
                top = 9.333251953125.dp,
                end = 4.193613052368164.dp,
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
        vector = painterResource(R.drawable.statistics_1_vector3),
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
        vector = painterResource(R.drawable.statistics_1_vector4),
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
        vector = painterResource(R.drawable.statistics_1_vector5),
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
        vector = painterResource(R.drawable.statistics_1_vector6),
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
        vector = painterResource(R.drawable.statistics_1_vector),
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
        vector = painterResource(R.drawable.statistics_1_vector7),
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
        fontFamily = com.example.budgeto.screensfonts.inter,
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
fun June(modifier: Modifier = Modifier) {
    RelayText(
        content = "June",
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
fun Vector321(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_vector_321),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
    )
}

@Composable
fun Vector322(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_vector_322),
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
        fontFamily = com.example.budgeto.screensfonts.inter,
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
fun Trend(modifier: Modifier = Modifier) {
    RelayText(
        content = "Trend",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Line15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_15),
        modifier = modifier.requiredWidth(278.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line16(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_16),
        modifier = modifier.requiredWidth(278.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line17(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_17),
        modifier = modifier.requiredWidth(278.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Rectangle6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_6),
        modifier = modifier.requiredWidth(9.103850364685059.dp).requiredHeight(59.286529541015625.dp)
    )
}

@Composable
fun Rectangle7(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(9.155067443847656.dp).requiredHeight(41.657936096191406.dp))
}

@Composable
fun Colam1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(22.471529006958008.dp).requiredHeight(101.0.dp)
    )
}

@Composable
fun Rectangle8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_7),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 20.458038330078125.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_8),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 88.94832611083984.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Colam2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(22.25408172607422.dp).requiredHeight(109.40646362304688.dp)
    )
}

@Composable
fun Rectangle10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_9),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 14.231681823730469.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_10),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 79.16402626037598.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Colam3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(22.253868103027344.dp).requiredHeight(93.3957748413086.dp)
    )
}

@Composable
fun Rectangle12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_11),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 27.123687744140625.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_12),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 60.921112060546875.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.155067443847656.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Colam4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(22.49728012084961.dp).requiredHeight(87.60861206054688.dp)
    )
}

@Composable
fun Rectangle14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_13),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 24.016067504882812.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_14),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 39.137298583984375.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Colam5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 0.0f).requiredWidth(22.25368881225586.dp).requiredHeight(63.15337371826172.dp)
    )
}

@Composable
fun Rectangle16(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_15),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 99.25166893005371.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle17(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_16),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 27.82568359375.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Colam6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 0.0f).requiredWidth(22.0380859375.dp).requiredHeight(126.82568359375.dp)
    )
}

@Composable
fun Rectangle18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_17),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 64.93253517150879.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle19(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_18),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 17.789871215820312.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Colam7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 0.0f).requiredWidth(22.253982543945312.dp).requiredHeight(82.72222137451172.dp)
    )
}

@Composable
fun Rectangle20(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_19),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 95.17485523223877.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_20),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 6.2264251708984375.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).requiredWidth(9.103850364685059.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Colam8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 0.0f).requiredWidth(22.253786087036133.dp).requiredHeight(101.4012451171875.dp)
    )
}

@Composable
fun Group9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(262.9998779296875.dp).requiredHeight(140.99996948242188.dp)
    )
}

@Composable
fun TxtVND(modifier: Modifier = Modifier) {
    RelayText(
        content = "VNĐ",
        fontSize = 10.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt2M(modifier: Modifier = Modifier) {
    RelayText(
        content = "2M",
        fontSize = 10.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt1M(modifier: Modifier = Modifier) {
    RelayText(
        content = "1M",
        fontSize = 10.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt0(modifier: Modifier = Modifier) {
    RelayText(
        content = "0",
        fontSize = 10.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt30(modifier: Modifier = Modifier) {
    RelayText(
        content = "30",
        fontSize = 10.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt25(modifier: Modifier = Modifier) {
    RelayText(
        content = "25",
        fontSize = 10.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt20(modifier: Modifier = Modifier) {
    RelayText(
        content = "20",
        fontSize = 10.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt15(modifier: Modifier = Modifier) {
    RelayText(
        content = "15",
        fontSize = 10.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle75(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_75),
        modifier = modifier.requiredWidth(78.00000034969071.dp).requiredHeight(8.000003409488272.dp)
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
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(8.000015258789062.dp).requiredHeight(343.0.dp)
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
        modifier = modifier.requiredWidth(345.0.dp).requiredHeight(244.0.dp)
    )
}

@Composable
fun Rectangle76(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_76),
        modifier = modifier.requiredWidth(155.0.dp).requiredHeight(37.0.dp)
    )
}

@Composable
fun MonthSBalance(modifier: Modifier = Modifier) {
    RelayText(
        content = "Month’s Balance",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(66.0.dp)
    )
}

@Composable
fun Expense(modifier: Modifier = Modifier) {
    RelayText(
        content = "Expense",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Income(modifier: Modifier = Modifier) {
    RelayText(
        content = "Income",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt4000000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "+ 4.000.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TxtMinus1000000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "- 1.000.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 233,
            green = 87,
            blue = 62
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt5000000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "+ 5.000.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 38,
            green = 205,
            blue = 45
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector324(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_vector_324),
        modifier = modifier.requiredWidth(304.6471252441406.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Vector325(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_vector_325),
        modifier = modifier.requiredWidth(304.6471252441406.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Frame83(
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
        modifier = modifier.requiredWidth(346.0.dp).requiredHeight(174.0.dp)
    )
}

@Composable
fun Income1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Income",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Details(modifier: Modifier = Modifier) {
    RelayText(
        content = "Details",
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
        vector = painterResource(R.drawable.statistics_1_vector_323),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
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
        modifier = modifier.requiredWidth(90.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Rectangle67(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_67),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
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
fun Ellipse22(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(672.0.dp).requiredHeight(672.0.dp))
}

@Composable
fun Ellipse27(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_27),
        modifier = modifier.requiredWidth(157.01449584960938.dp).requiredHeight(157.01449584960938.dp)
    )
}

@Composable
fun Ellipse26(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_26),
        modifier = modifier.requiredWidth(157.01449584960938.dp).requiredHeight(157.01449584960938.dp)
    )
}

@Composable
fun Ellipse25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_25),
        modifier = modifier.requiredWidth(157.01449584960938.dp).requiredHeight(157.01449584960938.dp)
    )
}

@Composable
fun Ellipse24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_24),
        modifier = modifier.requiredWidth(157.91769409179688.dp).requiredHeight(157.91769409179688.dp)
    )
}

@Composable
fun Ellipse28(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_28),
        modifier = modifier.requiredWidth(157.91769409179688.dp).requiredHeight(157.91769409179688.dp)
    )
}

@Composable
fun Ellipse23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_23),
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
fun Txt41percent(modifier: Modifier = Modifier) {
    RelayText(
        content = "41%",
        height = 1.171875.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt28percent(modifier: Modifier = Modifier) {
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
        vector = painterResource(R.drawable.statistics_1_ellipse_29),
        modifier = modifier.requiredWidth(159.0.dp).requiredHeight(159.0.dp)
    )
}

@Composable
fun Ellipse30(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_30),
        modifier = modifier.requiredWidth(76.0.dp).requiredHeight(76.0.dp)
    )
}

@Composable
fun Line18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_18),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line20(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_20),
        modifier = modifier.requiredWidth(40.3112907409668.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_21),
        modifier = modifier.requiredWidth(41.59326934814453.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_22),
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
                start = 72.0.dp,
                top = 60.0.dp,
                end = 71.0.dp,
                bottom = 18.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(249.0.dp).relayDropShadow(
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
fun Expense1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Expense",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Details1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Details",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector326(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_vector_326),
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
        modifier = modifier.requiredWidth(90.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Rectangle68(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_rectangle_68),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Ellipse31(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(672.0.dp).requiredHeight(672.0.dp))
}

@Composable
fun Ellipse34(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_33),
        modifier = modifier.requiredWidth(157.01449584960938.dp).requiredHeight(157.01449584960938.dp)
    )
}

@Composable
fun Ellipse35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_34),
        modifier = modifier.requiredWidth(157.01449584960938.dp).requiredHeight(157.01449584960938.dp)
    )
}

@Composable
fun Ellipse36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_35),
        modifier = modifier.requiredWidth(157.01449584960938.dp).requiredHeight(157.01449584960938.dp)
    )
}

@Composable
fun Ellipse37(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_36),
        modifier = modifier.requiredWidth(157.91769409179688.dp).requiredHeight(157.91769409179688.dp)
    )
}

@Composable
fun Ellipse38(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_37),
        modifier = modifier.requiredWidth(157.91769409179688.dp).requiredHeight(157.91769409179688.dp)
    )
}

@Composable
fun Ellipse39(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_38),
        modifier = modifier.requiredWidth(157.91769409179688.dp).requiredHeight(157.91769409179688.dp)
    )
}

@Composable
fun Group12(
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
fun Txt28percent1(modifier: Modifier = Modifier) {
    RelayText(
        content = "28%",
        height = 1.171875.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Ellipse32(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_31),
        modifier = modifier.requiredWidth(159.0.dp).requiredHeight(159.0.dp)
    )
}

@Composable
fun Ellipse33(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_ellipse_32),
        modifier = modifier.requiredWidth(76.0.dp).requiredHeight(76.0.dp)
    )
}

@Composable
fun Line19(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_19),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_23),
        modifier = modifier.requiredWidth(40.24922180175781.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_24),
        modifier = modifier.requiredWidth(40.3112907409668.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line25(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(41.59326934814453.dp).requiredHeight(0.0.dp))
}

@Composable
fun Line26(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.statistics_1_line_25),
        modifier = modifier.requiredWidth(43.011627197265625.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun BarchartXL1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 72.0.dp,
                top = 55.0.dp,
                end = 71.0.dp,
                bottom = 23.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Txt24percent1(modifier: Modifier = Modifier) {
    RelayText(
        content = "24%",
        height = 1.171875.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame84(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(249.0.dp).relayDropShadow(
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
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
