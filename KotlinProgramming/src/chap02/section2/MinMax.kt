package chap02.section2

fun main() {
    println("Int min: "+Int.MIN_VALUE+" max: "+Int.MAX_VALUE)

    var num:Double = 0.1

    for(x in 0..999){
       num += 0.1
    }

    println(num)
}