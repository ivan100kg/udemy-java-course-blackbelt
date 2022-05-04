package com.github.ivan100kg.javablackbelt.lesson8;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread10().start();
        new Thread20().start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: trying to get the monitor of object lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: the monitor of object lock1 is gotten");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: the monitors of objects lock1 and lock2 is gotten");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: trying to get the monitor of object lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread20: the monitor of object lock1 is gotten");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread20: the monitors of objects lock1 and lock2 is gotten");
            }
        }
    }
}
