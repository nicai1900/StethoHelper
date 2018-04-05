package com.nicaiya.stethohelper

import android.content.Context
import com.facebook.stetho.Stetho

class StethoHelper {

    companion object {

        @JvmStatic
        fun install(context: Context) {
            Stetho.initialize(Stetho.newInitializerBuilder(context)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(context))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(context))
                .build())
        }


    }

}