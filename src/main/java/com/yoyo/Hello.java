package com.yoyo;

public class Hello {
    public static void main(String[] args) {
        Person person = new Person(1.7f, 65f);
        System.out.println(person.Bmi());
        Person person2 = new Person("YOYO",1.7f, 65f);
        System.out.println(person2.Say()+"\t"+person2.Bmi());
    }

}
