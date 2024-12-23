package com.example.budgeto.screens.historyscreen

import android.app.DatePickerDialog
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Divider
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.budgeto.R
import com.example.budgeto.data.enums.transaction.TransactionType
import com.example.budgeto.data.model.account.Account
import com.example.budgeto.data.model.category.Category
import com.example.budgeto.data.model.transaction.Transaction
import com.example.budgeto.viewmodel.AccountViewModel
import com.example.budgeto.viewmodel.CategoryViewModel
import com.example.budgeto.viewmodel.TransactionViewModel
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.ColumnScopeInstanceImpl.weight
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
    transactionViewModel: TransactionViewModel = hiltViewModel(),
    categoryViewModel: CategoryViewModel = hiltViewModel(),
    accountViewModel: AccountViewModel = hiltViewModel()
) {
    val calendar: Calendar = Calendar.getInstance(TimeZone.getDefault())

    var currentMonth by remember { mutableStateOf(calendar.get(Calendar.MONTH) + 1) }
    var currentYear by remember { mutableStateOf(calendar.get(Calendar.YEAR)) }

    var transactionsWithAccountNames by remember { mutableStateOf(emptyList<Pair<Transaction, String>>()) }
    var selectedTransaction by remember { mutableStateOf<Pair<Transaction, String>?>(null) }

    var totalExpenses by remember { mutableStateOf(0.0) }
    var totalIncomes by remember { mutableStateOf(0.0) }
    var overallBalance by remember { mutableStateOf(0.0) }

    val categoryList by categoryViewModel.categories.collectAsState(initial = emptyList())
    val accountList by accountViewModel.accountList

    // Function to calculate totals dynamically
    fun updateTotals(filteredTransactions: List<Pair<Transaction, String>>) {
        totalExpenses = filteredTransactions
            .filter { it.first.type == TransactionType.EXPENSE }
            .sumOf { it.first.amount }

        totalIncomes = filteredTransactions
            .filter { it.first.type == TransactionType.INCOME }
            .sumOf { it.first.amount }

        overallBalance = totalIncomes - totalExpenses
    }

    // Fetch transactions and update totals
    LaunchedEffect(currentMonth, currentYear) {
        transactionViewModel.fetchTransactionsWithAccountNames { transactions ->
            val filteredTransactions = transactions.filter { transaction ->
                val transactionDate = SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(transaction.first.date)
                val transactionCalendar = Calendar.getInstance().apply { time = transactionDate }

                transactionCalendar.get(Calendar.YEAR) == currentYear &&
                        transactionCalendar.get(Calendar.MONTH) + 1 == currentMonth
            }

            transactionsWithAccountNames = filteredTransactions
            updateTotals(filteredTransactions) // Update totals
        }
    }

    History1(
        transactionsWithAccountNames = transactionsWithAccountNames,
        totalExpenses = totalExpenses,
        totalIncomes = totalIncomes,
        overallBalance = overallBalance,
        currentMonth = currentMonth,
        currentYear = currentYear,
        onMonthChanged = { newMonth, newYear ->
            currentMonth = newMonth
            currentYear = newYear
        },
        onTransactionClicked = { transaction ->
            selectedTransaction = transaction
        },
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    )

    selectedTransaction?.let { (transaction, accountName) ->
        TransactionDetailsDialog(
            transaction = transaction,
            accountName = accountName,
            accountList = accountList,
            categoryList = categoryList,
            onDismiss = { selectedTransaction = null },
            onSave = { updatedTransaction ->
                transactionViewModel.updateTransaction(transaction.id, updatedTransaction)
                transactionViewModel.fetchTransactionsWithAccountNames { transactions ->
                    transactionsWithAccountNames = transactions
                    updateTotals(transactions) // Recalculate totals after update
                }
                selectedTransaction = null
            },
            onDelete = { transactionId ->
                transactionViewModel.deleteTransaction(transactionId)
                transactionViewModel.fetchTransactionsWithAccountNames { transactions ->
                    transactionsWithAccountNames = transactions
                    updateTotals(transactions) // Recalculate totals after delete
                }
                selectedTransaction = null
            }
        )
    }
}

