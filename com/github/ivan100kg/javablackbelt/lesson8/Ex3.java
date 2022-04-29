package com.github.ivan100kg.javablackbelt.lesson8;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("1: " + i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 1000; i > 0; i--) {
                System.out.println("2: " + i);
            }
        }).start();
    }
}
