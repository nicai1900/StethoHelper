package com.nicaiya.stethohelper

import android.content.Context
import com.facebook.stetho.Stetho

class StethoHelper {

    companion object {
        fun install(context: Context) {
            Stetho.initializeWithDefaults(context.applicationContext)

        }
    }

}