package chap08.secion2

import java.util.*

fun main() {
    val b = Array<Any>(10,{0})
    b[0] = "Hello"
    b[1] = 1.1

    val c = Array<Any>(10,{i->i*2})
    println(Arrays.toString(c))

    println(Arrays.toString(b))
}