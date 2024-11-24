package com.example.budgeto.screens.addAccount

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import com.example.budgeto.data.enums.account.AccountActionType
import com.example.budgeto.data.model.account.Account
import com.example.budgeto.state.AddAccountState
import com.example.budgeto.utils.ToastUtil
import com.example.budgeto.viewmodel.AccountViewModel
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector


@Composable
fun AddAccountScreen(
    existingAccount: Account? = null,
    onTransferButtonTapped: () -> Unit = {},
    onXButtonTapped: () -> Unit = {},
    modifier: Modifier = Modifier,
    accountViewModel: AccountViewModel = hiltViewModel(),
    accountActionType: AccountActionType
){
    var localAccountName by remember { mutableStateOf(existingAccount?.name ?: "") }
    var localAccountBalance by remember { mutableStateOf(existingAccount?.balance?.toString() ?: "") }
    var localAccountExpense by remember { mutableStateOf(existingAccount?.expense?.toString() ?: "") }
    var localAccountIncome by remember { mutableStateOf(existingAccount?.income?.toString() ?: "") }
    var localAccountIconLink by remember { mutableStateOf(existingAccount?.iconLink ?: "") }
    var localAccountCurrency by remember { mutableStateOf(existingAccount?.currency ?: "VNĐ") }

    var addAccountState = accountViewModel.addAccountState.value

    val context = LocalContext.current

    LaunchedEffect(addAccountState.error) {
        addAccountState.error?.let { errorMessage ->
            ToastUtil.showToastAtTop(context, errorMessage)
            accountViewModel.resetAddAccountState()
        }
    }


    LaunchedEffect(addAccountState.success) {
        addAccountState.success?.let { message ->
            ToastUtil.showToastAtTop(context, message)
            onXButtonTapped()
            accountViewModel.resetAddAccountState()
        }
    }

    AccountDetails(
        onTransferButtonTapped = onTransferButtonTapped,
        onXButtonTapped = onXButtonTapped,
        modifier = modifier.fillMaxWidth().fillMaxHeight(),
        accountName = localAccountName,
        accountBalance = localAccountBalance,
        accountExpense = localAccountExpense,
        accountIncome = localAccountIncome,
        accountIconLink = localAccountIconLink,
        accountCurrency = localAccountCurrency,
        onAccountNameChanged = { localAccountName = it },
        onAccountBalanceChanged = { localAccountBalance = it.toString() },
        onAccountExpenseChanged = { localAccountExpense = it.toString() },
        onAccountIncomeChanged = { localAccountIncome = it.toString() },
        onAccountIconLinkChanged = { localAccountIconLink = it },
        onAccountCurrencyChanged = { localAccountCurrency = it },
        onDeleteButtonTapped = {
            if (existingAccount != null) {
                accountViewModel.deleteAccount(existingAccount.id)
            }
        },
        onSaveButtonTapped = {
            when(accountActionType) {
                AccountActionType.ADD -> {
                    accountViewModel.addAccount(
                        accountName = localAccountName,
                        accountBalance = localAccountBalance.toDoubleOrNull(),
                        accountExpense = localAccountExpense.toDoubleOrNull(),
                        accountIncome = localAccountIncome.toDoubleOrNull(),
                        accountIconLink = localAccountIconLink,
                        accountCurrency = localAccountCurrency
                    )
                }
                AccountActionType.UPDATE -> {
                    if (existingAccount != null) {
                        accountViewModel.updateAccount(
                            accountId = existingAccount.id,
                            accountName = localAccountName,
                            accountBalance = localAccountBalance.toDoubleOrNull(),
                            accountExpense = localAccountExpense.toDoubleOrNull(),
                            accountIncome = localAccountIncome.toDoubleOrNull(),
                            accountIconLink = localAccountIconLink,
                            accountCurrency = localAccountCurrency)
                    }
                }
            }
        }

    )
}

