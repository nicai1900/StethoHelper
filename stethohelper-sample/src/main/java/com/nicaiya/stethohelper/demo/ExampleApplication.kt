package com.nicaiya.stethohelper.demo

import android.app.Application
import com.nicaiya.stethohelper.StethoHelper
import com.nicaiya.stethohelper.StethoInterceptorWrapper
import okhttp3.OkHttpClient

class ExampleApplication : Application() {

    val httpClient = initOkhttpClient()

    override fun onCreate() {
        super.onCreate()

        StethoHelper.install(this)
    }

    private fun initOkhttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        builder.addNetworkInterceptor(StethoInterceptorWrapper())
        return builder.build()
    }
}