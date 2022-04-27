package com.github.ivan100kg.javablackbelt.lesson8;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("her");
        myThread5.start();
//        System.out.println("Name MyThread5: " + myThread5.getName() +
//                "\nPriority of myThread5: " + myThread5.getPriority());
        System.out.println(Thread.currentThread().getName());
    }
}


class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}