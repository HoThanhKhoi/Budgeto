package com.example.budgeto.screens.openingscreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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

@Composable
fun OpeningScreenExpensesInputScreen(
    modifier: Modifier = Modifier
) {
    OpeningScreenExpensesInput(
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f),
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
        Hero(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 156.0.dp
                )
            )
        ) {
            Frame35(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 132.0.dp,
                        y = 5.0.dp
                    )
                )
            ) {
                Rectangle63(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 72.0.dp
                        )
                    )
                )
                OverallBalance(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 54.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
                Class101000000VN(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 18.0.dp,
                            y = 35.0.dp
                        )
                    )
                )
            }
        }
        TopNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 30.0.dp
                )
            )
        ) {
            NameFrame(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 57.0.dp
                    )
                )
            ) {
                Cup(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 196.0.dp,
                            y = 10.0.dp
                        )
                    )
                ) {
                    Class993(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 28.0.dp,
                                y = 3.0.dp
                            )
                        )
                    )
                }
                Cup1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 178.0.dp,
                            y = 5.0.dp
                        )
                    )
                ) {
                    Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector10(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector11(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector12(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector13(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector14(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector15(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -2.0.dp,
                                y = -2.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector16(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -2.0.dp,
                                y = -2.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector17(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector18(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -1.0.dp,
                                y = -1.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector19(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector20(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector21(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector22(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector23(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector24(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -1.0.dp,
                                y = -1.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                    Vector25(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector26(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Abrabra(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 50.0.dp,
                            y = 13.0.dp
                        )
                    )
                )
                Avatar(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                ) {
                    Layer2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        Class1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            Vector27(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector28(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector29(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector30(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            ClipPathGroup(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                A(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector38(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                                Group(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector39(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector40(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector41(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector42(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector43(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector44(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                    Vector45(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                            }
                            Vector31(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector32(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            ClipPathGroup1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                B(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector46(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                                }
                                Group1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                                    Vector47(
                                        modifier = Modifier.boxAlign(
                                            alignment = Alignment.TopStart,
                                            offset = DpOffset(
                                                x = 0.0.dp,
                                                y = 0.24770355224609375.dp
                                            )
                                        ).rowWeight(1.0f).columnWeight(1.0f)
                                    )
                                }
                            }
                            Vector33(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector34(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector35(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector36(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector37(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
            }
            Setting(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 300.0.dp,
                        y = 57.0.dp
                    )
                )
            ) {
                IconCog(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 7.0.dp,
                            y = 7.0.dp
                        )
                    )
                ) {
                    Vector48(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            Budgetoken(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 240.0.dp,
                        y = 10.0.dp
                    )
                )
            ) {
                Frame33(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 18.0.dp,
                            y = 5.0.dp
                        )
                    )
                ) {
                    Class10993(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 20.0.dp,
                                y = 3.0.dp
                            )
                        )
                    )
                }
                Ellipse2()
                B(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 11.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
            }
            Level(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = -2.0.dp,
                        y = 5.0.dp
                    )
                )
            ) {
                LevelFrame(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 18.0.dp,
                            y = 10.0.dp
                        )
                    )
                ) {
                    Rectangle58()
                    Class262500(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 142.0.dp,
                                y = 5.0.dp
                            )
                        )
                    )
                }
                Star1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 2.14300537109375.dp,
                            y = 1.1478729248046875.dp
                        )
                    )
                )
                Class13(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 13.0.dp,
                            y = 13.0.dp
                        )
                    )
                )
            }
        }
        Rectangle65()
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
                    )
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

@Composable
fun Rectangle63(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_rectangle_63),
        modifier = modifier.requiredWidth(218.0.dp).requiredHeight(14.0.dp)
    )
}

@Composable
fun OverallBalance(modifier: Modifier = Modifier) {
    RelayText(
        content = "Overall Balance",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class101000000VN(modifier: Modifier = Modifier) {
    RelayText(
        content = "101.000.000 VNĐ",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
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
        modifier = modifier.requiredWidth(211.0.dp).requiredHeight(81.0.dp)
    )
}

@Composable
fun Hero(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(343.0.dp).requiredHeight(99.0.dp)
    )
}

@Composable
fun Class993(modifier: Modifier = Modifier) {
    RelayText(
        content = "993",
        fontSize = 16.0.sp,
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

@Composable
fun Cup(
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
        modifier = modifier.requiredWidth(84.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 1.09375.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.03125.dp,
                top = 24.609375.dp,
                end = 12.03125.dp,
                bottom = 4.921875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.2109375.dp,
                top = 30.078125.dp,
                end = 11.2109375.dp,
                bottom = 4.1015625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.21875.dp,
                top = 25.9765625.dp,
                end = 14.21875.dp,
                bottom = 6.015625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.078125.dp,
                top = 18.73046875.dp,
                end = 16.050780296325684.dp,
                bottom = 11.7578125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.1015625.dp,
                top = 18.73046875.dp,
                end = 16.078125.dp,
                bottom = 11.7578125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector6),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.3984375.dp,
                top = 22.96875.dp,
                end = 13.3984375.dp,
                bottom = 10.390625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector7),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.59375.dp,
                top = 22.96875.dp,
                end = 13.3984375.dp,
                bottom = 10.390625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector8),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.765625.dp,
                top = 19.4140625.dp,
                end = 14.765625.dp,
                bottom = 13.9453125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector9),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.07421875.dp,
                top = 19.4140625.dp,
                end = 14.765624523162842.dp,
                bottom = 13.9453125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector10),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.8515625.dp,
                top = 24.0625.dp,
                end = 12.8515625.dp,
                bottom = 10.390625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector11),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 20.234375.dp,
                top = 24.0625.dp,
                end = 12.8515625.dp,
                bottom = 10.390625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector12),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.21875.dp,
                top = 18.8671875.dp,
                end = 14.21875.dp,
                bottom = 14.765625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector13),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.21875.dp,
                top = 18.8671875.dp,
                end = 14.21875.dp,
                bottom = 14.765625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector14),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.8671875.dp,
                top = 18.8671875.dp,
                end = 14.21875.dp,
                bottom = 14.765625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector15),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 21.328125.dp,
                top = 10.1171875.dp,
                end = 8.4765625.dp,
                bottom = 19.4140625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector16(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector16),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.4765625.dp,
                top = 10.1171875.dp,
                end = 21.328125.dp,
                bottom = 19.4140625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector17(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector17),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.03125.dp,
                top = 7.9296875.dp,
                end = 12.03125.dp,
                bottom = 15.3125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector18),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.671875.dp,
                top = 8.75.dp,
                end = 21.328125.dp,
                bottom = 20.78125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector19(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector19),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.45703125.dp,
                top = 7.9296875.dp,
                end = 12.03125.dp,
                bottom = 15.3125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector20(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector20),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.2109375.dp,
                top = 7.9296875.dp,
                end = 11.2109375.dp,
                bottom = 26.25.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector21),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 21.6015625.dp,
                top = 7.9296875.dp,
                end = 11.2109375.dp,
                bottom = 26.25.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector22),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.390625.dp,
                top = 6.8359375.dp,
                end = 10.390625.dp,
                bottom = 27.0703125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector23),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 22.421875.dp,
                top = 6.8359375.dp,
                end = 10.390625.dp,
                bottom = 27.0703125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector24),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.671875.dp,
                top = 15.421875.dp,
                end = 21.328125.dp,
                bottom = 18.949218928813934.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector25),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.16796875.dp,
                top = 5.359375.dp,
                end = 19.8515625.dp,
                bottom = 26.660155773162842.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector26(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector26),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.162567138671875.dp,
                top = 11.087890625.dp,
                end = 15.18993330001831.dp,
                bottom = 19.4444637298584.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Cup1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(35.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun Abrabra(modifier: Modifier = Modifier) {
    RelayText(
        content = "Abrabra",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector27(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector27),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.897735595703125.dp,
                top = 4.177520751953125.dp,
                end = 8.561735153198242.dp,
                bottom = 8.968406677246094.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector28(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector28),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector29(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector29),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.2315673828125.dp,
                top = 19.16301727294922.dp,
                end = 4.3703765869140625.dp,
                bottom = 0.0001678466796875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector30(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector30),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.2315673828125.dp,
                top = 23.332611083984375.dp,
                end = 4.3703765869140625.dp,
                bottom = 0.00017309188842773438.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector38(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector38),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun A(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector39(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector39),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.14318084716796875.dp,
                end = 15.75291395187378.dp,
                bottom = 5.036615967750549.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector40(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector40),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.752899169921875.dp,
                top = 3.23272705078125.dp,
                end = 15.000014781951904.dp,
                bottom = 1.947069764137268.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector41(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector41),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.333984375.dp,
                top = 3.3897857666015625.dp,
                end = 11.418928861618042.dp,
                bottom = 1.7900091409683228.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector42(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector42),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.107757568359375.dp,
                top = 5.179801940917969.dp,
                end = 7.645155668258667.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector43(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector43),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.8990478515625.dp,
                top = 3.1455307006835938.dp,
                end = 3.8538671731948853.dp,
                bottom = 2.0342642068862915.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector44(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector44),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.498046875.dp,
                top = 3.2252960205078125.dp,
                end = 0.254866361618042.dp,
                bottom = 1.9545007944107056.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector45(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector45),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.752899169921875.dp,
                top = 0.0.dp,
                end = 0.000014066696166992188.dp,
                bottom = 5.179794907569885.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.3524169921875.dp,
                top = 0.9408340454101562.dp,
                end = 1.777191162109375.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ClipPathGroup(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.2315673828125.dp,
                top = 23.332611083984375.dp,
                end = 4.3703765869140625.dp,
                bottom = 0.00017309188842773438.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector31(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector31),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.282379150390625.dp,
                top = 17.021743774414062.dp,
                end = 2.5859155654907227.dp,
                bottom = 7.237176418304443.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector32(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector32),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.32257080078125.dp,
                top = 19.379501342773438.dp,
                end = 10.596769332885742.dp,
                bottom = 5.687982082366943.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector46(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector46),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun B(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector47(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector47),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.423065185546875.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 1.374589443206787.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ClipPathGroup1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.32257080078125.dp,
                top = 19.379501342773438.dp,
                end = 10.596769332885742.dp,
                bottom = 5.687982082366943.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector33(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector33),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.6163330078125.dp,
                top = 11.980667114257812.dp,
                end = 8.219209671020508.dp,
                bottom = 14.978997230529785.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector34(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector34),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.109649658203125.dp,
                top = 4.29345703125.dp,
                end = 8.773616790771484.dp,
                bottom = 9.084831237792969.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector35),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.994720458984375.dp,
                top = 3.1209564208984375.dp,
                end = 7.701603889465332.dp,
                bottom = 17.975016593933105.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector36),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.13299560546875.dp,
                top = 3.06195068359375.dp,
                end = 7.847588539123535.dp,
                bottom = 20.819265365600586.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector37(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector37),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.1734619140625.dp,
                top = 1.3389892578125.dp,
                end = 5.908098220825195.dp,
                bottom = 11.054683685302734.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Layer2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.097076416015625.dp,
                top = 0.099090576171875.dp,
                end = 0.0.dp,
                bottom = 0.28289222717285156.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun NameFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier.requiredWidth(291.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun Vector48(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_vector48),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconCog(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(30.49974250793457.dp).requiredHeight(30.5.dp)
    )
}

@Composable
fun Setting(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun Class10993(modifier: Modifier = Modifier) {
    RelayText(
        content = "10.993",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame33(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier.requiredWidth(86.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_ellipse_2),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun B(modifier: Modifier = Modifier) {
    RelayText(
        content = "B",
        fontSize = 16.0.sp,
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

@Composable
fun Budgetoken(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(104.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle58(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_rectangle_58),
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Class262500(modifier: Modifier = Modifier) {
    RelayText(
        content = "262/500",
        fontSize = 12.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun LevelFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
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
        modifier = modifier.requiredWidth(201.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun Star1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_star_1),
        modifier = modifier.requiredWidth(45.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Class13(modifier: Modifier = Modifier) {
    RelayText(
        content = "13",
        fontSize = 16.0.sp,
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

@Composable
fun Level(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(219.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun TopNav(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(110.0.dp)
    )
}

@Composable
fun Rectangle65(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.opening_screen_expenses_input_rectangle_65),
        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(845.0.dp)
    )
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
    modifier: Modifier = Modifier
) {
    RelayText(
        content = resultTextContent,
        fontSize = 40.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
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
