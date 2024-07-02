import org.example.Line
import org.example.Point
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LineTest {
    @Test
    fun testLineConstruction() {
        var point1 = Point(5.0, 8.0)
        var point2 = Point(6.0, 10.0)
        var line1 = Line(point1, point2)
        assertEquals(line1.point1.x, 5.0)
        assertEquals(line1.point1.y, 8.0)
        assertEquals(line1.point2.x, 6.0)
        assertEquals(line1.point2.y, 10.0)
        // Testing invalid line creation
        var point3 = Point(6.0, 10.0)
        var point4 = Point(6.0, 10.0)
        var line2 = Line(point3, point4)
        assertEquals(line2.point1.x, 0.0)
        assertEquals(line2.point1.y, 0.0)
        assertEquals(line2.point2.x, 1.0)
        assertEquals(line2.point2.y, 1.0)
    }
    @Test
    fun testLineSlope() {
        var point1 = Point(5.0, 8.0)
        var point2 = Point(6.0, 10.0)
        var line1 = Line(point1, point2)
        assertEquals(line1.getSlope(), 2.0)
    }
    @Test
    fun testLineLength() {
        var point1 = Point(5.0, 8.0)
        var point2 = Point(6.0, 10.0)
        var line1 = Line(point1, point2)
        assertEquals(line1.getLength(), 2.23606797749979)
    }
    @Test
    fun testMoveLine() {
        var point1 = Point(5.0, 8.0)
        var point2 = Point(6.0, 10.0)
        var line1 = Line(point1, point2)
        line1.moveLine(5.0, 5.0)
        assertEquals(line1.point1.x, 10.0)
        assertEquals(line1.point1.y, 13.0)
        assertEquals(line1.point2.x, 11.0)
        assertEquals(line1.point2.y, 15.0)
    }
}