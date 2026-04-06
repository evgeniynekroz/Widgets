package com.nekrozdev.widgets.background

import android.content.Context
import androidx.glance.appwidget.updateAll
import androidx.work.*
import com.nekrozdev.widgets.receiver.UniversalWidget

class WidgetWorker(val context: Context, params: WorkerParameters) : CoroutineWorker(context, params) {
    override suspend fun doWork(): Result {
        UniversalWidget().updateAll(context)
        return Result.success()
    }
}
