package deligation

interface Car {
    var cname:String
    fun carName()
    fun Message()
}
class SetCar(override var cname: String):Car{
    override fun carName() {
        println(cname)
    }
    override fun Message() {
        println("WELCOME TO CAR WORLD")
    }
}
class NewCar(val c:Car):Car by c{
    override fun Message() {
        println("New Car Added")
    }
}
fun main(){
    val car=NewCar(SetCar("Thar"))
    car.carName()
    car.Message()
}