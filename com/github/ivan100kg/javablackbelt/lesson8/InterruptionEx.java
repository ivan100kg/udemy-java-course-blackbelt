package com.github.ivan100kg.javablackbelt.lesson8;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();                     // send signal
        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    private double sqrt_sum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 1000000000; i++) {
//            if (isInterrupted()) {              // check signal
//                System.out.println(getName() + " is interrupted");
//                break;
//            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("They want to interrupt " + getName());
                break;
            }
            sqrt_sum += Math.sqrt(i);
        }
        System.out.println(sqrt_sum);
    }
}
