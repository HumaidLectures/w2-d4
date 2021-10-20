import kotlin.math.PI
import kotlin.math.pow

interface Shape {



    fun info ():String

    fun computeArea():Double


}


fun main() {


    val circle = Circle("circle" , "purple" , 2.5)
    println(circle.info())
    println(circle.computeArea())

    val triangle = Triangle("triangle" , "black" , 7.8 , 9.2)
    println(triangle.info())
    println(triangle.computeArea())

    val rectangle = Rectangle("rectangle" , "white" , 8.4,6.5)
    println(rectangle.info())
    println(rectangle.computeArea())
}


class Circle (private var shapeName :String,private var shapeColor:String,private var radius:Double ):Shape{
    override fun info(): String {
        return "you have $shapeColor $shapeName"
    }

    override fun computeArea(): Double {
        return PI * radius.pow(2)
    }

}

class Triangle (private var shapeName :String,private var shapeColor:String,private var base:Double,private var height:Double):Shape{
    override fun info(): String {
        return "you have $shapeColor $shapeName"
    }

    override fun computeArea(): Double {
        return (base * height) / 2
    }

}

class Rectangle (private var shapeName :String,private var shapeColor:String, private var length: Double,private var width :Double):Shape{
    override fun info(): String {
        return "you have $shapeColor $shapeName"
    }

    override fun computeArea(): Double {
        return length * width
    }

}