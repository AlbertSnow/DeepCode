package com.albert.snow.deepcode

import android.app.Application
import com.albert.snow.datasdk.SensorDataAPI

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SensorDataAPI.init(this)
    }

}