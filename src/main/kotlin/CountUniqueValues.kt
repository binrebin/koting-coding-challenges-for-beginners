import org.junit.Assert.assertEquals
import org.junit.Test
// without using builtin  toSet() distinct() groupBy()
class CountUniqueValues {
    fun parse(li: List<Int>): Int {
        val out = mutableListOf<Int>()
        for (m in li) {
            if (m in out) {
                continue
            } else {
                out.add(m)
            }
        }
        return out.size
    }
}

class CountUniqueValuesTest {
    @Test
    fun first() {
        val cls = CountUniqueValues()
        assertEquals(3, cls.parse(listOf(1, 1, 2, 2, 3, 3)))
    }
}