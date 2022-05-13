package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffOnPlace() {
        try {
            Thread.sleep(2000);
            System.out.println("Market staff came to work");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void everythingIsReady() {
        try {
            Thread.sleep(3000);
            System.out.println("Everything is ready, let's open the market");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void openMarket() {
        try {
            Thread.sleep(4000);
            System.out.println("Market is opened");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Friend("Ivan", countDownLatch);
        new Friend("Egor", countDownLatch);
        new Friend("Lisa", countDownLatch);
        new Friend("olga", countDownLatch);

        marketStaffOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private final CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " lets to buying");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
