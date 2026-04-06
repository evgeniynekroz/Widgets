package com.nekrozdev.widgets.data

import android.content.Context
import android.net.TrafficStats
import android.os.BatteryManager

class DataRepository(val context: Context) {
    fun getBattery(): String = (context.getSystemService(Context.BATTERY_SERVICE) as BatteryManager)
        .getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY).toString() + "%"

    fun getNetSpeed(): String = (TrafficStats.getTotalRxBytes() / 1024).toString() + " KB/s"
}
