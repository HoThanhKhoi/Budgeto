package com.example.budgeto.screens.homepagescreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
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
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.budgeto.R
import com.example.budgeto.screens.openingscreen.OpeningScreenExpensesInputScreen
import com.example.budgeto.screensfonts.inter
import com.example.budgeto.screensfonts.kurale
import com.example.budgeto.viewmodel.AccountViewModel
import com.example.budgeto.viewmodel.TransactionViewModel
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomepageScreen(
    onProfileButtonTapped: () -> Unit = {},
    onAccountsButtonTapped: () -> Unit = {},
    onSettingButtonTapped: () -> Unit = {},
    transactionViewModel: TransactionViewModel,
    accountViewModel: AccountViewModel = hiltViewModel(),
    onNavigateToHistoryScreen: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val bottomSheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    val coroutineScope = rememberCoroutineScope()

    var isBottomSheetVisible by remember { mutableStateOf(true) }

    val userMoneyInfo by accountViewModel.userMoneyInfo // Observe userMoneyInfo

    LaunchedEffect(Unit) {
        // Fetch user money info when the composable is loaded
        accountViewModel.fetchUserMoneyInfo()
    }

    LaunchedEffect(isBottomSheetVisible) {
        if (isBottomSheetVisible) {
            coroutineScope.launch {
                bottomSheetState.show()
            }
        }
    }
    // Main content of the homepage
    Homepage02(
        onProfileButtonTapped = onProfileButtonTapped,
        onAccountsButtonTapped = onAccountsButtonTapped,
        onSettingButtonTapped = onSettingButtonTapped,
        onNewOperationButtonTapped = {
            coroutineScope.launch {
                isBottomSheetVisible = true
                bottomSheetState.show()
            }
        },
        balance = userMoneyInfo?.totalBalance ?: 0.0,
        modifier = modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f),
    )

    if (isBottomSheetVisible) {
        ModalBottomSheet(
            sheetState = bottomSheetState,
            onDismissRequest = {
                coroutineScope.launch {
                    isBottomSheetVisible = false
                    bottomSheetState.hide()
                }
            },
        ) {
            OpeningScreenExpensesInputScreen(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                onCloseCalculator = {
                    isBottomSheetVisible = false
                },
                transactionViewModel = transactionViewModel,
                onNavigateToHistoryScreen = onNavigateToHistoryScreen
            )
        }
    }
}


