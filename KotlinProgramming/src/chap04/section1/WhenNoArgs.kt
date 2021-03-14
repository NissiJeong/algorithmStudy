package chap04.section1

fun main() {

    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade : Char = 'F'

    when{
        score >= 90.9 -> grade = 'A'
        score in 80.0 .. 89.9 -> grade = 'B'
        score in 70.0 .. 79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }

    val msg = when(score){
        in 90.0..100.0 -> "good"
        else -> "not bad!"
    }

    println("Score: $score, Grade: $grade")

    var x = 0;
    for(i in 1..10){
        x += i
    }
    print(x)

}