package com.example.budgeto.screens.inventoryscreen

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
import com.example.budgeto.screensfonts.kyivTypeSerif
import com.example.budgeto.screensfonts.milonga
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow


@Composable
fun InventoryScreen(
    onProfileButtonTapped: () -> Unit = {},
    onStoreButtonTapped: () -> Unit = {},
    onInventoryButtonTapped: () -> Unit = {},
    onHistoryButtonTapped: () -> Unit = {},
    onStatisticButtonTapped: () -> Unit = {},

    modifier: Modifier = Modifier
){
    Inventory1(

    )

}


@Composable
fun Inventory1(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        BottomNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 2553.0.dp
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
                    Vector2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -0.875.dp,
                                y = -0.875.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector3(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -0.8751373291015625.dp,
                                y = -0.875.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                }
                Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Inventory(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 83.0.dp,
                            y = 38.0.dp
                        )
                    )
                )
                History(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 236.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Vector4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Frame162486(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 103.0.dp,
                        y = 6.0.dp
                    )
                )
            ) {
                Archive(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Vector6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
        }
        Frame53(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            Frame59(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 148.0.dp,
                        y = 18.0.dp
                    )
                )
            ) {
                Using(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 32.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
                Idle(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 149.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
                Line14(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -3.5.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            Frame162477(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 22.0.dp,
                        y = 18.0.dp
                    )
                )
            ) {
                All(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 50.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
        }
        Frame47(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 72.0.dp
                )
            )
        ) {
            BigButton(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 22.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Rectangle67(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 548.0.dp
                    )
                )
            )
            Frame162484(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 49.0.dp
                    )
                )
            ) {
                Have3Using2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 87.0.dp
                        )
                    )
                )
                Group101(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -24.0.dp,
                            y = -9.0.dp
                        )
                    )
                ) {
                    Frame45(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -3.455028533935547.dp,
                                y = 32.0106201171875.dp
                            )
                        )
                    ) {}
                    FloraOpeningScreen3(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 84.97354125976562.dp,
                                y = 47.724853515625.dp
                            )
                        )
                    )
                    FloraOpeningScreen22(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 24.0.dp,
                                y = 9.0.dp
                            )
                        )
                    )
                }
            }
            Frame162497(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 178.0.dp,
                        y = 49.0.dp
                    )
                )
            ) {
                Have4Using1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 88.0.dp
                        )
                    )
                )
                Group27(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 2.0.dp,
                            y = 10.82568359375.dp
                        )
                    )
                ) {
                    Frame46(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -0.2563896179199219.dp,
                                y = 17.2591552734375.dp
                            )
                        )
                    ) {}
                    FloraOpeningScreen4(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 85.37078857421875.dp,
                                y = 46.23193359375.dp
                            )
                        )
                    )
                    FloraOpeningScreen23()
                }
            }
            Frame162498(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 172.0.dp
                    )
                )
            ) {
                Have2Using1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 83.0.dp
                        )
                    )
                )
                Group25(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 19.486328125.dp,
                            y = 0.46044921875.dp
                        )
                    )
                ) {
                    Frame36(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 19.206298828125.dp
                            )
                        )
                    ) {
                        Rectangle63()
                    }
                    FloraButtonHome3(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 71.64642333984375.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    FloraOpeningScreen5(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 42.36003112792969.dp,
                                y = 37.2486572265625.dp
                            )
                        )
                    )
                }
            }
            Frame162499(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 179.0.dp,
                        y = 172.0.dp
                    )
                )
            ) {
                Have3Using0(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 83.0.dp
                        )
                    )
                )
                Group116(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -92.0.dp,
                            y = -27.0.dp
                        )
                    )
                ) {
                    Frame44(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 12.738147735595703.dp,
                                y = 45.07080078125.dp
                            )
                        )
                    ) {}
                    Red1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 100.13444933886387.dp,
                                y = 42.6146216852776.dp
                            )
                        )
                    )
                    Cup1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 98.679394692806.dp,
                                y = 41.485866687219186.dp
                            )
                        )
                    )
                    Bow1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 136.38271013634312.dp,
                                y = 55.29977196411801.dp
                            )
                        )
                    )
                }
            }
            Frame162500(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 295.0.dp
                    )
                )
            ) {
                Have2Using0(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 84.0.dp
                        )
                    )
                )
                Group105(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -17.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Group23(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 39.66197204589844.dp,
                                y = 12.0423583984375.dp
                            )
                        )
                    ) {
                        Group1 {}
                    }
                    FloraButtonHome5(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 17.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
            }
            Frame162501(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 181.0.dp,
                        y = 295.0.dp
                    )
                )
            ) {
                Have2Using2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 84.0.dp
                        )
                    )
                )
                Group106(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -17.0.dp,
                            y = 14.0.dp
                        )
                    )
                ) {
                    Group24(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 36.843719482421875.dp,
                                y = 9.6041259765625.dp
                            )
                        )
                    ) {
                        Group2 {}
                    }
                    FloraButtonHome6(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 17.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
            }
            Frame162502(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 418.0.dp
                    )
                )
            ) {
                Have2Using3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 83.0.dp
                        )
                    )
                )
                Group115(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -25.217758178710938.dp,
                            y = -12.3775634765625.dp
                        )
                    )
                ) {
                    Frame37(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 46.25822448730469.dp,
                                y = 35.2193603515625.dp
                            )
                        )
                    ) {
                        Rectangle65(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -2.0.dp,
                                    y = 72.0.dp
                                )
                            )
                        )
                        Text(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 18.0.dp,
                                    y = 35.0.dp
                                )
                            )
                        )
                    }
                    Snow1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 26.657902159895272.dp,
                                y = 15.010251545838827.dp
                            )
                        )
                    )
                    Bow2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 80.42721557617188.dp,
                                y = 12.3775634765625.dp
                            )
                        )
                    )
                }
            }
            Frame162503(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 177.0.dp,
                        y = 418.0.dp
                    )
                )
            ) {
                Have2Using4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 23.0.dp,
                            y = 82.0.dp
                        )
                    )
                )
                Group120(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -42.0.dp,
                            y = -21.0.dp
                        )
                    )
                ) {
                    Frame48(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -13.012866973876953.dp,
                                y = 38.54052734375.dp
                            )
                        )
                    ) {}
                    Red2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 46.41933326595819.dp,
                                y = 41.605865808395606.dp
                            )
                        )
                    )
                    Cup2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 48.76609262535476.dp,
                                y = 35.67388436149213.dp
                            )
                        )
                    )
                    Bow3(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 88.34624400335042.dp,
                                y = 49.667071525091615.dp
                            )
                        )
                    )
                }
            }
        }
        Frame54(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 647.0.dp
                )
            )
        ) {
            SmallButton(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 22.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Rectangle68(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 482.0.dp
                    )
                )
            )
            Frame162504(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 63.0.dp
                    )
                )
            ) {
                Have5Using2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 94.0.dp
                        )
                    )
                )
                FloraButtonHome12()
            }
            Frame162505(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 178.0.dp,
                        y = 63.0.dp
                    )
                )
            ) {
                Have4Using2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 17.0.dp,
                            y = 94.0.dp
                        )
                    )
                )
                Star9(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 42.378814697265625.dp,
                            y = 19.180419921875.dp
                        )
                    )
                )
            }
            Frame162506(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 197.0.dp
                    )
                )
            ) {
                Have2Using5(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 96.0.dp
                        )
                    )
                )
                Ellipse3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 29.0.dp
                        )
                    )
                )
            }
            Frame162507(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 177.0.dp,
                        y = 199.0.dp
                    )
                )
            ) {
                Have2Using6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 18.0.dp,
                            y = 95.0.dp
                        )
                    )
                )
                Setting(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 52.0.dp,
                            y = 29.0.dp
                        )
                    )
                ) {}
            }
            Frame162508(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 336.0.dp
                    )
                )
            ) {
                Have2Using7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 96.0.dp
                        )
                    )
                )
                Setting1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 54.0.dp,
                            y = 26.0.dp
                        )
                    )
                ) {}
            }
            Frame162509(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 177.0.dp,
                        y = 336.0.dp
                    )
                )
            ) {
                Have1Using0(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 95.0.dp
                        )
                    )
                )
                Group153(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = -0.01389312744140625.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Frame52(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 21.9444580078125.dp,
                                y = 34.379638671875.dp
                            )
                        )
                    ) {}
                    Hat1()
                }
            }
        }
        Frame55(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 1157.0.dp
                )
            )
        ) {
            Icon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 22.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Rectangle69(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 400.0.dp
                    )
                )
            )
            Frame162510(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                Have5Using3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 70.0.dp
                        )
                    )
                )
                Shop22(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 5.0.dp
                        )
                    )
                )
            }
            Frame162511(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 177.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                Have4Using3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 18.0.dp,
                            y = 65.0.dp
                        )
                    )
                )
                Group33610(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 56.0.dp,
                            y = 10.5263671875.dp
                        )
                    )
                ) {
                    Vector8(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -0.875.dp,
                                y = -0.875.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector9(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -0.874755859375.dp,
                                y = -0.875.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                }
            }
            Frame162512(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 173.0.dp
                    )
                )
            ) {
                Have2Using8(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 20.0.dp,
                            y = 71.0.dp
                        )
                    )
                )
                Vector10(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Frame162513(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 177.0.dp,
                        y = 173.0.dp
                    )
                )
            ) {
                Have2Using9(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 71.0.dp
                        )
                    )
                )
                Vector11(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = -0.1737499237060547.dp,
                            y = 0.0.dp
                        )
                    ).columnWeight(1.0f)
                )
            }
            Frame162514(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 288.0.dp
                    )
                )
            ) {
                Have2Using10(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 73.0.dp
                        )
                    )
                )
                Level(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 17.0.dp
                        )
                    )
                ) {
                    Star2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.1722412109375.dp,
                                y = 2.308349609375.dp
                            )
                        )
                    )
                }
            }
            Frame162515(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 177.0.dp,
                        y = 288.0.dp
                    )
                )
            ) {
                Have1Using1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 71.0.dp
                        )
                    )
                )
                Group33609(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 49.0.dp,
                            y = 13.0.dp
                        )
                    )
                ) {
                    Vector12(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector13(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
        }
        Frame57(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 1809.0.dp
                )
            )
        ) {
            Background(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 22.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Rectangle70(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 2.0.dp,
                        y = 721.0.dp
                    )
                )
            )
            Frame162519(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 75.0.dp
                    )
                )
            ) {
                Have5Using4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 285.0.dp
                        )
                    )
                )
                FloraBg2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 10.0.dp,
                            y = 14.0.dp
                        )
                    )
                )
            }
            Frame162520(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 178.0.dp,
                        y = 77.0.dp
                    )
                )
            ) {
                Have4Using4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 16.0.dp,
                            y = 282.0.dp
                        )
                    )
                )
                Z555214942458944f4f29198b0d1e91c35ad51fb03e8f72(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 12.0.dp
                        )
                    )
                )
            }
            Frame162521(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 401.0.dp
                    )
                )
            ) {
                Have2Using11(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 14.0.dp,
                            y = 279.0.dp
                        )
                    )
                )
                Z5567088375231Fe171d217e1379fb153ce5d62f7c44e52(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
            }
        }
        Frame56(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 1587.0.dp
                )
            )
        ) {
            Font(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 22.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Rectangle71(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 192.0.dp
                    )
                )
            )
            Frame162516(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 62.0.dp
                    )
                )
            ) {
                Milonga(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 22.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
                AaBbCcDd(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 208.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
            Frame162517(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 102.0.dp
                    )
                )
            ) {
                AaBbCcDd1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 220.0.dp,
                            y = 4.0.dp
                        )
                    )
                )
                Kurale(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 22.0.dp,
                            y = 4.0.dp
                        )
                    )
                )
            }
            Frame162518(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 143.0.dp
                    )
                )
            ) {
                AaBbCcDd2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 209.0.dp,
                            y = 4.0.dp
                        )
                    )
                )
                KyivTypeSerif(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 22.0.dp,
                            y = 4.0.dp
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
                    y = 72.0.dp
                )
            )
        ) {
            Rectangle72(
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

@Preview(widthDp = 390, heightDp = 2666)
@Composable
private fun Inventory1Preview() {
    MaterialTheme {
        RelayContainer {
            Inventory1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_line_12),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.666671752929688.dp,
                top = 2.666748046875.dp,
                end = 10.666661262512207.dp,
                bottom = 11.999917984008789.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.3333282470703125.dp,
                top = 9.333251953125.dp,
                end = 4.1815032958984375.dp,
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
                start = 20.0.dp,
                top = 13.0.dp,
                end = 292.0.dp,
                bottom = 12.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 289.0.dp,
                top = 16.0.dp,
                end = 23.01999855041504.dp,
                bottom = 15.533000946044922.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Inventory(modifier: Modifier = Modifier) {
    RelayText(
        content = "Inventory",
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
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.083343505859375.dp,
                top = 1.083251953125.dp,
                end = 1.0833187103271484.dp,
                bottom = 1.0834102630615234.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.583343505859375.dp,
                top = 5.416748046875.dp,
                end = 11.916656494140625.dp,
                bottom = 11.916584968566895.dp
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
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 168.0.dp,
                top = 15.0.dp,
                end = 146.0.dp,
                bottom = 16.0.dp
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(57.0.dp)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector6),
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
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector7),
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
fun Frame162486(
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
        content = content,
        modifier = modifier.requiredWidth(54.0.dp).requiredHeight(54.0.dp)
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
fun Using(modifier: Modifier = Modifier) {
    RelayText(
        content = "Using",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Idle(modifier: Modifier = Modifier) {
    RelayText(
        content = "Idle",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Line14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_line_14),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(0.0.dp)
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
        modifier = modifier.requiredWidth(218.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun All(modifier: Modifier = Modifier) {
    RelayText(
        content = "All",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame162477(
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
        modifier = modifier.requiredWidth(121.0.dp).requiredHeight(35.0.dp)
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun BigButton(modifier: Modifier = Modifier) {
    RelayText(
        content = "Big Button",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle67(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_rectangle_67),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Have3Using2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 3 | Using: 2",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame45(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 239,
            green = 178,
            blue = 122
        ),
        isStructured = false,
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 0,
            red = 160,
            green = 114,
            blue = 62
        ),
        content = content,
        modifier = modifier.requiredWidth(110.5820083618164.dp).requiredHeight(47.72486877441406.dp)
    )
}

@Composable
fun FloraOpeningScreen3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_opening_screen_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(113.4920654296875.dp).requiredHeight(55.873016357421875.dp)
    )
}

@Composable
fun FloraOpeningScreen22(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_opening_screen_2_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(121.64021301269531.dp).requiredHeight(68.67724609375.dp)
    )
}

@Composable
fun Group101(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(198.46560668945312.dp).requiredHeight(103.59788513183594.dp)
    )
}

@Composable
fun Frame162484(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(114.0.dp)
    )
}

@Composable
fun Have4Using1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 4 | Using: 1",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame46(
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
            alpha = 0,
            red = 160,
            green = 114,
            blue = 62
        ),
        content = content,
        modifier = modifier.requiredWidth(110.5820083618164.dp).requiredHeight(47.72486877441406.dp)
    )
}

@Composable
fun FloraOpeningScreen4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_opening_screen_3),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(59.62921142578125.dp).requiredHeight(29.355918884277344.dp)
    )
}

