import kotlin.math.PI

abstract class Shape1(var shapeName : String, var shapeColor : String) {


    fun info () {
        println("your shape is $shapeColor $shapeName")
    }

    abstract fun computeArea():Double
}

class Circle1(shapeName: String, shapeColor: String,var radius : Double ) : Shape1(shapeName,shapeColor) {
    override fun computeArea(): Double {
        return PI * radius * radius
    }
}

class Rectangle1 (shapeName: String, shapeColor: String,var length : Double , var width :Double) :Shape1(shapeName,shapeColor){
    override fun computeArea(): Double {
        return length*width
    }
}

class Triangle1 (shapeName: String,shapeColor: String,var base :Double, var height :Double): Shape1(shapeName,shapeColor){
    override fun computeArea(): Double {
        return ((base * height)/2)
    }
}


fun main() {

    val circle = Circle1("circle" , "white" , 2.8)
    println(circle.computeArea())
    circle.info()

    val rectangle = Rectangle1("rectangle", "purple" , 12.5 , 9.4)
    println(rectangle.computeArea())
    rectangle.info()

    val triangle = Triangle1("triangle" , "black",8.4,9.7)
    println(triangle.computeArea())
    triangle.info()

}