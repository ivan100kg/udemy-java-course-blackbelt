package com.github.ivan100kg.javablackbelt.lesson8;

public class WaitNotifyApp {
    volatile int count = 0;
    private final Object lock = new Object();

}
