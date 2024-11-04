package com.example.budgeto.screens.accountscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.budgeto.R
import com.example.budgeto.screens.account3.Account3
import com.example.budgeto.screensfonts.inter
import com.google.relay.compose.BoxScopeInstance.boxAlign
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable


@Composable
fun AccountScreen(
    onHomepageButtonTapped: () -> Unit = {},
    onStoreButtonTapped: () -> Unit = {},
    onInventoryButtonTapped: () -> Unit = {},
    onHistoryButtonTapped: () -> Unit = {},
    onStatisticButtonTapped: () -> Unit = {},

    modifier: Modifier = Modifier
){
    Account1(

        onStoreButtonTapped = onStoreButtonTapped,
        onStatisticButtonTapped = onStatisticButtonTapped,
        onInventoryButtonTapped = onInventoryButtonTapped,
        onHistoryButtonTapped = onHistoryButtonTapped,
        onHomepageButtonTapped = onHomepageButtonTapped,
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f),
    )
}

data class AccountData(
    val title: String,
    val income: String,
    val expense: String,
    val balance: String
)

val accounts = listOf(
    AccountData(
        title = "Account: Default",
        income = "+ 75.000.000 VNĐ",
        expense = "- 35.000.000 VNĐ",
        balance = "40.000.000 VNĐ"
    ),
    AccountData(
        title = "Account: Tiền mẹ cho",
        income = "+ 50.000.000 VNĐ",
        expense = "- 10.000.000 VNĐ",
        balance = "40.000.000 VNĐ"
    ),
    AccountData(
        title = "Account: Tiền nuôi chó",
        income = "+ 5.000.000 VNĐ",
        expense = "- 1.000.000 VNĐ",
        balance = "4.000.000 VNĐ"
    ),
    AccountData(
        title = "Account: Tiền nuôi chó",
        income = "+ 5.000.000 VNĐ",
        expense = "- 1.000.000 VNĐ",
        balance = "4.000.000 VNĐ"
    )
    // Add more accounts as needed
)

@Composable
fun Account1(
    modifier: Modifier = Modifier,
    onHomepageButtonTapped: () -> Unit = {},
    onStoreButtonTapped: () -> Unit = {},
    onStatisticButtonTapped: () -> Unit = {},
    onInventoryButtonTapped: () -> Unit = {},
    onHistoryButtonTapped: () -> Unit = {}
) {
    var showAccountPopup by remember { mutableStateOf(false) }

    if (showAccountPopup) {
        Dialog(onDismissRequest = { showAccountPopup = false }) {
            Account3(
                onTransferButtonTapped = { /* Handle transfer action if needed */ },
                onXButtonTapped = { showAccountPopup = false },
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight() // Only take up necessary height
            )
        }
    }

    TopLevel(modifier = modifier.fillMaxWidth()) {

        //region expenses & income
        Frame46(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 120.0.dp
                )
            ).fillMaxWidth()
        ) {
            Expenses(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 62.0.dp,
                        y = 38.0.dp
                    )
                )
            )
            Txt400000(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 31.0.dp,
                        y = 62.0.dp
                    )
                )
            )
            Txt501000(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 225.0.dp,
                        y = 62.0.dp
                    )
                )
            )
            Incomes(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 258.0.dp,
                        y = 38.0.dp
                    )
                )
            )
            Line13(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0000013113418617649586.dp,
                        y = 68.0.dp
                    )
                )
            )
            Rectangle63(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 113.0.dp
                    )
                )
            )
        }
        //endregion

        //region Total Balance
        Frame35(modifier = modifier.fillMaxWidth()) {
            TotalBalance(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 150.0.dp,
                        y = 41.0.dp
                    )
                )
            )
            Txt101000(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 68.0.dp
                    )
                )
            )
        }
        //endregion

        //region account section

        RelayContainer(
            scrollable = true,
            arrangement = RelayContainerArrangement.Column,
            mainAxisAlignment = MainAxisAlignment.Start,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(0.dp, 240.dp)
            ).fillMaxWidth().height(400.dp).padding(8.dp)
        ) {
            accounts.forEach { account ->
                AccountSection(
                    accountTitle = account.title,
                    income = account.income,
                    expense = account.expense,
                    balance = account.balance
                )
            }
        }

        //endregion

        //region add new account
        Frame50 (
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.dp,
                    y = 679.0.dp
                )
            ).fillMaxWidth()
        ) {
            AddNewAccount(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 11.0.dp
                    )
                ).fillMaxWidth().clickable{showAccountPopup = true}
            )
        }
        //endregion

        //region earased account section
