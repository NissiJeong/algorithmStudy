package chap09.section1

fun main() {
    var numbers: List<Int> = listOf(1,2,3,4,5)
    var names: List<String> = listOf("one","two","thress")
    var mixed = listOf("One", 1, 1.5, 'c')

    println("mixed: $mixed")

    for(name in names){
        println(name)
    }
    for(num in numbers) print(num)
    println()

    for(index in numbers.indices)
        println("numbers[$index] = ${numbers[index]}")

    val emptyList: List<String> = listOf()

    println(numbers.size)
    println(numbers.indexOf(3))
    println(numbers.get(0))
    println(numbers[1])
    println(numbers.contains(1))

}

