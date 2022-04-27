package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sum1 = list.stream().mapToDouble(d -> d).sum();
        double sum2 = list.stream().reduce(0.0, Double::sum);
        double sumP = list.parallelStream().reduce((acc, el) -> acc + el).get();
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sumP);

    }
}
