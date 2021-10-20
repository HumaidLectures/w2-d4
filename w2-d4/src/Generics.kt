import kotlin.reflect.typeOf

class Name <T> (val name:T){
    fun print (){
        println(name)
    }
}
//
//fun main() {
////    val name = Name("Humaid")
////
////    name.print()
//
////    val y = hats(99)
//    val x = lootBox(hats(99))
//    x.printItem()
//}

class hats (val numberOfHats : Int){

    fun getNumberOfHat():Int{
        return numberOfHats
    }
}

class lootBox <T : hats>(val item : T) {

    fun printItem(){
        val x = item as hats
        println(x.getNumberOfHat())
    }
}


fun adding(vararg items:Int){

    var results = 0

    for (z in items.indices){
        results += items[z]
        println(results)
    }

}

fun main() {

//    val ii = IntArray(10)



//    adding(1,1,1,1,1)

    looping(3,4,5,1,6,7,8,2)


}

fun looping (vararg numbers :Int){
    for (x in numbers.indices) {
        numbers[x]++
        println(numbers[x])
    }
}