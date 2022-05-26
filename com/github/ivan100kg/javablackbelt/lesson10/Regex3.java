package com.github.ivan100kg.javablackbelt.lesson10;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCDEFG";

        boolean result = s1.matches("ABC.+");
        System.out.println(result);

        String[] arr = s1.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