@Composable
fun FloraOpeningScreen23(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_opening_screen_2_2),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(68.57185363769531.dp).requiredHeight(39.17431640625.dp)
    )
}

@Composable
fun Group27(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(145.0.dp).requiredHeight(75.58786010742188.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 0.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun Frame162497(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(114.0.dp)
    )
}

@Composable
fun Have2Using1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 1",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_rectangle_63),
        modifier = modifier.requiredWidth(218.0.dp).requiredHeight(82.0.dp)
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
            red = 160,
            green = 114,
            blue = 62
        ),
        content = content,
        modifier = modifier.requiredWidth(110.34583282470703.dp).requiredHeight(47.14285659790039.dp)
    )
}

@Composable
fun FloraButtonHome3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_button_home_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(69.0315170288086.dp).requiredHeight(43.068782806396484.dp)
    )
}

@Composable
fun FloraOpeningScreen5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_opening_screen_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(101.97837829589844.dp).requiredHeight(55.873016357421875.dp)
    )
}

@Composable
fun Group25(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(144.33840942382812.dp).requiredHeight(93.12169647216797.dp)
    )
}

@Composable
fun Frame162498(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(114.0.dp)
    )
}

@Composable
fun Have3Using0(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 3 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
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
            red = 149,
            green = 179,
            blue = 151
        ),
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(111.21259307861328.dp).requiredHeight(47.997013092041016.dp)
    )
}

