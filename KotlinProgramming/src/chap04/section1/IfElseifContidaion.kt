package chap04.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if(score >= 90.0) grade = 'A'
    //else if(score >= 80.0) grade = 'B'
    else if(score in 08.0 .. 89.9) grade = 'B'
    //else if(score >=  70.0) grade = 'C'
    else if(score in 70.0 .. 79.9) grade = 'C'

    println("Score: $score, Grade: $grade")
}