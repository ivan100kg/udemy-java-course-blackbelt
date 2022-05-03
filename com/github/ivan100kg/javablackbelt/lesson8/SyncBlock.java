package com.github.ivan100kg.javablackbelt.lesson8;

public class SyncBlock {
    public static void main(String[] args) {
        RS rs = new RS();
        Thread t1 = new Thread(rs);
        Thread t2 = new Thread(rs);
        Thread t3 = new Thread(rs);
        t1.start();
        t2.start();
        t3.start();

    }
}

class RS implements Runnable {
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
