package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore smp = new Semaphore(4);
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    System.out.println("Поток " + Thread.currentThread().getName() + " перед семафором");
                    smp.acquire();  // если счетчик не 0, захват и счетчик-=1
                    System.out.println("Поток " + Thread.currentThread().getName() + " получил доступ к ресурсу");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Поток " + Thread.currentThread().getName() + " освободил ресурс");
                    smp.release();  // увеличить счетчик на 1
                }
            }).start();
        }
    }
}
