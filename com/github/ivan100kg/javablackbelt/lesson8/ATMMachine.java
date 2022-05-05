package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATMMachine {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Ivan", lock);
        new Employee("Efim", lock);
        new Employee("Lisa", lock);
        Thread.sleep(2000);
        new Employee("Olga", lock);
        new Employee("Igor", lock);
    }
}

class Employee extends Thread {
    String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " waits ...");
//            lock.lock();
                System.out.println(name + " uses an ATM");
                Thread.sleep(200);
                System.out.println(name + " has finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " don't want to wait");
        }
    }
}
