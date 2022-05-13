package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count.incrementAndGet();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count.decrementAndGet();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count.get());
    }
}
