package chap04.section3

import chap03.section06.b

fun main() {
    retFunc()
}

inline fun inlineLamda(a: Int, b: Int, out: (Int, Int)-> Unit){
    out(a,b)
}

fun retFunc(){
    println("stsart of retFunc")
    inlineLamda(13,3 ,fun(a,b){
        val result = a + b
        if(result > 10) return
        println("result: $result")
    })
    println("end of retFunc")
}