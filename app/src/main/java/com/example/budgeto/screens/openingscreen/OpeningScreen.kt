package com.example.budgeto.screens.openingscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.budgeto.R
import com.example.budgeto.screensfonts.inter
import com.example.budgeto.viewmodel.OpeningScreenViewModel
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.Case
import com.google.relay.compose.ColumnScopeInstanceImpl.weight
import com.google.relay.compose.RelayCalculateButton
import com.google.relay.compose.RelayColumn
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayRow
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable
import java.util.Stack

@Composable
fun OpeningScreenExpensesInputScreen(
    modifier: Modifier = Modifier,
    viewModel: OpeningScreenViewModel = hiltViewModel<OpeningScreenViewModel>()
) {
    var operationText by viewModel.operationText
    var resultText by viewModel.resultText

    OpeningScreenExpensesInput(
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f),
        operationTextContent = operationText,
        resultTextContent = resultText,
        onNumberButtonTapped = { number -> viewModel.appendNumber(number) },

        //Row 1
        onTaxButtonTapped = { /* Implement tax logic if needed */ },
        onPercentButtonTapped = { viewModel.appendOperation("%") },
        onAccountButtonTapped = { /* Implement account logic if needed */ },
        onInputButtonTapped = { /* Handle input button if needed */ },
        onOutputButtonTapped = { /* Handle output button if needed */ },

        //Row 2
        onDeleteButtonTapped = { viewModel.deleteLast() },
        onEqualButtonTapped = { viewModel.calculateResult() },

        //Row 3
        onMultiplyButtonTapped = { viewModel.appendOperation("*") },
        onDivideButtonTapped = { viewModel.appendOperation("/") },

        //Row 4
        onAdditionButtonTapped = { viewModel.appendOperation("+") },
        onMinusButtonTapped = { viewModel.appendOperation("-") },

        //Row 5
        onOpenParenthesesButtonTapped = { viewModel.appendNumber("(") },
        onCloseParenthesesButtonTapped = { viewModel.appendNumber(")") },
        onDotButtonTapped = { viewModel.appendNumber(".") },
        onDoneButtonTapped = { /* Handle done action if needed */ },
    )
}

@Composable
fun OpeningScreenExpensesInput(
    modifier: Modifier = Modifier,

    categoryTextContent: String = "",
    operationTextContent: String = "",
    resultTextContent: String = "",
    dateTextContent: String = "",
    noteTextContent: String = "",

    onNumberButtonTapped: (String) -> Unit = {},

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
    TopLevel(modifier = modifier) {
        MAINFRAME(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter)
        ) {
            Category(
                modifier = Modifier
                    .fillMaxWidth() // Makes Category take the full width of the container
                    .padding(top = 16.dp, start = 200.dp) // Relative positioning using padding
            ) {
                FrameCategory(
                    modifier = Modifier
                        .fillMaxWidth() // Makes FrameCategory responsive to Category width
                        .padding(top = 31.dp) // Positioning within Category
                ) {
                    TxtDefault(
                        categoryTextContent = categoryTextContent,
                        modifier = Modifier
                            .padding(start = 36.dp, top = 11.dp) // Relative padding for TxtDefault within FrameCategory
                    )
                }

                Category1(
                    modifier = Modifier
                        .padding(start = 40.dp, top = 7.dp) // Relative positioning within Category
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

                    // Optional: Fade effect for overflow indicator
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
                        RelayCalculateButton(icon = painterResource(R.drawable.opening_screen_expenses_input_account_icon), onClick = onAccountButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(icon = painterResource(R.drawable.opening_screen_expenses_input_money_in_icon), onClick = onInputButtonTapped, modifier = Modifier.weight(1f))
                        RelayCalculateButton(icon = painterResource(R.drawable.opening_screen_expenses_input_money_out_icon), onClick = onOutputButtonTapped, modifier = Modifier.weight(1f))
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

        Note(
            modifier = modifier
                .align(Alignment.TopStart)
                .padding(start = 30.dp, end = 0.dp, top = 157.dp, bottom = 0.dp)
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
                dateTextContent = "June, 14th 2024",
                noteTextContent = "Expenses at 14:35’",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
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
fun TxtOpenParentheses(
    text: String = "(",
    fontSize: TextUnit = 30.sp,
    fontFamily: FontFamily = inter, // Can be customized, e.g., "inter"
    color: Color = Color(0, 0, 0, alpha = 229),
    lineHeight: TextUnit = 1.21.em,
    fontWeight: FontWeight = FontWeight.Medium, // Corresponds to weight 500
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier = Modifier
){
    Text(
        text = text,
        fontSize = fontSize,
        fontFamily = fontFamily,
        color = color,
        lineHeight = lineHeight,
        fontWeight = fontWeight,
        maxLines = maxLines,
        modifier = modifier
            .requiredWidth(47.dp)
            .requiredHeight(51.dp)
            .wrapContentHeight(
                align = Alignment.CenterVertically,
                unbounded = true
            )
            .wrapContentWidth(
                align = Alignment.CenterHorizontally,
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
