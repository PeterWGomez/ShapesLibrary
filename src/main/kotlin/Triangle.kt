package org.example

import kotlin.math.abs

class Triangle(
    var point1: Point,
    var point2: Point,
    var point3: Point
) {
    init {
        if (!isValid()) {
            println("Triangle is invalid, setting points to (0.0, 0.0), (1.0, 1.0), (1.0, 0.0)")
            point1.x = 0.0
            point1.y = 0.0
            point2.x = 1.0
            point2.y = 1.0
            point3.x = 1.0
            point3.y = 0.0
        }
    }
    fun isValid(): Boolean {
        var side1 = Line(point1, point2)
        var side2 = Line(point1, point3)
        var side3 = Line(point2, point3)
        return !(side1.getSlope() == side2.getSlope() && side1.getSlope() == side3.getSlope())
    }
    fun getTriangle(){
        println("point1 of the triangle is: ")
        point1.getPoint()
        println("point2 of the triangle is: ")
        point2.getPoint()
        println("point3 of the triangle is: ")
        point3.getPoint()
    }
    fun getArea(): Double {
        return (0.5 * abs(point1.x*(point2.y-point3.y) + point2.x*(point3.y-point1.y) + point3.x*(point1.y-point2.y)))
    }
    fun moveTriangle(xchange: Double, ychange: Double) {
        point1.movePoint(xchange, ychange)
        point2.movePoint(xchange, ychange)
        point3.movePoint(xchange, ychange)
    }

}