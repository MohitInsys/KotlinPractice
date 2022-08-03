fun main()
{
    val list= mutableListOf(0,20,50,2,5)
    println(list.swap(0,2))
}
fun MutableList<Int>.swap(first:Int,sec:Int):Any{
    if(this==null) return "null"
    else {
        var temp=this[first]
        this[first]=this[sec]
        this[sec]=temp
        return this
}}