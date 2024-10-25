package com.example.budgeto.screens.profilescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
import com.example.budgeto.R
import com.example.budgeto.data.enums.UserGender
import com.example.budgeto.screensfonts.inter
import com.example.budgeto.viewmodel.ProfileViewModel
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.UserInfoDropDown
import com.google.relay.compose.UserInfoTextBox
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable


@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel,
    modifier: Modifier = Modifier
) {
    val generalInfo by viewModel.generalInfo.collectAsState()

    Profile1(
        fullnameTextContent = generalInfo?.fullName ?: "",
        birthdateTextContent = generalInfo?.dateOfBirth ?: "",
        phoneNumberTextContent = generalInfo?.phone ?: "",
        addressTextContent = generalInfo?.address ?: "",
        occupationTextContent = generalInfo?.occupation ?: "",
        genderContent = generalInfo?.gender ?: UserGender.NONE,
        onBackToHomepageButtonTapped = {},
        onSignOutButtonTapped = {},
        onHomepageButtonTapped = {},
        onStoreButtonTapped = {},
        onStatisticButtonTapped = {},
        onInventoryButtonTapped = {},
        onHistoryButtonTapped = {},
        onGenderOptionButtonTapped = {},
        onGoogleAccountLinkButtonTapped = {},
        onFacebookAccountLinkButtonTapped = {},
        modifier = modifier,
    )
}


