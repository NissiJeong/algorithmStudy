package chap05.section3.override

open class Bird(var name:String, var wing: Int, var beak: String, var color : String){
    fun fly() : Unit {
        println("Fly wing: $wing")
    }
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

class Lark(name:String, wing: Int, beak: String,color: String, var language: String) : Bird(name, wing, beak, color){
    fun singHighthon() = println("Happy new year!!")
}

class Parrot(name: String, wing: Int, beak: String, color: String, var language: String) : Bird(name, wing, beak, color){
    fun speak() = println("speak $language")
    override fun sing(vol: Int) {
        super.sing(vol)
        println("I'm a Parrot $vol")
        speak()
    }
}

fun main() {
    val coco = Bird("coco", 2, "short","blue")
    val lark = Lark("lark", 2,  "long", "brown","korean")
    val parrot = Parrot("parrot", 2,  "middle", "gold","english")

    println("coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}, ${lark.language}")
    println("parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    parrot.sing(6)
    lark.sing(4)
}

