import org.example.Point
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testPointConstruction() {
        var point = Point(1.0, 2.0)
        assertEquals(point.x, 1.0)
        assertEquals(point.y, 2.0)
    }
    @Test
    fun testMovePoint() {
        var point = Point(1.0, 2.0)
        point.movePoint(3.0, 5.0)
        assertEquals(point.x, 4.0)
        assertEquals(point.y, 7.0)
    }
    @Test
    fun testPointCopy() {
        var point = Point(1.0, 2.0)
        var point2 = point.copy()
        assertEquals(point2.x, 1.0)
        assertEquals(point2.y, 2.0)
    }
}