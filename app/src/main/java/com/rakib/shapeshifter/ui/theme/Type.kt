package com.bkash.businessapp.shared.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.rakib.shapeshifter.R


// Set of Material typography styles to start with

val Roboto = FontFamily(
//    Font(R.font.roboto_regular, weight = FontWeight.Normal),
//    Font(R.font.roboto_bold, weight = FontWeight.Bold),
//    Font(R.font.roboto_bolditalic, weight = FontWeight.Bold),
//    Font(R.font.roboto_medium, weight = FontWeight.Medium),
//    Font(R.font.roboto_light, weight = FontWeight.Light),
//    Font(R.font.roboto_lightitalic, weight = FontWeight.Light),
//    Font(R.font.roboto_thin, weight = FontWeight.Thin),
//    Font(R.font.roboto_italic, weight = FontWeight.Light),
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */

)

val Typography.infoCellHeading: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        color = AppColor.SecondaryText,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
    )

val Typography.infoCellValue: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        color = AppColor.PrimaryText,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    )

val Typography.infoCellAdditionalValue: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        color = AppColor.AdditionalText,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    )

val Typography.pinPadText: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        color = AppColor.PinDigit,
        fontSize = 34.sp,
        textAlign = TextAlign.Center
    )

val Typography.proceedButtonText: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        letterSpacing = 0.sp,
        fontSize = 16.sp,
        fontWeight = FontWeight(400)
    )

val Typography.termsAndConditions: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        color = AppColor.PrimaryText,
        fontSize = 12.sp,
    )

val Typography.inputBoxLabel: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        color = AppColor.SecondaryText,
        fontSize = 12.sp,
    )

val Typography.inputBoxCounter: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        color = AppColor.AdditionalText,
        fontSize = 12.sp,
    )

val Typography.inputBoxHint: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        color = AppColor.AdditionalText,
        fontSize = 14.sp,
    )

val Typography.inputBoxText: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        color = AppColor.PrimaryText,
        fontSize = 14.sp,
    )

val Typography.pinInputHintText: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        color = AppColor.AdditionalText,
        fontSize = 14.sp,
    )

val Typography.thumbnailInfoTitleNormal: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        color = AppColor.PrimaryText,
        fontSize = 14.sp,
    )

val Typography.thumbnailInfoTitleMedium: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        color = AppColor.PrimaryText,
        fontSize = 14.sp
    )

val Typography.thumbnailInfoSubtitle: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        color = AppColor.PrimaryText,
        fontSize = 14.sp,
    )

val Typography.thumbnailInfoText: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        color = AppColor.PrimaryText,
        fontSize = 14.sp,
    )

val Typography.sectionHeader: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        color = AppColor.PrimaryText,
        fontSize = 14.sp
    )

val Typography.tapAndHoldButtonText: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        color = Color.White,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    )
val Typography.inputAmount: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        color = AppColor.Primary,
        fontSize = 40.sp,
        textAlign = TextAlign.Center
    )

val Typography.inputAmountHint: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        color = AppColor.AdditionalText,
        fontSize = 40.sp,
        textAlign = TextAlign.Center
    )

val Typography.tapAndHoldTitle: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        color = AppColor.PrimaryText,
        fontSize = 18.sp,
    )

val Typography.finalScreenTitle: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        color = AppColor.PrimaryText,
        fontSize = 18.sp,
    )

val Typography.linkAccountFinalScreenTitle: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        color = AppColor.PrimaryText,
        fontSize = 18.sp,
    )

val Typography.finalScreenFooter: TextStyle
    get() = TextStyle(
        fontSize = 14.sp,
        color = AppColor.PrimaryText,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Center
    )

val Typography.searchBoxHint: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        color = AppColor.AdditionalText,
        fontSize = 18.sp,
    )

val Typography.searchBoxText: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        color = AppColor.PrimaryText,
        fontSize = 18.sp,
    )

val Typography.minimumAmount: TextStyle
    get() = TextStyle(
        fontSize = 14.sp,
        color = AppColor.PrimaryText,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
    )

val Typography.availableBalance: TextStyle
    get() = TextStyle(
        fontSize = 14.sp,
        color = AppColor.PrimaryText,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
    )

val Typography.labelText: TextStyle
    get() = TextStyle(
        fontSize = 12.sp,
        color = AppColor.SecondaryText,
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
    )

val Typography.bottomSheetTitle: TextStyle
    get() = TextStyle(
        color = Color.White,
        fontSize = 24.sp,
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        textAlign = TextAlign.Center
    )

val Typography.bottomSheetDescription: TextStyle
    get() = TextStyle(
        color = AppColor.PrimaryText,
        fontSize = 16.sp,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Center
    )

val Typography.consentButton: TextStyle
    get() = TextStyle(
        color = AppColor.Primary,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

val Typography.commonTitleText: TextStyle
    get() = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        color = AppColor.PrimaryText,
    )