@Composable
fun Red1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_red_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = -6.8852980717891015f).requiredWidth(269.63934326171875.dp).requiredHeight(151.9287567138672.dp)
    )
}

@Composable
fun Cup1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_cup_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = -15.996283941053932f).requiredWidth(114.1977767944336.dp).requiredHeight(64.52173614501953.dp)
    )
}

@Composable
fun Bow1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_bow_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = 23.414215229139057f).requiredWidth(161.22573852539062.dp).requiredHeight(90.68948364257812.dp)
    )
}

@Composable
fun Group116(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(308.9893493652344.dp).requiredHeight(183.15792846679688.dp)
    )
}

@Composable
fun Frame162499(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(114.0.dp)
    )
}

@Composable
fun Have2Using0(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
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
        radius = 2.0,
        content = content,
        modifier = modifier.requiredWidth(110.49651336669922.dp).requiredHeight(47.14285659790039.dp)
    )
}

@Composable
fun Group23(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 2.0,
        content = content,
        modifier = modifier.requiredWidth(110.49651336669922.dp).requiredHeight(47.14285659790039.dp)
    )
}

@Composable
fun FloraButtonHome5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_button_home_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(79.7354507446289.dp).requiredHeight(35.502647399902344.dp)
    )
}

@Composable
fun Group105(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.1584930419922.dp).requiredHeight(59.185184478759766.dp)
    )
}

