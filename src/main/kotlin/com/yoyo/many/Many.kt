package com.yoyo.many

fun main(args: Array<String>) {
    val list= listOf<Int>(1,2,3,4,5,6)
    println(list)

    var mut= mutableListOf<Int>(1,5,9,4,5,6)
    mut.add(33)
    println(mut)

    for (num in mut){
        println(num)
    }
}