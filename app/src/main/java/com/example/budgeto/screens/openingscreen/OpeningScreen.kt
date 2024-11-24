package com.example.budgeto.screens.openingscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.budgeto.R
import com.example.budgeto.data.enums.transaction.TransactionType
import com.example.budgeto.data.model.account.Account
import com.example.budgeto.data.model.category.Category
import com.example.budgeto.screensfonts.inter
import com.example.budgeto.utils.ToastUtil
import com.example.budgeto.viewmodel.AccountViewModel
import com.example.budgeto.viewmodel.CategoryViewModel
import com.example.budgeto.viewmodel.OpeningScreenViewModel
import com.example.budgeto.viewmodel.TransactionViewModel
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.Case
import com.google.relay.compose.ColumnScopeInstanceImpl.weight
import com.google.relay.compose.RelayCalculateButton
import com.google.relay.compose.RelayColumn
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayRow
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow

@Composable
fun OpeningScreenExpensesInputScreen(
    modifier: Modifier = Modifier,
    openingScreenViewModel: OpeningScreenViewModel = hiltViewModel<OpeningScreenViewModel>(),
    transactionViewModel: TransactionViewModel = hiltViewModel(),
    accountViewModel: AccountViewModel = hiltViewModel(),
    categoryViewModel: CategoryViewModel = hiltViewModel(),
    onCloseCalculator: () -> Unit = {},
    onNavigateToHistoryScreen: () -> Unit = {}
) {
    var operationText by openingScreenViewModel.operationText
    var resultText by openingScreenViewModel.resultText

    var accountId by remember {mutableStateOf("")}
    var amount by remember { mutableStateOf(0.0) }
    var categoryId by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var date by remember { mutableStateOf("") }
    var note by remember { mutableStateOf("") }
    var type by remember { mutableStateOf(TransactionType.EXPENSE) }

    //account selection
    var isAccountPopupVisible by remember { mutableStateOf(false) }
    var selectedAccount by remember { mutableStateOf<Account?>(null) }
    val accountList by accountViewModel.accountList

    //category selection
    var isCategoryPopupVisible by remember { mutableStateOf(false) }
    var selectedCategory by remember { mutableStateOf<Category?>(null) }
    val categoryList by categoryViewModel.categories.collectAsState()

    val context = LocalContext.current

    LaunchedEffect(Unit) {
        accountViewModel.fetchAllAccounts()
        categoryViewModel.fetchCategories()
    }

    var selectedTransactionType by remember { mutableStateOf(TransactionType.EXPENSE) }

    OpeningScreenExpensesInput(
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f),
        operationTextContent = operationText,
        resultTextContent = resultText,
        selectedAccount = selectedAccount?.name ?: "No Account Selected",
        selectedCategory = selectedCategory?.name ?: "No Category Selected",
        onCategoryButtonTapped = { isCategoryPopupVisible = true },
        onNumberButtonTapped = { number -> openingScreenViewModel.appendNumber(number) },
        selectedTransactionType = selectedTransactionType,

        //Row 1
        onTaxButtonTapped = { /* Implement tax logic if needed */ },
        onPercentButtonTapped = { openingScreenViewModel.appendOperation("%") },
        onAccountButtonTapped = { isAccountPopupVisible = true },
        onInputButtonTapped = { selectedTransactionType = TransactionType.INCOME},
        onOutputButtonTapped = { selectedTransactionType = TransactionType.EXPENSE },

        //Row 2
        onDeleteButtonTapped = { openingScreenViewModel.deleteLast() },
        onEqualButtonTapped = { openingScreenViewModel.calculateResult() },

        //Row 3
        onMultiplyButtonTapped = { openingScreenViewModel.appendOperation("*") },
        onDivideButtonTapped = { openingScreenViewModel.appendOperation("/") },

        //Row 4
        onAdditionButtonTapped = { openingScreenViewModel.appendOperation("+") },
        onMinusButtonTapped = { openingScreenViewModel.appendOperation("-") },

        //Row 5
        onOpenParenthesesButtonTapped = { openingScreenViewModel.appendNumber("(") },
        onCloseParenthesesButtonTapped = { openingScreenViewModel.appendNumber(")") },
        onDotButtonTapped = { openingScreenViewModel.appendNumber(".") },
        onDoneButtonTapped = {
            openingScreenViewModel.calculateResult()

            if (!resultText.isNullOrEmpty()) {
                val resultValue = resultText.toDoubleOrNull() // Attempt to convert to Double

                if(resultValue == null){
                    ToastUtil.showToastAtTop(context, "Invalid result.")
                } else{
                    if(resultValue == 0.0)
                    {
                        ToastUtil.showToastAtTop(context, "Result must be >0.")
                    }
                    else{
                        ToastUtil.showToastAtTop(context, "Add new transaction succeeded.")

                        onCloseCalculator()

                        transactionViewModel.addTransaction(
                            accountId = selectedAccount?.id ?: "",
                            categoryId = selectedCategory?.categoryId?:"",
                            amount = resultValue, // Use the safely parsed value
                            description = description,
                            note = note,
                            type = selectedTransactionType
                        )

                        onNavigateToHistoryScreen()
                    }

                }
            }
        },
    )
    if (isAccountPopupVisible) {
        AccountSelectionDialog(
            accountList = accountList,
            onAccountSelected = { account ->
                selectedAccount = account // Save the selected account
                isAccountPopupVisible = false // Close the dialog
            },
            onDismissRequest = { isAccountPopupVisible = false } // Close dialog on outside tap
        )
    }

    if (isCategoryPopupVisible) {
        CategorySelectionDialog(
            categoryList = categoryList,
            onCategorySelected = { category ->
                selectedCategory = category
                isCategoryPopupVisible = false
            },
            onDismissRequest = { isCategoryPopupVisible = false }
        )
    }
}