@Composable
fun Frame162500(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(114.0.dp)
    )
}

@Composable
fun Have2Using2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
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
        radius = 2.0,
        content = content,
        modifier = modifier.requiredWidth(114.1562728881836.dp).requiredHeight(48.70427703857422.dp)
    )
}

@Composable
fun Group24(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 2.0,
        content = content,
        modifier = modifier.requiredWidth(114.1562728881836.dp).requiredHeight(48.70427703857422.dp)
    )
}

@Composable
fun FloraButtonHome6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_button_home_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(82.37637329101562.dp).requiredHeight(36.678531646728516.dp)
    )
}

@Composable
fun Group106(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.99998474121094.dp).requiredHeight(58.30844497680664.dp)
    )
}

@Composable
fun Frame162501(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(114.0.dp)
    )
}

@Composable
fun Have2Using3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle65(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_rectangle_64),
        modifier = modifier.requiredWidth(218.0.dp).requiredHeight(14.0.dp)
    )
}

@Composable
fun Text(modifier: Modifier = Modifier) {
    RelayText(
        content = "\n",
        fontSize = 20.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
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
            red = 149,
            green = 179,
            blue = 151
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
        modifier = modifier.requiredWidth(110.91458892822266.dp).requiredHeight(42.57858657836914.dp)
    )
}

