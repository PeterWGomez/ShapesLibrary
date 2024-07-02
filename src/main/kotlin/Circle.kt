package org.example

class Circle(
    var point1: Point,
    var radii1: Double,
    var radii2: Double
) {
    init {
        if (!isValid()) {
            println("One or more radii is invalid (0) or the 2 radii are not equal, setting both radii to 1")
            radii1 = 1.0
            radii2 = 1.0
        }
    }
    fun isValid(): Boolean {
        return !(radii1 == 0.0 || radii2 == 0.0 || radii1 != radii2)
    }
    fun getCircle(){
        println("point1 of the circle is: ")
        point1.getPoint()
        println("the radii are : $radii1 and $radii2")
    }
    fun getArea(): Double {
        return (radii1 * radii2 * 3.14159)
    }
    fun moveCircle(xchange: Double, ychange: Double) {
        point1.movePoint(xchange, ychange)
    }

}