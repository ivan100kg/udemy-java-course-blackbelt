package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImplementation());
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("main ends");
    }
}

class RunnableImplementation implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
