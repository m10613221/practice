package com.yoyo.Parking.Kotlin

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter=LocalDateTime.of(2019,1,22,8,0,0)
    val leave=LocalDateTime.of(2019,1,22,10,5,0)
    var car = Car("KOTLIN-123", enter)
    car.leave=leave
    val duration = car.duration()
    println(duration)
    val hours=Math.ceil(duration/60.0).toLong()
    println(hours)
    var cost=hours*30
    println(cost)

}

class Car(val name: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value))
                field = value
        }

    fun duration() = Duration.between(enter, leave).toMinutes()

}