@Composable
fun Snow1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_snow_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = -3.227071276066092f).requiredWidth(95.05103302001953.dp).requiredHeight(53.84394454956055.dp)
    )
}

@Composable
fun Bow2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_bow_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(144.79055786132812.dp).requiredHeight(81.44469451904297.dp)
    )
}

@Composable
fun Group115(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(225.2177734375.dp).requiredHeight(81.44469451904297.dp)
    )
}

@Composable
fun Frame162502(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(114.0.dp)
    )
}

@Composable
fun Have2Using4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
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
        clipToParent = false,
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(112.65612030029297.dp).requiredHeight(48.62001037597656.dp)
    )
}

@Composable
fun Red2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_red_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.graphicsLayer(rotationZ = -6.8852980717891015f).requiredWidth(97.46104431152344.dp).requiredHeight(79.5910873413086.dp)
    )
}

@Composable
fun Cup2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_cup_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = -15.996283941053932f).requiredWidth(115.6800537109375.dp).requiredHeight(65.35922241210938.dp)
    )
}

@Composable
fun Bow3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_bow_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = 23.414215229139057f).requiredWidth(163.3184356689453.dp).requiredHeight(91.86662292480469.dp)
    )
}

@Composable
fun Group120(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(263.1933288574219.dp).requiredHeight(162.03839111328125.dp)
    )
}

