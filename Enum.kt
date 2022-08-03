fun main(){

   println(Direction.North)
    enumValues<Direction>().forEach {
    if(it.name==Direction.North.name)
    {
        println("Matched")
    }
}
    println(Direction.North.values)
    println(Direction.North.values+Direction.South.values)
    println(Direction.South.text)
enumValues<PhoneBook>().forEach { if(it.name==PhoneBook.Abhinav.name) println("${it.name}'s contact no is ${it.no}") }
}
enum class Direction(var values:Long,var text:String){
    North(12345,"north side"),
    South(23456,"south side"),
    East(34567,"east side"),
    West(45678,"west side")

     }
enum class PhoneBook(var no:Long){
    Mohit(9834836),
    Kasish(327433234),
    Tushar(323423478),
    Abhinav(7652457)
}
