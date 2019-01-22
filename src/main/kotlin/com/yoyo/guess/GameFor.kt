package com.yoyo.guess

import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(10) + 1
    println("猜數字遊戲練習:")
    for (i in 1..5){
        print("剩餘$i 次，請輸入數字: ")
        val num = readLine()!!.toInt()
        if(num==-1){
            break
        }else if(num >random){
            println("低一點")
        }else if(num<random){
            println("高一些")
        }else{
            println("你猜對了!!! 該數字為$random")
            break
        }

    }
}