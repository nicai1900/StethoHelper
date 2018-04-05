package com.nicaiya.stethohelper

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class StethoInterceptorWrapper : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }

}