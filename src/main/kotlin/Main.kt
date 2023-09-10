import java.util.Scanner

fun main(args: Array<String>) {

    // Scanner for double values
    val userInput: Scanner = Scanner(System.`in`)

    // Create one instance of each class and store each in a variable of type Shape
    print("Name your square: ")
    // Extraneous, just practicing reading user input
    val squareName: String = readln()
    var square : Shape = Square(squareName)
    // Prompt the user to enter the dimensions for each object
    println("Enter the height of a square")
    var squareHeight: Double = userInput.nextDouble()
    println("Enter the length of a square")
    var squareLength: Double = userInput.nextDouble()

    print("Name your circle: ")
    val circleName: String = readln()
    var circle : Shape = Circle(circleName)
    println("Enter the radius of a circle")
    var circleRadius: Double = userInput.nextDouble()

    print("Name your triangle: ")
    val triangleName: String = readln()
    var triangle : Shape = Triangle(triangleName)
    println("Enter the length of the first side of a triangle")
    var triangleSideOne: Double = userInput.nextDouble()
    println("Enter the length of the second side of a triangle")
    var triangleSideTwo: Double = userInput.nextDouble()
    println("Enter the length of the third side of a triangle")
    var triangleSideThree: Double = userInput.nextDouble()

    print("Name your equilateral triangle: ")
    val equilateralName: String = readln()
    var equilateral : Shape = EquilateralTriangle(equilateralName)
    println("Enter the side of a triangle")
    var triangleSide: Double = userInput.nextDouble()

    /*
    * Cannot access a function declared in a child class that is not declared in the parent class
    * if the object is initialized with the type of the parent. Casting?
    */

    val sqr = square as Square
    val cir = circle as Circle
    val tri = triangle as Triangle
    val etri = equilateral as EquilateralTriangle

    sqr.setDimensions(squareHeight, squareLength)
    cir.setDimensions(circleRadius)
    tri.setDimensions(triangleSideOne, triangleSideTwo, triangleSideThree)
    etri.setDimensions(triangleSide)

    // Once all objects have been created, print the name, dimensions, and area for each object to
    // the screen with appropriate headings

    println("Square")
    println("Name: ${sqr.name}")
    sqr.printDimensions()
    println("Area: ${sqr.getArea()}")

    println("Circle")
    println("Name: ${cir.name}")
    cir.printDimensions()
    println("Area: ${cir.getArea()}")

    println("Triangle")
    println("Name: ${tri.name}")
    tri.printDimensions()
    println("Area: ${tri.getArea()}")

    println("Equilateral Triangle")
    println("Name: ${etri.name}")
    etri.printDimensions()
    println("Area: ${etri.getArea()}")

}

