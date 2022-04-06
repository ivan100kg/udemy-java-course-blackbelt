package com.github.ivan100kg.javablackbelt.lesson2;

public class MyClass implements Comparable<MyClass> {
    private int id;

    MyClass(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(MyClass o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                '}';
    }
}