@Composable
fun Homepage02(
    modifier: Modifier = Modifier,
    onNewOperationButtonTapped: () -> Unit = {},
    onBudgetoPassButtonTapped: () -> Unit = {},
    onEventsButtonTapped: () -> Unit = {},
    onLeftBannerTapped: () -> Unit = {},
    onRightBannerTapped: () -> Unit = {},
    onMainBannerTapped: () -> Unit = {},
    onAccountsButtonTapped: () -> Unit = {},
    onDailyMissionButtonTapped: () -> Unit = {},
    onSettingButtonTapped: () -> Unit = {},
    onRankButtonTapped: () -> Unit = {},
    onProfileButtonTapped: () -> Unit = {},
    balance: Double
) {
    TopLevel(
        modifier = modifier
    ) {

        Statistics(
            modifier = modifier
                .align(Alignment.Center)
                .padding(top = 450.dp)
        ) {
            Frame44(
                onNewOperationButtonTapped = onNewOperationButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 55.0.dp
                    )
                )
            ) {
                Ellipse147(
                    modifier = Modifier
                        .boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                        .columnWeight(1.0f)
                )
                OperationIcon(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 21.0.dp
                        )
                    )
                )
            }
            Frame93(
                onBudgetoPassButtonTapped = onBudgetoPassButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 27.0.dp,
                        y = 76.0.dp
                    )
                )
            ) {
                Group33602(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 3.0.dp,
                            y = 6.0.dp
                        )
                    )
                ) {
                    Asset61()
                    B(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 27.0614013671875.dp,
                                y = 5.178466796875.dp
                            )
                        )
                    )
                }
            }
            Frame94(
                onEventsButtonTapped = onEventsButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 325.0.dp,
                        y = 76.0.dp
                    )
                )
            ) {
                Frame95 {
                    Event1(
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
        }

        WishBanner(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(top = 25.dp)
        ) {
            Class01(
                onLeftBannerTapped = onLeftBannerTapped,
                modifier = modifier
                    .align(Alignment.CenterStart)
                    .absoluteOffset(x = -30.dp, y = 0.dp)
            ) {
                Vector317(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 35.5858159542241.dp,
                            y = 85.00000026226833.dp
                        )
                    )
                )
                FloraBg3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 12.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            Class3(
                onRightBannerTapped = onRightBannerTapped,
                modifier = modifier
                    .align(Alignment.CenterEnd)
                    .absoluteOffset(x = 30.dp, y = 0.dp)
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
                Z5567088375231Fe171d217e1379fb153ce5d62f7c44e52()
            }
            Class2(
                onMainBannerTapped = onMainBannerTapped,
                modifier = modifier
                    .align(Alignment.Center)
                    .padding()
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
                                    x = 5.4852858781814575.dp,
                                    y = 10.999964833259583.dp
                                )
                            )
                        )
                    }
                }
                Class4(
                    modifier = modifier
                        .align(Alignment.Center)
                ) {
                    Z555214942458944f4f29198b0d1e91c35ad51fb03e8f72(
                        modifier = modifier
                            .align(Alignment.Center)
                    )
                    Frame38(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = -0.5.dp,
                                y = 210.0.dp
                            )
                        )
                    ) {
                        XMas2024(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 10.0.dp,
                                    y = 8.0.dp
                                )
                            )
                        )
                        Frame39(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 224.0.dp,
                                    y = 5.0.dp
                                )
                            )
                        ) {
                            Arrow3(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 5.4852858781814575.dp,
                                        y = 10.999964833259583.dp
                                    )
                                )
                            )
                        }
                    }
                    Group142(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -66.81585693359375.dp,
                                y = -9.745071411132812.dp
                            )
                        )
                    ) {
                        Frame45(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopCenter,
                                offset = DpOffset(
                                    x = 14.712857524498133.dp,
                                    y = 51.383334375559.dp
                                )
                            )
                        ) {}
                        Group159(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 44.30201552187964.dp,
                                    y = 95.36620771004755.dp
                                )
                            )
                        ) {
                            Frame40(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 37.76832580566406.dp,
                                        y = 28.75547981262207.dp
                                    )
                                )
                            ) {
                                Rectangle63(
                                    modifier = Modifier.boxAlign(
                                        alignment = Alignment.TopStart,
                                        offset = DpOffset(
                                            x = -9.774292464626342.dp,
                                            y = 70.85690307617188.dp
                                        )
                                    )
                                )
                                Text(
                                    modifier = Modifier.boxAlign(
                                        alignment = Alignment.TopStart,
                                        offset = DpOffset(
                                            x = 10.44931579076001.dp,
                                            y = 37.33171081542969.dp
                                        )
                                    )
                                )
                            }
                            Snow1(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 23.176008914453092.dp,
                                        y = 6.870609553655953.dp
                                    )
                                )
                            )
                            Bow2(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 65.66575067729082.dp,
                                        y = 0.0.dp
                                    )
                                )
                            )
                        }
                        Group144(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 34.38688745662978.dp,
                                    y = 73.93393839043722.dp
                                )
                            )
                        ) {
                            Group130(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 56.6480712890625.dp,
                                        y = 13.620613068574471.dp
                                    )
                                )
                            ) {
                                Frame41 {
                                    Text1(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 22.29071044921875.dp,
                                                y = 43.91161091358606.dp
                                            )
                                        )
                                    )
                                }
                            }
                            Red3(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 39.633788306807105.dp,
                                        y = 7.778307918694168.dp
                                    )
                                )
                            )
                        }
                        Bow1(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 109.04118263743021.dp,
                                    y = 56.800988080195566.dp
                                )
                            )
                        )
                        Group116(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 9.721176886509284.dp,
                                    y = 16.572480285381744.dp
                                )
                            )
                        ) {
                            Red1(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 59.810148543369394.dp,
                                        y = 11.153043482263001.dp
                                    )
                                )
                            )
                            Cup1(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 54.07527888479149.dp,
                                        y = 13.796802250499354.dp
                                    )
                                )
                            )
                        }
                    }
                    Group143(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -25.753868751396794.dp,
                                y = 106.00938602954852.dp
                            )
                        )
                    ) {
                        Group129(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 44.834964138985896.dp,
                                    y = 41.94184931480993.dp
                                )
                            )
                        ) {
                            Frame42 {
                                Text2(
                                    modifier = Modifier.boxAlign(
                                        alignment = Alignment.TopStart,
                                        offset = DpOffset(
                                            x = 22.047607421875.dp,
                                            y = 43.165257708815716.dp
                                        )
                                    )
                                )
                            }
                        }
                        Mistletoe3(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 33.703446695216.dp,
                                    y = 8.414646877346172.dp
                                )
                            )
                        )
                        Mistletoe4(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 82.22079686578633.dp,
                                    y = 55.41504729633937.dp
                                )
                            )
                        )
                        Snow2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 89.43201746533475.dp,
                                    y = 25.02169573027831.dp
                                )
                            )
                        )
                    }
                    Frame46(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 71.0.dp,
                                y = 24.0.dp
                            )
                        )
                    ) {
                        Setting(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 85.0.dp,
                                    y = 41.0.dp
                                )
                            )
                        ) {}
                        Group138(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 14.18603515625.dp,
                                    y = 43.5439453125.dp
                                )
                            )
                        ) {
                            Ellipse37()
                        }
                        Star9(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 13.00592041015625.dp,
                                    y = 6.844940185546875.dp
                                )
                            )
                        )
                        Button(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 50.13232421875.dp,
                                    y = 12.74609375.dp
                                )
                            )
                        ) {
                            Ellipse3()
                        }
                        Ellipse2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 51.0.dp,
                                    y = 48.0.dp
                                )
                            )
                        )
                        Setting1(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 85.0.dp,
                                    y = 9.0.dp
                                )
                            )
                        ) {}
                    }
                    Frame47(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                x = 56.0.dp,
                                y = 105.0.dp
                            )
                        )
                    ) {}
                    Group160(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 137.0.dp,
                                y = 114.0.dp
                            )
                        )
                    ) {
                        History(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 16.0.dp,
                                    y = 1.703125.dp
                                )
                            )
                        ) {
                            Vector3(modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f))
                            Vector4(modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f))
                        }
                        Vector(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector1(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Store(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)) {
                            Vector5(
                                modifier = Modifier
                                    .boxAlign(
                                        alignment = Alignment.TopStart,
                                        offset = DpOffset(
                                            x = -0.5.dp,
                                            y = -0.5.dp
                                        )
                                    )
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                            Vector6(
                                modifier = Modifier
                                    .boxAlign(
                                        alignment = Alignment.TopStart,
                                        offset = DpOffset(
                                            x = -0.50030517578125.dp,
                                            y = -0.5.dp
                                        )
                                    )
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                        Vector2(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Level(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 28.0.dp,
                                    y = 17.5947265625.dp
                                )
                            )
                        ) {
                            Star2(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = 2.6162109375.dp,
                                        y = 2.308319091796875.dp
                                    )
                                )
                            )
                        }
                        Arrow4(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 73.15422958551198.dp,
                                    y = 28.1147238173794.dp
                                )
                            )
                        )
                        Star12(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 101.8070068359375.dp,
                                    y = 19.91107177734375.dp
                                )
                            )
                        )
                    }
                    Group161(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 130.0.dp,
                                y = 171.0.dp
                            )
                        )
                    ) {
                        Frame48(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopCenter,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.0.dp
                                )
                            )
                        ) {}
                        TypefaceKurale(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 10.0.dp,
                                    y = 3.0.dp
                                )
                            )
                        )
                    }
                }
            }
            WishBanner(
                modifier = modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 35.dp, bottom = 300.dp)
            )
        }
        Hero(
            modifier = modifier
                .align(Alignment.TopCenter)
                .padding(top = 130.dp)
        ) {
            Frame35(
                onAccountsButtonTapped = onAccountsButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 132.0.dp,
                        y = 5.0.dp
                    )
                )
            ) {
                Rectangle64(
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
                    ),
                    balance = balance
                )
            }
            Group1(
                onDailyMissionButtonTapped = onDailyMissionButtonTapped,
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
                Button1(
                    modifier = modifier
                        .align(Alignment.TopStart)
                        .padding(99.dp, 75.dp)
                ) {
                    Ellipse4(
                        modifier = modifier
                            .fillMaxSize()
                    )
                    Arrow1(
                        modifier = modifier
                            .align(Alignment.Center)
                            .fillMaxSize()
                    )
                }
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
        TopNav(
            modifier = modifier
                .align(Alignment.TopCenter)
                .padding(top = 20.dp)
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
                Rank(
                    onRankButtonTapped = onRankButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 178.0.dp,
                            y = 5.0.dp
                        )
                    )
                ) {
                    Cup(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 18.0.dp,
                                y = 5.0.dp
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
                    Cup1 {
                        Vector15(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector16(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector17(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector18(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector19(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector20(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector21(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector22(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector23(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector24(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector25(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector26(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector27(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector28(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector29(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector30(
                            modifier = Modifier
                                .boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -2.0.dp,
                                        y = -2.0.dp
                                    )
                                )
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector31(
                            modifier = Modifier
                                .boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -2.0.dp,
                                        y = -2.0.dp
                                    )
                                )
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector32(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector33(
                            modifier = Modifier
                                .boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -1.0.dp,
                                        y = -1.0.dp
                                    )
                                )
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector34(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector35(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector36(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector37(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector38(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector39(
                            modifier = Modifier
                                .boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -1.0.dp,
                                        y = -1.0.dp
                                    )
                                )
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        )
                        Vector40(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                        Vector41(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f))
                    }
                }
                Profile(
                    onProfileButtonTapped = onProfileButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                ) {
                    Abrabra(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 39.0.dp,
                                y = 6.0.dp
                            )
                        )
                    )
                    Avatar {
                        Layer2(modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)) {
                            Class1(modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)) {
                                Vector42(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                Vector43(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                Vector44(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                Vector45(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                ClipPathGroup(
                                    modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)
                                ) {
                                    A(modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)) {
                                        Vector53(
                                            modifier = Modifier
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                    }
                                    Group(modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)) {
                                        Vector54(
                                            modifier = Modifier
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                        Vector55(
                                            modifier = Modifier
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                        Vector56(
                                            modifier = Modifier
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                        Vector57(
                                            modifier = Modifier
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                        Vector58(
                                            modifier = Modifier
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                        Vector59(
                                            modifier = Modifier
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                        Vector60(
                                            modifier = Modifier
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                    }
                                }
                                Vector46(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                Vector47(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                ClipPathGroup1(
                                    modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)
                                ) {
                                    B(modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)) {
                                        Vector61(
                                            modifier = Modifier
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                    }
                                    Group1(modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)) {
                                        Vector62(
                                            modifier = Modifier
                                                .boxAlign(
                                                    alignment = Alignment.TopStart,
                                                    offset = DpOffset(
                                                        x = 0.0.dp,
                                                        y = 0.24770355224609375.dp
                                                    )
                                                )
                                                .rowWeight(1.0f)
                                                .columnWeight(1.0f)
                                        )
                                    }
                                }
                                Vector48(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                Vector49(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                Vector50(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                Vector51(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                                Vector52(modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f))
                            }
                        }
                    }
                }
            }
            Setting2(
                onSettingButtonTapped = onSettingButtonTapped,
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
                    Vector63(modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f))
                }
            }
            B1(
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
                Ellipse6()
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
            Level1(
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
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun Homepage02Preview() {
    MaterialTheme {
        RelayContainer {
            Homepage02(
                onNewOperationButtonTapped = {},
                onBudgetoPassButtonTapped = {},
                onEventsButtonTapped = {},
                onLeftBannerTapped = {},
                onRightBannerTapped = {},
                onMainBannerTapped = {},
                onAccountsButtonTapped = {},
                onDailyMissionButtonTapped = {},
                onSettingButtonTapped = {},
                onRankButtonTapped = {},
                onProfileButtonTapped = {},
                balance = 0.0,
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Ellipse147(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_ellipse_147),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.0.dp,
                    top = 24.0.dp,
                    end = 0.0.dp,
                    bottom = 26.0.dp
                )
            )
            .requiredWidth(32.0.dp)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun OperationIcon(modifier: Modifier = Modifier) {
    RelayText(
        content = "+",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .requiredWidth(20.0.dp)
            .requiredHeight(36.0.dp)
            .wrapContentHeight(
                align = Alignment.CenterVertically,
                unbounded = true
            )
    )
}

@Composable
fun Frame44(
    onNewOperationButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier
            .tappable(onTap = onNewOperationButtonTapped)
            .requiredWidth(190.0.dp)
            .requiredHeight(82.0.dp)
    )
}

@Composable
fun Asset61(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_asset_6_1),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(33.53312301635742.dp)
            .requiredHeight(31.82634735107422.dp)
    )
}

@Composable
fun B(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 8.0.sp,
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
        maxLines = -1,
        modifier = modifier
            .requiredWidth(3.212754487991333.dp)
            .requiredHeight(5.823117256164551.dp)
    )
}

@Composable
fun Group33602(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(33.53312301635742.dp)
            .requiredHeight(31.82634735107422.dp)
    )
}

@Composable
fun Frame93(
    onBudgetoPassButtonTapped: () -> Unit,
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
        modifier = modifier
            .tappable(onTap = onBudgetoPassButtonTapped)
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Event1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_event_1),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(37.0.dp)
            .requiredHeight(36.0.dp)
    )
}

@Composable
fun Frame95(
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
        modifier = modifier
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
    )
}

@Composable
fun Frame94(
    onEventsButtonTapped: () -> Unit,
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
            .tappable(onTap = onEventsButtonTapped)
            .requiredWidth(40.0.dp)
            .requiredHeight(40.0.dp)
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
        modifier = modifier
            .requiredWidth(392.0.dp)
            .requiredHeight(161.0.dp)
    )
}

@Composable
fun Vector317(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector_317),
        modifier = modifier
            .requiredWidth(6.0.dp)
            .requiredHeight(12.0.dp)
    )
}

@Composable
fun FloraBg3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_flora_bg_3),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(410.0.dp)
            .requiredHeight(888.0.dp)
    )
}

@Composable
fun Class01(
    onLeftBannerTapped: () -> Unit,
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
        modifier = modifier
            .tappable(onTap = onLeftBannerTapped)
            .requiredWidth(55.0.dp)
            .requiredHeight(183.0.dp)
    )
}

@Composable
fun Vector318(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector_318),
        modifier = modifier
            .requiredWidth(6.0.dp)
            .requiredHeight(12.0.dp)
    )
}

@Composable
fun Z5567088375231Fe171d217e1379fb153ce5d62f7c44e52(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_z5567088375231_fe171d217e1379fb153ce5d62f7c44e5_2),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(325.0.dp)
            .requiredHeight(703.0.dp)
    )
}

@Composable
fun Class3(
    onRightBannerTapped: () -> Unit,
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
        modifier = modifier
            .tappable(onTap = onRightBannerTapped)
            .requiredWidth(55.0.dp)
            .requiredHeight(183.0.dp)
    )
}

@Composable
fun Christmas(modifier: Modifier = Modifier) {
    RelayText(
        content = "Christmas",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Arrow2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_arrow_2),
        modifier = modifier
            .requiredWidth(12.0.dp)
            .requiredHeight(0.0.dp)
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
        modifier = modifier
            .requiredWidth(25.0.dp)
            .requiredHeight(25.0.dp)
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
        modifier = modifier
            .requiredWidth(257.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Z555214942458944f4f29198b0d1e91c35ad51fb03e8f72(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_z5552149424589_44f4f29198b0d1e91c35ad51fb03e8f7_2),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(284.0.dp)
            .requiredHeight(614.0.dp)
    )
}

@Composable
fun XMas2024(modifier: Modifier = Modifier) {
    RelayText(
        content = "X-Mas 2024",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Arrow3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_arrow_3),
        modifier = modifier
            .requiredWidth(12.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Frame39(
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
        modifier = modifier
            .requiredWidth(25.0.dp)
            .requiredHeight(25.0.dp)
    )
}

@Composable
fun Frame38(
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
            .requiredWidth(257.0.dp)
            .requiredHeight(35.0.dp)
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
        modifier = modifier
            .graphicsLayer(rotationZ = 9.89433630752849f)
            .requiredWidth(80.26248168945312.dp)
            .requiredHeight(34.63959884643555.dp)
    )
}

@Composable
fun Rectangle63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_rectangle_63),
        modifier = modifier
            .requiredWidth(217.59122848510742.dp)
            .requiredHeight(47.01435661315918.dp)
    )
}

@Composable
fun Text(modifier: Modifier = Modifier) {
    RelayText(
        content = "\n",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame40(
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
        modifier = modifier
            .graphicsLayer(rotationZ = -0.0f)
            .requiredWidth(90.55841064453125.dp)
            .requiredHeight(34.764129638671875.dp)
    )
}

@Composable
fun Snow1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_snow_1),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .graphicsLayer(rotationZ = -3.227071276066092f)
            .requiredWidth(77.6063003540039.dp)
            .requiredHeight(43.961952209472656.dp)
    )
}

@Composable
fun Bow2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_bow_1),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .graphicsLayer(rotationZ = -0.0f)
            .requiredWidth(118.21710968017578.dp)
            .requiredHeight(66.49712371826172.dp)
    )
}

