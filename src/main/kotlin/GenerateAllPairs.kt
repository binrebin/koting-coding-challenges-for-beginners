import org.junit.Assert.assertEquals
import org.junit.Test

// generate all possible pairs from 0 to n
class GenerateAllPairs {
    fun parse(n: Int): List<Pair<Int, Int>> {
        val list = mutableListOf<Pair<Int, Int>>()
        for(i  in (0..n)){
            for (j in (0..n)){
                list.add(i to j)
            }
        }
        return list
    }
}

class GenerateAllPairsTest {
    @Test
    fun with0(){
        val cls = GenerateAllPairs()
        assertEquals(listOf(Pair(0, 0)), cls.parse(0))
    }
    @Test
    fun with1(){
        val cls = GenerateAllPairs()
        assertEquals(listOf(Pair(0, 0), Pair(0, 1), Pair(1, 0), Pair(1, 1)), cls.parse(1))
    }

    @Test
    fun with2(){
        val cls = GenerateAllPairs()
        assertEquals(listOf(Pair(0, 0), Pair(0, 1), Pair(0, 2), Pair(1, 0), Pair(1, 1), Pair(1, 2), Pair(2, 0), Pair(2, 1), Pair(2, 2)), cls.parse(2))
    }

}