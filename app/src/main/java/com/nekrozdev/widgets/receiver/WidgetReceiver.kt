package com.nekrozdev.widgets.receiver

import androidx.glance.appwidget.GlanceAppWidgetReceiver

class WidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget = WidgetUI()
    
    // Добавляем метод для обновления из воркера
    suspend fun updateAll(context: android.content.Context) {
        glanceAppWidget.updateAll(context)
    }
}
