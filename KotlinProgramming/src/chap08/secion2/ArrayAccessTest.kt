package chap08.secion2

import java.util.*

fun main() {
    val arr = arrayOf(1,2,3,4,5)

    println(arr.get(2))
    println(arr[2])

    println(arr.size)

    for(el in arr)
        print(el)

    println()

    println(Arrays.toString(arr))
    println(arr.contentToString())
    println(arr.sum())

    arr.set(1,8)
    println(Arrays.toString(arr))

    arr[1] = 10
    println(Arrays.toString(arr))
}