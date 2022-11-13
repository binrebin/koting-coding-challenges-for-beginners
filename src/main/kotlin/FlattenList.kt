import org.junit.Assert.assertEquals
import org.junit.Test

// flatten list of any without using built ins
class FlattenList {
    private val res = mutableListOf<Any?>()
    fun parse(li: List<*>): List<*> {
        for (e in li) {
            if (e is List<*>) {
                parse(e)
            } else {
                res.add(e)
            }
        }
        return res.filterNotNull()
    }
}

class FlattenListTest {
    @Test
    fun first() {
        val cls = FlattenList()
        assertEquals(listOf(0, 1, 2, 3, 4, 5), cls.parse(listOf(0, 1, listOf(2, 3), listOf(4, 5))))
    }

    @Test
    fun second() {
        val cls = FlattenList()
        assertEquals(listOf(1, 2, 3), cls.parse(listOf(1, listOf(2, listOf(3), emptyList<Any>()))))
    }

    @Test
    fun third() {
        val cls = FlattenList()
        assertEquals(
            listOf(1, 2, 3), cls.parse(
                listOf(
                    1,
                    listOf(2, listOf<Any>(emptyList<Any>())),
                    listOf(3)
                )
            )
        )
    }
}