@Composable
fun Profile1(
    modifier: Modifier = Modifier,
    fullnameTextContent: String = "",
    birthdateTextContent: String = "",
    phoneNumberTextContent: String = "",
    addressTextContent: String = "",
    occupationTextContent: String = "",
    genderContent: UserGender = UserGender.NONE,
    onBackToHomepageButtonTapped: () -> Unit = {},
    onSignOutButtonTapped: () -> Unit = {},
    onHomepageButtonTapped: () -> Unit = {},
    onStoreButtonTapped: () -> Unit = {},
    onStatisticButtonTapped: () -> Unit = {},
    onInventoryButtonTapped: () -> Unit = {},
    onHistoryButtonTapped: () -> Unit = {},
    onGenderOptionButtonTapped: () -> Unit = {},
    onGoogleAccountLinkButtonTapped: () -> Unit = {},
    onFacebookAccountLinkButtonTapped: () -> Unit = {},
    onNameFieldChanged: (String) -> Unit = {},
    onPhoneFieldChanged: (String) -> Unit = {},
    onAddressFieldChanged: (String) -> Unit = {},
    onOccupationFieldChanged: (String) -> Unit = {},
    onGenderFieldChanged: (UserGender) -> Unit = {},
    onBirthDayFieldChanged: (String) -> Unit = {},
) {
    TopLevel(modifier = modifier) {
        BottomNav(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 1151.0.dp
                )
            )
        ) {
            Line12(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -2.0.dp,
                        y = 101.0.dp
                    )
                )
            )
            Frame43(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 24.0.dp
                    )
                )
            ) {
                Store(
                    onStoreButtonTapped = onStoreButtonTapped,
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                ) {
                    Vector(
                        modifier = Modifier
                            .boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -0.875.dp,
                                    y = -0.875.dp
                                )
                            )
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector1(
                        modifier = Modifier
                            .boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -0.8751220703125.dp,
                                    y = -0.875.dp
                                )
                            )
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                }
                Statistic(
                    onStatisticButtonTapped = onStatisticButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 282.0.dp,
                            y = 9.0.dp
                        )
                    )
                ) {
                    Vector2(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                }
                Archive(
                    onInventoryButtonTapped = onInventoryButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 87.0.dp,
                            y = 14.0.dp
                        )
                    )
                ) {
                    Vector3(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector4(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                }
                History(
                    onHistoryButtonTapped = onHistoryButtonTapped,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 231.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Vector5(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector6(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                }
            }
            Frame42(
                onHomepageButtonTapped = onHomepageButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 165.0.dp,
                        y = 6.0.dp
                    )
                )
            ) {
                Vector7(
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                )
            }
        }
        Frame54(
            onBackToHomepageButtonTapped = onBackToHomepageButtonTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 339.0.dp,
                    y = 37.0.dp
                )
            )
        ) {
            Arrow3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 7.0.dp,
                        y = 6.6360321044921875.dp
                    )
                )
            )
        }
        Avatar(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 89.0.dp
                )
            )
        ) {
            Layer2(
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            ) {
                Class1(
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                ) {
                    Vector8(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector9(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector10(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector11(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    ClipPathGroup(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    ) {
                        A(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        ) {
                            Vector19(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                        Group(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        ) {
                            Vector20(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                            Vector21(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                            Vector22(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                            Vector23(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                            Vector24(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                            Vector25(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                            Vector26(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                    }
                    Vector12(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector13(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    ClipPathGroup1(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    ) {
                        B(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        ) {
                            Vector27(
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                        Group1(
                            modifier = Modifier
                                .rowWeight(1.0f)
                                .columnWeight(1.0f)
                        ) {
                            Vector28(
                                modifier = Modifier
                                    .boxAlign(
                                        alignment = Alignment.TopStart,
                                        offset = DpOffset(
                                            x = 0.0.dp,
                                            y = 1.2065582275390625.dp
                                        )
                                    )
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                    }
                    Vector14(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector15(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector16(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector17(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                    Vector18(
                        modifier = Modifier
                            .rowWeight(1.0f)
                            .columnWeight(1.0f)
                    )
                }
            }
        }
        Profile(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 41.0.dp
                )
            )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 300.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(14.dp)

        ) {
            UserNameField(
                value = fullnameTextContent,
                onValueChange = onNameFieldChanged,
                modifier = modifier
            )
            DayOfBirthField(
                value = birthdateTextContent,
                onValueChange = onBirthDayFieldChanged,
                modifier = modifier
            )
            PhoneField(
                value = phoneNumberTextContent,
                onValueChange = onPhoneFieldChanged,
                modifier = modifier
            )
            AddressField(
                value = addressTextContent,
                onValueChange = onAddressFieldChanged,
                modifier = modifier
            )
            OccupationField(
                value = occupationTextContent,
                onValueChange = onOccupationFieldChanged,
                modifier = modifier
            )

            GenderDropdownField(
                onValueChange = onGenderFieldChanged,
                modifier = modifier
            )

        }


//        Frame56(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopCenter,
//                offset = DpOffset(
//                    x = 0.0.dp,
//                    y = 335.0.dp
//                )
//            )
//        ) {
//            BaoNgu1(
//                nameTextContent = nameTextContent,
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 15.0.dp,
//                        y = 16.0.dp
//                    )
//                )
//            )
//        }
//        Frame57(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopCenter,
//                offset = DpOffset(
//                    x = 0.0.dp,
//                    y = 429.0.dp
//                )
//            )
//        ) {
//            YyyyMmDd(
//                birthdateTextContent = birthdateTextContent,
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 15.0.dp,
//                        y = 16.0.dp
//                    )
//                )
//            )
//        }
//        Frame58(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopCenter,
//                offset = DpOffset(
//                    x = 0.0.dp,
//                    y = 523.0.dp
//                )
//            )
//        ) {
//            Class84366295416(
//                phoneNumberTextContent = phoneNumberTextContent,
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 15.0.dp,
//                        y = 16.0.dp
//                    )
//                )
//            )
//        }
//        Frame59(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopCenter,
//                offset = DpOffset(
//                    x = 0.0.dp,
//                    y = 617.0.dp
//                )
//            )
//        ) {
//            HoChiMinhCity(
//                addressTextContent = addressTextContent,
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 15.0.dp,
//                        y = 16.0.dp
//                    )
//                )
//            )
//        }
//        Frame60(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopCenter,
//                offset = DpOffset(
//                    x = 0.0.dp,
//                    y = 711.0.dp
//                )
//            )
//        ) {
//            Student(
//                occupationTextContent = occupationTextContent,
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 15.0.dp,
//                        y = 16.0.dp
//                    )
//                )
//            )
//        }
//        Frame61(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopCenter,
//                offset = DpOffset(
//                    x = 0.0.dp,
//                    y = 805.0.dp
//                )
//            )
//        ) {
//            Female(
//                genderTextContent = genderTextContent,
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 15.0.dp,
//                        y = 16.0.dp
//                    )
//                )
//            )
//            Vector321(
//                onGenderOptionButtonTapped = onGenderOptionButtonTapped,
//                modifier = Modifier.boxAlign(
//                    alignment = Alignment.TopStart,
//                    offset = DpOffset(
//                        x = 315.68750006556706.dp,
//                        y = 21.31250013933003.dp
//                    )
//                )
//            )
//        }
//        Name(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopStart,
//                offset = DpOffset(
//                    x = 23.0.dp,
//                    y = 309.0.dp
//                )
//            )
//        )
//        DayOfBirth(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopStart,
//                offset = DpOffset(
//                    x = 23.0.dp,
//                    y = 403.0.dp
//                )
//            )
//        )
//        Phone(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopStart,
//                offset = DpOffset(
//                    x = 23.0.dp,
//                    y = 497.0.dp
//                )
//            )
//        )
//        Address(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopStart,
//                offset = DpOffset(
//                    x = 23.0.dp,
//                    y = 591.0.dp
//                )
//            )
//        )
//        Occupation(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopStart,
//                offset = DpOffset(
//                    x = 23.0.dp,
//                    y = 685.0.dp
//                )
//            )
//        )
//        Gender(
//            modifier = Modifier.boxAlign(
//                alignment = Alignment.TopStart,
//                offset = DpOffset(
//                    x = 23.0.dp,
//                    y = 779.0.dp
//                )
//            )
//        )
        BaoNgu(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = 256.0.dp
                )
            )
        )
        Frame47(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 886.0.dp
                )
            )
        ) {
            AccountLink(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Frame48(
                onGoogleAccountLinkButtonTapped = onGoogleAccountLinkButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 56.0.dp
                    )
                )
            ) {
                Google(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 69.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Group99(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 21.0.dp,
                            y = 10.0.dp
                        )
                    )
                ) {
                    Ellipse1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Ellipse35(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 7.25.dp,
                                y = 7.25.dp
                            )
                        )
                    )
                }
            }
            Frame49(
                onFacebookAccountLinkButtonTapped = onFacebookAccountLinkButtonTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 115.0.dp
                    )
                )
            ) {
                Facebook(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 70.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Group98(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 21.0.dp,
                            y = 10.0.dp
                        )
                    )
                ) {
                    Ellipse36(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Ellipse2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Vector161(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.0.dp,
                                y = 8.00006103515625.dp
                            )
                        )
                    )
                }
            }
            Rectangle67(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 182.0.dp
                    )
                )
            )
        }
        Frame50(
            onSignOutButtonTapped = onSignOutButtonTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 1094.0.dp
                )
            )
        ) {
            SignOut(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 11.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 1264)
@Composable
private fun Profile1Preview() {
    MaterialTheme {
        RelayContainer {
            Profile1(
                onBackToHomepageButtonTapped = {},
                onSignOutButtonTapped = {},
                onHomepageButtonTapped = {},
                onStoreButtonTapped = {},
                onStatisticButtonTapped = {},
                onInventoryButtonTapped = {},
                onHistoryButtonTapped = {},
                fullnameTextContent = "Bao Ngu",
                birthdateTextContent = "yyyy-mm-dd",
                phoneNumberTextContent = "+84 366 295 416",
                addressTextContent = "Ho Chi Minh City",
                occupationTextContent = "Student",
                genderContent = UserGender.NONE,
                onGenderOptionButtonTapped = {},
                onGoogleAccountLinkButtonTapped = {},
                onFacebookAccountLinkButtonTapped = {},
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Line12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_line_12),
        modifier = modifier
            .requiredWidth(150.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 10.6976318359375.dp,
                    top = 2.66668701171875.dp,
                    end = 10.697715759277344.dp,
                    bottom = 11.999979019165039.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector1),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 5.348876953125.dp,
                    top = 9.33331298828125.dp,
                    end = 4.193613052368164.dp,
                    bottom = 2.66668701171875.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Store(
    onStoreButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 27.0784912109375.dp,
                    top = 11.0.dp,
                    end = 285.82848739624023.dp,
                    bottom = 14.0.dp
                )
            )
            .tappable(onTap = onStoreButtonTapped)
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector2),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 3.510009765625.dp,
                    top = 3.9000244140625.dp,
                    end = 3.509988784790039.dp,
                    bottom = 9.632976531982422.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Statistic(
    onStatisticButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .tappable(onTap = onStatisticButtonTapped)
            .requiredWidth(39.0.dp)
            .requiredHeight(39.0.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector3),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 3.75.dp,
                    top = 11.25.dp,
                    end = 3.75.dp,
                    bottom = 3.75.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector4),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 1.875.dp,
                    top = 3.75.dp,
                    end = 1.875.dp,
                    bottom = 13.125.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Archive(
    onInventoryButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .tappable(onTap = onInventoryButtonTapped)
            .requiredWidth(30.0.dp)
            .requiredHeight(30.0.dp)
    )
}

@Composable
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector5),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 1.0833740234375.dp,
                    top = 1.08331298828125.dp,
                    end = 1.0832881927490234.dp,
                    bottom = 1.0833492279052734.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector6),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 7.5833740234375.dp,
                    top = 5.41668701171875.dp,
                    end = 11.9166259765625.dp,
                    bottom = 11.916646003723145.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun History(
    onHistoryButtonTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .tappable(onTap = onHistoryButtonTapped)
            .requiredWidth(26.0.dp)
            .requiredHeight(26.0.dp)
    )
}

@Composable
fun Frame43(
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
            .requiredWidth(345.0.dp)
            .requiredHeight(57.0.dp)
    )
}

@Composable
fun Vector7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector7),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 14.0.dp,
                    top = 15.0.dp,
                    end = 14.058818817138672.dp,
                    bottom = 18.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Frame42(
    onHomepageButtonTapped: () -> Unit,
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
            .tappable(onTap = onHomepageButtonTapped)
            .requiredWidth(61.0.dp)
            .requiredHeight(61.0.dp)
            .relayDropShadow(
                color = Color(
                    alpha = 63,
                    red = 80,
                    green = 78,
                    blue = 30
                ),
                borderRadius = 50.0.dp,
                blur = 4.0.dp,
                offsetX = 0.0.dp,
                offsetY = 4.0.dp,
                spread = 0.0.dp
            )
    )
}

@Composable
fun BottomNav(
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
            .requiredWidth(390.0.dp)
            .requiredHeight(113.0.dp)
    )
}

