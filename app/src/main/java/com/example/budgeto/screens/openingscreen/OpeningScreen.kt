package com.example.budgeto.screens.openingscreen

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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
import com.example.budgeto.screensfonts.inter
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.Case
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable
import java.util.Stack

@Composable
fun OpeningScreenExpensesInputScreen(
    modifier: Modifier = Modifier
) {
    var operationText by remember { mutableStateOf("") }
    var resultText by remember { mutableStateOf("") }

    OpeningScreenExpensesInput(
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f),
        operationTextContent = operationText,
        resultTextContent = resultText,
        onTaxButtonTapped = { /* Implement tax logic if needed */ },
        onPercentButtonTapped = { operationText += "%" },
        onAccountButtonTapped = { /* Implement account logic if needed */ },
        onNumberFourButtonTapped = { operationText += "4" },
        onButtonFiveButtonTapped = { operationText += "5" },
        onMultiplyButtonTapped = { operationText += "*" },
        onButtonSixButtonTapped = { operationText += "6" },
        onDivideButtonTapped = { operationText += "/" },
        onNumberSevenButtonTapped = { operationText += "7" },
        onNumberEightButtonTapped = { operationText += "8" },
        onDeleteButtonTapped = {
            if (operationText.isNotEmpty()) {
                operationText = operationText.dropLast(1)
            }
        },
        onNumberNineButtonTapped = { operationText += "9" },
        onEqualButtonTapped = {
            resultText = evaluateExpression(operationText)
        },
        onNumberOneButtonTapped = { operationText += "1" },
        onNumberTwoButtonTapped = { operationText += "2" },
        onAdditionButtonTapped = { operationText += "+" },
        onNumberThreeButtonTapped = { operationText += "3" },
        onOpenParenthesesButtonTapped = { operationText += "(" },
        onNumberZeroButtonTapped = { operationText += "0" },
        onDotButtonTapped = { operationText += "." },
        onCloseParenthesesButtonTapped = { operationText += ")" },
        onMinusButtonTapped = { operationText += "-" },
        onDoneButtonTapped = { /* Handle done action if needed */ },
        onInputButtonTapped = { /* Handle input button if needed */ },
        onOutputButtonTapped = { /* Handle output button if needed */ }
    )
}

fun evaluateExpression(expression: String): String {
    return try {
        val result = ExpressionParser().evaluate(expression)
        result.toString()
    } catch (e: Exception) {
        "Error"
    }
}

class ExpressionParser {
    fun evaluate(expression: String): Double {
        val tokens = expression.toCharArray()
        val values = Stack<Double>()
        val ops = Stack<Char>()

        var i = 0
        while (i < tokens.size) {
            when {
                tokens[i] == ' ' -> i++
                tokens[i] in '0'..'9' || tokens[i] == '.' -> {
                    val sb = StringBuilder()
                    while (i < tokens.size && (tokens[i] in '0'..'9' || tokens[i] == '.')) {
                        sb.append(tokens[i++])
                    }
                    values.push(sb.toString().toDouble())
                }
                tokens[i] == '(' -> ops.push(tokens[i++])
                tokens[i] == ')' -> {
                    while (ops.peek() != '(') {
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()))
                    }
                    ops.pop()
                    i++
                }
                tokens[i] in listOf('+', '-', '*', '/') -> {
                    while (ops.isNotEmpty() && hasPrecedence(tokens[i], ops.peek())) {
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()))
                    }
                    ops.push(tokens[i++])
                }
                else -> i++
            }
        }

        while (ops.isNotEmpty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()))
        }

        return values.pop()
    }

    private fun hasPrecedence(op1: Char, op2: Char): Boolean {
        if (op2 == '(' || op2 == ')') return false
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return false
        return true
    }

    private fun applyOp(op: Char, b: Double, a: Double): Double {
        return when (op) {
            '+' -> a + b
            '-' -> a - b
            '*' -> a * b
            '/' -> {
                if (b == 0.0) throw UnsupportedOperationException("Cannot divide by zero")
                a / b
            }
            else -> 0.0
        }
    }
}


