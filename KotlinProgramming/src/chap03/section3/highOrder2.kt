package chap03.section3.high2

fun main() {

    var result: Int

    result = highOrder(::sum, 10,20)
    println(result)

    hello(::text)
}

fun highOrder(sum: (Int, Int)->Int, a:Int, b:Int): Int {
    return sum(a, b)
}

fun hello(body:(String, String) -> String): Unit {
    println(body("Hello","World"))
}

fun text(a:String,b:String) = "Hi! $a $b"

fun sum(a:Int , b:Int): Int = a+b