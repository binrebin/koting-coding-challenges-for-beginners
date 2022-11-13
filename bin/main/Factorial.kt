import org.junit.Assert.assertEquals
import org.junit.Test

class Factorial {
    fun parse(num: Int): Int {
        var res = 1
        for (n in num downTo 1) {
            res *= n
        }
        return res
    }
}

class FactorialTest{
    @Test
    fun with1(){
        val cls = Factorial()
        assertEquals(1, cls.parse(1))
    }

    @Test
    fun with3(){
        val cls = Factorial()
        assertEquals(6, cls.parse(3))
    }
}