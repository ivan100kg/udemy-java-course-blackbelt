package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            service.execute(new RunnableImplementation2());
//        }
//        service.schedule(new RunnableImplementation2(), 3, TimeUnit.SECONDS);
//        service.scheduleAtFixedRate(new RunnableImplementation2(), 3, 1, TimeUnit.SECONDS);
//        service.schedule(() -> System.out.println("Hi"), 3, TimeUnit.SECONDS);
//        service.scheduleAtFixedRate(() -> System.out.println("Hey"), 3, 1, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(() -> System.out.println("ok"), 2, 1, TimeUnit.SECONDS);
    }
}

class RunnableImplementation2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins the work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends the work");
    }
}
