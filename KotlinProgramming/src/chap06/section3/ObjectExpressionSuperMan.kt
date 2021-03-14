package chap06.section3

open class Superman(){
    fun work() = println("Taking photos")
    fun talk() = println("Talking with ")
    open fun fly() = println("Flying in the air")
}

fun main() {
    val pretendedMan = object: Superman(){
        override fun fly() = println("I'm not a real superman. I can't fly!")
    }
    pretendedMan.fly()
    pretendedMan.talk()
    val superman = Superman()
    superman.fly()
}