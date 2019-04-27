package app.chenqi

import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import kotlin.test.Test

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [28])
class LogImplTest {
    private val tag = "Android"

    @Test
    fun testLogV() = Log.v(tag, "Verbose")

    @Test
    fun testLogD() = Log.d(tag, "Debug")

    @Test
    fun testLogI() = Log.i(tag, "Info")

    @Test
    fun testLogW() = Log.w(tag, "Warn")

    @Test
    fun testLogE() = Log.e(tag, "Error")
}