package com.github.ivan100kg.javablackbelt.lesson8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaitNotifyApp {
    volatile int count = 0;
    private final Object lock = new Object();

    public static void main(String[] args) {
        System.out.println(Boolean.hashCode(true));
        System.out.println(Integer.compare(12, 12));

        System.out.println(Stream.of(1, 2, 3, 4)
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }

}