//
//        //region Account Default
//        Frame47(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopStart,
//                offset = DpOffset(
//                    x = 23.0.dp,
//                    y = 263.0.dp
//                )
//            )
//        ) {
//            AccountDefault(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 14.0.dp,
//                        y = 22.0.dp
//                    )
//                )
//            )
//            Frame51(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopCenter,
//                    offset = DpOffset(
//                        x = 0.5.dp,
//                        y = 56.0.dp
//                    )
//                )
//            ) {
//                Incomes1(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 15.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//                TxtAddition75000000(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 163.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//            }
//            Frame52(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopCenter,
//                    offset = DpOffset(
//                        x = 0.5.dp,
//                        y = 115.0.dp
//                    )
//                )
//            ) {
//                Expenses1(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 15.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//                TxtMinus35000000(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 165.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//            }
//            Frame53(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopCenter,
//                    offset = DpOffset(
//                        x = 0.5.dp,
//                        y = 174.0.dp
//                    )
//                )
//            ) {
//                Balance(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 15.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//                Txt40000000(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 176.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//            }
//            Frame54(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 258.0.dp,
//                        y = 20.0.dp
//                    )
//                )
//            ) {
//                More(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 15.0.dp,
//                            y = 2.0.dp
//                        )
//                    )
//                )
//                Vector321(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 59.0.dp,
//                            y = 6.999996185302734.dp
//                        )
//                    )
//                )
//            }
//            Rectangle67(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 0.0.dp,
//                        y = 240.0.dp
//                    )
//                )
//            )
//        }
//              //endregion
//
//        //region account 2
//        Frame48(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopStart,
//                offset = DpOffset(
//                    x = 23.0.dp,
//                    y = 535.0.dp
//                )
//            )
//        ) {
//            AccountTiNMCho(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 14.0.dp,
//                        y = 22.0.dp
//                    )
//                )
//            )
//            Frame55(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 310.0.dp,
//                        y = 20.0.dp
//                    )
//                )
//            ) {
//                Group2(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.Center,
//                        offset = DpOffset(
//                            x = -0.25.dp,
//                            y = -0.25.dp
//                        )
//                    )
//                ) {
//                    Vector319(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 2.75.dp,
//                                y = -1.0.dp
//                            )
//                        )
//                    )
//                    Vector320(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 2.75.dp,
//                                y = -0.9999998360822691.dp
//                            )
//                        )
//                    )
//                }
//            }
//        }
//        //endregion
//
//        //region account 3
//        Frame49(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopStart,
//                offset = DpOffset(
//                    x = 23.0.dp,
//                    y = 604.0.dp
//                )
//            )
//        ) {
//            AccountTiNNuICh(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 14.0.dp,
//                        y = 22.0.dp
//                    )
//                )
//            )
//            Frame56(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 310.0.dp,
//                        y = 20.0.dp
//                    )
//                )
//            ) {
//                Group3(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.Center,
//                        offset = DpOffset(
//                            x = -0.25.dp,
//                            y = -0.25.dp
//                        )
//                    )
//                ) {
//                    Vector322(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 2.75.dp,
//                                y = -1.0.dp
//                            )
//                        )
//                    )
//                    Vector323(
//                        modifier = Modifier.boxAlign(
//                            alignment = Alignment.TopStart,
//                            offset = DpOffset(
//                                x = 2.75.dp,
//                                y = -0.9999998360822691.dp
//                            )
//                        )
//                    )
//                }
//            }
//        }
//        //endregion

        //endregion

        //region navigation bar
        BottomNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 731.0.dp
                )
            ).fillMaxWidth()
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
                    Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                    Vector3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                    Vector5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Frame42(
                onHomepageButtonTapped = onHomepageButtonTapped,
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
        //endregion
    }

}

