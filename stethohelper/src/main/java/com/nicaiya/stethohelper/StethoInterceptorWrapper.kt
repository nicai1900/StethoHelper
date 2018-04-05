package com.nicaiya.stethohelper

import com.facebook.stetho.okhttp3.StethoInterceptor
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class StethoInterceptorWrapper : Interceptor {

    private val stethoInterceptor = StethoInterceptor()

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        return stethoInterceptor.intercept(chain)
    }

}