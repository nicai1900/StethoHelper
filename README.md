
# StethoHelper

[![](https://jitpack.io/v/nicai1900/StethoHelper.svg)](https://jitpack.io/#nicai1900/StethoHelper)


## Getting started

In your `build.gradle`:

```groovy
dependencies {
    debugImplementation 'com.github.nicai1900.StethoHelper:stethohelper:v0.0.3'
    releaseImplementation 'com.github.nicai1900.StethoHelper:stethohelper-no-op:v0.0.3'
}
```

In your `Application` class:

```java
public class ExampleApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    StethoHelper.install(this);
    // Normal app init code...
  }
}
```

## License
