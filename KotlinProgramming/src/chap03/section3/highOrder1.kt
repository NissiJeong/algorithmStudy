package chap03.section3

fun main() {
    var result: Int

    val multi = {x: Int, y:Int ->
        println("x * y")
        x
        x * y
    }
    val multi2: (Int,Int) -> Int = {x, y -> x * y}
    //val multi3 = {x, y -> x * y}

    val greet: () -> Unit = { println("Hello")}
    val nestedLamda: () -> () -> Int = {{ 20}}

    result = multi(10,20)
    println(result)
    println(greet())
    val testResult = nestedLamda()()
    println(testResult)
}