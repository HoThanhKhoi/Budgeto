package com.example.budgeto.screens.settingscreen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
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
fun SettingScreen(
    onXButtonTapped: () -> Unit = {},
    modifier: Modifier = Modifier.fillMaxHeight()
){
    Setting1(
        onXButtonTapped = onXButtonTapped,
        modifier = modifier.rowWeight(1.0f).columnWeight(1.0f)
    )

}

@Composable
fun Setting1(
    modifier: Modifier = Modifier,
    onXButtonTapped: () -> Unit = {}
) {
    val accountList = listOf("Option 1", "Option 2", "Option 3")

    val categoryList = listOf(
        Triple("Food", "100.000 đ", R.drawable.setting_1_food),
        Triple("Cafe", "0 đ", R.drawable.setting_1_cafe),
        Triple("Entertainment", "0 đ", R.drawable.setting_1_retro_tv),
        Triple("Transport", "0 đ", R.drawable.setting_1_public_transportation),
        Triple("Health", "0 đ", R.drawable.setting_1_heart_with_pulse),
        Triple("Family", "0 đ", R.drawable.setting_1_defend_family),
        Triple("Pets", "0 đ", R.drawable.setting_1_pets),
        Triple("Clothes", "0 đ", R.drawable.setting_1_clothes),
        Triple("Clothes", "0 đ", R.drawable.setting_1_clothes),
        Triple("Clothes", "0 đ", null),
    )

    var title by remember { mutableStateOf("") }
    var type by remember { mutableStateOf("Expenses") }
    var description by remember { mutableStateOf("") }

    val scrollState= rememberScrollState()

    TopLevel(modifier = modifier
        .verticalScroll(scrollState)
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(bottom = 20.dp)
    ) {

        //region Setting header
        Setting(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 33.0.dp
                )
            )
        )
        Frame54(
            onXButtonTapped = onXButtonTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 339.0.dp,
                    y = 29.0.dp
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
                            x = 1.6513671875.dp,
                            y = 1.6516436636447906.dp
                        )
                    )
                )
                Vector320(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 2.75.dp,
                            y = -0.9999978989412046.dp
                        )
                    )
                )
            }
        }
        Frame64(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 1000.0.dp,
                    y = 82.0.dp
                )
            )
        ) {
            Rectangle73(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 6.0.dp
                    )
                )
            )
        }
        //endregion

        //region General Settings
        Frame47(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 82.0.dp
                )
            )
        ) {
            GeneralSettings(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 22.0.dp
                    )
                )
            )

            //region Language
            Frame48(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 56.0.dp
                    )
                )
            ) {
                Language(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame52(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 175.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    English(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                    Vector321(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 114.0000000655675.dp,
                                y = 7.000000139330046.dp
                            )
                        )
                    )
                }
            }
            //endregion

            //region Currency
            Frame49(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 115.0.dp
                    )
                )
            ) {
                DefaultCurrency(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame53(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 175.0.dp,
                            y = 15.0.dp
                        )
                    )
                ) {
                    VN(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                    Vector322(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 114.0000000655675.dp,
                                y = 6.9999972783071005.dp
                            )
                        )
                    )
                }
            }
            //endregion

            //region Date
            Frame50(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 174.0.dp
                    )
                )
            ) {
                DateFormat(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame57(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 175.0.dp,
                            y = 15.0.dp
                        )
                    )
                ) {
                    MmDdYyyy(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                    Vector323(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 114.0000000655675.dp,
                                y = 6.999996324632788.dp
                            )
                        )
                    )
                }
            }

            Frame51(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 233.0.dp
                    )
                )
            ) {
                FirstDayOfTheWeek(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                FirstDayOfTheMonth(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 42.0.dp
                        )
                    )
                )
                FirstMonthOfTheYear(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 68.0.dp
                        )
                    )
                )
                Monday(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 239.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Class1st(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 279.0.dp,
                            y = 42.0.dp
                        )
                    )
                )
                January(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 239.0.dp,
                            y = 68.0.dp
                        )
                    )
                )
            }
            Rectangle67(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 353.0.dp
                    )
                )
            )
            //endregion

        }
        //endregion

        //region Notification Settigns
        Frame55(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 467.0.dp
                )
            )
        ) {
            NotificationSettings(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 22.0.dp
                    )
                )
            )
            Frame71(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 56.0.dp
                    )
                )
            ) {
                DailyMissionsReminder(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame73(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 258.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Rectangle71(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 29.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                }
            }
            Frame72(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 115.0.dp
                    )
                )
            ) {
                EventNotification(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame74(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 258.0.dp,
                            y = 16.0.dp
                        )
                    )
                ) {
                    Rectangle72(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 2.0.dp,
                                y = 2.0.dp
                            )
                        )
                    )
                }
            }
            Rectangle69(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 182.0.dp
                    )
                )
            )
        }
        //endregion

        //region Category Settings
        Frame56(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 681.0.dp
                )
            )
        ) {
            // Header for Category Settings
            CategorySettings(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 22.0.dp
                    )
                )
            )

            // Account Dropdown Section (Frame58)
            Frame58(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 11.dp,
                        y = 56.dp
                    )
                )
            ) {
                Account(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 15.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
                Frame69(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 175.0.dp,
                            y = 6.0.dp
                        )
                    )
                ) {
                    Frame69WithDropdown(
                        options = accountList,
                        arrowColor = Color.Black// Add your options here
                    )
                }
            }

            // Category List Section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 120.dp) // Ensures the list starts below Frame58
            ) {
                CategorySettingsListScrollableAligned(
                    categoryList = categoryList
                )
            }

            // Apply All Section (Frame68 and Rectangle68)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 400.dp) // Space between the list and the footer
            ) {
                Frame68(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    AddCategory(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 15.0.dp,
                                y = 16.0.dp
                            )
                        )
                    )
                    Frame70(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 223.0.dp,
                                y = 16.0.dp
                            )
                        )
                    ) {
                        Add(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 27.0.dp,
                                    y = 2.0.dp
                                )
                            )
                        )
                        Frame70WithDialog(
                            title = title,
                            onTitleChange = { title = it },
                            type = type,
                            onTypeChange = { type = it },
                            description = description,
                            onDescriptionChange = { description = it }
                        )

                        Log.d("Category Settings", "Title: $title, Type: $type, Description: $description")
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Rectangle68(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(2.dp) // Divider or decorative bar
                )
            }
        }
        //endregion
    }
        //endregion
}

