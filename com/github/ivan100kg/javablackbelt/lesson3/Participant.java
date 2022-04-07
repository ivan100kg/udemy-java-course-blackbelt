package com.github.ivan100kg.javablackbelt.lesson3;

abstract public class Participant {
    private String name;
    private int age;

    Participant(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
