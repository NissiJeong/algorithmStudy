package chap05.section1

class Bird{
    //프로퍼티
    var name:String
    var wing: Int
    var beak: String
    var color :String

    //부 생성자1
    constructor(_name:String, _wing: Int, _beak: String, _color:String){
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    //부 생성자2
    constructor(_name: String, _beak: String){
        name = _name
        beak = _beak
        wing = 3
        color = "red"
    }

    //메소드
    fun fly() = println("Fly $wing")
    fun sing(vol: Int) = println("Sing $vol")

}

fun main() {
    val coco = Bird("myBird",2,"long","Yellow")
    coco.color = "Blue"

    println(coco)
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
    println(coco.color)

    coco.fly()
    coco.sing(3)

    val coco2 = Bird("yourBird","very Long")
    println(coco2.beak)
    println(coco2.name)
}