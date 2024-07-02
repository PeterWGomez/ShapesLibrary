import org.example.Point
import org.example.Rectangle
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RectangleTest {
    @Test
    fun testRectangleConstruction() {
        var point1 = Point(0.0, 2.0)
        var point2 = Point(1.0, 0.0)
        var rectangle1 = Rectangle(point1, point2)
        assertEquals(rectangle1.point1.x, 0.0)
        assertEquals(rectangle1.point1.y, 2.0)
        assertEquals(rectangle1.point2.x, 1.0)
        assertEquals(rectangle1.point2.y, 0.0)
        // Testing invalid rectangle creation
        var point3 = Point(0.0, 2.0)
        var point4 = Point(0.0, 3.0)
        var rectangle2 = Rectangle(point3, point4)
        assertEquals(rectangle2.point1.x, 0.0)
        assertEquals(rectangle2.point1.y, 0.0)
        assertEquals(rectangle2.point2.x, 1.0)
        assertEquals(rectangle2.point2.y, 1.0)
    }
    @Test
    fun testRectangleArea() {
        var point1 = Point(0.0, 2.0)
        var point2 = Point(1.0, 0.0)
        var rectangle1 = Rectangle(point1, point2)
        assertEquals(rectangle1.getArea(), 2.0)
    }
    @Test
    fun testRectangleMove() {
        var point1 = Point(0.0, 2.0)
        var point2 = Point(1.0, 0.0)
        var rectangle1 = Rectangle(point1, point2)
        rectangle1.moveRectangle(5.0, 5.0)
        assertEquals(rectangle1.point1.x, 5.0)
        assertEquals(rectangle1.point1.y, 7.0)
        assertEquals(rectangle1.point2.x, 6.0)
        assertEquals(rectangle1.point2.y, 5.0)
    }
}