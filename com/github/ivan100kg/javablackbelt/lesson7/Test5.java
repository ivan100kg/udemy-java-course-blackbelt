package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 65, 80, 0, 21, 3};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