@Composable
fun Group159(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .graphicsLayer(rotationZ = 8.753872748801426f)
            .requiredWidth(183.88262939453125.dp)
            .requiredHeight(66.49712371826172.dp)
    )
}

@Composable
fun Text1(modifier: Modifier = Modifier) {
    RelayText(
        content = "\n",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame41(
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
            .requiredWidth(94.21621175556584.dp)
            .requiredHeight(45.95239131246183.dp)
    )
}

@Composable
fun Group130(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier
            .requiredWidth(94.21621175556584.dp)
            .requiredHeight(45.95239131246183.dp)
    )
}

@Composable
fun Red3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_red_3),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .graphicsLayer(rotationZ = -6.8852980717891015f)
            .requiredWidth(134.31910705566406.dp)
            .requiredHeight(75.68232727050781.dp)
    )
}

@Composable
fun Group144(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .graphicsLayer(rotationZ = -7.281224353613574f)
            .requiredWidth(145.8953399658203.dp)
            .requiredHeight(91.23893737792969.dp)
    )
}

@Composable
fun Bow1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_bow_1),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .graphicsLayer(rotationZ = 37.91902116177443f)
            .requiredWidth(116.35713195800781.dp)
            .requiredHeight(65.45088195800781.dp)
    )
}

@Composable
fun Red1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_red_3),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .graphicsLayer(rotationZ = -6.8852980717891015f)
            .requiredWidth(192.59548950195312.dp)
            .requiredHeight(108.51825714111328.dp)
    )
}

