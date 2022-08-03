class Rectangle(name1:firstName ,name2: secondName){
    val firstname=name1
    val secondname=name2
    fun printSpec()
    {
        println("First person name is ${firstname.name1}")
        println("Second person name is ${secondname.name2}")
    }
}
fun main(){
    val firstname=firstName("Rohan")
    val secondname=secondName("Mohit")
    val rect=Rectangle(firstname,secondname)
    rect.printSpec()
}
inline class firstName(val name1:String)
inline class secondName(val name2:String)