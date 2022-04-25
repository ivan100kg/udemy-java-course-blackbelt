package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 8, 2, 4, 3));
        System.out.println(list.stream().reduce((acc, el) -> acc * el).get());

        Optional<Integer> optional = list.stream().reduce((acc, el) -> acc * el);
        if (optional.isPresent()) System.out.println(optional.get());
        optional.ifPresent(System.out::println);

        List<String> strings = new ArrayList<>();
        strings.add("Hi");
        strings.add("Bye");
        strings.add("Ok");
        String s = strings.stream().reduce((acc, el) -> acc + " " + el).get();
        String x = strings.stream().reduce("Hello", (acc, el) -> acc + " " + el);
        System.out.println(s);
        System.out.println(x);
    }
}
