package com.nekrozdev.widgets.background

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.ListenableWorker.Result
import com.nekrozdev.widgets.receiver.WidgetReceiver

class WidgetWorker(
    context: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    // Метод, который выполняется в фоне
    override suspend fun doWork(): Result {
        return try {
            // Вызываем обновление всех виджетов через ресивер
            WidgetReceiver().updateAll(applicationContext)
            
            // Возвращаем успех для WorkManager
            Result.success()
        } catch (e: Exception) {
            // Если что-то пошло не так, пробуем позже
            Result.retry()
        }
    }
}
