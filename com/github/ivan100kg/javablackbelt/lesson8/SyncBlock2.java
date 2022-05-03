package com.github.ivan100kg.javablackbelt.lesson8;

public class SyncBlock2 {
    volatile static int counter = 0;

    public static void increment() {
        synchronized (SyncBlock2.class) {
            System.out.println("static synchro");
        }
    }

    public static void main(String[] args) {
        RS2 rs = new RS2();
        Thread t1 = new Thread(rs);
        Thread t2 = new Thread(rs);
        Thread t3 = new Thread(rs);
        t1.start();
        t2.start();
        t3.start();

    }
}

class RS2 implements Runnable {
    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    private void doWork2() {
        System.out.println("Ura!!!");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}