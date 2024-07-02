package org.example

data class Point(
    var x: Double,
    var y: Double
) {
    fun getPoint(){
        println("x is $x")
        println("y is $y")
    }
    fun movePoint(xchange: Double, ychange: Double) {
        x = x + xchange
        y = y + ychange
    }
}