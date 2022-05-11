package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CallableFactorial {
    static int result;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(0);
        Future<Integer> future = service.submit(factorial2);
        try {
            result = future.get();
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
        if (f <= 0) throw  new Exception("Wrong digit");
        return CallableFactorial.result = IntStream.rangeClosed(1, f)
                .reduce((acc, el) -> acc * el)
                .orElse(0);
    }
}