//region scrollable and hide section (can keep the original design but not flexible)

//@Composable
//fun AccountSection(
//    accountTitle: String,
//    income: String,
//    expense: String,
//    balance: String,
//    modifier: Modifier = Modifier
//) {
//    var isExpanded by remember { mutableStateOf(false) }
//    Spacer(modifier = Modifier.height(16.dp))
//    Frame47(
//        modifier = modifier.boxAlign(Alignment.TopStart, DpOffset(0.dp, 0.dp))
//    ) {
//        // Account Title
//        RelayText(
//            content = accountTitle,
//            fontSize = 16.sp,
//            fontFamily = inter,
//            fontWeight = FontWeight(700),
//            modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(14.dp, 22.dp))
//        )
//
//        // "More" Button
//        Frame54(
//            modifier = Modifier
//                .boxAlign(Alignment.TopStart, DpOffset(258.dp, 20.dp))
//                .clickable { isExpanded = !isExpanded } // Toggle expand/collapse
//        ) {
//            More(
//                modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(15.dp, 2.dp))
//            )
//            Vector321(
//                modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(59.dp, 6.999.dp))
//            )
//        }
//
//        // Conditionally show details based on isExpanded
//        if (isExpanded) {
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            Frame51(
//                modifier = Modifier.boxAlign(Alignment.TopCenter, DpOffset(0.5.dp, 56.dp))
//            ) {
//                RelayText(
//                    content = "Incomes",
//                    fontSize = 16.sp,
//                    fontFamily = inter,
//                    fontWeight = FontWeight(500),
//                    modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(15.dp, 16.dp))
//                )
//                RelayText(
//                    content = income,
//                    fontSize = 16.sp,
//                    fontFamily = inter,
//                    fontWeight = FontWeight(600),
//                    modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(163.dp, 16.dp))
//                )
//            }
//            Frame52(
//                modifier = Modifier.boxAlign(Alignment.TopCenter, DpOffset(0.5.dp, 115.dp))
//            ) {
//                RelayText(
//                    content = "Expenses",
//                    fontSize = 16.sp,
//                    fontFamily = inter,
//                    fontWeight = FontWeight(500),
//                    modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(15.dp, 16.dp))
//                )
//                RelayText(
//                    content = expense,
//                    fontSize = 16.sp,
//                    fontFamily = inter,
//                    fontWeight = FontWeight(600),
//                    modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(165.dp, 16.dp))
//                )
//            }
//            Frame53(
//                modifier = Modifier.boxAlign(Alignment.TopCenter, DpOffset(0.5.dp, 174.dp))
//            ) {
//                RelayText(
//                    content = "Balance",
//                    fontSize = 16.sp,
//                    fontFamily = inter,
//                    fontWeight = FontWeight(500),
//                    modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(15.dp, 16.dp))
//                )
//                RelayText(
//                    content = balance,
//                    fontSize = 16.sp,
//                    fontFamily = inter,
//                    fontWeight = FontWeight(600),
//                    modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(176.dp, 16.dp))
//                )
//            }
//        }
//    }
//}

//endregion


//region account section demo 1 component (not keep the design but best in function)
@Composable
fun AccountSection(
    accountTitle: String,
    income: String,
    expense: String,
    balance: String,
    modifier: Modifier = Modifier
) {
    var isExpanded by remember { mutableStateOf(false) }

    Spacer(modifier = Modifier.height(16.dp))

    Column(
        modifier = modifier
            .fillMaxWidth()
            .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { isExpanded = !isExpanded }
        ) {
            Text(
                text = accountTitle,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            Button(onClick = { isExpanded = !isExpanded }) {
                Text(text = if (isExpanded) "Less" else "More")
            }
        }

        if (isExpanded) {
            Spacer(modifier = Modifier.height(8.dp))
            AccountDetailRow(label = "Incomes", amount = income)
            AccountDetailRow(label = "Expenses", amount = expense)
            AccountDetailRow(label = "Balance", amount = balance)
        }
    }
}

@Composable
fun AccountDetailRow(label: String, amount: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .border(1.dp, Color.Gray, RoundedCornerShape(4.dp))
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = amount,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
//endregion


@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun Account1Preview() {
    MaterialTheme {
        RelayContainer {
            Account1(
                onHomepageButtonTapped = {},
                onStoreButtonTapped = {},
                onStatisticButtonTapped = {},
                onInventoryButtonTapped = {},
                onHistoryButtonTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
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

//region expense income component
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
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(120.0.dp)
    )
}

@Composable
fun Expenses(modifier: Modifier = Modifier) {
    RelayText(
        content = "Expenses",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Txt400000(modifier: Modifier = Modifier) {
    RelayText(
        content = "400.000 VNĐ",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Incomes(modifier: Modifier = Modifier) {
    RelayText(
        content = "Incomes",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Txt501000(modifier: Modifier = Modifier) {
    RelayText(
        content = "501.000 VNĐ",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Line13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_line_13),
        modifier = modifier.requiredWidth(60.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Rectangle63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_rectangle_63),
        modifier = modifier.requiredWidth(401.0.dp).requiredHeight(14.0.dp)
    )
}
//endregion

//region total component
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
fun TotalBalance(modifier: Modifier = Modifier) {
    RelayText(
        content = "Total Balance",
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt101000(modifier: Modifier = Modifier) {
    RelayText(
        content = "101.000 VNĐ",
        fontSize = 32.0.sp,
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

//endregion

//region account component
@Composable
fun AccountDefault(modifier: Modifier = Modifier) {
    RelayText(
        content = "Account: Default",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Incomes1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Incomes",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TxtAddition75000000(modifier: Modifier = Modifier) {
    RelayText(
        content = "+ 75.000.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Expenses1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Expenses",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TxtMinus35000000(modifier: Modifier = Modifier) {
    RelayText(
        content = "- 35.000.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
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
fun Balance(modifier: Modifier = Modifier) {
    RelayText(
        content = "Balance",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt40000000(modifier: Modifier = Modifier) {
    RelayText(
        content = "40.000.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun More(modifier: Modifier = Modifier) {
    RelayText(
        content = "More",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector321(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector_321),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
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
        modifier = modifier.requiredWidth(74.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Rectangle67(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_rectangle_67),
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
fun AccountTiNMCho(modifier: Modifier = Modifier) {
    RelayText(
        content = "Account: Tiền mẹ cho",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector319(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector_319),
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(7.5.dp)
    )
}

@Composable
fun Vector320(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector_320),
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
        modifier = modifier.requiredWidth(7.5.dp).requiredHeight(7.5.dp)
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
        modifier = modifier.requiredWidth(22.0.dp).requiredHeight(22.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun AccountTiNNuICh(modifier: Modifier = Modifier) {
    RelayText(
        content = "Account: Tiền nuôi chó",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector322(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector_322),
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(7.5.dp)
    )
}

@Composable
fun Vector323(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_vector_323),
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(7.5.dp)
    )
}

@Composable
fun Group3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(7.5.dp).requiredHeight(7.5.dp)
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
        modifier = modifier.requiredWidth(22.0.dp).requiredHeight(22.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(62.0.dp)
    )
}

//endregion

//region add account component
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun AddNewAccount(modifier: Modifier = Modifier) {
    RelayText(
        content = "Add new account",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}
//endregion

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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(113.0.dp)
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