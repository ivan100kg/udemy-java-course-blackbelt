package com.github.ivan100kg.javablackbelt.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCDEFG";
        Pattern p1 = Pattern.compile(".");
        Matcher matcher = p1.matcher(s1);

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
            System.out.println(matcher.group());
        }

    }
}
