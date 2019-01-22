package com.yoyo.guess

import java.util.*


fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1
    println(secret)
    val scanner= Scanner(System.`in`)
    var number=0
    while (number!=secret){
        print("輸入猜的數字: ")
        number=scanner.next().toInt()
        grade(number)
        if (number>secret){
            println("低一點")
        }else if (number<secret){
            println("高一點")
        }else{
            println("恭喜猜中了!! 數字為:$secret")
        }
    }

}
fun grade(number:Int) =when(number){
    in 0..3->println("A")
    in 4..6->println("B")
    in 7..9->println("C")
    else -> println("F")
}