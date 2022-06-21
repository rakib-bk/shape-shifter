package com.bkash.businessapp.shared.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bkash.businessapp.shared.ui.theme.inputBoxHint
import com.bkash.businessapp.shared.ui.theme.inputBoxLabel
import com.bkash.businessapp.shared.ui.theme.inputBoxCounter
import com.bkash.businessapp.shared.ui.theme.inputBoxText

@Composable
fun InputBox(
    modifier: Modifier = Modifier,
    value: String,
    onValueChanged: (String) -> Unit = {},
    labelText: String,
    hintText: String,
    singleLine: Boolean = true,
    showMaxCharacterCounter: Boolean = false,
    maxCharacterLimit: Int = 0,
    cursorColor: Color = Color.Black,
    keyboardType: KeyboardType = KeyboardType.Text,
    labelStyle: TextStyle = MaterialTheme.typography.inputBoxLabel,
    counterTextStyle: TextStyle = MaterialTheme.typography.inputBoxCounter,
    hintTextStyle: TextStyle = MaterialTheme.typography.inputBoxHint,
    inputTextStyle: TextStyle = MaterialTheme.typography.inputBoxText,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        var inputText by remember { mutableStateOf(value) }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .padding(end = 15.dp)
                    .weight(1f),
                maxLines = 1,
                text = labelText,
                style = labelStyle,
            )
            if (showMaxCharacterCounter && maxCharacterLimit > 0) {
                Text(
                    text = "${inputText.length}/$maxCharacterLimit",
                    style = counterTextStyle,
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        BasicTextField(
            value = inputText,
            onValueChange = {
                if (maxCharacterLimit > 0) {
                    if (it.length <= maxCharacterLimit) {
                        inputText = it
                        onValueChanged(inputText)
                    }
                } else {
                    inputText = it
                    onValueChanged(inputText)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically),
            textStyle = inputTextStyle,
            singleLine = singleLine,
            cursorBrush = SolidColor(cursorColor),
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType,
                autoCorrect = false,
            ),
            decorationBox = { innerTextField ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    if (inputText.isEmpty()) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = hintText,
                            style = hintTextStyle,
                        )
                    }
                }
                innerTextField()
            },
        )
    }
}

@Preview
@Composable
fun InputBoxPreview() {
    InputBox(
        value = "",
        keyboardType = KeyboardType.Text,
        singleLine = true,
        labelText = "Account Number",
        hintText = "Enter your bank account no",
        cursorColor = Color.Black,
    )
}