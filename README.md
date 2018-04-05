
# StethoHelper

[![](https://jitpack.io/v/nicai1900/StethoHelper.svg)](https://jitpack.io/#nicai1900/StethoHelper)



## Getting started

In your `build.gradle`:

```groovy
dependencies {
    debugImplementation 'com.github.nicai1900.StethoHelper:stethohelper:v0.0.5'
    releaseImplementation 'com.github.nicai1900.StethoHelper:stethohelper-no-op:v0.0.5'
}
```

In your `Application` class:

```kotlin
class ExampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        StethoHelper.install(this)
    }
  
}
```

Okhttp

```kotlin

private fun initOkhttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        builder.addNetworkInterceptor(StethoInterceptorWrapper())
        return builder.build()
    }

```

