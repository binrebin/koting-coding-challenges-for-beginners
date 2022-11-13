import org.junit.Assert
import org.junit.Test

class AddUpto {
    fun parse(i: Int): Int {
        var result = 0
            for (x in 0 until i+1){
                result += x
            }
        return result
    }

}

class AddUptoTest {
    @Test
    fun addUpto1(){
        val addUpto = AddUpto()
        val result = addUpto.parse(1)
        Assert.assertEquals(1, result)
    }

    @Test
    fun addUpto6() {
        val addUpto = AddUpto()
        val result = addUpto.parse(6)
        Assert.assertEquals(21, result)
    }
}