@Composable
fun AccountDetails(
    modifier: Modifier = Modifier,
    onTransferButtonTapped: () -> Unit = {},
    onXButtonTapped: () -> Unit = {},
    accountName: String = "",
    accountBalance: String = "",
    accountExpense: String = "",
    accountIncome: String = "",
    accountIconLink: String = "",
    accountCurrency: String = "VNĐ",
    onAccountNameChanged: (String) -> Unit = {},
    onAccountBalanceChanged: (String) -> Unit = {},
    onAccountExpenseChanged: (String) -> Unit = {},
    onAccountIncomeChanged: (String) -> Unit = {},
    onAccountIconLinkChanged: (String) -> Unit = {},
    onAccountCurrencyChanged: (String) -> Unit = {},
    onSaveButtonTapped: () -> Unit = {},
    onDeleteButtonTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        //Rectangle65()
        AccountScreenHolder(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.5.dp
                )
            ).fillMaxWidth().background(color = Color.White)
        ) {
            AccountTitle(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 44.0.dp,
                        y = 46.0.dp
                    )
                )
            )

            //region close screen button
            ExitButton(
                onXButtonTapped = onXButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 315.0.dp,
                        y = 18.0.dp
                    )
                )
            )
            //endregion

            //region default and balance Sections
            AccountNameFrame(
                value = accountName,
                onValueChange = onAccountNameChanged,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 80.0.dp
                    )
                )
            )

            AccountBalanceField(
                value = accountBalance.toString(),
                onValueChange = onAccountBalanceChanged,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 139.0.dp
                    )
                )
            )
            //endregion

            //region expenses&Income section
            ExpenseIncomeFrame(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 44.0.dp,
                        y = 198.0.dp
                    )
                )
            )
            //endregion

            //region ViewTransactionHistory button
            ViewTransactionHistoryButton(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 332.0.dp
                    )
                )
            )
            //endregion

            //region Icon & currency section
            SelectIconButton(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = (-77.0).dp,
                        y = 380.0.dp
                    )
                )
            )

            SelectCurrencyButton(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 78.0.dp,
                        y = 380.0.dp
                    )
                )
            )
            //endregion

            //region transfer button
            TransferButton(
                onTransferButtonTapped = onTransferButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 462.0.dp
                    )
                )
            )
            //endregion

            //region delete, archive, save button
            ActionButtonsRow(
                onDeleteClick = onDeleteButtonTapped,
                onArchiveClick = {},
                onSaveClick = onSaveButtonTapped,
                modifier = Modifier
                    .boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(x = 0.dp, y = 526.dp)
                    )
            )

            //endregion

        }
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun Account3Preview() {
    MaterialTheme {
        RelayContainer {
            AccountDetails(
                onTransferButtonTapped = {},
                onXButtonTapped = {},
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

@Composable
fun Rectangle65(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_3_rectangle_65),
        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(845.0.dp)
    )
}

@Composable
fun AccountScreenHolder(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(600.0.dp)
    )
}

@Composable
fun AccountTitle(modifier: Modifier = Modifier) {
    RelayText(
        content = "Account",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

// region close button component
@Composable
fun ExitButton(
    onXButtonTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(36.dp) // Adjust size as needed
            .background(Color.Blue, shape = RoundedCornerShape(8.dp))
            .clickable(onClick = onXButtonTapped),
        contentAlignment = Alignment.Center
    ) {
        Canvas(
            modifier = Modifier.size(16.dp) // Size for the "X" shape
        ) {
            val strokeWidth = 2.dp.toPx() // Width of the "X" lines
            val halfSize = size.minDimension / 2
            drawLine(
                color = Color.White,
                start = Offset(x = 0f, y = 0f),
                end = Offset(x = size.width, y = size.height),
                strokeWidth = strokeWidth
            )
            drawLine(
                color = Color.White,
                start = Offset(x = size.width, y = 0f),
                end = Offset(x = 0f, y = size.height),
                strokeWidth = strokeWidth
            )
        }
    }
}

//endregion

//region default and balance component
@Composable
fun AccountNameFrame(
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit = {},
    value: String = "Default"
) {
    Box(
        modifier = modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(5.dp)
            )
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(5.dp)
            )
            .requiredWidth(303.dp)
            .requiredHeight(52.dp)
    ) {
        AccountNameTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 0.dp)
        )
    }
}

