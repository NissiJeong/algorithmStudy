package chap03.section3.funarg

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b:Int) = a*b

fun main() {
    val result = sum(10,3)
    val result2 = mul(sum(3,3), 2)

    println("result: $result, result2: $result2")
    println(funvFunc())

}

fun funvFunc() : Int{
    return sum(2,2)
}