package com.example.musicappcompose.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

private val customColorScheme = CustomColorScheme(
    primaryBackground = primaryBackground,
    textPrimary = textPrimary,
)

val LocalCustomColors = compositionLocalOf { customColorScheme }

@Composable
fun MusicAppComposeTheme(
    content: @Composable () -> Unit
) {
    val materialColorScheme = darkColorScheme(
        primary = LocalCustomColors.current.textPrimary,
    )

    CompositionLocalProvider(
        LocalCustomColors provides customColorScheme
    ) {
        MaterialTheme(
            colorScheme = materialColorScheme,
            typography = Typography,
            content = content
        )
    }
}

data class CustomColorScheme(
    val primaryBackground: Color,
    val textPrimary: Color,
)