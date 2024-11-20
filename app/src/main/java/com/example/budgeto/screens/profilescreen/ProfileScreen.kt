package com.example.budgeto.screens.profilescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.budgeto.data.enums.user.UserGender
import com.example.budgeto.screensfonts.inter
import com.example.budgeto.viewmodel.ProfileViewModel
import com.google.relay.compose.BoxScopeInstanceImpl.align
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
    val generalInfo by viewModel.userGeneralInfo.collectAsState()

    var localFullName by remember { mutableStateOf(generalInfo?.fullName?:"") }
    var localBirthDate by remember { mutableStateOf(generalInfo?.dateOfBirth?:"") }
    var localPhoneNumber by remember { mutableStateOf(generalInfo?.phone?:"") }
    var localAddress by remember { mutableStateOf(generalInfo?.address?:"") }
    var localOccupation by remember { mutableStateOf(generalInfo?.occupation?:"") }
    var localGender by remember { mutableStateOf(UserGender.NONE) }

    LaunchedEffect(generalInfo) {
        generalInfo?.let {
            localFullName = it.fullName
            localBirthDate = it.dateOfBirth
            localPhoneNumber = it.phone
            localAddress = it.address
            localOccupation = it.occupation
            localGender = it.gender
        }
    }

    ProfileContent(
        fullnameTextContent = localFullName,
        birthdateTextContent = localBirthDate,
        phoneNumberTextContent = localPhoneNumber,
        addressTextContent = localAddress,
        occupationTextContent = localOccupation,
        genderContent = localGender,
        onBackToHomepageButtonTapped = {},
        onSignOutButtonTapped = {},
        onGenderOptionButtonTapped = {},
        onGoogleAccountLinkButtonTapped = {},
        onFacebookAccountLinkButtonTapped = {},
        onNameFieldChanged = {
            localFullName = it
        },
        onNameFieldUpdate = {
            viewModel.updateUserGeneralInfoField { info ->
                info.copy(fullName = localFullName)
            }
        },
        onPhoneFieldChanged = {
            localPhoneNumber = it
        },
        onPhoneFieldUpdate = {
            viewModel.updateUserGeneralInfoField { info ->
                info.copy(phone = localPhoneNumber)
            }
        },
        onAddressFieldChanged = {
            localAddress = it
        },
        onAddressFieldUpdate = {
            viewModel.updateUserGeneralInfoField { info ->
                info.copy(address = localAddress)
            }
        },
        onOccupationFieldChanged = {
            localOccupation = it
        },
        onOccupationFieldUpdate = {
            viewModel.updateUserGeneralInfoField { info ->
                info.copy(occupation = localOccupation)
            }
        },
        onGenderFieldChanged = {
            localGender = it
        },
        onGenderFieldUpdate = {
            viewModel.updateUserGeneralInfoField { info ->
                info.copy(gender = localGender)
            }
        },
        onBirthDayFieldChanged = {
            localBirthDate = it
        },
        onBirthDayFieldUpdate = {
            viewModel.updateUserGeneralInfoField { info ->
                info.copy(dateOfBirth = localBirthDate)
            }
        },
        modifier = modifier,
    )
}