@Composable
fun Arrow3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_arrow_3),
        modifier = modifier
            .requiredWidth(14.0.dp)
            .requiredHeight(0.0.dp)
    )
}

@Composable
fun Frame54(
    onBackToHomepageButtonTapped: () -> Unit,
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
        modifier = modifier
            .tappable(onTap = onBackToHomepageButtonTapped)
            .requiredWidth(28.0.dp)
            .requiredHeight(28.0.dp)
    )
}

@Composable
fun Vector8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector8),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector9),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 43.3023681640625.dp,
                    top = 20.348587036132812.dp,
                    end = 41.667057037353516.dp,
                    bottom = 43.68479919433594.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector10),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 20.5936279296875.dp,
                    top = 93.3424301147461.dp,
                    end = 21.2691650390625.dp,
                    bottom = 0.000827789306640625.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector11),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 20.5936279296875.dp,
                    top = 113.65240478515625.dp,
                    end = 21.2691650390625.dp,
                    bottom = 0.000835418701171875.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector19(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector19),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector20(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector20),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.0.dp,
                    top = 0.6974296569824219.dp,
                    end = 76.66418123245239.dp,
                    bottom = 24.53319501876831.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector21(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector21),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 3.6640625.dp,
                    top = 15.746496200561523.dp,
                    end = 73.00011873245239.dp,
                    bottom = 9.484128475189209.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector22),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 21.092041015625.dp,
                    top = 16.51152801513672.dp,
                    end = 55.572136878967285.dp,
                    bottom = 8.719087600708008.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector23),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 39.457763671875.dp,
                    top = 25.23064613342285.dp,
                    end = 37.206414222717285.dp,
                    bottom = 0.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector24),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 57.90869140625.dp,
                    top = 15.321765899658203.dp,
                    end = 18.755495071411133.dp,
                    bottom = 9.908849716186523.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector25),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 75.4239501953125.dp,
                    top = 15.7103271484375.dp,
                    end = 1.2402276992797852.dp,
                    bottom = 9.520297527313232.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector26(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector26),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 76.6641845703125.dp,
                    top = 0.0.dp,
                    end = 0.0.dp,
                    bottom = 25.230623245239258.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 11.448486328125.dp,
                    top = 4.582759857177734.dp,
                    end = 8.648941040039062.dp,
                    bottom = 0.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 20.5936279296875.dp,
                    top = 113.65240478515625.dp,
                    end = 21.2691650390625.dp,
                    bottom = 0.000835418701171875.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector12),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 88.9742431640625.dp,
                    top = 82.91233825683594.dp,
                    end = 12.584789276123047.dp,
                    bottom = 35.252079010009766.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector13(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector13),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 55.1031494140625.dp,
                    top = 94.39692687988281.dp,
                    end = 51.57097244262695.dp,
                    bottom = 27.705976486206055.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector27(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector27),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector28(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector28),
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 2.0589599609375.dp,
                    top = 0.0.dp,
                    end = 0.0.dp,
                    bottom = 6.695583343505859.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 55.1031494140625.dp,
                    top = 94.39692687988281.dp,
                    end = 51.57097244262695.dp,
                    bottom = 27.705976486206055.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector14(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector14),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 41.932861328125.dp,
                    top = 58.35740661621094.dp,
                    end = 40.00011444091797.dp,
                    bottom = 72.96224784851074.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector15),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 44.3336181640625.dp,
                    top = 20.913299560546875.dp,
                    end = 42.698280334472656.dp,
                    bottom = 44.25190734863281.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector16(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector16),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 38.9075927734375.dp,
                    top = 15.202117919921875.dp,
                    end = 37.48118591308594.dp,
                    bottom = 87.5556869506836.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector17(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector17),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 39.5806884765625.dp,
                    top = 14.9146728515625.dp,
                    end = 38.191490173339844.dp,
                    bottom = 101.40996170043945.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector18),
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 30.044189453125.dp,
                    top = 6.52215576171875.dp,
                    end = 28.75273895263672.dp,
                    bottom = 53.847023010253906.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 0.4725341796875.dp,
                    top = 0.4826507568359375.dp,
                    end = 0.0.dp,
                    bottom = 1.3779754638671875.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
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
        modifier = modifier
            .requiredWidth(146.0.dp)
            .requiredHeight(151.0.dp)
    )
}

