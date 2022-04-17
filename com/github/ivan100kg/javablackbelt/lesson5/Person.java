package com.github.ivan100kg.javablackbelt.lesson5;

public class Person {
    public static void main(String[] args) {
        getName();
    }

    static void getName() {
        class Name {
            String name = "Gennady";
        }
        System.out.println(new Name().name);
    }
}


