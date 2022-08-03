fun main() {
      val obj=Details("Mohit",95)
    println("Name of Student is ${obj.name}")
    println("Percenatge is ${obj.perc()}")
    println("New Name ${obj.newName()}")
}
fun Details.newName():String{
    return ("$name yadav")

}
class Details(val name:String,val marks:Long){
    fun get():String{
       return name
    }
    fun perc():Long{
        return marks/5
    }
}

