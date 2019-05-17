package com.san

fun main(args: Array<String>) {
//    println("Hello Kotlin");
//    Human().hello()
    val h = Human()
    h.hello()
    var name:String
    name = "Susan"
    println(name)
}

class Human {
    fun hello(){
        println("Hello kotlin")
    }
}