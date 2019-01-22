package com.yoyo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {
    @Test
    public void BmiTest(){
        Person person = new Person(1.7f, 65f);
        Assertions.assertEquals(65f/(1.7f*1.7f),person.Bmi());
    }
}
