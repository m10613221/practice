package com.yoyo

import org.junit.Test
import org.junit.jupiter.api.Assertions

class HummanTest{
    @Test
    fun BmiTest(){
        val humman = Humman(1.7f, 65f, "yoyo")
        Assertions.assertEquals(65f/(1.7f*1.7f),humman.Bmi());
    }
}