import org.junit.Assert.assertEquals
import org.junit.Test

class MoneyWithCoins {
    fun parse(amt: Int, coins: List<Int>): Int {
        val oList = IntArray(amt+1)
        oList[0] = 1
        for(c in coins) {
            for (hAmt in c..amt){
                val bal = hAmt - c
                oList[hAmt] += oList[bal]
            }
        }
        return oList[amt]
    }
}

class MoneyWithCoinsTest {
    @Test
    fun with4And123(){
        val cls = MoneyWithCoins()
        assertEquals(6, cls.parse(50, listOf(5,10)))
    }
}