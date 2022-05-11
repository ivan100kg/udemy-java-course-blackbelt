package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class RunnableFactorial {
    static int result;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        service.execute(factorial);
        service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(result);
    }
}

class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Wrong digit");
            return;
        }
        RunnableFactorial.result = IntStream.rangeClosed(1, f)
                .reduce((acc, el) -> acc * el)
                .orElse(0);
    }
}
