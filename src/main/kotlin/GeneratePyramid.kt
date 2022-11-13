import org.junit.Assert.assertEquals
import org.junit.Test

class GeneratePyramid {
    fun parse(n: Int): List<String> {
        val list = mutableListOf<String>()
        (1..n ).forEach {
            list.add("#".repeat((2*it) -1))
        }
        return list
    }
}

class GeneratePyramidTest {
    @Test
    fun ofTier1() {
        val cls = GeneratePyramid()
        cls.parse(1).also {
            assertEquals(1, it.size)
            assertEquals("#", it[0])
        }
    }

    @Test
    fun ofTier2() {
        val cls = GeneratePyramid()
        cls.parse(2).also {
            assertEquals(2, it.size)
            assertEquals("#", it[0])
            assertEquals("###", it[1])
        }
    }
}