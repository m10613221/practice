package com.yoyo;

public class Person {
    float height;
    float weight;
    String name;

    public Person(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public Person(String name,float height, float weight) {
        this(height,weight);
        this.name = name;
    }
    public String Say(){
        return "ha! "+name;
    }
    public float Bmi(){
        return weight/(height*height);
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
}
