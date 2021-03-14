package chap08.secion2

import java.util.*

fun main() {
    val arr = arrayOf(8,4,3,2,5,9,1)

    val sortedArr =  arr.sortedArray()

    println(Arrays.toString(sortedArr))

    val sortedArrDesc = arr.sortedArrayDescending()
    println(Arrays.toString(sortedArrDesc))

    arr.sortDescending(0,5)
    println(Arrays.toString(arr))

    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println(listSorted)
    println("List: $listDesc")

    val items = arrayOf<String>("Dog","Cat","Lion","Kangaroo","Po")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))
}