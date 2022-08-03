package `object`

import java.util.Objects

fun main(){
  var obj=object:Details{
                override var name: String
                    get() = "ROHAN"
                    set(value) {}
                override var age: Int
                    get() = 24
                    set(value) {}

                override fun setter() {
                             println("Your Name is $name")
                             println("Age is $age")
                                 }
                 }
    var obj2=object:Details{
                        override var name: String
                            get() = "AMAN"
                            set(value) {}
                        override var age: Int
                            get() = 30
                            set(value) {}

                        override fun setter() {
                            println("Your Name is $name")
                            println("Age is $age")
                        }

    }
    obj.setter()
    obj2.setter()

    val new=object {
        fun setvalue(){
            println("Anonymous Object")
        }
    }
    println(new.setvalue())
}

interface Details{
    var name:String
    var age:Int
    fun setter()
}