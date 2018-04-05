package com.nicaiya.stethohelper.demo

import android.app.Application
import com.nicaiya.stethohelper.StethoHelper

class App : Application(){

    override fun onCreate() {
        super.onCreate()

        StethoHelper.install(this)
    }
}