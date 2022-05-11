package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CallableFactorial {
    static int result;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(5);
        Future<Integer> future = service.submit(factorial2);
        try {
            System.out.println(future.isDone());
            System.out.println("Wanna to get a result");
            result = future.get();
            System.out.println("Result is gotten");
            System.out.println(future.isDone());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            service.shutdown();
        }
        System.out.println(result);
    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if (f <= 0) throw new Exception("Wrong digit");
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
