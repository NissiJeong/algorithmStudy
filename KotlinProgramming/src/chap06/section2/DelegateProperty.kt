package chap06.section2

import kotlin.properties.Delegates

class User {
    var name:String by Delegates.observable("Noname"){
        prop, old, new ->
        println("prop: $prop, old: $old, new: $new")
    }
}

fun main() {
    val user = User()
    user.name = "Kidong"
    user.name = "Dooly"
}