package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MainApp {
    public static void main(String[] args) {
        IntStream.iterate(0, n -> n + 1).limit(3).forEach(n -> System.out.print(n + " "));
        System.out.println("\n-----");
        DoubleStream.iterate(0, n-> n < 3, n -> n + 1).forEach(n -> System.out.print(n + " "));
        System.out.println("\n-----");
        IntStream.range(0, 3).forEach(n -> System.out.print(n + " "));
        System.out.println("\n-----");
        DoubleStream.generate(Math::random).limit(3).forEach(System.out::println);

    }
}
