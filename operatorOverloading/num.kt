package operatorOverloading
fun main(){
    val a=Num(10,20)
    val b=Num(25,30)
    var c=Num(40,4)
    var d=Num(3,25)
    var e=Num(10,15)

    println(a+b)
    println(a-b)
    println(++c)
    println(--d)
    println(a*e)
    println(a in b)
}
data class Num( var m:Int, var n:Int){
    operator fun plus(new:Num):Num {
        return Num(this.m*new.m,this.n*new.n)
    }
    operator fun minus(new:Num):Num {
        return Num(this.m+new.m,this.n+new.n)
    }
    operator fun inc(): Num {
        return Num(this.m-20,this.n+10)
    }
    operator fun dec():Num{
        return Num(this.m+100,this.n-4)
    }
    operator fun times(new:Num):Num{
        return Num(this.m+new.m,this.n+new.n)
    }
    operator fun contains(new:Num):Boolean{
        var r:Boolean=if(this.m>new.m)
                        true
                    else
                           false
        return r
    }

}



