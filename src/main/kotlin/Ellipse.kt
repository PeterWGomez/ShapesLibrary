package org.example

class Ellipse(
    var point1: Point,
    var radii1: Double,
    var radii2: Double
) {
    init {
        if (!isValid()) {
            println("One or more radii is invalid (0), setting both radii to 1")
            radii1 = 1.0
            radii2 = 1.0
        }
    }
    fun isValid(): Boolean {
        return !(radii1 == 0.0 || radii2 == 0.0)
    }
    fun getEllipse(){
        println("point1 of the ellipse is: ")
        point1.getPoint()
        println("the radii are : $radii1 and $radii2")
    }
    fun getArea(): Double {
        // points 3 and 4 are also diagonal from each other
        return (radii1 * radii2 * 3.14159)
    }
    fun moveEllipse(xchange: Double, ychange: Double) {
        point1.movePoint(xchange, ychange)
    }

}