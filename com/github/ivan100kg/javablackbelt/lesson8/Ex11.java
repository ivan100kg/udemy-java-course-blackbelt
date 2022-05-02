package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex11 {
    static int counter = 0;
    static Lock lock = new ReentrantLock();

    public static void inc() {
        lock.lock();
        counter++;
        lock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new R());
        Thread t2 = new Thread(new R());
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter);
    }
}

class R implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Ex11.inc();
        }
    }
}
