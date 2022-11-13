import org.junit.Assert
import org.junit.Test

class Calculator {
    fun parse(s: String): Int {

        val(a, op, b) = s.split(" ")
        return when(op){
            "*" -> a.toInt() * b.toInt()
            "+" -> a.toInt() + b.toInt()
            else -> {throw IllegalArgumentException("Invalid operator")}
        }

    }

}

class CalculatorTest {
    @Test
    fun testMultiply2By2(){
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        Assert.assertEquals(4, result)
    }

    @Test
    fun testAdd4To2() {
        val calculator = Calculator()
        val result = calculator.parse("4 + 2")
        Assert.assertEquals(6, result)
    }
}