@Composable
fun AccountNameTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        placeholder = { Text(text = "Account name") },
        value = value,
        onValueChange = onValueChange,
        textStyle = TextStyle(
            fontSize = 16.sp,
            fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your specific font if needed
            lineHeight = 20.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Start,
            color = Color.Black
        ),
        modifier = modifier
            .fillMaxWidth(),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            cursorColor = Color.Black,
            focusedIndicatorColor = Color.Gray,
            unfocusedIndicatorColor = Color.LightGray
        ),
    )
}

@Composable
fun AccountBalanceField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(5.dp)
            )
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(5.dp)
            )
            .requiredWidth(303.dp)
            .requiredHeight(52.dp)
    ) {
//        AccountBalanceTitle(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 15.dp, y = 16.dp)
//        )
        AccountBalanceValueTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 0.dp)
        )
    }
}

@Composable
fun AccountBalanceTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Balance",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your specific font
        lineHeight = 20.sp,
        textAlign = TextAlign.Start,
        fontWeight = FontWeight.Medium,
        modifier = modifier,
        color = Color.Black
    )
}

@Composable
fun AccountBalanceValueTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        textStyle = TextStyle(
            fontSize = 16.sp,
            fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your specific font if needed
            lineHeight = 20.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start,
            color = Color.Black
        ),
        modifier = modifier
            .fillMaxWidth(),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            cursorColor = Color.Black,
            focusedIndicatorColor = Color.Gray,
            unfocusedIndicatorColor = Color.LightGray
        ),
        placeholder = {
            Text("Account balance") // Optional placeholder text
        }
    )
}

//endregion

//region expenses&incomes component

//expenses component
@Composable
fun ExpenseIncomeFrame(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(5.dp)
            )
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(5.dp)
            )
            .requiredWidth(304.dp)
            .requiredHeight(127.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Expenses Section
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.weight(1f)
            ) {
                ExpensesTitle(
                    modifier = Modifier.padding(start = 15.dp, top = 16.dp)
                )
                ExpenseValue(
                    modifier = Modifier.padding(start = 15.dp, top = 8.dp)
                )
//                AddExpenseButton(
//                    modifier = Modifier.padding(start = 15.dp, top = 8.dp)
//                )
            }

            // Line Divider
            Line13(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(vertical = 16.dp)
            )

            // Incomes Section
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.weight(1f)
            ) {
                IncomesTitle(
                    modifier = Modifier.padding(start = 15.dp, top = 16.dp)
                )
                IncomeValue(
                    modifier = Modifier.padding(start = 15.dp, top = 8.dp)
                )
//                AddIncomeButton(
//                    modifier = Modifier.padding(start = 15.dp, top = 8.dp)
//                )
            }
        }
    }
}

@Composable
fun ExpensesTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Expenses",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
        fontWeight = FontWeight.Medium,
        modifier = modifier
    )
}

@Composable
fun ExpenseValue(modifier: Modifier = Modifier) {
    Text(
        text = "0.0 VNĐ",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}

@Composable
fun AddExpenseButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF8DF00)),
        shape = RoundedCornerShape(50),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
            .requiredWidth(110.dp)
            .requiredHeight(30.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        AddExpenseButtonTitle()
    }
}

@Composable
fun AddExpenseButtonTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Add expense",
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
        fontWeight = FontWeight.SemiBold,
        modifier = modifier,
        color = Color.Black
    )
}

@Composable
fun Line13(modifier: Modifier = Modifier) {
    VerticalDivider(
        color = Color.Black,
        modifier = modifier
            .width(1.dp)
            .fillMaxHeight()
    )
}

@Composable
fun IncomesTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Incomes",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
        fontWeight = FontWeight.Medium,
        modifier = modifier
    )
}