fun getMonthName(month: Int): String {
    return SimpleDateFormat("MMMM", Locale.US).format(Calendar.getInstance().apply {
        set(Calendar.MONTH, month - 1)
    }.time)
}

@Composable
fun History1(
    transactionsWithAccountNames: List<Pair<Transaction, String>>,
    totalExpenses: Double,
    totalIncomes: Double,
    overallBalance: Double,
    currentMonth: Int,
    currentYear: Int,
    onMonthChanged: (Int, Int) -> Unit,
    onTransactionClicked: (Pair<Transaction, String>) -> Unit,
    modifier: Modifier = Modifier,
) {
    TopLevel(modifier = modifier.fillMaxWidth()) {

        //region overall balance
        Frame35(
            balance = overallBalance,
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(0.dp, 0.dp)
                )
        )
        //endregion

        //region expenses & incomes
        Frame46(
            totalExpenses = totalExpenses,
            totalIncomes = totalIncomes,
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 130.0.dp
                    )
                )
                .fillMaxWidth()
        )

        //endregion

        MonthSelector(
            currentMonth = currentMonth,
            currentYear = currentYear,
            onMonthChanged = onMonthChanged,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 260.dp)
        )

        // Transaction List
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 325.dp)
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
                    items(transactionsWithAccountNames) { transactionWithAccountName ->
                        val (transaction, accountName) = transactionWithAccountName
                        TransactionEntry(
                            transaction = transaction,
                            accountName = accountName,
                            modifier = Modifier
                                .padding(vertical = 4.dp)
                                .clickable { onTransactionClicked(transactionWithAccountName) }
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
                totalExpenses = 0.0,
                totalIncomes = 0.0,
                overallBalance = 0.0,
                onTransactionClicked = {},
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
            modifier = Modifier.boxAlign(Alignment.TopStart, DpOffset(120.dp, 16.dp))
        )

        val formattedAmount = String.format(Locale("vi", "VN"), "%,.2f", transaction.amount)

        RelayText(
            content = (if (transaction.type == TransactionType.EXPENSE) "- " else "+ ") +
                    "$formattedAmount VNĐ",
            fontSize = 16.sp,
            fontFamily = com.example.budgeto.screensfonts.inter,
            height = 1.2102272510528564.em,
            fontWeight = FontWeight(500),
            textAlign = TextAlign.Right,
            color = if (transaction.type == TransactionType.EXPENSE) Color.Red else Color.Green,
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

@Composable
fun TransactionDetailsDialog(
    transaction: Transaction,
    accountName: String,
    accountList: List<Account>,
    categoryList: List<Category>,
    onDismiss: () -> Unit,
    onSave: (Transaction) -> Unit,
    onDelete: (String) -> Unit
) {
    var date by remember { mutableStateOf(transaction.date) }
    var selectedCategory by remember {
        mutableStateOf(categoryList.find { it.categoryId == transaction.categoryId }?.name ?: "")
    }
    var selectedAccount by remember { mutableStateOf(accountList.find { it.id == transaction.accountId }?.name ?: accountName) }
    var amount by remember { mutableStateOf(transaction.amount.toString()) }
    var isIncome by remember { mutableStateOf(transaction.type == TransactionType.INCOME) }

    // For the DatePickerDialog
    val calendar = Calendar.getInstance()
    val datePickerDialog = DatePickerDialog(
        LocalContext.current,
        { _, year, month, dayOfMonth ->
            val selectedDate = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                .format(calendar.apply {
                    set(Calendar.YEAR, year)
                    set(Calendar.MONTH, month)
                    set(Calendar.DAY_OF_MONTH, dayOfMonth)
                }.time)
            date = selectedDate
        },
        calendar.get(Calendar.YEAR),
        calendar.get(Calendar.MONTH),
        calendar.get(Calendar.DAY_OF_MONTH)
    )

    var isCategorySelectionVisible by remember { mutableStateOf(false) }
    var isAccountSelectionVisible by remember { mutableStateOf(false) }

    Dialog(onDismissRequest = { onDismiss() }) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .wrapContentHeight()
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Header Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Details",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text(
                            text = "X",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red,
                            modifier = Modifier.clickable { onDismiss() }
                        )
                    }

                    // Account Display
                    Column {
                        Text(
                            text = "Account",
                            fontSize = 18.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                                .clickable { isAccountSelectionVisible = true }
                                .padding(12.dp)
                        ) {
                            Text(
                                text = selectedAccount.ifEmpty { "Select Account" },
                                fontSize = 16.sp,
                                color = Color.Black
                            )
                        }
                    }

                    // Transaction Type Toggle (Income/Expense)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(Color.LightGray, shape = RoundedCornerShape(8.dp)),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .background(
                                    if (isIncome) Color.Green else Color.LightGray,
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clickable { isIncome = true }
                                .padding(vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Income",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isIncome) Color.White else Color.Black
                            )
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .background(
                                    if (!isIncome) Color.Red else Color.LightGray,
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clickable { isIncome = false }
                                .padding(vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Expense",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (!isIncome) Color.White else Color.Black
                            )
                        }
                    }

                    // Date Field with Label
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        // Label for the Date Field
                        Text(
                            text = "Transaction Date",
                            fontSize = 18.sp,
                            color = Color.Black,
                            modifier = Modifier.padding(
                                start = 4.dp,
                                bottom = 8.dp
                            ) // Adjusted padding for consistency
                        )

                        // Box for the Date Field
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(1.dp, Color.Black, RoundedCornerShape(4.dp))
                                .clickable { datePickerDialog.show() } // Show DatePickerDialog on click
                                .padding(12.dp)
                        ) {
                            Text(
                                text = date,
                                fontSize = 16.sp,
                                color = Color.Black
                            )
                        }
                    }

                    // Category Field
                    Column {
                        Text(
                            text = "Category",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                                .clickable { isCategorySelectionVisible = true }
                                .padding(12.dp)
                        ) {
                            Text(
                                text = selectedCategory.ifEmpty { "Select Category" },
                                color = Color.Black
                            )
                        }
                    }

                    // Amount Field
                    CustomTextField(
                        value = amount,
                        onValueChange = { amount = it },
                        label = "Transaction Amount",
                        isError = amount.toDoubleOrNull() == null
                    )

                    // Save and Delete Buttons
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Button(
                            onClick = {
                                if (amount.toDoubleOrNull() != null) {
                                    val updatedTransaction = transaction.copy(
                                        date = date,
                                        accountId = accountList.find { it.name == selectedAccount }?.id ?: "",
                                        categoryId = categoryList.find { it.name == selectedCategory }?.categoryId ?: "",
                                        amount = amount.toDouble(),
                                        type = if (isIncome) TransactionType.INCOME else TransactionType.EXPENSE
                                    )
                                    onSave(updatedTransaction)
                                }
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                        ) {
                            Text(text = "Save", color = Color.White)
                        }

                        Button(
                            onClick = { onDelete(transaction.id) },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                        ) {
                            Text(text = "Delete", color = Color.White)
                        }
                    }
                }
            }
        }
    }
    if (isAccountSelectionVisible) {
        AccountSelectionDialog(
            accountList = accountList,
            onAccountSelected = { account ->
                selectedAccount = account.name
                isAccountSelectionVisible = false
            },
            onDismissRequest = { isAccountSelectionVisible = false }
        )
    }
    if (isCategorySelectionVisible) {
        CategorySelectionDialog(
            categoryList = categoryList,
            onCategorySelected = { category ->
                selectedCategory = category.name
                isCategorySelectionVisible = false
            },
            onDismissRequest = { isCategorySelectionVisible = false }
        )
    }
}

