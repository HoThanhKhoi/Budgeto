package com.example.budgeto.screens.accountscreen

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.budgeto.R
import com.example.budgeto.data.enums.account.AccountActionType
import com.example.budgeto.data.model.account.Account
import com.example.budgeto.data.model.user.UserMoneyInfo
import com.example.budgeto.screens.addAccount.AddAccountScreen
import com.example.budgeto.screensfonts.inter
import com.example.budgeto.viewmodel.AccountViewModel
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector


@Composable
fun AccountScreen(
    modifier: Modifier = Modifier,
    accountViewModel: AccountViewModel = hiltViewModel()
) {
    var accountList = accountViewModel.accountList.value
    var userMoneyInfo = accountViewModel.userMoneyInfo.value

    LaunchedEffect(Unit) {
        accountViewModel.fetchAllAccounts()
        accountViewModel.fetchUserMoneyInfo()
    }

    Account1(
        modifier = modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f),
        accountViewModel = accountViewModel,
        userMoneyInfo = userMoneyInfo?: UserMoneyInfo(),
        accountList = accountList
    )
}


@Composable
fun Account1(
    modifier: Modifier = Modifier,
    accountViewModel: AccountViewModel = hiltViewModel(),
    accountList: List<Account> = emptyList(),
    userMoneyInfo: UserMoneyInfo = UserMoneyInfo()
) {
    var showAccountPopup by remember { mutableStateOf(false) }
    var selectedAccount by remember { mutableStateOf<Account?>(null) }

    var accountActionType by remember { mutableStateOf(AccountActionType.ADD) }

    if (showAccountPopup) {
        Dialog(onDismissRequest = {
            selectedAccount = null
            showAccountPopup = false
        }) {
            AddAccountScreen(
                existingAccount = selectedAccount,
                onTransferButtonTapped = { /* Handle transfer action if needed */ },
                onXButtonTapped = {
                    showAccountPopup = false
                    selectedAccount = null
                },
                modifier = Modifier.height(600.dp),
                accountViewModel = accountViewModel,
                accountActionType = accountActionType
            )
        }
    }

    TopLevel(modifier = modifier.fillMaxWidth()) {

        //region expenses & income
        Frame46(
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.TopStart,
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
            ExpensesValue(
                value = userMoneyInfo.totalIncome.toString(),
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 31.0.dp,
                        y = 62.0.dp
                    )
                )
            )
            IncomesValue(
                value = userMoneyInfo.totalExpense.toString(),
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
            TotalBalanceValue(
                value = userMoneyInfo.totalBalance.toString(),
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
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(0.dp, 240.dp)
                )
                .fillMaxWidth()
                .height(400.dp)
                .padding(8.dp)
        ) {
            accountList.forEach { account ->
                AccountSection(
                    accountTitle = account.name,
                    income = account.income.toString(),
                    expense = account.expense.toString(),
                    balance = account.balance.toString(),
                    modifier = Modifier.clickable {
                        selectedAccount = account
                        showAccountPopup = true
                        accountActionType = AccountActionType.UPDATE
                    }
                )
            }
        }

        //endregion

        //region add new account
        Frame50(
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.dp,
                        y = 679.0.dp
                    )
                )
                .fillMaxWidth()
        ) {
            AddNewAccount(
                modifier = Modifier
                    .boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 11.0.dp
                        )
                    )
                    .fillMaxWidth()
                    .clickable {
                        showAccountPopup = true
                        accountActionType = AccountActionType.ADD
                    }
            )
        }
        //endregion

    }

}

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
                modifier = Modifier.weight(1f),
                color = Color.Black
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
            fontWeight = FontWeight.Medium,
            color = Color.Black
        )
        Text(
            text = amount,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
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
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f),
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(120.0.dp)
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
fun ExpensesValue(
    modifier: Modifier = Modifier,
    value: String = ""
) {
    RelayText(
        content = value,
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
fun IncomesValue(
    modifier: Modifier = Modifier,
    value: String = ""
) {
    RelayText(
        content = value,
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
        modifier = modifier
            .requiredWidth(60.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Rectangle63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_1_rectangle_63),
        modifier = modifier
            .requiredWidth(401.0.dp)
            .requiredHeight(14.0.dp)
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
        modifier = modifier
            .requiredWidth(390.0.dp)
            .requiredHeight(136.0.dp)
    )
}

@Composable
fun TotalBalance(
    modifier: Modifier = Modifier,
) {
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
fun TotalBalanceValue(
    modifier: Modifier = Modifier,
    value: String = ""
) {
    RelayText(
        content = value,
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
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(41.0.dp)
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
