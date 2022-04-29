package com.github.ivan100kg.javablackbelt.lesson8;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread t1 = new Thread(new Worker());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
        System.out.println("Method main ends");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}
