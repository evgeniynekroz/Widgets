package com.nekrozdev.widgets.receiver

import android.content.Context
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.*
import androidx.glance.text.Text

class WidgetUI : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            // Твой базовый дизайн, чтобы билд прошел
            Box(modifier = GlanceModifier.fillMaxSize()) {
                Text(text = "Liquid Widgets")
            }
        }
    }
}
