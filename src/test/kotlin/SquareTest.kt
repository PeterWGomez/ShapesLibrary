import org.example.Point
import org.example.Square
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SquareTest {
    @Test
    fun testSquareConstruction() {
        var point1 = Point(0.0, 1.0)
        var point2 = Point(1.0, 0.0)
        var square1 = Square(point1, point2)
        assertEquals(square1.point1.x, 0.0)
        assertEquals(square1.point1.y, 1.0)
        assertEquals(square1.point2.x, 1.0)
        assertEquals(square1.point2.y, 0.0)
        // Testing invalid Square creation, side = 0
        var point3 = Point(0.0, 2.0)
        var point4 = Point(0.0, 3.0)
        var square2 = Square(point3, point4)
        assertEquals(square2.point1.x, 0.0)
        assertEquals(square2.point1.y, 0.0)
        assertEquals(square2.point2.x, 1.0)
        assertEquals(square2.point2.y, 1.0)
        // Testing invalid Square creation, made a rectangle
        var point5 = Point(0.0, 1.0)
        var point6 = Point(5.0, 0.0)
        var square3 = Square(point5, point6)
        assertEquals(square3.point1.x, 0.0)
        assertEquals(square3.point1.y, 0.0)
        assertEquals(square3.point2.x, 1.0)
        assertEquals(square3.point2.y, 1.0)
    }
    @Test
    fun testSquareArea() {
        var point1 = Point(0.0, 1.0)
        var point2 = Point(1.0, 0.0)
        var square1 = Square(point1, point2)
        assertEquals(square1.getArea(), 1.0)
    }
    @Test
    fun testSquareMove() {
        var point1 = Point(0.0, 1.0)
        var point2 = Point(1.0, 0.0)
        var square1 = Square(point1, point2)
        square1.moveSquare(5.0, 5.0)
        assertEquals(square1.point1.x, 5.0)
        assertEquals(square1.point1.y, 6.0)
        assertEquals(square1.point2.x, 6.0)
        assertEquals(square1.point2.y, 5.0)
    }
}