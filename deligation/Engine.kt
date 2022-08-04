package deligation

interface Engine {
    fun print()
}
class ElectricEng:Engine{
    override fun print() {
        println("Welcome")
    }
}
class NewEngine(val eng:Engine):Engine by eng
fun main(array: Array<String>){
    val valEng=NewEngine(ElectricEng())
    valEng.print()
}