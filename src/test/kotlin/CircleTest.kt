import org.example.Circle
import org.example.Point
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CircleTest {
    @Test
    fun testCircleConstruction() {
        var point1 = Point(0.0, 1.0)
        var circle1 = Circle(point1, 10.0, 10.0)
        assertEquals(circle1.point1.x, 0.0)
        assertEquals(circle1.point1.y, 1.0)
        assertEquals(circle1.radii1, 10.0)
        assertEquals(circle1.radii2, 10.0)
        // Testing invalid Circle creation, radii = 0
        var circle2 = Circle(point1, 0.0, 0.0)
        assertEquals(circle2.point1.x, 0.0)
        assertEquals(circle2.point1.y, 1.0)
        assertEquals(circle2.radii1, 1.0)
        assertEquals(circle2.radii2, 1.0)
        // Testing invalid Circle creation, radii not equal
        var circle3 = Circle(point1, 3.0, 7.0)
        assertEquals(circle3.point1.x, 0.0)
        assertEquals(circle3.point1.y, 1.0)
        assertEquals(circle3.radii1, 1.0)
        assertEquals(circle3.radii2, 1.0)
    }
    @Test
    fun testCircleArea() {
        var point1 = Point(0.0, 1.0)
        var circle1 = Circle(point1, 5.0, 5.0)
        assertEquals(circle1.getArea(), 78.53975)
    }
    @Test
    fun testCircleMove() {
        var point1 = Point(0.0, 1.0)
        var circle1 = Circle(point1, 10.0, 10.0)
        circle1.moveCircle(5.0, 5.0)
        assertEquals(circle1.point1.x, 5.0)
        assertEquals(circle1.point1.y, 6.0)
        assertEquals(circle1.radii1, 10.0)
        assertEquals(circle1.radii2, 10.0)
    }
}