package com.github.ivan100kg.javablackbelt.lesson8;

public class Ex12 {
    final static Car car = new Car();

    void mobileCall() {
        synchronized (car) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (car) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsAppCall() {
        synchronized (car) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> new Ex12().mobileCall());
        Thread t2 = new Thread(() -> new Ex12().skypeCall());
        Thread t3 = new Thread(() -> new Ex12().whatsAppCall());
        t1.start();
        t2.start();
        t3.start();


    }


}

class Car {
}
