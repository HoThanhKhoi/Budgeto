package com.example.budgeto.screens.account3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.budgeto.R
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable


@Composable
fun Account3(
    onTransferButtonTapped: () -> Unit = {},
    onXButtonTapped: () -> Unit = {},
    modifier: Modifier = Modifier

){
    AccountDetails(
        onTransferButtonTapped = onTransferButtonTapped,
        onXButtonTapped = onXButtonTapped,
        modifier = modifier.fillMaxWidth().fillMaxHeight()
    )
}


@Composable
fun AccountDetails(
    modifier: Modifier = Modifier,
    onTransferButtonTapped: () -> Unit = {},
    onXButtonTapped: () -> Unit = {},
) {
    TopLevel(modifier = modifier) {
        //Rectangle65()
        Frame53(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.5.dp
                )
            ).fillMaxWidth().background(color = Color.White)
        ) {
            Account(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 44.0.dp,
                        y = 46.0.dp
                    )
                )
            )

            //region close screen button
            Frame54(
                onXButtonTapped = onXButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 339.0.dp,
                        y = 18.0.dp
                    )
                )
            ) {
                Group2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.30330076813697815.dp,
                            y = 0.3033008575439453.dp
                        )
                    )
                ) {
                    Vector319(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 1.65185546875.dp,
                                y = 1.651651293039322.dp
                            )
                        )
                    )
                    Vector320(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 2.75.dp,
                                y = (-0.9999978989412046).dp
                            )
                        )
                    )
                }
            }
            //endregion

            //region default and balance Sections
            Frame49(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 80.0.dp
                    )
                )
            ) {
                Default(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
            }

            Frame50(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 139.0.dp
                    )
                )
            ) {
                Balance(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Txt40000000(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 156.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
            }
            //endregion

            //region expenses&Income section
            Frame47(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 44.0.dp,
                        y = 198.0.dp
                    )
                )
            ) {
                Expenses(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 43.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Txt400000(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 25.0.dp,
                            y = 41.0.dp
                        )
                    )
                )
                Frame51(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 24.0.dp,
                            y = 77.0.dp
                        )
                    )
                ) {
                    AddExpense(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 10.0.dp,
                                y = 6.0.dp
                            )
                        )
                    )
                }

                //line between expenses and incomes (not appear yet)
                Line13(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.000002098146410389745.dp,
                            y = 66.0.dp
                        )
                    )
                )

                Incomes(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 195.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Txt501000(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 176.0.dp,
                            y = 41.0.dp
                        )
                    )
                )

                Frame52(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 171.0.dp,
                            y = 77.0.dp
                        )
                    )
                ) {
                    AddIncome(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 14.0.dp,
                                y = 6.0.dp
                            )
                        )
                    )
                }
            }
            //endregion

            //region ViewTransactionHistory button
            Frame55(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 332.0.dp
                    )
                )
            ) {
                ViewTransactionHistory(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            //endregion

            //region Icon & currency section
            Frame56(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = (-77.0).dp,
                        y = 380.0.dp
                    )
                )
            ) {
                Icon(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame162496(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 95.0.dp,
                            y = 14.0.dp
                        )
                    )
                ) {
                    Asset14(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 4.0.dp,
                                y = 6.0.dp
                            )
                        )
                    )
                }
            }

            Frame57(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 78.0.dp,
                        y = 380.0.dp
                    )
                )
            ) {
                Currency(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                VN(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 38.0.dp
                        )
                    )
                )
            }
            //endregion

            //region transfer button
            Frame58(
                onTransferButtonTapped = onTransferButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 462.0.dp
                    )
                )
            ) {
                Transfer(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopCenter,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            //endregion

            //region delete, archive, save button
            Frame59(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = (-103.0).dp,
                        y = 526.0.dp
                    )
                )
            ) {
                Delete(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 23.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
            }
            Frame60(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 526.0.dp
                    )
                )
            ) {
                Archive(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
            }
            Frame61(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 104.0.dp,
                        y = 526.0.dp
                    )
                )
            ) {
                Save(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 29.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
            }

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
fun Frame53(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(637.0.dp)
    )
}

@Composable
fun Account(modifier: Modifier = Modifier) {
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
fun Frame54(
    onXButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 91,
            blue = 228
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
        modifier = modifier.tappable(onTap = onXButtonTapped).requiredWidth(28.0.dp).requiredHeight(28.0.dp)
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
        modifier = modifier.graphicsLayer(rotationZ = -45.0f).requiredWidth(7.5.dp).requiredHeight(7.5.dp)
    )
}


@Composable
fun Vector319(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_3_vector_319),
        modifier = modifier.requiredWidth(5.303300768136978.dp).requiredHeight(5.303300768136978.dp)
    )
}

@Composable
fun Vector320(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_3_vector_320),
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(7.5.dp)
    )
}

//endregion

//region default and balance component
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "Default",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame50(
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Balance(modifier: Modifier = Modifier) {
    RelayText(
        content = "Balance",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
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
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

//endregion

//region expenses&incomes component

//expenses component
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
        modifier = modifier.requiredWidth(304.0.dp).requiredHeight(127.0.dp)
    )
}

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
fun Txt400000(modifier: Modifier = Modifier) {
    RelayText(
        content = "400.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
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
        modifier = modifier.requiredWidth(110.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun AddExpense(modifier: Modifier = Modifier) {
    RelayText(
        content = "Add expense",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

//the line between
@Composable
fun Line13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.account_3_line_13),
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(0.0.dp)
    )
}

//income component
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
fun Txt501000(modifier: Modifier = Modifier) {
    RelayText(
        content = "501.000 VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
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
        modifier = modifier.requiredWidth(110.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun AddIncome(modifier: Modifier = Modifier) {
    RelayText(
        content = "Add income",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

//endregion

//region ViewTransactionHistory component
@Composable
fun Frame55(
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
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun ViewTransactionHistory(modifier: Modifier = Modifier) {
    RelayText(
        content = "View transaction History",
        fontSize = 16.0.sp,
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
//endregion

//region icon & currency component

//icon component
@Composable
fun Frame56(
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
        modifier = modifier.requiredWidth(148.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun Icon(modifier: Modifier = Modifier) {
    RelayText(
        content = "Icon",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame162496(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Asset14(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.account_3_asset_1_4),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(39.0.dp)
    )
}

//currency component
@Composable
fun Frame57(
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
        modifier = modifier.requiredWidth(148.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun Currency(modifier: Modifier = Modifier) {
    RelayText(
        content = "Currency",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun VN(modifier: Modifier = Modifier) {
    RelayText(
        content = "VNĐ",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

//endregion

//region transfer component
@Composable
fun Frame58(
    onTransferButtonTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onTransferButtonTapped).requiredWidth(303.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Transfer(modifier: Modifier = Modifier) {
    RelayText(
        content = "Transfer",
        fontSize = 16.0.sp,
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
//endregion

//region delete, archive, save component
@Composable
fun Frame59(
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Delete(modifier: Modifier = Modifier) {
    RelayText(
        content = "Delete",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame60(
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
        modifier = modifier.requiredWidth(97.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Archive(modifier: Modifier = Modifier) {
    RelayText(
        content = "Archive",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame61(
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Save(modifier: Modifier = Modifier) {
    RelayText(
        content = "Save",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}
//endregion



















