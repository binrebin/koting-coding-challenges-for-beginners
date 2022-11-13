import org.junit.Assert.assertEquals
import org.junit.Test

// get list of all odd numbers from given list
class GetOdds {
    fun parse(li: List<Int>): List<Int>{
        val list = mutableListOf<Int>()
        li.forEach {
            if(it % 2 != 0){
                list.add(it)
            }
        }
        return list
    }
}

class GetOddsTest{
    @Test
    fun with1to3(){
        val cls = GetOdds()
        assertEquals(listOf(1,3), cls.parse(listOf(1,2,3)))
    }

    @Test
    fun with4to9(){
        val cls = GetOdds()
        assertEquals(listOf(7, 9), cls.parse(listOf(4, 6, 8, 7, 9)))
    }
}