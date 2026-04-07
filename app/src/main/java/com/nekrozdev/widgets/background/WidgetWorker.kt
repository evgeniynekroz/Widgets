package com.nekrozdev.widgets.background

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.ListenableWorker.Result
// Меняем импорт с ресивера на UI класс
import com.nekrozdev.widgets.receiver.WidgetUI

class WidgetWorker(
    context: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result {
        return try {
            // Вызываем updateAll у класса самого виджета (GlanceAppWidget)
            WidgetUI().updateAll(applicationContext)
            
            Result.success()
        } catch (e: Exception) {
            Result.retry()
        }
    }
}