@Composable
fun Frame162503(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(114.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(556.0.dp).relayDropShadow(
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
fun SmallButton(modifier: Modifier = Modifier) {
    RelayText(
        content = "Small Button",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle68(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_rectangle_68),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Have5Using2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 5 | Using: 2",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun FloraButtonHome12(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_button_home_1_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(182.0.dp).requiredHeight(102.0.dp)
    )
}

@Composable
fun Frame162504(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(125.0.dp)
    )
}

@Composable
fun Have4Using2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 4 | Using: 1",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Star9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_star_9),
        modifier = modifier.requiredWidth(82.74191284179688.dp).requiredHeight(78.6922378540039.dp)
    )
}

@Composable
fun Frame162505(
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
        modifier = modifier.requiredWidth(149.0.dp).requiredHeight(125.0.dp)
    )
}

@Composable
fun Have2Using5(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 1",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Ellipse3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_ellipse_3),
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun Frame162506(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun Have2Using6(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Setting(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 149,
            green = 179,
            blue = 151
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
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun Frame162507(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun Have2Using7(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Setting1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 128,
            green = 22,
            blue = 22
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
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun Frame162508(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun Have1Using0(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 1 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
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
            red = 145,
            green = 23,
            blue = 23
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
        modifier = modifier.requiredWidth(44.620361328125.dp).requiredHeight(44.620361328125.dp).relayDropShadow(
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
fun Hat1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_hat_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(89.97221374511719.dp).requiredHeight(68.02777099609375.dp)
    )
}

@Composable
fun Group153(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(89.97221374511719.dp).requiredHeight(79.0000228881836.dp)
    )
}

@Composable
fun Frame162509(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun Frame54(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(491.0.dp).relayDropShadow(
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
fun Icon(modifier: Modifier = Modifier) {
    RelayText(
        content = "Icon",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle69(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_rectangle_69),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Have5Using3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 5 | Using: 2",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Shop22(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_shop_2_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(69.63158416748047.dp)
    )
}

@Composable
fun Frame162510(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(100.0.dp)
    )
}

@Composable
fun Have4Using3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 4 | Using: 1",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector8),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.571441650390625.dp,
                top = 0.0.dp,
                end = 10.285699844360352.dp,
                bottom = 15.338298797607422.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector9),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 10.826904296875.dp,
                end = 0.0.dp,
                bottom = 0.00011444091796875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.requiredWidth(36.0.dp).requiredHeight(44.210479736328125.dp)
    )
}

@Composable
fun Frame162511(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(100.0.dp)
    )
}

@Composable
fun Have2Using8(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 1",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector10),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 47.0.dp,
                top = 14.0.dp,
                end = 46.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Frame162512(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(100.0.dp)
    )
}

@Composable
fun Have2Using9(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector11),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 15.340087890625.dp,
                end = 0.0.dp,
                bottom = 39.659912109375.dp
            )
        ).requiredWidth(51.65250015258789.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun Frame162513(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(100.0.dp)
    )
}

@Composable
fun Have2Using10(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Star2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_star_2),
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(44.0.dp)
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
        radius = 2.0,
        content = content,
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun Frame162514(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(100.0.dp)
    )
}

@Composable
fun Have1Using1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 1 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector12),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_vector13),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.22222900390625.dp,
                top = 8.148193359375.dp,
                end = 20.370363235473633.dp,
                bottom = 20.370325088500977.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun Frame162515(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(100.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(411.0.dp).relayDropShadow(
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
fun Background(modifier: Modifier = Modifier) {
    RelayText(
        content = "Background",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle70(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_rectangle_70),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Have5Using4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 5 | Using: 2",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun FloraBg2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_flora_bg_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(133.0.dp).requiredHeight(255.0.dp)
    )
}

@Composable
fun Frame162519(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(315.0.dp)
    )
}

@Composable
fun Have4Using4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 4 | Using: 1",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Z555214942458944f4f29198b0d1e91c35ad51fb03e8f72(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_z5552149424589_44f4f29198b0d1e91c35ad51fb03e8f7_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(133.0.dp).requiredHeight(255.0.dp)
    )
}

