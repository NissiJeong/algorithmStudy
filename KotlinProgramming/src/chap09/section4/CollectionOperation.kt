package chap09.section4

fun main() {
    val list1 = listOf("one","two","three")
    val list2: List<Int> = listOf(1,2,3)
    val map1 = mapOf("hi" to 1, "hello" to 2, "good bye" to 3)

    println(list1+"four")
    println(list2+"4")
    println(list2 -1)
    println(list2)
    println(list1 - "one")
    println(list1 + list2)
    println(list1 + listOf("abc","def"))
    println(list1 + mapOf(1 to 2))
    println(map1 - listOf("hi",2,3))

    val listPair = listOf(Pair(1,2),Pair(2,3),Pair(4,5))

    println(listPair)

    listPair.forEach{print(it)}  

    listPair.forEachIndexed { index, pair -> println(pair) }
}