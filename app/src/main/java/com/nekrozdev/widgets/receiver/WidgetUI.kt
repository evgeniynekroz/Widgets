package com.nekrozdev.widgets.receiver

import android.content.Context
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.glance.*
import androidx.glance.appwidget.*
import androidx.glance.layout.*
import androidx.glance.text.*
import androidx.glance.unit.ColorProvider
import com.nekrozdev.widgets.data.DataRepository

class UniversalWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        val repo = DataRepository(context)
        provideContent {
            Column(GlanceModifier.fillMaxSize().background(ColorProvider(Color(0x992D004D))).padding(8.dp)) {
                Text("Система", style = TextStyle(color = ColorProvider(Color.White)))
                Text("Заряд: ${repo.getBattery()}", style = TextStyle(color = ColorProvider(Color.White)))
            }
        }
    }
}
