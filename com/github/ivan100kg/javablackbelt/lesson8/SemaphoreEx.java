package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore smp = new Semaphore(1);
        for (int i = 0; i < 5; i++) {
            final int w = i;
            new Thread(() -> {
                try {
                    System.out.println("Поток " + w + " перед семафором");
                    smp.acquire();  // если счетчик не 0, захват и счетчик-=1
                    System.out.println("Поток " + w + " получил доступ к ресурсу");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Поток " + w + " освободил ресурс");
                    smp.release();  // увеличить счетчик на 1
                }
            }).start();
        }
    }
}