@Composable
fun Cup1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_cup_1),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .graphicsLayer(rotationZ = -15.996283941053932f)
            .requiredWidth(81.56813049316406.dp)
            .requiredHeight(46.08599090576172.dp)
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
        modifier = modifier
            .graphicsLayer(rotationZ = 9.89433630752849f)
            .requiredWidth(204.2158966064453.dp)
            .requiredHeight(130.82435607910156.dp)
    )
}

@Composable
fun Group142(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(233.22698974609375.dp)
            .requiredHeight(175.4685821533203.dp)
    )
}

@Composable
fun Text2(modifier: Modifier = Modifier) {
    RelayText(
        content = "\n",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
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
            .requiredWidth(91.94988649112645.dp)
            .requiredHeight(44.30467576466981.dp)
    )
}

@Composable
fun Group129(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier
            .graphicsLayer(rotationZ = 11.332718224376748f)
            .requiredWidth(88.52732849121094.dp)
            .requiredHeight(33.98442459106445.dp)
    )
}

@Composable
fun Mistletoe3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_mistletoe_3),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .graphicsLayer(rotationZ = 11.332718224376748f)
            .requiredWidth(90.59400939941406.dp)
            .requiredHeight(49.90347671508789.dp)
    )
}

@Composable
fun Mistletoe4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_mistletoe_3),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .graphicsLayer(rotationZ = 11.332718224376748f)
            .requiredWidth(90.59400939941406.dp)
            .requiredHeight(50.671226501464844.dp)
    )
}

