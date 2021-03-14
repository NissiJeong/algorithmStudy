package chap03.section1

fun main() {
    val result1 : Int = default(1,2,3)
    val result2 : Int = default(a=12, b=13)
    val result3 : Int = default(b=5)

    println("result1: $result1, result2: $result2, result3: $result3")

    val result4 : Int = varargsFunc(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

    println("result4: $result4")
}

fun default(a: Int=1, b: Int, c: Int = 12) = a+b+c

fun varargsFunc(vararg counts: Int):Int{
    var sum = 0
    for(num in counts){
        sum += num
    }
    return sum
}