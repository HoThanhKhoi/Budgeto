package com.example.budgeto.screens.historyscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.budgeto.R
import com.example.budgeto.data.enums.transaction.TransactionType
import com.example.budgeto.data.model.transaction.Transaction
import com.example.budgeto.viewmodel.TransactionViewModel
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector


@Composable
fun HistoryScreen(
    modifier: Modifier = Modifier,
    transactionViewModel: TransactionViewModel = hiltViewModel()
) {
    LaunchedEffect(Unit) {
        transactionViewModel.fetchTransactions()
    }

    var transactions = transactionViewModel.transactions

    History1(
        transactions = transactions,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
    )
}


@Composable
fun History1(
    transactions: List<Transaction>,
    modifier: Modifier = Modifier,
) {
    TopLevel(modifier = modifier.fillMaxWidth()) {

        //region overall balance
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
        //endregion

        //region expenses & incomes
        Frame46(
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 120.0.dp
                    )
                )
                .fillMaxWidth()
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
            Txt400000VND(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 31.0.dp,
                        y = 62.0.dp
                    )
                )
            )
            Txt501000VND(
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
        Frame35(
            modifier = modifier
                .align(Alignment.TopCenter)
        ) {
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
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
            Frame62(
                modifier = modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 0.dp)
                    .fillMaxWidth()
            ) {
                Frame51(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 6.0.dp
                        )
                    )
                ) {
                    June(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 59.0.dp,
                                y = 6.0.dp
                            )
                        )
                    )
                    Vector321(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 136.0.dp,
                                y = 12.0.dp
                            )
                        )
                    )
                    Vector322(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 14.626708984375.dp,
                                y = 12.0.dp
                            )
                        )
                    )
                }
                transactions.forEachIndexed { index, transaction ->
                    TransactionEntry(
                        transaction = transaction,
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopCenter,
                            offset = DpOffset(
                                0.dp,
                                68.dp + (index * 59).dp
                            ) // Adjust spacing as needed
                        )
                    )
                }
                //region history list
//            Frame48(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopCenter,
//                    offset = DpOffset(
//                        x = 0.0.dp,
//                        y = 68.0.dp
//                    )
//                )
//            ) {
//                June29thSaturday(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 15.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//                TxtMinus70000VND(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 223.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//            }
//            Frame52(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopCenter,
//                    offset = DpOffset(
//                        x = 0.0.dp,
//                        y = 127.0.dp
//                    )
//                )
//            ) {
//                June15thTuesday(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 15.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//                Txt100000VND(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 211.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//            }
//            Frame55(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopCenter,
//                    offset = DpOffset(
//                        x = 0.0.dp,
//                        y = 186.0.dp
//                    )
//                )
//            ) {
//                June13thSunday(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 15.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//                TxtMinus330000VND(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 216.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//            }
//            Frame53(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopCenter,
//                    offset = DpOffset(
//                        x = 0.0.dp,
//                        y = 245.0.dp
//                    )
//                )
//            ) {
//                June7thModay(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 15.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//                TxtMinus1000000VND(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 200.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//            }
//            Frame54(
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopCenter,
//                    offset = DpOffset(
//                        x = 0.0.dp,
//                        y = 304.0.dp
//                    )
//                )
//            ) {
//                June2ndModay(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 15.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//                Txt5000000VND(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 194.0.dp,
//                            y = 16.0.dp
//                        )
//                    )
//                )
//            }

                //endregion
            }
        }
        //endregion
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun History1Preview() {
    MaterialTheme {
        RelayContainer {
            History1(
                transactions = emptyList(),
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun TransactionEntry(
    transaction: Transaction,
    modifier: Modifier = Modifier
) {
    RelayContainer(
        backgroundColor = Color.White,
        isStructured = false,
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color.Black,
        modifier = modifier
            .requiredWidth(346.dp)
            .requiredHeight(52.dp)
    ) {
        RelayText(
            content = "${transaction.date}",
            fontFamily = com.example.budgeto.screensfonts.inter,
            fontWeight = FontWeight(500),
            modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(15.dp, 16.dp))
        )

        RelayText(
            content = if (transaction.type == TransactionType.EXPENSE) "-" else "+" + transaction.amount,
            fontSize = 16.sp,
            fontFamily = com.example.budgeto.screensfonts.inter,
            height = 1.2102272510528564.em,
            fontWeight = FontWeight(500),
            textAlign = TextAlign.Right,
            color = if (transaction.type == TransactionType.EXPENSE) Color.Red else Color.Green, // color based on income/expense
            modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(211.dp, 16.dp))
        )
    }
}

//region expenses & Incomes component
@Composable
fun Expenses(modifier: Modifier = Modifier) {
    RelayText(
        content = "Expenses",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Txt400000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "400.000 VNĐ",
        fontSize = 20.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Txt501000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "501.000 VNĐ",
        fontSize = 20.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
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
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Line13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.history_1_line_13),
        modifier = modifier
            .requiredWidth(60.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Rectangle63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.history_1_rectangle_63),
        modifier = modifier
            .requiredWidth(401.0.dp)
            .requiredHeight(14.0.dp)
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
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(120.0.dp)
    )
}
//endregion

//region overall balance component
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
        fontWeight = FontWeight(500.0.toInt()),
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
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(136.0.dp)
    )
}
//endregion

//region history list
@Composable
fun Frame62(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        scrollable = true,
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(346.0.dp)
            .requiredHeight(458.0.dp)
    )
}

//region select date component
@Composable
fun June(modifier: Modifier = Modifier) {
    RelayText(
        content = "June",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector321(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.history_1_vector_321),
        modifier = modifier
            .requiredWidth(3.0.dp)
            .requiredHeight(6.375.dp)
    )
}

@Composable
fun Vector322(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.history_1_vector_322),
        modifier = modifier
            .requiredWidth(3.0.dp)
            .requiredHeight(6.375.dp)
    )
}
//endregion

//region date list component
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
        modifier = modifier
            .requiredWidth(155.0.dp)
            .requiredHeight(31.0.dp)
    )
}

@Composable
fun June29thSaturday(modifier: Modifier = Modifier) {
    RelayText(
        content = "June 29th, Saturday",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TxtMinus70000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "- 70.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
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
            .requiredWidth(346.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun June15thTuesday(modifier: Modifier = Modifier) {
    RelayText(
        content = "June 15th, Tuesday",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt100000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "+ 100.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
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
            .requiredWidth(346.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun June13thSunday(modifier: Modifier = Modifier) {
    RelayText(
        content = "June 13th, Sunday",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TxtMinus330000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "-330.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
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
        modifier = modifier
            .requiredWidth(346.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun June7thModay(modifier: Modifier = Modifier) {
    RelayText(
        content = "June 7th, Moday",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TxtMinus1000000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "- 1.000.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(500.0.toInt()),
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
        modifier = modifier
            .requiredWidth(346.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun June2ndModay(modifier: Modifier = Modifier) {
    RelayText(
        content = "June 2nd, Moday",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Txt5000000VND(modifier: Modifier = Modifier) {
    RelayText(
        content = "+ 5.000.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
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
        modifier = modifier
            .requiredWidth(346.0.dp)
            .requiredHeight(52.0.dp)
    )
}

//endregion

//endregion

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
