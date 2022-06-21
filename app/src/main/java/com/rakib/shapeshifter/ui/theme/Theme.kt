package com.bkash.businessapp.shared.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Colors.pinPad: Color
    get() = AppColor.PinPad

val Colors.pinDigit: Color
    get() = AppColor.PinDigit

val Colors.divider: Color
    get() = AppColor.Divider

private val DarkColorPalette = darkColors(
    primary = AppColor.Primary,
    onPrimary = AppColor.Background,
    primaryVariant = AppColor.PrimaryVariant,
    secondary = AppColor.Primary,
    onSecondary = AppColor.Background,
    background = AppColor.Background,
    surface = AppColor.Primary,
    onSurface = AppColor.Background
)

private val LightColorPalette = lightColors(
    primary = AppColor.Primary,
    onPrimary = AppColor.Background,
    primaryVariant = AppColor.PrimaryVariant,
    secondary = AppColor.Primary,
    onSecondary = AppColor.Background,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun BkashBusinessAppTheme(content: @Composable () -> Unit) {
    val colors = LightColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

object BusinessAppRippleTheme : RippleTheme {

    val alpha = RippleAlpha(
        focusedAlpha = .8f,
        draggedAlpha = .8f,
        hoveredAlpha = .8f,
        pressedAlpha = .8f
    )

    @Composable
    override fun defaultColor(): Color = AppColor.Primary

    @Composable
    override fun rippleAlpha(): RippleAlpha = alpha
}