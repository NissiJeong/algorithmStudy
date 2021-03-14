package chap05.section3

class Calc{
    fun add(x:Int, y:Int):Int = x+y
    fun add(x:Double, y:Double) = x+y
    fun add(x:Int, y:Int,z:Int): Int{
        return x + y + z
    }
    fun add(x:String, y:String) : String = x + y
}

fun main() {
    val calc = Calc()
    println(calc.add(3,2))
    println(calc.add(3.2,2.1))
    println(calc.add(3,2,5))
    println(calc.add("3","2"))
}

//BirdOverrideEx