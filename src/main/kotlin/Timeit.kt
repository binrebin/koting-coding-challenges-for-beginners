import org.junit.Assert.assertEquals
import org.junit.Test

fun <T> timeIt(message: String = "", block: () -> T): T {
    val start = System.currentTimeMillis()
    val r = block()
    val end = System.currentTimeMillis()
    println("$message: ${end - start} ms")
    return r
}

class TimeitTest {
    @Test
    fun timeitFlattenList(): Unit {

        timeIt("one") {
            val cls = FlattenList()
            assertEquals(listOf(1, 2, 3), cls.parse(listOf(1, listOf(2, listOf(3), emptyList<Any>()))))

        }
        timeIt ("two"){
            val cls = FlattenList()
            assertEquals(listOf(0, 1, 2, 3, 4, 5), cls.parse(listOf(0, 1, listOf(2, 3), listOf(4, 5))))
        }
    }
}