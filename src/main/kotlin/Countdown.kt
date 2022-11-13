import org.junit.Assert.assertEquals
import org.junit.Test

class Countdown {
//    fun parse(num: Int): List<Int>{
//        val result = mutableListOf<Int>()
//        for (n in num downTo 0) {
//            result.add(n)
//        }
//        return result
//    }

    fun parse(num: Int): List<Int>{
        return List(num + 1) {num - it }
    }
}

class CountdownTest {
    @Test
    fun countDownFrom1(){
        val countdown = Countdown()
        val result = countdown.parse(1)
        assertEquals(listOf(1, 0), result)
    }

    @Test
    fun countDownFrom8(){
        val countdown = Countdown()
        val result = countdown.parse(8)
        assertEquals(listOf(8,7,6,5,4,3,2,1, 0), result)
    }
}