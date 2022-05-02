package com.github.ivan100kg.javablackbelt.lesson8;

public class Ex11 {
    volatile static int counter = 0;

    synchronized public static void inc() {
        counter++;
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
