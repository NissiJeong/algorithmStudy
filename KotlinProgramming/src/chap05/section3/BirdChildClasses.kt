package chap05.section3.openClass

open class Bird(var name:String, var wing: Int, var beak: String, var color : String){
    fun fly() : Unit {
        println("Fly wing: $wing")
    }
    fun sing(vol: Int) = println("Sing vol: $vol")
}

class Lark(name:String, wing: Int, beak: String,color: String, var language: String) : Bird(name, wing, beak, color){
    fun singHighthon() = println("Happy new year!!")
}

class Parrot : Bird{
    val language: String

    constructor(name: String, wing: Int, beak: String, color: String, language: String) : super(name, wing, beak, color){
        this.language = language
    }
}

fun main() {
    val coco = Bird("coco", 2, "short","blue")
    val lark = Lark("lark", 2,  "long", "brown","korean")
    val parrot = Parrot("parrot", 2,  "middle", "gold","english")

    println("coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}, ${lark.language}")
    println("parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
}

