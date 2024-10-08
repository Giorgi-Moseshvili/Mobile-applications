package com.example.myfirstapplication

//open class Human(private var name: String = "",
//            private var age: Int = 0,
//            private var alive: Boolean = false){
//
//    open fun details(){
//         println("\nName: $name,\nAge: $age,\nAlive: $alive")
//    }
//
//}
//
//class Profession(name:String,
//                 age:Int,
//                 alive:Boolean,
//                 private var profession: String): Human(name, age,alive){
//
//    override fun details(){
//        super.details()
//        println("Profession: $profession")
//    }
//
//
//
//}
//

class Numbers(private var a:Int = 0,
               private var b:Int = 0){
               fun sum(): String{
                   return "$a + $b = ${a + b}"
               }

}



fun main(){
//    println("Hello world!")
//    val h1 = Human("El gu ja",21, true)
//    val p1 = Profession("jib uta",74,true,"Knight capitan of the silver cross")
//    h1.details()
//    p1.details()

    val f1 = Numbers(1,3)
    println(f1.sum())
}



