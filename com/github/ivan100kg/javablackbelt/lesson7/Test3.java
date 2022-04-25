package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 1, 6, 9, 0, 6, 2};
        Arrays.stream(array).forEach(value -> System.out.print(value * 2));
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.stream().forEach(integer -> System.out.print(integer * 3));
    }
}