@Composable
fun Snow2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.homepage_02_snow_1),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .graphicsLayer(rotationZ = 17.897964967524214f)
            .requiredWidth(89.91682434082031.dp)
            .requiredHeight(50.935523986816406.dp)
    )
}

@Composable
fun Group143(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .graphicsLayer(rotationZ = -18.185553849107468f)
            .requiredWidth(184.99993896484375.dp)
            .requiredHeight(114.4934310913086.dp)
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
        modifier = modifier
            .requiredWidth(18.0.dp)
            .requiredHeight(20.0.dp)
    )
}

@Composable
fun Ellipse37(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_ellipse_37),
        modifier = modifier
            .requiredWidth(17.231096267700195.dp)
            .requiredHeight(17.231096267700195.dp)
    )
}

@Composable
fun Group138(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(17.231096267700195.dp)
            .requiredHeight(17.231096267700195.dp)
    )
}

@Composable
fun Star9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_star_9),
        modifier = modifier
            .requiredWidth(34.0.dp)
            .requiredHeight(33.0.dp)
    )
}

@Composable
fun Ellipse3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_ellipse_3),
        modifier = modifier
            .requiredWidth(15.552168846130371.dp)
            .requiredHeight(15.552168846130371.dp)
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
        modifier = modifier
            .requiredWidth(15.552168846130371.dp)
            .requiredHeight(15.552168846130371.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_ellipse_2),
        modifier = modifier
            .requiredWidth(13.0.dp)
            .requiredHeight(13.0.dp)
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
            .requiredWidth(18.0.dp)
            .requiredHeight(17.0.dp)
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
        strokeWidth = 2.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier
            .requiredWidth(114.0.dp)
            .requiredHeight(69.0.dp)
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
        strokeWidth = 2.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier
            .requiredWidth(144.0.dp)
            .requiredHeight(55.0.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector3),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.5439453125.dp,
                    top = 0.520263671875.dp,
                    end = 0.5438909530639648.dp,
                    bottom = 0.5202751159667969.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector4),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 3.80743408203125.dp,
                    top = 2.601348876953125.dp,
                    end = 5.98310661315918.dp,
                    bottom = 5.722975254058838.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .requiredWidth(13.054054260253906.dp)
            .requiredHeight(12.486486434936523.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 51.729736328125.dp,
                    top = 6.8108062744140625.dp,
                    end = 62.4324254989624.dp,
                    bottom = 27.811078548431396.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector1),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 51.16217041015625.dp,
                    top = 2.8378448486328125.dp,
                    end = 61.8648567199707.dp,
                    bottom = 32.35160732269287.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector5),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 5.29730224609375.dp,
                    top = 1.2770233154296875.dp,
                    end = 5.297292232513428.dp,
                    bottom = 5.746625900268555.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector6),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 2.64862060546875.dp,
                    top = 4.4695892333984375.dp,
                    end = 2.076650619506836.dp,
                    bottom = 1.2770328521728516.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 84.0.dp,
                    top = 0.0.dp,
                    end = 25.054054260253906.dp,
                    bottom = 26.675938606262207.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector2),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.0.dp,
                    top = 22.134765625.dp,
                    end = 109.62162113189697.dp,
                    bottom = 7.9465789794921875.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Star2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_star_2),
        modifier = modifier
            .requiredWidth(21.27959632873535.dp)
            .requiredHeight(21.27959632873535.dp)
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
        modifier = modifier
            .requiredWidth(21.27959632873535.dp)
            .requiredHeight(21.27959632873535.dp)
    )
}

