package chap04.section2

fun main() {

    var lineNumber = 5

    for(line in 1..lineNumber){
        for(space in 1..(lineNumber-line)) print("   ")
        for(star in 1 until 2*line) print(" * ")
        println()
    }
    var num = 0;
    for(i in 1..100 step 2){
        num += i
    }
    println(num)
    num = 0
    for(i in 0..99 step 2){
        num += i
    }
    println(num)

    var test = 10
    var facto:Long = 1
    while(test>0){
        facto *= test
        --test
    }
    println(facto)

}