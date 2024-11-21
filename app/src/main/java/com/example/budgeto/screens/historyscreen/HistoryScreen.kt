package com.example.budgeto.screens.historyscreen

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone


@Composable
fun HistoryScreen(
    modifier: Modifier = Modifier,
    transactionViewModel: TransactionViewModel = hiltViewModel()
) {
    val calendar: Calendar = Calendar.getInstance(TimeZone.getDefault())

    // Track current month and year
    var currentMonth by remember { mutableStateOf(calendar.get(Calendar.MONTH) + 1) }
    var currentYear by remember { mutableStateOf(calendar.get(Calendar.YEAR)) }

    var transactionsWithAccountNames by remember { mutableStateOf(emptyList<Pair<Transaction, String>>()) }

    LaunchedEffect(currentMonth, currentYear) {
        transactionViewModel.fetchTransactionsWithAccountNames { transactions ->

            transactionsWithAccountNames = transactions.filter { transaction ->
                val transactionDate = SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(transaction.first.date)
                val transactionCalendar = Calendar.getInstance().apply { time = transactionDate }

                transactionCalendar.get(Calendar.YEAR) == currentYear &&
                        transactionCalendar.get(Calendar.MONTH) + 1 == currentMonth
            }
        }
    }

    History1(
        transactionsWithAccountNames = transactionsWithAccountNames,
        currentMonth = currentMonth,
        currentYear = currentYear,
        onMonthChanged = { newMonth, newYear ->
            currentMonth = newMonth
            currentYear = newYear
        },
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    )
}

fun getMonthName(month: Int): String {
    return SimpleDateFormat("MMMM", Locale.US).format(Calendar.getInstance().apply {
        set(Calendar.MONTH, month - 1)
    }.time)
}

@Composable
fun History1(
    transactionsWithAccountNames: List<Pair<Transaction, String>>,
    modifier: Modifier = Modifier,
    currentMonth: Int,
    currentYear: Int,
    onMonthChanged: (Int, Int) -> Unit,
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
        //endregion

        MonthSelector(
            currentMonth = currentMonth,
            currentYear = currentYear,
            onMonthChanged = onMonthChanged,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 256.dp)
        )

        // Transaction List
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 320.dp)
        ) {
            if (transactionsWithAccountNames.isEmpty()) {
                // Empty State
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.payment_1_asset_1_1),
                            contentDescription = "Empty",
                            modifier = Modifier
                                .size(64.dp)
                                .padding(bottom = 8.dp),
                            tint = MaterialTheme.colorScheme.primary.copy(alpha = 0.8f)
                        )
                        Text(
                            text = "No transactions yet",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f),
                                fontWeight = FontWeight.Medium
                            )
                        )
                        Text(
                            text = "Start adding transactions to see them here!",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f)
                            )
                        )
                    }
                }
            } else {
                // Display Transaction List
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    items(transactionsWithAccountNames) { (transaction, accountName) ->
                        TransactionEntry(
                            transaction = transaction,
                            accountName = accountName,
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                    }
                }
            }
        }
    }
}


@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun History1Preview() {
    MaterialTheme {
        RelayContainer {
            History1(
                transactionsWithAccountNames = emptyList(),
                currentMonth = 1,
                currentYear = 2024,
                onMonthChanged = { _, _ -> },
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
    accountName: String,
    modifier: Modifier = Modifier,
) {
    RelayContainer(
        backgroundColor = Color.White,
        isStructured = false,
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color.Black,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(52.dp)
    ) {
        RelayText(
            content = "${transaction.date}",
            fontFamily = com.example.budgeto.screensfonts.inter,
            fontWeight = FontWeight(500),
            modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(15.dp, 16.dp))
        )

        RelayText(
            content = accountName,
            fontFamily = com.example.budgeto.screensfonts.inter,
            fontWeight = FontWeight(500),
            modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(130.dp, 16.dp))
        )

        RelayText(
            content = (if (transaction.type == TransactionType.EXPENSE) "- " else "+ ") + transaction.amount.toString() + " VNĐ",
            fontSize = 16.sp,
            fontFamily = com.example.budgeto.screensfonts.inter,
            height = 1.2102272510528564.em,
            fontWeight = FontWeight(500),
            textAlign = TextAlign.Right,
            color = if (transaction.type == TransactionType.EXPENSE) Color.Red else Color.Green, // color based on income/expense
            modifier = Modifier.boxAlign(Alignment.TopEnd, DpOffset(-15.dp, 16.dp))
        )
    }
}

@Composable
fun MonthSelector(
    currentMonth: Int,
    currentYear: Int,
    onMonthChanged: (Int, Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    val monthName = getMonthName(currentMonth)

    Frame51(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "<",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                ),
                modifier = Modifier
                    .clickable {
                        val previousMonth = if (currentMonth == 1) 12 else currentMonth - 1
                        val updatedYear = if (currentMonth == 1) currentYear - 1 else currentYear
                        onMonthChanged(previousMonth, updatedYear)
                    }
                    .padding(horizontal = 12.dp)
            )

            Text(
                text = "$monthName $currentYear",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
            )

            Text(
                text = ">",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                ),
                modifier = Modifier
                    .clickable {
                        val nextMonth = if (currentMonth == 12) 1 else currentMonth + 1
                        val updatedYear = if (currentMonth == 12) currentYear + 1 else currentYear
                        onMonthChanged(nextMonth, updatedYear)
                    }
                    .padding(horizontal = 12.dp)
            )
        }
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
    content: @Composable RelayContainerScope.() -> Unit,
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
    content: @Composable RelayContainerScope.() -> Unit,
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

//region date list component
@Composable
fun Frame51(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
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
            .requiredWidth(220.0.dp)
            .requiredHeight(50.0.dp)
    )
}

//endregion

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit,
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
