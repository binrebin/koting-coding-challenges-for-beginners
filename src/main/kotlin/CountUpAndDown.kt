import org.junit.Assert.assertEquals
import org.junit.Test

class CountUpAndDown {
    fun parse(num: Int): List<Int> {
        return (0 until num) + (num downTo 0)
    }
}

class CountUpAndDownTest {
    @Test
    fun with1(){
        val obj = CountUpAndDown()
        val res = obj.parse(1)
        assertEquals(listOf(0, 1, 0), res)
    }

    @Test
    fun with8(){
        val obj = CountUpAndDown()
        val res = obj.parse(8)
        assertEquals(listOf(0, 1, 2, 3,4,5,6,7,8,7,6,5,4,3,2,1,0), res)
    }
}