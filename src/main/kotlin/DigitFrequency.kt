import org.junit.Assert.assertEquals
import org.junit.Test

class DigitFrequency {
    fun parse(s: String): Boolean {

        val(a, b) = s.split(",")
        return a.length == b.length && a.toList().toSet() == b.toList().toSet()
    }
}

class DigitFrequencyTest {
    @Test
    fun with756And657(){
        val cls = DigitFrequency()
        val res = cls.parse("756,657")
        assertEquals(true, res)
    }
    @Test
    fun with12345And54312(){
        val cls = DigitFrequency()
        val res = cls.parse("12345,54312")
        assertEquals(true, res)
    }

    @Test
    fun with12345And543112(){
        val cls = DigitFrequency()
        val res = cls.parse("12345,543112")
        assertEquals(false, res)
    }
}