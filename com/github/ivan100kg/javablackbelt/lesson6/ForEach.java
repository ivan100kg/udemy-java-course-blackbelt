package com.github.ivan100kg.javablackbelt.lesson6;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "ok", "Bye");
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