@Composable
fun OpeningScreenExpensesInput(
    modifier: Modifier = Modifier,
    categoryTextContent: String = "",
    operationTextContent: String = "",
    resultTextContent: String = "",
    dateTextContent: String = "",
    noteTextContent: String = "",
    onTaxButtonTapped: () -> Unit = {},
    onPercentButtonTapped: () -> Unit = {},
    onAccountButtonTapped: () -> Unit = {},
    onNumberFourButtonTapped: () -> Unit = {},
    onButtonFiveButtonTapped: () -> Unit = {},
    onMultiplyButtonTapped: () -> Unit = {},
    onButtonSixButtonTapped: () -> Unit = {},
    onDivideButtonTapped: () -> Unit = {},
    onNumberSevenButtonTapped: () -> Unit = {},
    onNumberEightButtonTapped: () -> Unit = {},
    onDeleteButtonTapped: () -> Unit = {},
    onNumberNineButtonTapped: () -> Unit = {},
    onEqualButtonTapped: () -> Unit = {},
    onNumberOneButtonTapped: () -> Unit = {},
    onNumberTwoButtonTapped: () -> Unit = {},
    onAdditionButtonTapped: () -> Unit = {},
    onNumberThreeButtonTapped: () -> Unit = {},
    onOpenParenthesesButtonTapped: () -> Unit = {},
    onNumberZeroButtonTapped: () -> Unit = {},
    onDotButtonTapped: () -> Unit = {},
    onCloseParenthesesButtonTapped: () -> Unit = {},
    onMinusButtonTapped: () -> Unit = {},
    onDoneButtonTapped: () -> Unit = {},
    onInputButtonTapped: () -> Unit = {},
    onOutputButtonTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
//        Rectangle65()
        MAINFRAME(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = -3.0.dp,
                    y = 229.0.dp
                )
            )
        ) {
            Category(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 220.0.dp,
                        y = 16.0.dp
                    )
                )
            ) {
                FrameCategory(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 9.0.dp,
                            y = 31.0.dp
                        )
                    )
                ) {
                    TxtDefault(
                        categoryTextContent = categoryTextContent,
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 36.0.dp,
                                y = 11.0.dp
                            )
                        )
                    )
                }
                Category1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 40.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
            Key(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 3.0.dp,
                        y = 240.0.dp
                    )
                )
            ) {
                Frame3(
                    onTaxButtonTapped = onTaxButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 22.0.dp,
                            y = 9.0.dp
                        )
                    )
                ) {
                    TaxIcon(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 16.0.dp,
                                y = 15.0.dp
                            )
                        )
                    )
                }
                Frame8(
                    onPercentButtonTapped = onPercentButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 91.00000243778862.dp,
                            y = 8.999998623091187.dp
                        )
                    )
                ) {
                    PercentIcon(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.51515125696347.dp,
                                y = 16.484849230427358.dp
                            )
                        )
                    )
                }
                Frame10(
                    onAccountButtonTapped = onAccountButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 160.50000243778862.dp,
                            y = 9.499998644946885.dp
                        )
                    )
                ) {
                    AccountIcon(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.999999300617787.dp,
                                y = 16.00000120796642.dp
                            )
                        )
                    )
                }
                Frame5(
                    onNumberFourButtonTapped = onNumberFourButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 22.0.dp,
                            y = 150.0.dp
                        )
                    )
                ) {
                    Txt4(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame12(
                    onButtonFiveButtonTapped = onButtonFiveButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 92.0.dp,
                            y = 150.0.dp
                        )
                    )
                ) {
                    Txt5(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame21(
                    onMultiplyButtonTapped = onMultiplyButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 231.0.dp,
                            y = 150.0.dp
                        )
                    )
                ) {
                    TxtMultiply(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.0.dp,
                                y = 7.0.dp
                            )
                        )
                    )
                }
                Frame16(
                    onButtonSixButtonTapped = onButtonSixButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 161.0.dp,
                            y = 150.0.dp
                        )
                    )
                ) {
                    Txt6(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame22(
                    onDivideButtonTapped = onDivideButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 300.0.dp,
                            y = 150.0.dp
                        )
                    )
                ) {
                    TxtDivide(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
                Frame4(
                    onNumberSevenButtonTapped = onNumberSevenButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 22.0.dp,
                            y = 80.0.dp
                        )
                    )
                ) {
                    Txt7(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 6.0.dp
                            )
                        )
                    )
                }
                Frame13(
                    onNumberEightButtonTapped = onNumberEightButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 92.0.dp,
                            y = 80.0.dp
                        )
                    )
                ) {
                    Txt8(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 6.0.dp
                            )
                        )
                    )
                }
                Frame23(
                    onDeleteButtonTapped = onDeleteButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 231.0.dp,
                            y = 80.0.dp
                        )
                    )
                ) {
                    DelIcon(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 14.0.dp,
                                y = 17.0.dp
                            )
                        )
                    )
                }
                Frame17(
                    onNumberNineButtonTapped = onNumberNineButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 161.0.dp,
                            y = 80.0.dp
                        )
                    )
                ) {
                    Txt9(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 6.0.dp
                            )
                        )
                    )
                }
                Frame24(
                    onEqualButtonTapped = onEqualButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 300.0.dp,
                            y = 80.0.dp
                        )
                    )
                ) {
                    TxtEqual(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 10.0.dp,
                                y = 6.0.dp
                            )
                        )
                    )
                }
                Frame6(
                    onNumberOneButtonTapped = onNumberOneButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 22.0.dp,
                            y = 219.0.dp
                        )
                    )
                ) {
                    Txt1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame14(
                    onNumberTwoButtonTapped = onNumberTwoButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 92.0.dp,
                            y = 219.0.dp
                        )
                    )
                ) {
                    Txt2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame26(
                    onAdditionButtonTapped = onAdditionButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 231.0.dp,
                            y = 219.0.dp
                        )
                    )
                ) {
                    TxtAddition(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 3.0.dp
                            )
                        )
                    )
                }
                Frame18(
                    onNumberThreeButtonTapped = onNumberThreeButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 161.0.dp,
                            y = 219.0.dp
                        )
                    )
                ) {
                    Txt3(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame7(
                    onOpenParenthesesButtonTapped = onOpenParenthesesButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 22.0.dp,
                            y = 290.0.dp
                        )
                    )
                ) {
                    TxtOpenParentheses(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame15(
                    onNumberZeroButtonTapped = onNumberZeroButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 92.0.dp,
                            y = 290.0.dp
                        )
                    )
                ) {
                    Txt0(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame28(
                    onDotButtonTapped = onDotButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 231.0.dp,
                            y = 290.0.dp
                        )
                    )
                ) {
                    TxtDot(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 10.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame19(
                    onCloseParenthesesButtonTapped = onCloseParenthesesButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 161.0.dp,
                            y = 290.0.dp
                        )
                    )
                ) {
                    TxtCloseParentheses(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Frame31(
                    onMinusButtonTapped = onMinusButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 300.0.dp,
                            y = 219.0.dp
                        )
                    )
                ) {
                    TxtMinus(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 5.0.dp,
                                y = 4.0.dp
                            )
                        )
                    )
                }
                Done(
                    onDoneButtonTapped = onDoneButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 300.0.dp,
                            y = 290.0.dp
                        )
                    )
                ) {
                    Vector318(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 17.4998779296875.dp,
                                y = 19.4998779296875.dp
                            )
                        )
                    )
                }
                EI(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 231.0.dp,
                            y = 9.0.dp
                        )
                    )
                ) {
                    Frame20(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 37.50000066157415.dp,
                                y = -31.50000084646883.dp
                            )
                        )
                    ) {
                        Frame(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 7.999999082060846.dp,
                                    y = 12.000000989409479.dp
                                )
                            )
                        ) {
                            Vector49(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                    Frame32(
                        onInputButtonTapped = onInputButtonTapped,
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.0.dp,
                                y = 3.0.dp
                            )
                        )
                    ) {
                        Frame1(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 12.0.dp,
                                    y = 8.0.dp
                                )
                            )
                        ) {}
                    }
                    Frame30(
                        onOutputButtonTapped = onOutputButtonTapped,
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 69.0.dp,
                                y = 3.0.dp
                            )
                        )
                    ) {
                        Frame2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 12.0.dp,
                                    y = 8.0.dp
                                )
                            )
                        ) {
                            Vector50(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
            }
            Input(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 25.0.dp,
                        y = 110.0.dp
                    )
                )
            ) {
                Class10001000(
                    operationTextContent = operationTextContent,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 20.0.dp,
                            y = 12.0.dp
                        )
                    )
                )
                Class2000(
                    resultTextContent = resultTextContent,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 205.0.dp,
                            y = 60.0.dp
                        )
                    ).wrapContentWidth(),
                    textAlign = TextAlign.End
                )
            }
        }
        Note(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 148.0.dp
                )
            )
        ) {
            Rectangle60(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 137.0.dp
                    )
                )
            )
            June14th2024(
                dateTextContent = dateTextContent,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 36.0.dp,
                        y = 147.0.dp
                    )
                )
            )
            NOTE(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 69.0.dp,
                        y = 16.0.dp
                    )
                )
            )
            ExpensesAt1435(
                noteTextContent = noteTextContent,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 12.0.dp,
                        y = 43.0.dp
                    )
                )
            )
            ExpensesAt2120(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 12.0.dp,
                        y = 61.0.dp
                    )
                )
            )
            Line8(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 57.5.dp
                    )
                )
            )
            Line9(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 75.5.dp
                    )
                )
            )
            Line10(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 92.5.dp
                    )
                )
            )
            Line11(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 17.0.dp,
                        y = 110.5.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun OpeningScreenExpensesInputPreview() {
    MaterialTheme {
        RelayContainer {
            OpeningScreenExpensesInput(
                categoryTextContent = "Default",
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
                onOutputButtonTapped = {},
                operationTextContent = "1.000 + 1.000",
                resultTextContent = "2.000",
                dateTextContent = "June, 14th 2024",
                noteTextContent = "Expenses at 14:35’",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

//@Composable
//fun Rectangle65(modifier: Modifier = Modifier) {
//    RelayVector(
//        vector = painterResource(R.drawable.opening_screen_expenses_input_rectangle_65),
//        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(845.0.dp)
//    )
//}

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
fun TaxIcon(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.opening_screen_expenses_input_tax_icon),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame3(
    onTaxButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onTaxButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun PercentIcon(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.opening_screen_expenses_input_percent_icon),
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(32.969696044921875.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame8(
    onPercentButtonTapped: () -> Unit,
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
        modifier = modifier.graphicsLayer(rotationZ = -90.00000250447806f).tappable(onTap = onPercentButtonTapped).requiredWidth(62.999996185302734.dp).requiredHeight(63.000003814697266.dp)
    )
}

@Composable
fun AccountIcon(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.opening_screen_expenses_input_account_icon),
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame10(
    onAccountButtonTapped: () -> Unit,
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
        modifier = modifier.graphicsLayer(rotationZ = -90.00000250447806f).tappable(onTap = onAccountButtonTapped).requiredWidth(62.999996185302734.dp).requiredHeight(62.000003814697266.dp)
    )
}

@Composable
fun Txt4(modifier: Modifier = Modifier) {
    RelayText(
        content = "4",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame5(
    onNumberFourButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onNumberFourButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun Txt5(modifier: Modifier = Modifier) {
    RelayText(
        content = "5",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame12(
    onButtonFiveButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onButtonFiveButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun TxtMultiply(modifier: Modifier = Modifier) {
    RelayText(
        content = "×",
        fontSize = 40.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(45.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame21(
    onMultiplyButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onMultiplyButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun Txt6(modifier: Modifier = Modifier) {
    RelayText(
        content = "6",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame16(
    onButtonSixButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onButtonSixButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun TxtDivide(modifier: Modifier = Modifier) {
    RelayText(
        content = "÷",
        fontSize = 40.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(55.0.dp).requiredHeight(59.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame22(
    onDivideButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onDivideButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun Txt7(modifier: Modifier = Modifier) {
    RelayText(
        content = "7",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame4(
    onNumberSevenButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onNumberSevenButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun Txt8(modifier: Modifier = Modifier) {
    RelayText(
        content = "8",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame13(
    onNumberEightButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onNumberEightButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun DelIcon(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.opening_screen_expenses_input_del_icon),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(33.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun Frame23(
    onDeleteButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onDeleteButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun Txt9(modifier: Modifier = Modifier) {
    RelayText(
        content = "9",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame17(
    onNumberNineButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onNumberNineButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun TxtEqual(modifier: Modifier = Modifier) {
    RelayText(
        content = "=",
        fontSize = 40.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(45.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame24(
    onEqualButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onEqualButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun Txt1(modifier: Modifier = Modifier) {
    RelayText(
        content = "1",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame6(
    onNumberOneButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onNumberOneButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun Txt2(modifier: Modifier = Modifier) {
    RelayText(
        content = "2",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame14(
    onNumberTwoButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onNumberTwoButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun TxtAddition(modifier: Modifier = Modifier) {
    RelayText(
        content = "+",
        fontSize = 40.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame26(
    onAdditionButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onAdditionButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun Txt3(modifier: Modifier = Modifier) {
    RelayText(
        content = "3",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame18(
    onNumberThreeButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onNumberThreeButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun TxtOpenParentheses(modifier: Modifier = Modifier) {
    RelayText(
        content = "(",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame7(
    onOpenParenthesesButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onOpenParenthesesButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun Txt0(modifier: Modifier = Modifier) {
    RelayText(
        content = "0",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame15(
    onNumberZeroButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onNumberZeroButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun TxtDot(modifier: Modifier = Modifier) {
    RelayText(
        content = ".",
        fontSize = 40.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(33.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame28(
    onDotButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onDotButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun TxtCloseParentheses(modifier: Modifier = Modifier) {
    RelayText(
        content = ")",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(51.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame19(
    onCloseParenthesesButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onCloseParenthesesButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun TxtMinus(modifier: Modifier = Modifier) {
    RelayText(
        content = "-",
        fontSize = 40.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 229,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(51.0.dp).requiredHeight(55.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame31(
    onMinusButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onMinusButtonTapped).requiredWidth(63.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun Vector318(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector_318),
        modifier = modifier.requiredWidth(25.0.dp).requiredHeight(20.5.dp)
    )
}

@Composable
fun Done(
    onDoneButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 38,
            green = 205,
            blue = 45
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
        modifier = modifier.tappable(onTap = onDoneButtonTapped).requiredWidth(63.0.dp).requiredHeight(62.0.dp)
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
fun Frame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = 90.00000250447806f).requiredWidth(42.0.dp).requiredHeight(42.0.dp).alpha(alpha = 0.4000000059604645f)
    )
}

@Composable
fun Frame20(
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
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.graphicsLayer(rotationZ = -90.00000250447806f).requiredWidth(56.999996185302734.dp).requiredHeight(126.0.dp)
    )
}

@Composable
fun Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Frame32(
    onInputButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.tappable(onTap = onInputButtonTapped).requiredWidth(60.0.dp).requiredHeight(57.0.dp)
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
fun Frame2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Frame30(
    onOutputButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onOutputButtonTapped).requiredWidth(60.0.dp).requiredHeight(57.0.dp)
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
    modifier: Modifier = Modifier
) {
    RelayText(
        content = operationTextContent,
        fontSize = 24.0.sp,
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
    textAlign: TextAlign = TextAlign.Right
) {
    RelayText(
        content = resultTextContent,
        fontSize = 40.0.sp,
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
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(342.0.dp).requiredHeight(120.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 5.0.dp,
            blur = 5.699999809265137.dp,
            offsetX = 1.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun MAINFRAME(
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
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(396.0.dp).requiredHeight(615.0.dp)
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
