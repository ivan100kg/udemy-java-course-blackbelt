package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//        stream1.filter(el -> {
//            System.out.println("!!!");
//            return el % 2 == 0;
//        }).collect(Collectors.toSet());
//        Stream<Integer> stream2 = Stream.of(6, 6, 6);
//        Stream<Integer> stream3 = Stream.of(100, 200, 300);
//        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
//        System.out.println(stream4.collect(Collectors.toList()));
//        System.out.println(stream4.collect(Collectors.toSet()));

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream5.distinct().toList());

    }

}
