package com.github.ivan100kg.javablackbelt.lesson8;

public class Ex10 {
    public static void main(String[] args) {
        MyRunnable2 myRunnable = new MyRunnable2();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);
        t1.start();
        t2.start();
        t3.start();

    }
}

class Counter {
    volatile static int count;
}

class MyRunnable2 implements Runnable {
    public synchronized void inc() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            inc();
        }
    }
}
