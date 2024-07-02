package org.example

fun main() {
    //Unit Tests
    
    // Point tests
    println("Point tests")
    var testPoint = Point(2.0, 5.0)
    testPoint.getPoint()
    testPoint.movePoint(3.0, 3.0)
    println("Moving the point by 3.0 and 3.0")
    testPoint.getPoint()
    println("copying testPoint1 to testPoint2")
    var testpoint2 = testPoint.copy()
    testpoint2.getPoint()

    println()

    // Line tests
    println("Line tests")
    var testPoint2 = Point(6.0, 10.0)
    var testLine = Line(testPoint, testPoint2)
    testLine.getLine()
    println("The length of testLine is ${testLine.getLength()}")
    println("The slope of testLine is ${testLine.getSlope()}")
    println("Moving the line by 5.0 and 5.0")
    testLine.moveLine(5.0, 5.0)
    testLine.getLine()
    println("The length of testLine is ${testLine.getLength()}")
    println("The slope of testLine is ${testLine.getSlope()}")
    println("Creating an invalid line")
    var testPoint3 = Point(6.0, 10.0)
    var testPoint4 = Point(6.0, 10.0)
    var testLine2 = Line(testPoint3, testPoint4)

    println()

    // Rectangle tests
    println("Rectangle tests")
    var testPoint5 = Point(0.0, 2.0)
    var testPoint6 = Point(1.0, 0.0)
    var testRectangle1 = Rectangle(testPoint5, testPoint6)
    testRectangle1.getRectangle()
    println("The area of testRectangle1 is ${testRectangle1.getArea()}")
    println("Moving the shape by 5.0 and 5.0")
    testRectangle1.moveRectangle(5.0, 5.0)
    testRectangle1.getRectangle()
    println("The area of testRectangle1 is ${testRectangle1.getArea()}")
    println("Creating an invalid rectangle")
    var testPoint7 = Point(0.0, 2.0)
    var testPoint8 = Point(0.0, 3.0)
    var testRectangle2 = Rectangle(testPoint7, testPoint8)
    testRectangle2.getRectangle()
    println("The area of testRectangle2 is ${testRectangle2.getArea()}")

    println()

    // Square tests
    println("Square tests")
    var testPoint9 = Point(0.0, 1.0)
    var testPoint10 = Point(1.0, 0.0)
    var testSquare1 = Square(testPoint9, testPoint10)
    testSquare1.getSquare()
    println("The area of testSquare1 is ${testSquare1.getArea()}")
    println("Moving the shape by 5.0 and 5.0")
    testSquare1.moveSquare(5.0, 5.0)
    testSquare1.getSquare()
    println("The area of testSquare1 is ${testSquare1.getArea()}")
    println("Creating an invalid square")
    var testPoint11 = Point(0.0, 1.0)
    var testPoint12 = Point(5.0, 0.0)
    var testSquare2 = Square(testPoint11, testPoint12)
    testSquare2.getSquare()
    println("The area of testSquare2 is ${testSquare2.getArea()}")

    println()

    // Ellipse tests
    println("Ellipse tests")
    var testPoint13 = Point(0.0, 1.0)
    var testEllipse1 = Ellipse(testPoint13, 10.0, 7.0)
    testEllipse1.getEllipse()
    println("The area of testEllipse1 is ${testEllipse1.getArea()}")
    println("Moving the shape by 5.0 and 5.0")
    testEllipse1.moveEllipse(5.0, 5.0)
    testEllipse1.getEllipse()
    println("The area of testEllipse1 is ${testEllipse1.getArea()}")
    println("Creating an invalid ellipse")
    var testEllipse2 = Ellipse(testPoint13, 0.0, 7.0)
    testEllipse2.getEllipse()
    println("The area of testEllipse2 is ${testEllipse2.getArea()}")

    println()

    // Circle tests
    println("Circle tests")
    var testPoint14 = Point(0.0, 1.0)
    var testCircle1 = Circle(testPoint13, 10.0, 10.0)
    testCircle1.getCircle()
    println("The area of testCircle1 is ${testCircle1.getArea()}")
    println("Moving the shape by 5.0 and 5.0")
    testCircle1.moveCircle(5.0, 5.0)
    testCircle1.getCircle()
    println("The area of testCircle1 is ${testCircle1.getArea()}")
    println("Creating an invalid circle")
    var testCircle2 = Circle(testPoint13, 1.0, 7.0)
    testCircle2.getCircle()
    println("The area of testCircle2 is ${testCircle2.getArea()}")

    println()

    //Triangle tests
    println("Triangle tests")
    var testPoint15 = Point(0.0, 0.0)
    var testPoint16 = Point(2.0, 2.0)
    var testPoint17 = Point(-2.0, 2.0)
    var testTriangle1 = Triangle(testPoint15, testPoint16, testPoint17)
    testTriangle1.getTriangle()
    println("The area of testTriangle1 is ${testTriangle1.getArea()}")
    println("Moving the shape by 5.0 and 5.0")
    testTriangle1.moveTriangle(5.0, 5.0)
    testTriangle1.getTriangle()
    println("The area of testTriangle1 is ${testTriangle1.getArea()}")
    println("Creating an invalid triangle")
    var testPoint18 = Point(0.0, 0.0)
    var testPoint19 = Point(0.0, 2.0)
    var testPoint20 = Point(0.0, 4.0)
    var testTriangle2 = Triangle(testPoint18, testPoint19, testPoint20)
    testTriangle2.getTriangle()
    println("The area of testTriangle2 is ${testTriangle2.getArea()}")

}