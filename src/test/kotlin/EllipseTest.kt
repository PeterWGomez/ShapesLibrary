import org.example.Ellipse
import org.example.Point
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EllipseTest {
    @Test
    fun testEllipseConstruction() {
        var point1 = Point(0.0, 1.0)
        var ellipse1 = Ellipse(point1, 10.0, 7.0)
        assertEquals(ellipse1.point1.x, 0.0)
        assertEquals(ellipse1.point1.y, 1.0)
        assertEquals(ellipse1.radii1, 10.0)
        assertEquals(ellipse1.radii2, 7.0)
        // Testing invalid ellipse creation
        var ellipse2 = Ellipse(point1, 0.0, 7.0)
        assertEquals(ellipse2.point1.x, 0.0)
        assertEquals(ellipse2.point1.y, 1.0)
        assertEquals(ellipse2.radii1, 1.0)
        assertEquals(ellipse2.radii2, 1.0)
    }
    @Test
    fun testEllipseArea() {
        var point1 = Point(0.0, 1.0)
        var ellipse1 = Ellipse(point1, 10.0, 7.0)
        assertEquals(ellipse1.getArea(), 219.91129999999998)
    }
    @Test
    fun testEllipseMove() {
        var point1 = Point(0.0, 1.0)
        var ellipse1 = Ellipse(point1, 10.0, 7.0)
        ellipse1.moveEllipse(5.0, 5.0)
        assertEquals(ellipse1.point1.x, 5.0)
        assertEquals(ellipse1.point1.y, 6.0)
        assertEquals(ellipse1.radii1, 10.0)
        assertEquals(ellipse1.radii2, 7.0)
    }
}