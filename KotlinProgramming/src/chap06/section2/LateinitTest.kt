package chap06.section2

class Person{
    lateinit var name : String

    fun test(){
        if(!::name.isInitialized){
            println("not Initialized")
        }else{
            println("Initialized")
        }
    }
}

fun main() {
    val person = Person()
    //println(person.name) 초기화 되지 않고 사용하면 에러발생
    person.test()
    person.name = "Kildong"
    person.test()
    println(person.name)
}