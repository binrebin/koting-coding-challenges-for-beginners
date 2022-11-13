import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.sign

class ReverseInt {
    fun parse(n: Int): Int {
        val rev = n.toString().removePrefix("-").reversed()
        return rev.toInt() * n.sign
    }
}

class ReverseIntTest {
    @Test
    fun with256() {
        val cls = ReverseInt()
        assertEquals(652, cls.parse(256))
    }

    @Test
    fun withMin200() {
        val cls = ReverseInt()
        assertEquals(-2, cls.parse(-200))
    }
}