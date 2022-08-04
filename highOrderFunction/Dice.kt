package highOrderFunction


fun main(){

    rollDice(1..6,3){result ->
        println(result)

    }
}

fun rollDice(
    range:IntRange,
    time:Int,
    callback:(result:Int)->Unit

){
    for(i in 0 until time){
        val num=range.random()
        callback(num)
    }
}