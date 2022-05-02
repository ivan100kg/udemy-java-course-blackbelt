package com.github.ivan100kg.javablackbelt.lesson8;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
//        t1.join();
        System.out.println(Thread.currentThread().getName() + ": has finished");

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("my_t");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        System.out.println(Thread.currentThread().getName() + ": has finished");
    }
}
