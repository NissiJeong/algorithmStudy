package chap03.section06

fun a() = b()
fun b() = println("b")

fun c() {
    fun e() = println("e")
    fun d() = e()

}

fun main() {
    a()
    c()
}