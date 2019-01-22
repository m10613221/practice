package com.yoyo

fun main(args: Array<String>) {
    val humman=Humman(1.7f,65f,"Kotlin")
    println("${humman.SayHi()}\t,${humman.Bmi()}")
}

class Humman(var height: Float,var weight: Float,var name: String = ""){
    fun SayHi():String{
        return "Hi! "+name
    }
    fun Bmi():Float{
        return weight/(height*height)
    }
}