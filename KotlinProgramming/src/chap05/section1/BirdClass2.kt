package chap05.section1.bird2

class Bird(var name:String = "NONAME", var wing: Int = 2, var beak:String, var color:String){
    //초기화 블록
    init {
        println("------------초기화 블록 시작------------")
        println("이름은 $name, ")
        this.sing(3)
        println("------------초기화 블록 종료------------")
    }

    //메소드
    fun fly() = println("Fly $wing")
    fun sing(vol: Int) = println("Sing $vol")
}

fun main() {
    val coco = Bird("myBird",2,"long","Yellow")
    val coco2 = Bird(wing = 2,beak = "long",color = "Yellow")
    val coco3 = Bird(beak = "short",color = "Green")
    coco.color = "Blue"

    println(coco)
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
    println(coco.color)

    coco.fly()
    coco.sing(3)
}