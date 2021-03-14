package chap02.section3

fun main() {
    val a:Int = 127
    val b = a

    val str1 : String = "Hello"
    val str2 : String = "Hello"

    println("str1 === str2 : ${str1 === str2}")

    println(a === b)
    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d)
    println(c === d)
    println(c === e)
}