//region popup dialog
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

//endregion

@Composable
fun OpeningScreenExpensesInput(
    modifier: Modifier = Modifier,

    operationTextContent: String = "",
    resultTextContent: String = "",

    onNumberButtonTapped: (String) -> Unit = {},
    selectedAccount: String,
    selectedCategory: String,
    onCategoryButtonTapped: () -> Unit = {},
    selectedTransactionType: TransactionType,

    //Row 1
    onTaxButtonTapped: () -> Unit = {},
    onPercentButtonTapped: () -> Unit = {},
    onAccountButtonTapped: () -> Unit = {},
    onInputButtonTapped: () -> Unit = {},
    onOutputButtonTapped: () -> Unit = {},

    //Row 2
    onDeleteButtonTapped: () -> Unit = {},
    onEqualButtonTapped: () -> Unit = {},

    //Row 3
    onMultiplyButtonTapped: () -> Unit = {},
    onDivideButtonTapped: () -> Unit = {},

    //Row 4
    onAdditionButtonTapped: () -> Unit = {},
    onMinusButtonTapped: () -> Unit = {},

    //Row 5
    onOpenParenthesesButtonTapped: () -> Unit = {},
    onCloseParenthesesButtonTapped: () -> Unit = {},
    onDotButtonTapped: () -> Unit = {},
    onDoneButtonTapped: () -> Unit = {},

) {
    TopLevel(modifier = modifier.height(630.dp)) {
        MAINFRAME(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                AccountFrame(
                    selectedAccount = selectedAccount,
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 16.dp)
                        .clickable(onClick = onAccountButtonTapped)
                )

                CategoryFrame(
                    selectedCategory = selectedCategory,
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 16.dp)
                        .clickable(onClick = onCategoryButtonTapped)
                )
            }


            val scrollState = rememberScrollState()
            Input(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 77.dp, end = 77.dp, top = 110.dp, bottom = 0.dp)
            ) {
                val operationTextFontSize = calculateFontSize(operationTextContent, maxFontSize = 24.sp, minFontSize = 12.sp)
                val resultTextFontSize = calculateFontSize(resultTextContent, maxFontSize = 40.sp, minFontSize = 20.sp)

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    Row(
                        modifier = Modifier
                            .horizontalScroll(scrollState)
                            .fillMaxWidth()
                    ) {
                        Class10001000(
                            operationTextContent = operationTextContent,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(15.dp),
                            fontSize = operationTextFontSize
                        )
                    }

                    Row(
                        modifier = Modifier
                            .horizontalScroll(scrollState)
                            .align(Alignment.BottomEnd)
                            .fillMaxWidth()
                    ) {
                        Class2000(
                            resultTextContent = resultTextContent,
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(15.dp),
                            fontSize = resultTextFontSize
                        )
                    }

                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .fillMaxWidth()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(Color.Transparent, Color.Gray),
                                    startX = 0.0f,
                                    endX = 100.0f
                                )
                            )
                    )
                }
            }

            Key(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 240.dp, bottom = 10.dp)
            ) {
                RelayColumn (modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp, 5.dp, 15.dp, 5.dp)) {
                    // Row 1
                    RelayRow (modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)) {
                        RelayCalculateButton(icon = painterResource(R.drawable.opening_screen_expenses_input_tax_icon), onClick = onTaxButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "%", onClick = onPercentButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(icon = painterResource(R.drawable.opening_screen_expenses_input_account_icon), onClick = {}, modifier = Modifier.weight(1f))
                        RelayCalculateButton(
                            icon = painterResource(R.drawable.opening_screen_expenses_input_money_in_icon),
                            onClick = onInputButtonTapped,
                            backgroundColor = if (selectedTransactionType == TransactionType.INCOME) Color.Yellow else Color.LightGray,
                            modifier = Modifier.weight(1f)
                        )

                        RelayCalculateButton(
                            icon = painterResource(R.drawable.opening_screen_expenses_input_money_out_icon),
                            onClick = onOutputButtonTapped,
                            backgroundColor = if (selectedTransactionType == TransactionType.EXPENSE) Color.Yellow else Color.LightGray,
                            modifier = Modifier.weight(1f)
                        )
                    }

                    // Row 2
                    RelayRow (modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)) {
                        RelayCalculateButton(label = "7", onClick = { onNumberButtonTapped("7") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "8", onClick = { onNumberButtonTapped("8") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "9", onClick = { onNumberButtonTapped("9") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(icon = painterResource(R.drawable.opening_screen_expenses_input_del_icon), onClick = onDeleteButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "=", onClick = onEqualButtonTapped, modifier = Modifier.weight(1f))
                    }

                    // Row 3
                    RelayRow (modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)) {
                        RelayCalculateButton(label = "4", onClick = { onNumberButtonTapped("4") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "5", onClick = { onNumberButtonTapped("5") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "6", onClick = { onNumberButtonTapped("6") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "×", onClick = onMultiplyButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "÷", onClick = onDivideButtonTapped, modifier = Modifier.weight(1f))
                    }

                    // Row 4
                    RelayRow (modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)) {
                        RelayCalculateButton(label = "1", onClick = { onNumberButtonTapped("1") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "2", onClick = { onNumberButtonTapped("2") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "3", onClick = { onNumberButtonTapped("3") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "+", onClick = onAdditionButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "-", onClick = onMinusButtonTapped, modifier = Modifier.weight(1f))
                    }

                    // Row 5
                    RelayRow (modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)) {
                        RelayCalculateButton(label = "(", onClick = onOpenParenthesesButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = "0", onClick = { onNumberButtonTapped("0") }, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = ")", onClick = onCloseParenthesesButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(label = ".", onClick = onDotButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(icon = painterResource(R.drawable.opening_screen_expenses_input_vector_318), backgroundColor = Color.Green, onClick = onDoneButtonTapped, modifier = Modifier.weight(1f))
                    }
                }

            }
        }

    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun OpeningScreenExpensesInputPreview() {
    MaterialTheme {
        RelayContainer {
            OpeningScreenExpensesInput(
                onCategoryButtonTapped = {},
                onNumberButtonTapped = {},
                selectedAccount = "Account",
                selectedCategory = "Category",
                onTaxButtonTapped = {},
                onPercentButtonTapped = {},
                onAccountButtonTapped = {},
                onMultiplyButtonTapped = {},
                onDivideButtonTapped = {},
                onDeleteButtonTapped = {},
                onEqualButtonTapped = {},
                onAdditionButtonTapped = {},
                onOpenParenthesesButtonTapped = {},
                onDotButtonTapped = {},
                onCloseParenthesesButtonTapped = {},
                onMinusButtonTapped = {},
                onDoneButtonTapped = {},
                onInputButtonTapped = {},
                onOutputButtonTapped = {},
                operationTextContent = "1.000 + 1.000",
                resultTextContent = "2.000",
                selectedTransactionType = TransactionType.INCOME,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

fun calculateFontSize(
    textContent: String,
    maxFontSize: TextUnit = 24.sp,
    minFontSize: TextUnit = 12.sp
): TextUnit {
    val length = textContent.length

    // Convert TextUnit to Float for calculation
    val fontSize = when {
        length < 10 -> maxFontSize
        length < 20 -> (maxFontSize.value - (maxFontSize.value - minFontSize.value) * 0.3f).sp
        length < 30 -> (maxFontSize.value - (maxFontSize.value - minFontSize.value) * 0.6f).sp
        else -> minFontSize
    }
    return fontSize
}

@Composable
fun CategoryFrame(
    selectedCategory: String,
    modifier: Modifier = Modifier
) {
    RelayContainer(
        backgroundColor = Color(0xFF181818),
        isStructured = false,
        radius = 5.0,
        modifier = modifier.requiredWidth(147.dp).requiredHeight(79.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            RelayText(
                content = "CATEGORY",
                fontSize = 12.sp,
                fontFamily = inter,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            RelayContainer(
                backgroundColor = Color.White,
                radius = 4.dp.value.toDouble(),
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth()
                    .width(110.dp)
                    .height(45.dp)
            ) {
                RelayText(
                    content = selectedCategory,
                    fontSize = 16.sp,
                    fontFamily = inter,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 4.dp)
                        .fillMaxWidth()
                )
            }
        }
    }
}

@Composable
fun AccountFrame(
    selectedAccount: String,
    modifier: Modifier = Modifier
) {
    RelayContainer(
        backgroundColor = Color(0xFF181818),
        isStructured = false,
        radius = 5.0,
        modifier = modifier.requiredWidth(147.dp).requiredHeight(79.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            RelayText(
                content = "ACCOUNT",
                fontSize = 12.sp,
                fontFamily = inter,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            RelayContainer(
                backgroundColor = Color.White,
                radius = 4.dp.value.toDouble(),
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth()
                    .width(110.dp)
                    .height(45.dp)
            ) {
                RelayText(
                    content = selectedAccount,
                    fontSize = 16.sp,
                    fontFamily = inter,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 4.dp)
                        .fillMaxWidth()
                )
            }
        }
    }
}


@Composable
fun TxtDefault(
    categoryTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = categoryTextContent,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun FrameCategory(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 249,
            green = 249,
            blue = 249
        ),
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(129.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Category1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Category",
        fontSize = 12.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        case = Case.Upper,
        modifier = modifier
    )
}

@Composable
fun Category(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 24,
            green = 24,
            blue = 24
        ),
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(147.0.dp).requiredHeight(79.0.dp)
    )
}


@Composable
fun Vector49(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector49),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector50(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector50),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun EI(
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
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun Key(
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
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(375.0.dp)
    )
}

@Composable
fun Class10001000(
    operationTextContent: String,
    fontSize: TextUnit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = operationTextContent,
        fontSize = fontSize,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class2000(
    resultTextContent: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit,
    textAlign: TextAlign = TextAlign.Right
) {
    RelayText(
        content = resultTextContent,
        fontSize = fontSize,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = textAlign,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Input(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 249,
            green = 249,
            blue = 249
        ),
        isStructured = false,
        radius = 5.0,
        strokeWidth = 2.0,
        strokeColor = Color.Black,
        content = content,
        modifier = modifier
            .width(342.dp) // Fixed width for consistent alignment
            .height(120.dp) // Adjust height as needed
            .relayDropShadow(
                color = Color.Black.copy(alpha = 0.25f),
                borderRadius = 5.dp,
                blur = 5.7.dp,
                offsetX = 1.dp,
                offsetY = 4.dp
            )
    )
}

@Composable
fun MAINFRAME(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color.White,
        isStructured = false,
        strokeWidth = 1.dp.value.toDouble(),
        strokeColor = Color.Black,
        content = content,
        modifier = modifier.requiredWidth(500.0.dp).requiredHeight(615.0.dp)
    )
}

@Composable
fun Rectangle60(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_rectangle_60),
        modifier = modifier.requiredWidth(183.0.dp).requiredHeight(39.0.dp)
    )
}

@Composable
fun June14th2024(
    dateTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = dateTextContent,
        fontFamily = inter,
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
fun NOTE(modifier: Modifier = Modifier) {
    RelayText(
        content = "NOTE",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun ExpensesAt1435(
    noteTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = noteTextContent,
        fontSize = 12.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        italic = true,
        modifier = modifier
    )
}

@Composable
fun ExpensesAt2120(modifier: Modifier = Modifier) {
    RelayText(
        content = "Expenses at 21:20’",
        fontSize = 12.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        italic = true,
        modifier = modifier
    )
}

@Composable
fun Line8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_line_8),
        modifier = modifier.requiredWidth(149.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_line_9),
        modifier = modifier.requiredWidth(149.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_line_10),
        modifier = modifier.requiredWidth(149.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_line_11),
        modifier = modifier.requiredWidth(149.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Note(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 255,
            blue = 213
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
        modifier = modifier.requiredWidth(183.0.dp).requiredHeight(176.0.dp)
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
        modifier = modifier.fillMaxSize() // Allows TopLevel to fill the full screen height
    )
}