@Composable
fun ProfileContent(
    modifier: Modifier = Modifier,
    fullnameTextContent: String = "",
    birthdateTextContent: String = "",
    phoneNumberTextContent: String = "",
    addressTextContent: String = "",
    occupationTextContent: String = "",
    genderContent: UserGender = UserGender.NONE,
    onBackToHomepageButtonTapped: () -> Unit = {},
    onSignOutButtonTapped: () -> Unit = {},
    onGenderOptionButtonTapped: () -> Unit = {},
    onGoogleAccountLinkButtonTapped: () -> Unit = {},
    onFacebookAccountLinkButtonTapped: () -> Unit = {},
    onNameFieldChanged: (String) -> Unit = {},
    onNameFieldUpdate: () -> Unit = {},
    onPhoneFieldChanged: (String) -> Unit = {},
    onPhoneFieldUpdate: () -> Unit = {},
    onAddressFieldChanged: (String) -> Unit = {},
    onAddressFieldUpdate: () -> Unit = {},
    onOccupationFieldChanged: (String) -> Unit = {},
    onOccupationFieldUpdate: () -> Unit = {},
    onGenderFieldChanged: (UserGender) -> Unit = {},
    onGenderFieldUpdate: () -> Unit = {},
    onBirthDayFieldChanged: (String) -> Unit = {},
    onBirthDayFieldUpdate: () -> Unit = {},
) {

    TopLevel(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {

//            Frame54(
//                onBackToHomepageButtonTapped = onBackToHomepageButtonTapped,
//                modifier = modifier
//                    .align(Alignment.TopEnd)
//                    .padding(top = 25.dp, end = 25.dp)
//            ) {
//                Arrow3(
//                    modifier = Modifier.boxAlign(
//                        alignment = Alignment.TopStart,
//                        offset = DpOffset(
//                            x = 7.0.dp,
//                            y = 6.6360321044921875.dp
//                        )
//                    )
//                )
//            }

            Avatar(
                modifier = modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 50.dp)
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
                        Image(
                            painter = painterResource(id = R.drawable.z5984713760376_5a890c725e3882c36b5b405cae1bdedd),
                            contentDescription = "Back Arrow",
                            modifier = modifier
                                .fillMaxSize()
                        )
                    }
                }
            }

            Profile(
                modifier = modifier
                    .align(Alignment.TopStart)
                    .padding(top = 25.dp, start = 25.dp)
            )

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(
                        top = 250.dp,
                        bottom = 0.dp
                    ) // Apply padding to the Box, not the Column
            ) {
                val scrollState = rememberScrollState()

                Column(
                    modifier = Modifier
                        .fillMaxSize() // Ensure the Column takes up the entire height
                        .verticalScroll(scrollState) // Enable scrolling
                        .padding(bottom = 70.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(14.dp),
                ) {
                    FullNameTitle(
                        text = fullnameTextContent,
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
                    )

                    UserNameField(
                        value = fullnameTextContent,
                        onValueChange = onNameFieldChanged,
                        modifier = Modifier.fillMaxWidth(),
                        onFieldUpdated = onNameFieldUpdate
                    )
                    DayOfBirthField(
                        value = birthdateTextContent,
                        onValueChange = onBirthDayFieldChanged,
                        modifier = Modifier.fillMaxWidth(),
                        onFieldUpdated = onBirthDayFieldUpdate
                    )
                    PhoneField(
                        value = phoneNumberTextContent,
                        onValueChange = onPhoneFieldChanged,
                        modifier = Modifier.fillMaxWidth(),
                        onFieldUpdated = onPhoneFieldUpdate
                    )
                    AddressField(
                        value = addressTextContent,
                        onValueChange = onAddressFieldChanged,
                        modifier = Modifier.fillMaxWidth(),
                        onFieldUpdated = onAddressFieldUpdate
                    )
                    OccupationField(
                        value = occupationTextContent,
                        onValueChange = onOccupationFieldChanged,
                        modifier = Modifier.fillMaxWidth(),
                        onFieldUpdated = onOccupationFieldUpdate
                    )
                    GenderDropdownField(
                        onValueChange = onGenderFieldChanged,
                        modifier = Modifier.fillMaxWidth(),
                    )

                    Frame47(
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
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


                }
                Frame50(
                    onSignOutButtonTapped = onSignOutButtonTapped,
                    modifier = modifier
                        .align(Alignment.BottomCenter)
                ) {
                    SignOut(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(x = 0.dp, y = 0.dp)
                        )
                    )
                }
            }
        }
    }
}

@Preview(widthDp = 390, heightDp = 1264)
@Composable
private fun Profile1Preview() {
    MaterialTheme {
        RelayContainer {
            ProfileContent(
                onBackToHomepageButtonTapped = {},
                onSignOutButtonTapped = {},
                fullnameTextContent = "User name",
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
        modifier = modifier
            .tappable(onTap = onBackToHomepageButtonTapped)
            .requiredWidth(32.0.dp)
            .requiredHeight(32.0.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_1_arrow_3),
            contentDescription = "Back Arrow",
            modifier = Modifier
                .size(24.dp)
                .align(Alignment.Center)
        )
    }
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
    onValueChange: (String) -> Unit = {},
    modifier: Modifier,
    placeHolder: String = "...",
    onFieldUpdated : () -> Unit = {}
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
            placeholder = placeHolder,
            onEnterPressed = onFieldUpdated,
            onExit = onFieldUpdated
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
    modifier: Modifier,
    onFieldUpdated: () -> Unit = {}
) {
    UserInfoTextField(
        label = "Name",
        value = value,
        placeHolder = "Enter your name",
        onValueChange = onValueChange,
        modifier = modifier,
        onFieldUpdated = onFieldUpdated
    )
}

@Composable
fun DayOfBirthField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    onFieldUpdated: () -> Unit = {}
) {
    UserInfoTextField(
        label = "Day of birth",
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        placeHolder = "Enter day of birth (yyyy-mm-dd)",
        onFieldUpdated = onFieldUpdated
    )
}

@Composable
fun PhoneField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    onFieldUpdated: () -> Unit = {}
) {
    UserInfoTextField(
        label = "Phone",
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        placeHolder = "Enter your phone number",
        onFieldUpdated = onFieldUpdated
    )
}

@Composable
fun AddressField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    onFieldUpdated: () -> Unit = {}
) {
    UserInfoTextField(
        label = "Address",
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        onFieldUpdated = onFieldUpdated,
        placeHolder = "Enter your address"
    )
}

@Composable
fun OccupationField(
    value: String = "",
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    onFieldUpdated: () -> Unit = {}
) {
    UserInfoTextField(
        label = "Occupation",
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        onFieldUpdated = onFieldUpdated,
        placeHolder = "Enter occupation"
    )
}

@Composable
fun GenderDropdownField(
    selectedGender: UserGender = UserGender.NONE,
    onValueChange: (UserGender) -> Unit,
    modifier: Modifier = Modifier
) {
    var gender by remember { mutableStateOf(selectedGender) }

    UserInfoDropDownField(
        label = "Gender",
        value = gender,
        onValueChange = { newGender ->
            gender = newGender
            onValueChange(newGender)
        },
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
fun FullNameTitle(
    text: String = "",
    modifier: Modifier = Modifier
) {
    RelayText(
        content = text,
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
