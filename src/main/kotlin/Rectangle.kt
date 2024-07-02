package org.example

class Rectangle(
    // the points are diagonal from each other
    var point1: Point,
    var point2: Point
) {
    init {
        if (!isValid()) {
            println("Length and/or width is invalid, setting points to (0,0) and (1,1)")
            point1.x = 0.0
            point1.y = 0.0
            point2.x = 1.0
            point2.y = 1.0
        }
    }
    fun isValid(): Boolean {
        var point3 = Point(point1.x, point2.y)
        var point4 = Point(point2.x, point1.y)
        var side1 = Line(point1, point3)
        var side2 = Line(point1, point4)
        return !(point1.x == point2.x || point1.y == point2.y)
    }
    fun getRectangle(){
        println("point1 of the rectangle is: ")
        point1.getPoint()
        println("point2 of the rectangle is: ")
        point2.getPoint()
    }
    fun getArea(): Double {
        // points 3 and 4 are also diagonal from each other
        var point3 = Point(point1.x, point2.y) // (0, 0)
        var point4 = Point(point2.x, point1.y) // (1, 2)
        var side1 = Line(point1, point3)
        var side2 = Line(point1, point4)
        return (side1.getLength() * side2.getLength())
    }
    fun moveRectangle(xchange: Double, ychange: Double) {
        point1.movePoint(xchange, ychange)
        point2.movePoint(xchange, ychange)
    }

}