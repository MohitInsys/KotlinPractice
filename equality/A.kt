package equality

class A (
    val name:String,
    val age:Int
)
class B(val age:Int)


fun main(){
    val a=A("Mohit",24)
    val b=A("Tushar",19)
    val x=B(10)
    val y=B(10)
    println(a===b)           //to compares the reference of both object
    println(x==y)           //to compares the reference of both object
    println(x.age==y.age)   //to compare data of different object


}