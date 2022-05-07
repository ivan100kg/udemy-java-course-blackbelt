package com.github.ivan100kg.javablackbelt.lesson8;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " starts");
        System.out.println(Thread.currentThread().getName() + " ends");
        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();
        userThread.setName("user_thread");
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (int i = 0; i < 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
