package com.rakib.shapeshifter

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bkash.businessapp.shared.ui.theme.AppColor
import com.bkash.businessapp.shared.ui.theme.proceedButtonText

@Composable
fun ProceedButton(
    modifier: Modifier = Modifier,
    backgroundColor: Color = AppColor.Primary,
    contentColor: Color = Color.White,
    disabledBackgroundColor: Color = AppColor.Disabled,
    disabledContentColor: Color = AppColor.AdditionalText,
    text: String,
//    @DrawableRes iconRes: Int = R.drawable.ic_arrow_forward_gray_24dp,
    enabled: Boolean = false,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        elevation = ButtonDefaults.elevation(0.dp),
        modifier = modifier.height(50.dp),
        shape = RoundedCornerShape(0.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor,
            disabledBackgroundColor = disabledBackgroundColor,
            disabledContentColor = disabledContentColor
        ),
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.proceedButtonText
        )
        Spacer(modifier = modifier.weight(1f))

//        Icon(
////            painter = painterResource(id = iconRes),
//            contentDescription = ""
//        )
    }
}

@Preview("Proceed Button")
@Composable
fun ProceedButtonPreview() {
    ProceedButton(
        text = "Proceed to the next step",
        enabled = true,
    ) {

    }
}