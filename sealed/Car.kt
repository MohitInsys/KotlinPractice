package sealed

sealed class Car {
    class Engine(val price:Double):Car()
    class Window(val price:Double):Car()
    class Tire(val price:Double):Car()
}
fun price(type:Car){
    when(type){
        is Car.Window->println("Window price is ${type.price+(12.5/100*type.price)}")
        is Car.Tire->println("Tire price is ${type.price+(12.5/100*type.price)}")
        is Car.Engine->println("Engine price is ${type.price+(12.5/100*type.price)}")
    }
}
fun main(){
    price(Car.Tire(11000.00))
    price(Car.Engine(200000.00))
    price(Car.Window(19000.00))

}