@Composable
fun Arrow4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_arrow_4),
        modifier = modifier
            .requiredWidth(8.366100311279297.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Star12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_star_12),
        modifier = modifier
            .requiredWidth(28.945945739746094.dp)
            .requiredHeight(27.810810089111328.dp)
    )
}

@Composable
fun Group160(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(124.9459457397461.dp)
            .requiredHeight(42.00026321411133.dp)
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
            red = 149,
            green = 179,
            blue = 151
        ),
        isStructured = false,
        radius = 5.0,
        strokeWidth = 2.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier
            .requiredWidth(131.0.dp)
            .requiredHeight(29.0.dp)
    )
}

@Composable
fun TypefaceKurale(modifier: Modifier = Modifier) {
    RelayText(
        content = "Typeface: Kurale",
        fontSize = 15.0.sp,
        fontFamily = kurale,
        height = 1.4780000050862627.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Group161(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier
            .requiredWidth(131.0.dp)
            .requiredHeight(29.0.dp)
    )
}

@Composable
fun Class4(
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
        modifier = modifier
            .requiredWidth(282.0.dp)
            .requiredHeight(257.0.dp)
    )
}

@Composable
fun Class2(
    onMainBannerTapped: () -> Unit,
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
        modifier = modifier
            .tappable(onTap = onMainBannerTapped)
            .requiredWidth(282.0.dp)
            .requiredHeight(257.0.dp)
    )
}

@Composable
fun WishBanner(modifier: Modifier = Modifier) {
    RelayText(
        content = "Wish Banner",
        fontSize = 16.0.sp,
        fontFamily = inter,
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
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(330.0.dp)
    )
}

@Composable
fun Rectangle64(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_rectangle_64),
        modifier = modifier
            .requiredWidth(218.0.dp)
            .requiredHeight(14.0.dp)
    )
}

@Composable
fun OverallBalance(modifier: Modifier = Modifier) {
    RelayText(
        content = "Overall Balance",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class101000000VN(
    balance: Double,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "${String.format("%,.0f", balance)} VNĐ",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame35(
    onAccountsButtonTapped: () -> Unit,
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
            .tappable(onTap = onAccountsButtonTapped)
            .requiredWidth(211.0.dp)
            .requiredHeight(81.0.dp)
    )
}

@Composable
fun DailyMission(modifier: Modifier = Modifier) {
    RelayText(
        content = "Daily\nMission",
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
fun Ellipse4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_ellipse_4),
        modifier = modifier
            .requiredWidth(38.0.dp)
            .requiredHeight(38.0.dp)
    )
}

@Composable
fun Arrow1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_arrow_1),
        modifier = modifier
            .requiredWidth(20.0.dp)
            .requiredHeight(20.0.dp)
            .align(Alignment.Center)
            .align(Alignment.Center)
    )
}

