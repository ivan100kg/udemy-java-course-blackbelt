package com.github.ivan100kg.javablackbelt.lesson5;

public class AnonymousClass {
    public static void main(String[] args) {
        Math2 m = Integer::sum;

        int result = m.doOperation(12,13);
        System.out.println(result);
    }
}

interface Math2 {
    int doOperation(int a, int b);
}
