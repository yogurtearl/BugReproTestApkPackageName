package com.example.testapkpackagename

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import some.other.app.id.BuildConfig

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    val basePackageName = "com.example.testapkpackagename.${BuildConfig.FLAVOR_fruit}.${BuildConfig.FLAVOR_color}"

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(basePackageName, appContext.packageName)
    }

    @Test
    fun useTestContext() {
        // Context of the test apk.
        val testAppContext = InstrumentationRegistry.getInstrumentation().context
        assertEquals("$basePackageName.test", testAppContext.packageName)
    }

}