@Preview(widthDp = 390, heightDp = 1200)
@Composable
private fun Setting1Preview() {
    MaterialTheme {
        RelayContainer {
            Setting1(
                onXButtonTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

//region category pop up
@Composable
fun CategoryDialog(
    onDismissRequest: () -> Unit,
    onSave: (String, String, String) -> Unit,
    initialTitle: String,
    initialType: String,
    initialDescription: String
) {
    var title by remember { mutableStateOf(initialTitle) }
    var type by remember { mutableStateOf(initialType) }
    var description by remember { mutableStateOf(initialDescription) }
    val typeOptions = listOf("Expenses", "Income")

    var selectedIcon by remember { mutableStateOf<Int?>(null) }
    var showIconPicker by remember { mutableStateOf(false) }

    val iconOptions = listOf(
        android.R.drawable.ic_menu_camera,
        android.R.drawable.ic_menu_compass,
        android.R.drawable.ic_menu_call,
        android.R.drawable.ic_menu_gallery,
        R.drawable.setting_1_food,
        R.drawable.setting_1_cafe,
        R.drawable.setting_1_retro_tv,
        R.drawable.setting_1_public_transportation,
        R.drawable.setting_1_heart_with_pulse,
        R.drawable.setting_1_defend_family,
        R.drawable.setting_1_pets,
        R.drawable.setting_1_clothes
    )

    Dialog(onDismissRequest = { onDismissRequest() }) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            color = Color.White
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth()
            ) {
                // Header
                Text(
                    text = "Category",
                    style = MaterialTheme.typography.titleMedium, // Use a larger, bold font for emphasis
                    color = Color.Black,
                    modifier = Modifier.padding(bottom = 20.dp)
                )

                // Title Input Field
                OutlinedTextField(
                    value = title,
                    onValueChange = { title = it },
                    label = { Text("Enter the title") },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.DarkGray,
                        unfocusedBorderColor = Color.DarkGray,
                        focusedTextColor = Color.DarkGray,
                        unfocusedTextColor = Color.DarkGray,
                        focusedLabelColor = Color.DarkGray,
                        unfocusedLabelColor = Color.DarkGray,
                        cursorColor = Color.DarkGray
                    ),
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)
                )

                // Icon and Type Selection Row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Icon Placeholder
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .background(
                                color = Color(0xFFF0F0F0),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .clickable { showIconPicker = true },
                        contentAlignment = Alignment.Center
                    ) {
                        if (selectedIcon != null) {
                            Icon(
                                painter = painterResource(id = selectedIcon!!),
                                contentDescription = "Selected Icon",
                                modifier = Modifier.size(36.dp),
                                tint = Color.Black // Tint for a subtle modern look
                            )
                        } else {
                            Icon(
                                painter = painterResource(id = R.drawable.setting_1_food), // Placeholder icon
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(24.dp),
                                tint = Color.Gray
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp)) // Add space between icon and dropdown

                    // Type Dropdown
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                    ) {
                        DropdownWithLabel(
                            label = "Type",
                            options = typeOptions,
                            selectedOption = type,
                            onOptionSelected = { type = it }
                        )
                    }
                }

                if (showIconPicker) {
                    IconPickerDialog(
                        iconOptions = iconOptions, // Pass your icon list here
                        onDismissRequest = { showIconPicker = false },
                        onIconSelected = { iconResId ->
                            selectedIcon = iconResId // Update the selected icon
                            showIconPicker = false
                        }
                    )
                }

                // Description Input Field
                OutlinedTextField(
                    value = description,
                    onValueChange = { description = it },
                    label = { Text("Description") },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.DarkGray,
                        unfocusedBorderColor = Color.DarkGray,
                        focusedTextColor = Color.DarkGray,
                        unfocusedTextColor = Color.DarkGray,
                        focusedLabelColor = Color.DarkGray,
                        unfocusedLabelColor = Color.DarkGray,
                        cursorColor = Color.DarkGray
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    maxLines = 4
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Save Button
                Button(
                    onClick = {
                        onSave(title, type, description)
                        onDismissRequest()
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = "Save",
                        style = MaterialTheme.typography.labelSmall,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
fun DropdownWithLabel(
    label: String,
    options: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Column {
        Text(
            text = label,
            style = MaterialTheme.typography.labelLarge,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        Box {
            Button(
                onClick = { expanded = true },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = selectedOption)
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Dropdown Arrow",
                        tint = Color.Black
                    )
                }
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                options.forEach { option ->
                    DropdownMenuItem(
                        onClick = {
                            onOptionSelected(option)
                            expanded = false
                        }
                    ) {
                        Text(text = option, color = Color.White)
                    }
                }
            }
        }
    }
}

@Composable
fun IconPickerDialog(
    iconOptions: List<Int>,
    onDismissRequest: () -> Unit,
    onIconSelected: (Int) -> Unit
) {
    Dialog(onDismissRequest = { onDismissRequest() }) {
        Surface(
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.padding(16.dp),
            color = Color.White
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Choose an Icon",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.Black,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                LazyVerticalGrid(
                    columns = GridCells.Fixed(4), // Show 4 icons per row
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(iconOptions) { iconResId ->
                        IconButton(
                            onClick = {
                                onIconSelected(iconResId)
                                onDismissRequest()
                            },
                            modifier = Modifier.size(64.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = iconResId),
                                contentDescription = null,
                                tint = Color.Unspecified,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
            }
        }
    }
}

//endregion

//region category item components
@Composable
fun CategoryItem(
    title: String,
    value: String,
    iconResId: Int?,
    modifier: Modifier = Modifier
) {
    RelayContainer(
        backgroundColor = Color.White,
        isStructured = false,
        radius = 5.0,
        strokeWidth = 1.0,
        strokeColor = Color.Black,
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(2f) // Ensures consistent height and width for the grid item
            .padding(2.dp) // Reduced padding for tighter layout
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 4.dp) // Reduced inner padding
        ) {
            // Icon
            if (iconResId != null) {
                RelayImage(
                    image = painterResource(id = iconResId),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(32.dp) // Slightly smaller icon
                )
                Spacer(modifier = Modifier.width(6.dp)) // Space between icon and text
            }

            Spacer(modifier = Modifier.width(6.dp)) // Reduced space between icon and text

            // Text
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxHeight()
            ) {
                RelayText(
                    content = title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )
                RelayText(
                    content = value,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,
                    textAlign = TextAlign.Start
                )
            }
        }
    }
}

@Composable
fun CategorySettingsListScrollableAligned(categoryList: List<Triple<String, String, Int?>>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // Two columns
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .padding(horizontal = 16.dp), // Matches the horizontal padding of Frame58
        horizontalArrangement = Arrangement.spacedBy(8.dp), // Consistent horizontal spacing
        verticalArrangement = Arrangement.spacedBy(8.dp), // Consistent vertical spacing
    ) {
        items(categoryList) { (title, value, iconResId) ->
            CategoryItem(
                title = title,
                value = value,
                iconResId = iconResId,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

//endregion


@Composable
fun GeneralSettings(modifier: Modifier = Modifier) {
    RelayText(
        content = "General Settings",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Language(modifier: Modifier = Modifier) {
    RelayText(
        content = "Language",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun English(modifier: Modifier = Modifier) {
    RelayText(
        content = "English",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector321(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_321),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
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
            red = 255,
            green = 255,
            blue = 255
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
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Frame48(
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun DefaultCurrency(modifier: Modifier = Modifier) {
    RelayText(
        content = "Default Currency",
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
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector322(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_322),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
    )
}

@Composable
fun Frame53(
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
        radius = 50.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(22.0.dp)
    )
}

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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun DateFormat(modifier: Modifier = Modifier) {
    RelayText(
        content = "Date Format",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun MmDdYyyy(modifier: Modifier = Modifier) {
    RelayText(
        content = "mm/dd/yyyy",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector323(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_323),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
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
        radius = 50.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(22.0.dp)
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun FirstDayOfTheWeek(modifier: Modifier = Modifier) {
    RelayText(
        content = "First day of the week",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun FirstDayOfTheMonth(modifier: Modifier = Modifier) {
    RelayText(
        content = "First day of the month",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun FirstMonthOfTheYear(modifier: Modifier = Modifier) {
    RelayText(
        content = "First month of the year",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Monday(modifier: Modifier = Modifier) {
    RelayText(
        content = "Monday",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Class1st(modifier: Modifier = Modifier) {
    RelayText(
        content = "1st",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun January(modifier: Modifier = Modifier) {
    RelayText(
        content = "January",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(103.0.dp)
    )
}

@Composable
fun Rectangle67(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_67),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(360.0.dp).relayDropShadow(
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
fun CategorySettings(modifier: Modifier = Modifier) {
    RelayText(
        content = "Category Settings",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
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
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "Default",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector324(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_324),
        modifier = modifier.requiredWidth(3.0.dp).requiredHeight(6.375.dp)
    )
}

@Composable
fun Frame69(
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
        radius = 50.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Frame69WithDropdown(options: List<String>, arrowColor: Color) {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf(options.firstOrNull() ?: "Select an option") }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp) // Set height to ensure enough space
            .border(0.5.dp, Color.Black, shape = RoundedCornerShape(8.dp))
            .clickable { expanded = true }
            .padding(horizontal = 16.dp, vertical = 8.dp) // Add padding for text and icon
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            // Display selected option
            Text(
                text = selectedOption,
                modifier = Modifier.weight(1f), // Ensure text takes up available space
                maxLines = 1,
                color = Color.Black,
                overflow = TextOverflow.Ellipsis // Handle overflow gracefully
            )

            // Add a dropdown indicator (e.g., arrow)
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Dropdown Arrow",
                tint = arrowColor
            )
        }

        // Dropdown menu
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    onClick = {
                        selectedOption = option
                        expanded = false
                    }
                ) {
                    Text(text = option)
                }
            }
        }
    }
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}


@Composable
fun Class01(modifier: Modifier = Modifier) {
    RelayText(
        content = "0 đ",
        fontFamily = com.example.budgeto.screensfonts.inter,
        color = Color(
            alpha = 255,
            red = 168,
            green = 168,
            blue = 168
        ),
        height = 1.2102272851126534.em,
        letterSpacing = -0.28.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame67(
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
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(61.0.dp)
    )
}

@Composable
fun Rectangle68(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_68),
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun AddCategory(modifier: Modifier = Modifier) {
    RelayText(
        content = "Add new Category",
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
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Add(modifier: Modifier = Modifier) {
    RelayText(
        content = "Add",
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272851126534.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame70(
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
        modifier = modifier.requiredWidth(84.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Frame70WithDialog(
    title: String,
    onTitleChange: (String) -> Unit,
    type: String,
    onTypeChange: (String) -> Unit,
    description: String,
    onDescriptionChange: (String) -> Unit
) {
    var showDialog by remember { mutableStateOf(false) }

    // Main UI component
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .border(1.dp, Color.Black, shape = RoundedCornerShape(8.dp))
            .clickable { showDialog = true }
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
    // Show the dialog when `showDialog` is true
    if (showDialog) {
        CategoryDialog(
            onDismissRequest = { showDialog = false },
            onSave = { updatedTitle, updatedType, updatedDescription ->
                // Pass updated values back to the parent component
                onTitleChange(updatedTitle)
                onTypeChange(updatedType)
                onDescriptionChange(updatedDescription)

                // Close the dialog
                showDialog = false
            },
            initialTitle = title,
            initialType = type,
            initialDescription = description
        )
    }
}



@Composable
fun Frame68(
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(500.0.dp).relayDropShadow(
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
fun NotificationSettings(modifier: Modifier = Modifier) {
    RelayText(
        content = "Notification Settings",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun DailyMissionsReminder(modifier: Modifier = Modifier) {
    RelayText(
        content = "Daily Missions Reminder",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle71(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_71),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Frame73(
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
        modifier = modifier.requiredWidth(49.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Frame71(
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun EventNotification(modifier: Modifier = Modifier) {
    RelayText(
        content = "Event Notification",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Rectangle72(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_72),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Frame74(
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
        modifier = modifier.requiredWidth(49.0.dp).requiredHeight(22.0.dp)
    )
}

@Composable
fun Frame72(
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
        modifier = modifier.requiredWidth(321.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun Rectangle69(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_69),
        modifier = modifier.requiredWidth(348.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Frame55(
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
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(189.0.dp).relayDropShadow(
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
fun Setting(modifier: Modifier = Modifier) {
    RelayText(
        content = "Setting",
        fontSize = 16.0.sp,
        fontFamily = com.example.budgeto.screensfonts.inter,
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector319(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_319),
        modifier = modifier.requiredWidth(5.303300768136978.dp).requiredHeight(5.303300768136978.dp)
    )
}

@Composable
fun Vector320(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_vector_320),
        modifier = modifier.requiredWidth(0.0.dp).requiredHeight(7.5.dp)
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
        modifier = modifier.graphicsLayer(rotationZ = -45.00000098057549f).requiredWidth(7.5.dp).requiredHeight(7.5.dp)
    )
}

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
fun Rectangle73(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.setting_1_rectangle_73),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(110.0.dp)
    )
}

@Composable
fun Frame64(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 127,
            red = 224,
            green = 224,
            blue = 224
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(1102.0.dp)
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
        modifier = modifier.fillMaxWidth().fillMaxHeight().requiredHeight(1190.dp)
    )
}