@Composable
fun Button1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(30.0.dp)
            .requiredHeight(30.0.dp)
    )
}

@Composable
fun Group1(
    onDailyMissionButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .tappable(onTap = onDailyMissionButtonTapped)
            .requiredWidth(124.0.dp)
            .requiredHeight(88.0.dp)
    )
}

@Composable
fun EI(modifier: Modifier = Modifier) {
    RelayText(
        content = "E/I",
        fontSize = 12.0.sp,
        fontFamily = inter,
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
        modifier = modifier
            .requiredWidth(343.0.dp)
            .requiredHeight(99.0.dp)
    )
}


@Composable
fun Class993(modifier: Modifier = Modifier) {
    RelayText(
        content = "993",
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
        modifier = modifier
            .requiredWidth(84.0.dp)
            .requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector15),
        modifier = modifier
            .padding(paddingValues = PaddingValues(all = 1.09375.dp))
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector16(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector16),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 12.03125.dp,
                    top = 24.609375.dp,
                    end = 12.03125.dp,
                    bottom = 4.921875.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector17(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector17),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 11.2109375.dp,
                    top = 30.078125.dp,
                    end = 11.2109375.dp,
                    bottom = 4.1015625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector18),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 14.21875.dp,
                    top = 25.9765625.dp,
                    end = 14.21875.dp,
                    bottom = 6.015625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector19(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector19),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 16.078125.dp,
                    top = 18.73046875.dp,
                    end = 16.050780296325684.dp,
                    bottom = 11.7578125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector20(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector20),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 18.1015625.dp,
                    top = 18.73046875.dp,
                    end = 16.078125.dp,
                    bottom = 11.7578125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector21),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 13.3984375.dp,
                    top = 22.96875.dp,
                    end = 13.3984375.dp,
                    bottom = 10.390625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector22),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 18.59375.dp,
                    top = 22.96875.dp,
                    end = 13.3984375.dp,
                    bottom = 10.390625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector23),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 14.765625.dp,
                    top = 19.4140625.dp,
                    end = 14.765625.dp,
                    bottom = 13.9453125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector24),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 18.07421875.dp,
                    top = 19.4140625.dp,
                    end = 14.765624523162842.dp,
                    bottom = 13.9453125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector25),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 12.8515625.dp,
                    top = 24.0625.dp,
                    end = 12.8515625.dp,
                    bottom = 10.390625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector26(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector26),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 20.234375.dp,
                    top = 24.0625.dp,
                    end = 12.8515625.dp,
                    bottom = 10.390625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector27(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector27),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 14.21875.dp,
                    top = 18.8671875.dp,
                    end = 14.21875.dp,
                    bottom = 14.765625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector28(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector28),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 14.21875.dp,
                    top = 18.8671875.dp,
                    end = 14.21875.dp,
                    bottom = 14.765625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector29(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector29),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 18.8671875.dp,
                    top = 18.8671875.dp,
                    end = 14.21875.dp,
                    bottom = 14.765625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector30(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector30),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 21.328125.dp,
                    top = 10.1171875.dp,
                    end = 8.4765625.dp,
                    bottom = 19.4140625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector31(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector31),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 8.4765625.dp,
                    top = 10.1171875.dp,
                    end = 21.328125.dp,
                    bottom = 19.4140625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector32(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector32),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 12.03125.dp,
                    top = 7.9296875.dp,
                    end = 12.03125.dp,
                    bottom = 15.3125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector33(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector33),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 13.671875.dp,
                    top = 8.75.dp,
                    end = 21.328125.dp,
                    bottom = 20.78125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector34(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector34),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 18.45703125.dp,
                    top = 7.9296875.dp,
                    end = 12.03125.dp,
                    bottom = 15.3125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector35),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 11.2109375.dp,
                    top = 7.9296875.dp,
                    end = 11.2109375.dp,
                    bottom = 26.25.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector36),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 21.6015625.dp,
                    top = 7.9296875.dp,
                    end = 11.2109375.dp,
                    bottom = 26.25.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector37(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector37),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 10.390625.dp,
                    top = 6.8359375.dp,
                    end = 10.390625.dp,
                    bottom = 27.0703125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector38(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector38),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 22.421875.dp,
                    top = 6.8359375.dp,
                    end = 10.390625.dp,
                    bottom = 27.0703125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector39(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector39),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 13.671875.dp,
                    top = 15.421875.dp,
                    end = 21.328125.dp,
                    bottom = 18.949218928813934.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector40(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector40),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 12.16796875.dp,
                    top = 5.359375.dp,
                    end = 19.8515625.dp,
                    bottom = 26.660155773162842.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector41(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector41),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 15.16259765625.dp,
                    top = 11.087890625.dp,
                    end = 15.189902782440186.dp,
                    bottom = 19.4444637298584.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .requiredWidth(35.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Rank(
    onRankButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .tappable(onTap = onRankButtonTapped)
            .requiredWidth(102.0.dp)
            .requiredHeight(35.0.dp)
    )
}

