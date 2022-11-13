import org.junit.Assert.assertEquals
import org.junit.Test

// print n-th entry in the series
class Fibonacci {
    fun parse(n: Int): Int{
        var list = mutableListOf<Int>(0,1,1)
        if (n<4) {
            return list[n-1]
        }
        var a = 1
        var b = 1
        var c = 0
        (4..n).forEach {
            c = a+ b
            a = b
            b = c

        }
        return c

    }
}

class FibonacciTest{

    @Test
    fun with1(){
        val cls = Fibonacci()
        assertEquals(0, cls.parse(1))
    }

    @Test
    fun with2(){
        val cls = Fibonacci()
        assertEquals(1, cls.parse(2))
    }


    @Test
    fun with3(){
        val cls = Fibonacci()
        assertEquals(1, cls.parse(3))
    }

    @Test
    fun with8(){
        val cls = Fibonacci()
        assertEquals(13, cls.parse(8))
    }

    @Test
    fun with10(){
        val cls = Fibonacci()
        assertEquals(34, cls.parse(10))
    }

    @Test
    fun with17(){
        val cls = Fibonacci()
        assertEquals(987, cls.parse(17))
    }
}