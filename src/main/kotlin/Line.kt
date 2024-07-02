package org.example

import kotlin.math.sqrt

class Line(
    var point1: Point,
    var point2: Point
) {
    init {
        if (!isValid()) {
            println("Points for a line are invalid: setting points to (0,0) and (1,1)")
            point1.x = 0.0
            point1.y = 0.0
            point2.x = 1.0
            point2.y = 1.0
        }
    }
    fun isValid(): Boolean {
        return !(point1.x == point2.x && point1.y == point2.y)
    }
    fun getLine(){
        println("point1 of the line is: ")
        point1.getPoint()
        println("point2 of the line is: ")
        point2.getPoint()
    }
    fun getLength(): Double {
        return sqrt(((point2.x - point1.x) * (point2.x - point1.x) + (point2.y - point1.y) * (point2.y - point1.y)))
    }
    fun getSlope(): Double {
        return ((point2.y - point1.y)/(point2.x - point1.x))
    }
    fun moveLine(xchange: Double, ychange: Double) {
        point1.movePoint(xchange, ychange)
        point2.movePoint(xchange, ychange)
    }

}