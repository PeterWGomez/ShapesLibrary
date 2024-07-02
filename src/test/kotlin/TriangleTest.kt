import org.example.Line
import org.example.Point
import org.example.Triangle
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TriangleTest {
    @Test
    fun testTriangleConstruction() {
        var point1= Point(0.0, 0.0)
        var point2 = Point(2.0, 2.0)
        var point3 = Point(-2.0, 2.0)
        var triangle1 = Triangle(point1, point2, point3)
        assertEquals(triangle1.point1.x, 0.0)
        assertEquals(triangle1.point1.y, 0.0)
        assertEquals(triangle1.point2.x, 2.0)
        assertEquals(triangle1.point2.y, 2.0)
        assertEquals(triangle1.point3.x, -2.0)
        assertEquals(triangle1.point3.y, 2.0)
        // Testing invalid triangle creation
        var point4= Point(0.0, 0.0)
        var point5 = Point(0.0, 2.0)
        var point6 = Point(0.0, 4.0)
        var triangle2 = Triangle(point4, point5, point6)
        assertEquals(triangle2.point1.x, 0.0)
        assertEquals(triangle2.point1.y, 0.0)
        assertEquals(triangle2.point2.x, 1.0)
        assertEquals(triangle2.point2.y, 1.0)
        assertEquals(triangle2.point3.x, 1.0)
        assertEquals(triangle2.point3.y, 0.0)
    }
    @Test
    fun testTriangleArea() {
        var point1= Point(0.0, 0.0)
        var point2 = Point(2.0, 2.0)
        var point3 = Point(-2.0, 2.0)
        var triangle1 = Triangle(point1, point2, point3)
        assertEquals(triangle1.getArea(), 4.0)
    }
    @Test
    fun testMoveTriangle() {
        var point1= Point(0.0, 0.0)
        var point2 = Point(2.0, 2.0)
        var point3 = Point(-2.0, 2.0)
        var triangle1 = Triangle(point1, point2, point3)
        triangle1.moveTriangle(5.0, 5.0)
        assertEquals(triangle1.point1.x, 5.0)
        assertEquals(triangle1.point1.y, 5.0)
        assertEquals(triangle1.point2.x, 7.0)
        assertEquals(triangle1.point2.y, 7.0)
        assertEquals(triangle1.point3.x, 3.0)
        assertEquals(triangle1.point3.y, 7.0)
    }
}