@Composable
fun Profile(modifier: Modifier = Modifier) {
    RelayText(
        content = "Profile",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun BaoNgu1(
    nameTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = nameTextContent,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun UserInfoTextField(
    label: String = "",
    value: String = "",
    placeholder: String ="",
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    placeHolder: String = ""
) {
    Column(
        modifier = Modifier.width(344.dp)
    ) {
        Text(
            text = label,
            fontSize = 16.sp,
            fontFamily = inter,
            lineHeight = 1.21.em,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Medium,
            maxLines = Int.MAX_VALUE,
            modifier = Modifier.padding(start = 5.dp)
        )
        UserInfoTextBox(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            placeholder = placeHolder
        )
    }
}

@Composable
fun UserInfoDropDownField(
    label: String = "",
    value: UserGender = UserGender.NONE,
    onValueChange: (UserGender) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.width(344.dp)
    ) {
        // Label for the dropdown
        Text(
            text = label,
            fontSize = 16.sp,
            fontFamily = com.example.budgeto.screensfonts.inter,
            lineHeight = 1.21.em,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Medium,
            maxLines = Int.MAX_VALUE,
            modifier = Modifier.padding(start = 5.dp)
        )
        // Dropdown for selecting an option
        UserInfoDropDown(
            value = value,
            onValueChange = onValueChange,
            options = UserGender.values().toList(), // Use enum values as options
            modifier = modifier,
            placeHolder = "Choose Gender"
        )
    }
}


@Composable
fun UserNameField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier
) {
    UserInfoTextField(
        label = "Name",
        value = value,
        placeholder = "Enter your name",
        onValueChange = onValueChange,
        modifier = modifier
    )
}

@Composable
fun DayOfBirthField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier
) {
    UserInfoTextField(
        label = "Day of birth",
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        placeHolder = "yyyy-mm-dd"
    )
}