@Composable
fun AccountSelectionDialog(
    accountList: List<Account>,
    onAccountSelected: (Account) -> Unit,
    onDismissRequest: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismissRequest,
        title = {
            Text(
                text = "Select Account",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                accountList.forEachIndexed { index, account ->
                    Column {
                        Button(
                            onClick = { onAccountSelected(account) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Yellow, // Button background
                                contentColor = Color.Black // Text color
                            ),
                            shape = RoundedCornerShape(8.dp) // Adds rounded corners
                        ) {
                            Text(
                                text = account.name,
                                style = MaterialTheme.typography.bodyMedium,
                                color = Color.Black
                            )
                        }
                        // Add divider for better separation
                        if (index != accountList.lastIndex) {
                            Divider(
                                modifier = Modifier.padding(horizontal = 8.dp),
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        },
        confirmButton = {
            Button(
                onClick = onDismissRequest,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black, // Dark button for contrast
                    contentColor = Color.White // Updated color parameter
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Close", style = MaterialTheme.typography.labelLarge)
            }
        },
        shape = RoundedCornerShape(16.dp), // Modern rounded corners
        containerColor = Color.White, // Clean white background
        tonalElevation = 8.dp
    )
}

@Composable
fun CategorySelectionDialog(
    categoryList: List<Category>,
    onCategorySelected: (Category) -> Unit,
    onDismissRequest: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismissRequest,
        title = {
            Text(
                text = "Select Category",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                categoryList.forEachIndexed { index, category ->
                    Column {
                        Button(
                            onClick = { onCategorySelected(category) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Yellow, // Button background
                                contentColor = Color.Black // Text color
                            ),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = category.name,
                                style = MaterialTheme.typography.bodyMedium,
                                color = Color.Black
                            )
                        }
                        // Add divider for better separation
                        if (index != categoryList.lastIndex) {
                            Divider(
                                modifier = Modifier.padding(horizontal = 8.dp),
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        },
        confirmButton = {
            Button(
                onClick = onDismissRequest,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black, // Dark button for contrast
                    contentColor = Color.White // Updated color parameter
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Close", style = MaterialTheme.typography.labelLarge)
            }
        },
        shape = RoundedCornerShape(16.dp), // Modern rounded corners
        containerColor = Color.White, // Clean white background
        tonalElevation = 8.dp
    )
}

@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    isError: Boolean = false
) {
    Column(modifier = modifier) {
        // Label for the TextField
        Text(
            text = label,
            fontSize = 18.sp,
            color = if (isError) Color.Red else Color.Black,
            modifier = Modifier.padding(start = 4.dp, bottom = 4.dp)
        )

        // Box to wrap the BasicTextField with a black border
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, if (isError) Color.Red else Color.Black, RoundedCornerShape(4.dp))
                .padding(8.dp)
        ) {
            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Black
                ),
                decorationBox = { innerTextField ->
                    if (value.isEmpty()) {
                        Text(
                            text = label,
                            fontSize = 16.sp,
                            color = Color.Gray
                        )
                    }
                    innerTextField()
                }
            )
        }
    }
}

@Composable
fun calculateFontSize(
    text: String,
    maxFontSize: TextUnit,
    minFontSize: TextUnit,
    maxWidth: Dp
): TextUnit {
    var calculatedFontSize by remember { mutableStateOf(maxFontSize) }
    val density = LocalDensity.current

    LaunchedEffect(text, maxFontSize, minFontSize, maxWidth) {
        with(density) {
            val maxWidthPx = maxWidth.toPx() // Convert Dp to Pixels
            val paint = android.graphics.Paint()

            // Start with maxFontSize and decrease until the text fits or reaches minFontSize
            var currentFontSizePx = maxFontSize.toPx()
            paint.textSize = currentFontSizePx

            while (currentFontSizePx >= minFontSize.toPx()) {
                val textWidth = paint.measureText(text)

                if (textWidth <= maxWidthPx) {
                    // If text fits within maxWidth, use current font size
                    break
                }

                // Reduce font size incrementally
                currentFontSizePx -= 1
                paint.textSize = currentFontSizePx
            }

            // Coerce the result between minFontSize and maxFontSize
            calculatedFontSize = currentFontSizePx.toSp()
        }
    }

    return calculatedFontSize
}


//region expenses & Incomes component
@Composable
fun ExpensesColumn(
    totalExpenses: Double,
    fontSize: TextUnit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Expenses",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        )
        Text(
            text = String.format(Locale("vi", "VN"), "%,.2f VNĐ", totalExpenses),
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun IncomesColumn(
    totalIncomes: Double,
    fontSize: TextUnit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Incomes",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        )
        Text(
            text = String.format(Locale("vi", "VN"), "%,.2f VNĐ", totalIncomes),
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.Green,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun Rectangle63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.history_1_rectangle_63),
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(14.0.dp)
    )
}

@Composable
fun Frame46(
    modifier: Modifier = Modifier,
    totalExpenses: Double,
    totalIncomes: Double
) {
    RelayContainer(
        backgroundColor = Color.White,
        isStructured = false,
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color.Black,
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(120.dp)
    ) {
        BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
            val maxWidthForEachColumn = with(LocalDensity.current) { (maxWidth - 32.dp).toPx() / 2 }
            val expensesText = String.format(Locale("vi", "VN"), "%,.2f VNĐ", totalExpenses)
            val incomesText = String.format(Locale("vi", "VN"), "%,.2f VNĐ", totalIncomes)

            val unifiedFontSize = calculateUnifiedFontSize(
                texts = listOf(expensesText, incomesText),
                maxFontSize = 25.sp,
                minFontSize = 15.sp,
                maxWidthForEachColumn
            )

            Row(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ExpensesColumn(
                    totalExpenses = totalExpenses,
                    fontSize = unifiedFontSize,
                    modifier = Modifier.weight(1f)
                )

                Box(
                    modifier = Modifier
                        .width(1.dp)
                        .fillMaxHeight(0.7f)
                        .background(Color.Black)
                )

                IncomesColumn(
                    totalIncomes = totalIncomes,
                    fontSize = unifiedFontSize,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
fun calculateUnifiedFontSize(
    texts: List<String>,
    maxFontSize: TextUnit,
    minFontSize: TextUnit,
    maxWidth: Float
): TextUnit {
    val density = LocalDensity.current
    var calculatedFontSize = maxFontSize

    // Calculate the font size dynamically
    with(density) {
        val paint = android.graphics.Paint()
        var currentFontSizePx = maxFontSize.toPx()

        while (currentFontSizePx >= minFontSize.toPx()) {
            paint.textSize = currentFontSizePx
            val textWidths = texts.map { paint.measureText(it) }

            if (textWidths.all { it <= maxWidth }) {
                break // Found a suitable font size
            }

            currentFontSizePx -= 1 // Reduce font size incrementally
        }

        calculatedFontSize = currentFontSizePx.toSp()
    }

    return calculatedFontSize
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
fun TxtOverallBalance(
    balance: Double,
    modifier: Modifier = Modifier
) {
    BoxWithConstraints(modifier = modifier.fillMaxWidth()) {
        val balanceText = String.format(Locale("vi", "VN"), "%,.2f VNĐ", balance)
        val fontSize = calculateFontSize(balanceText, maxFontSize = 32.sp, minFontSize = 12.sp, maxWidth)

        Text(
            text = balanceText,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,
            fontFamily = com.example.budgeto.screensfonts.inter,
            textAlign = TextAlign.Center,
            color = Color.White,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun Frame35(
    balance: Double,
    modifier: Modifier = Modifier
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
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(130.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OverallBalance() // Call the label composable
            TxtOverallBalance(
                balance = balance,
                modifier = Modifier.padding(top = 8.dp) // Add spacing between label and value
            )
        }
    }
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