@Composable
fun IncomeValue(modifier: Modifier = Modifier) {
    Text(
        text = "0.0 VNĐ",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}

@Composable
fun AddIncomeButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF8DF00)),
        shape = RoundedCornerShape(50),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
            .requiredWidth(110.dp)
            .requiredHeight(30.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        AddIncomeButtonTitle()
    }
}

@Composable
fun AddIncomeButtonTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Add income",
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
        fontWeight = FontWeight.SemiBold,
        modifier = modifier,
        color = Color.Black
    )
}
//endregion

//region ViewTransactionHistory component
@Composable
fun ViewTransactionHistoryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
            .requiredWidth(303.dp)
            .requiredHeight(41.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        ViewTransactionHistoryTextField(
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}

@Composable
fun ViewTransactionHistoryTextField(modifier: Modifier = Modifier) {
    Text(
        text = "View transaction History",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
        color = Color.White,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier,
        textAlign = TextAlign.Center
    )
}

//endregion

//region icon & currency component

//icon component
@Composable
fun SelectIconButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
            .requiredWidth(148.dp)
            .requiredHeight(75.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopStart
        ) {
            SelectIconButtonTitle(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 15.dp, top = 16.dp)
            )
            SelectIconButtonImageFrame(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 15.dp, top = 14.dp)
            )
        }
    }
}

@Composable
fun SelectIconButtonTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Icon",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
        fontWeight = FontWeight.Medium,
        modifier = modifier
    )
}

@Composable
fun SelectIconButtonImageFrame(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(42.dp)
            .border(BorderStroke(1.dp, Color.Black), CircleShape)
    ) {
        SelectIconButtonImage()
    }
}

@Composable
fun SelectIconButtonImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.account_3_asset_1_4),
        contentDescription = "Icon",
        contentScale = ContentScale.Crop,
        modifier = modifier.size(34.dp)
    )
}


//currency component
@Composable
fun SelectCurrencyButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
            .requiredWidth(148.dp)
            .requiredHeight(75.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopStart
        ) {
            SelectCurrencyTitle(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 15.dp, top = 16.dp)
            )
            SelectCurrencyValue(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 15.dp, top = 38.dp)
            )
        }
    }
}

@Composable
fun SelectCurrencyTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Currency",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your specific font
        fontWeight = FontWeight.Medium,
        modifier = modifier
    )
}

@Composable
fun SelectCurrencyValue(modifier: Modifier = Modifier) {
    Text(
        text = "VNĐ",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your specific font
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}


//endregion

//region transfer component
@Composable
fun TransferButton(
    onTransferButtonTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onTransferButtonTapped,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
            .requiredWidth(303.dp)
            .requiredHeight(41.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        TransferButtonTitle(
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}

@Composable
fun TransferButtonTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Transfer",
        fontSize = 16.sp,
        fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
        color = Color.White,
        fontWeight = FontWeight.Bold,
        modifier = modifier,
        textAlign = TextAlign.Center
    )
}

//endregion

//region delete, archive, save component
@Composable
fun DeleteButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
            .requiredWidth(96.dp)
            .requiredHeight(52.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(
            text = "Delete",
            fontSize = 16.sp,
            fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ArchiveButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
            .requiredWidth(97.dp)
            .requiredHeight(52.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(
            text = "Archive",
            fontSize = 16.sp,
            fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun SaveButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
            .requiredWidth(96.dp)
            .requiredHeight(52.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(
            text = "Save",
            fontSize = 16.sp,
            fontFamily = com.example.budgeto.screensfonts.inter, // Replace with your custom font
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ActionButtonsRow(
    onDeleteClick: () -> Unit,
    onArchiveClick: () -> Unit,
    onSaveClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(horizontal = 0.dp), // Position all buttons at the desired vertical offset
        horizontalArrangement = Arrangement.spacedBy(8.dp), // Space buttons horizontally
        verticalAlignment = Alignment.CenterVertically
    ) {
        DeleteButton(
            onClick = onDeleteClick,
        )
        ArchiveButton(
            onClick = onArchiveClick,
        )
        SaveButton(
            onClick = onSaveClick,
        )
    }
}
//endregion



















