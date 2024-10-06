package com.example.budgeto.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.budgeto.openingscreenexpensesinput.OpeningScreenExpensesInput

@Composable
fun OpeningScreenExpensesInputScreen(
    modifier: Modifier = Modifier
) {
    OpeningScreenExpensesInput(
        modifier = modifier,
        categoryTextContent = "Category",
        operationTextContent = "Operation",
        resultTextContent = "Result",
        dateTextContent = "Date",
        noteTextContent = "Note",
        onTaxButtonTapped = {},
        onPercentButtonTapped = {},
        onAccountButtonTapped = {},
        onNumberFourButtonTapped = {},
        onButtonFiveButtonTapped = {},
        onMultiplyButtonTapped = {},
        onButtonSixButtonTapped = {},
        onDivideButtonTapped = {},
        onNumberSevenButtonTapped = {},
        onNumberEightButtonTapped = {},
        onDeleteButtonTapped = {},
        onNumberNineButtonTapped = {},
        onEqualButtonTapped = {},
        onNumberOneButtonTapped = {},
        onNumberTwoButtonTapped = {},
        onAdditionButtonTapped = {},
        onNumberThreeButtonTapped = {},
        onOpenParenthesesButtonTapped = {},
        onNumberZeroButtonTapped = {},
        onDotButtonTapped = {},
        onCloseParenthesesButtonTapped = {},
        onMinusButtonTapped = {},
        onDoneButtonTapped = {},
        onInputButtonTapped = {},
        onOutputButtonTapped = {}
    )
}