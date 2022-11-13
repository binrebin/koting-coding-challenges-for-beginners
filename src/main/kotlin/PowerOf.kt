import org.junit.Assert.assertEquals
import org.junit.Test

class PowerOf {
    fun parse(p: Int, n: Int): Int {
        var res = 1
        (1..p).forEach{
            res *= n
        }
        return res
    }

}

class PowerOfTest{

    @Test
    fun with2Of1(){
        val  cls = PowerOf()
        assertEquals(1, cls.parse(2,1))
    }

    @Test
    fun with2Of2(){
        val  cls = PowerOf()
        assertEquals(4, cls.parse(2,2))
    }

    @Test
    fun with3Of3(){
        val  cls = PowerOf()
        assertEquals(27, cls.parse(3,3))
    }
}