@Composable
fun PhoneField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier
) {
    UserInfoTextField(
        label = "Phone",
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
    )
}

@Composable
fun AddressField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier
) {
    UserInfoTextField(
        label = "Address",
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
    )
}

@Composable
fun OccupationField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier
) {
    UserInfoTextField(
        label = "Occupation",
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
    )
}

@Composable
fun GenderDropdownField(
    selectedGender: UserGender = UserGender.NONE,
    onValueChange: (UserGender) -> Unit,
    modifier: Modifier
) {
    UserInfoDropDownField(
        label = "Gender",
        value = selectedGender,
        onValueChange = onValueChange,
        modifier = modifier
    )
}

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
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun YyyyMmDd(
    birthdateTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = birthdateTextContent,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

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
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun Class84366295416(
    phoneNumberTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = phoneNumberTextContent,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Frame58(
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
            .requiredWidth(344.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun HoChiMinhCity(
    addressTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = addressTextContent,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

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
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun Student(
    occupationTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = occupationTextContent,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
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
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun Female(
    genderTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = genderTextContent,
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Vector321(
    onGenderOptionButtonTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector_321),
        modifier = modifier
            .tappable(onTap = onGenderOptionButtonTapped)
            .requiredWidth(3.0.dp)
            .requiredHeight(6.375.dp)
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
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun Name(modifier: Modifier = Modifier) {
    RelayText(
        content = "Name",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(85.0.dp)
    )
}

@Composable
fun DayOfBirth(modifier: Modifier = Modifier) {
    RelayText(
        content = "Day of birth",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(132.0.dp)
    )
}

@Composable
fun Phone(modifier: Modifier = Modifier) {
    RelayText(
        content = "Phone ",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(132.0.dp)
    )
}

@Composable
fun Address(modifier: Modifier = Modifier) {
    RelayText(
        content = "Address",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(132.0.dp)
    )
}

@Composable
fun Occupation(modifier: Modifier = Modifier) {
    RelayText(
        content = "Occupation",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(132.0.dp)
    )
}

@Composable
fun Gender(modifier: Modifier = Modifier) {
    RelayText(
        content = "Gender",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(132.0.dp)
    )
}

@Composable
fun BaoNgu(modifier: Modifier = Modifier) {
    RelayText(
        content = "Bao Ngu",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun AccountLink(modifier: Modifier = Modifier) {
    RelayText(
        content = "Account Link",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Google(modifier: Modifier = Modifier) {
    RelayText(
        content = "Google",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_ellipse_1),
        modifier = modifier
            .requiredWidth(30.0.dp)
            .requiredHeight(30.0.dp)
    )
}

@Composable
fun Ellipse35(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_ellipse_35),
        modifier = modifier
            .requiredWidth(13.50000286102295.dp)
            .requiredHeight(13.500015258789062.dp)
    )
}

@Composable
fun Group99(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(30.0.dp)
            .requiredHeight(30.0.dp)
    )
}

@Composable
fun Frame48(
    onGoogleAccountLinkButtonTapped: () -> Unit,
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
            .tappable(onTap = onGoogleAccountLinkButtonTapped)
            .requiredWidth(321.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun Facebook(modifier: Modifier = Modifier) {
    RelayText(
        content = "Facebook",
        fontSize = 16.0.sp,
        fontFamily = inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Ellipse36(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_ellipse_36),
        modifier = modifier
            .requiredWidth(18.0.dp)
            .requiredHeight(18.0.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_ellipse_2),
        modifier = modifier
            .requiredWidth(30.0.dp)
            .requiredHeight(30.0.dp)
    )
}

@Composable
fun Vector161(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_vector_161),
        modifier = modifier
            .requiredWidth(6.0.dp)
            .requiredHeight(12.75.dp)
    )
}

@Composable
fun Group98(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(30.0.dp)
            .requiredHeight(30.0.dp)
    )
}

@Composable
fun Frame49(
    onFacebookAccountLinkButtonTapped: () -> Unit,
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
            .tappable(onTap = onFacebookAccountLinkButtonTapped)
            .requiredWidth(321.0.dp)
            .requiredHeight(52.0.dp)
    )
}

@Composable
fun Rectangle67(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.profile_1_rectangle_67),
        modifier = modifier
            .requiredWidth(348.0.dp)
            .requiredHeight(15.0.dp)
    )
}

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
        modifier = modifier
            .requiredWidth(344.0.dp)
            .requiredHeight(192.0.dp)
            .relayDropShadow(
                color = Color(
                    alpha = 38,
                    red = 0,
                    green = 0,
                    blue = 0
                ),
                borderRadius = 5.0.dp,
                blur = 4.0.dp,
                offsetX = 0.0.dp,
                offsetY = 4.0.dp,
                spread = 0.0.dp
            )
    )
}

@Composable
fun SignOut(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sign out",
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
fun Frame50(
    onSignOutButtonTapped: () -> Unit,
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
            .tappable(onTap = onSignOutButtonTapped)
            .requiredWidth(344.0.dp)
            .requiredHeight(41.0.dp)
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}
