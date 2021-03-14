package chap07.secion1

abstract class Vehicle(val name: String, val color :String, val weight:Double){
    // 추상 프로퍼티 - 하위 클래스에서 오버라이디 필요
    abstract val maxSpeed: Double

    // 비추상 프로퍼티 초기화 필요
    var year: String = "2008"

    abstract fun start()

    abstract fun stop()

    fun displaySpec(){
        println("name: $name. color: $color, weight: $weight, year: $year, maxSpeed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
        println("Car Started")
    }
    override fun stop() {
        println("Car Stop")
    }
    fun autoPilotOn(){
        println("Auto Pilot On")
    }
}

class MotorBike(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
        println("MotorBike Started")
    }
    override fun stop() {
        println("MotorBike Stop")
    }
}

fun main() {
    var car = Car("Matiz", "red", 1000.0, 100.0)
    var motorBike = MotorBike("Motor1", "red", 1000.0, 100.0)

    car.year = "2002"

    car.displaySpec()
    motorBike.displaySpec()

}