@Composable
fun Frame162520(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(310.0.dp)
    )
}

@Composable
fun Have2Using11(modifier: Modifier = Modifier) {
    RelayText(
        content = "Have: 2 | Using: 0",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Z5567088375231Fe171d217e1379fb153ce5d62f7c44e52(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.inventory_1_z5567088375231_fe171d217e1379fb153ce5d62f7c44e5_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(133.0.dp).requiredHeight(255.0.dp)
    )
}

@Composable
fun Frame162521(
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
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(310.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(736.0.dp).relayDropShadow(
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
fun Font(modifier: Modifier = Modifier) {
    RelayText(
        content = "Font",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle71(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_rectangle_71),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Milonga(modifier: Modifier = Modifier) {
    RelayText(
        content = "Milonga",
        fontSize = 16.0.sp,
        fontFamily = milonga,
        height = 1.25.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun AaBbCcDd(modifier: Modifier = Modifier) {
    RelayText(
        content = "AaBbCcDd",
        fontSize = 16.0.sp,
        fontFamily = milonga,
        color = Color(
            alpha = 127,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.25.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Frame162516(
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
        modifier = modifier.requiredWidth(310.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun AaBbCcDd1(modifier: Modifier = Modifier) {
    RelayText(
        content = "AaBbCcDd",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.kurale,
        color = Color(
            alpha = 127,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4780000448226929.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Kurale(modifier: Modifier = Modifier) {
    RelayText(
        content = "Kurale",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.kurale,
        height = 1.4780000448226929.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Frame162517(
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
        modifier = modifier.requiredWidth(310.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun AaBbCcDd2(modifier: Modifier = Modifier) {
    RelayText(
        content = "AaBbCcDd",
        fontSize = 16.0.sp,
        fontFamily = kyivTypeSerif,
        color = Color(
            alpha = 127,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(350.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun KyivTypeSerif(modifier: Modifier = Modifier) {
    RelayText(
        content = "Kyiv*Type Serif",
        fontSize = 16.0.sp,
        fontFamily = kyivTypeSerif,
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame162518(
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
        modifier = modifier.requiredWidth(310.0.dp).requiredHeight(30.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(203.0.dp).relayDropShadow(
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
fun Rectangle72(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.inventory_1_rectangle_72),
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
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(2594.0.dp)
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
