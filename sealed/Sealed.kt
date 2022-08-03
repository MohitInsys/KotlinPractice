package sealed
sealed class Employee{
data class Manager(var name:String,var age:Int):Employee(){
    val n=name
    fun prt() {
        println(n)
    }}
class SeniorDev(var name:String,var Experience:Int):Employee()

}
fun office(post:Employee){
    when(post){
        is Employee.Manager-> println("Manager")
        is Employee.SeniorDev-> println("SeniorDev")



}}
fun main(){
    var p=Employee.Manager("Mohit",23)
    println(p)
}