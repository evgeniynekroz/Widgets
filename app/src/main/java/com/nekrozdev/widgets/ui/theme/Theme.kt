package com.nekrozdev.widgets.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val LiquidGlassColor = Color(0x992D004D)

@Composable
fun WidgetCatalogTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Color(0xFFD0BCFF),
            background = Color(0xFF131314),
            surface = Color(0xFF1E1F22)
        ),
        shapes = Shapes(medium = RoundedCornerShape(24.dp)),
        content = content
    )
}