@Composable
fun Abrabra(modifier: Modifier = Modifier) {
    RelayText(
        content = "Abrabra",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector42(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector42),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 8.89776611328125.dp,
                    top = 4.177520751953125.dp,
                    end = 8.561704635620117.dp,
                    bottom = 8.968406677246094.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector43(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector43),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector44(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector44),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 4.2315673828125.dp,
                    top = 19.16301727294922.dp,
                    end = 4.3703765869140625.dp,
                    bottom = 0.0001678466796875.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector45(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector45),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 4.2315673828125.dp,
                    top = 23.332611083984375.dp,
                    end = 4.3703765869140625.dp,
                    bottom = 0.00017309188842773438.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector53(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector53),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector54(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector54),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.0.dp,
                    top = 0.14318084716796875.dp,
                    end = 15.75291395187378.dp,
                    bottom = 5.036615967750549.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector55(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector55),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.7529296875.dp,
                    top = 3.23272705078125.dp,
                    end = 14.99998426437378.dp,
                    bottom = 1.947069764137268.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector56(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector56),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 4.333984375.dp,
                    top = 3.3897857666015625.dp,
                    end = 11.418928861618042.dp,
                    bottom = 1.7900091409683228.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector57(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector57),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 8.10772705078125.dp,
                    top = 5.179801940917969.dp,
                    end = 7.645186185836792.dp,
                    bottom = 0.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector58(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector58),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 11.8990478515625.dp,
                    top = 3.1455307006835938.dp,
                    end = 3.8538671731948853.dp,
                    bottom = 2.0342642068862915.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector59(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector59),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 15.498046875.dp,
                    top = 3.2252960205078125.dp,
                    end = 0.254866361618042.dp,
                    bottom = 1.9545007944107056.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector60(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector60),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 15.7529296875.dp,
                    top = 0.0.dp,
                    end = 0.0.dp,
                    bottom = 5.179794907569885.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 2.3524169921875.dp,
                    top = 0.9408340454101562.dp,
                    end = 1.777191162109375.dp,
                    bottom = 0.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 4.2315673828125.dp,
                    top = 23.332611083984375.dp,
                    end = 4.3703765869140625.dp,
                    bottom = 0.00017309188842773438.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector46(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector46),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 18.2823486328125.dp,
                    top = 17.021743774414062.dp,
                    end = 2.5859460830688477.dp,
                    bottom = 7.237176418304443.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector47(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector47),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 11.32257080078125.dp,
                    top = 19.379501342773438.dp,
                    end = 10.596769332885742.dp,
                    bottom = 5.687982082366943.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector61(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector61),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector62(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector62),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.42303466796875.dp,
                    top = 0.0.dp,
                    end = 0.0.dp,
                    bottom = 1.374589443206787.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 11.32257080078125.dp,
                    top = 19.379501342773438.dp,
                    end = 10.596769332885742.dp,
                    bottom = 5.687982082366943.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector48(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector48),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 8.6163330078125.dp,
                    top = 11.980667114257812.dp,
                    end = 8.219209671020508.dp,
                    bottom = 14.978997230529785.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector49(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector49),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 9.109619140625.dp,
                    top = 4.29345703125.dp,
                    end = 8.77364730834961.dp,
                    bottom = 9.084831237792969.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector50(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector50),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 7.99468994140625.dp,
                    top = 3.1209564208984375.dp,
                    end = 7.701634407043457.dp,
                    bottom = 17.975016593933105.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector51(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector51),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 8.13299560546875.dp,
                    top = 3.06195068359375.dp,
                    end = 7.847588539123535.dp,
                    bottom = 20.819265365600586.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector52(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector52),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 6.1734619140625.dp,
                    top = 1.3389892578125.dp,
                    end = 5.908098220825195.dp,
                    bottom = 11.054683685302734.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.09710693359375.dp,
                    top = 0.099090576171875.dp,
                    end = 0.0.dp,
                    bottom = 0.28289222717285156.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .requiredWidth(30.0.dp)
            .requiredHeight(31.0.dp)
    )
}

@Composable
fun Profile(
    onProfileButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .tappable(onTap = onProfileButtonTapped)
            .requiredWidth(103.0.dp)
            .requiredHeight(31.0.dp)
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
        modifier = modifier
            .requiredWidth(291.0.dp)
            .requiredHeight(44.0.dp)
    )
}

@Composable
fun Vector63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_vector63),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .requiredWidth(30.49974250793457.dp)
            .requiredHeight(30.5.dp)
    )
}

@Composable
fun Setting2(
    onSettingButtonTapped: () -> Unit,
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
            .tappable(onTap = onSettingButtonTapped)
            .requiredWidth(44.0.dp)
            .requiredHeight(44.0.dp)
    )
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
fun Ellipse6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.homepage_02_ellipse_5),
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
fun B1(
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
        vector = painterResource(R.drawable.homepage_02_rectangle_58),
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
        vector = painterResource(R.drawable.homepage_02_star_1),
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
fun Level1(
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
            .requiredHeight(110.0.dp)
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
        modifier = modifier.fillMaxSize()
    )
}
