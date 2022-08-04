package highOrderFunction
fun main(){

percentage(80.0,95.0) {r->
        println(r)

}
}
fun percentage(
    x:Double,
    y:Double,
    sum:(String)->Unit)
{       val r:String
        val result=(x+y)/2
          r = if(result>75)
                 "Pass"
           else
               "Fail"
        sum(r)

        println(result)

}
