package com.nekrozdev.widgets.receiver

import android.content.Context
import androidx.glance.appwidget.GlanceAppWidgetReceiver
// ВАЖНО: Тот же импорт здесь
import androidx.glance.appwidget.updateAll 

class WidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget = WidgetUI()
    
    suspend fun updateAll(context: Context) {
        // Теперь это скомпилируется
        glanceAppWidget.updateAll(context)
    }
}
