package com.github.ivan100kg.javablackbelt.lesson10;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "Hello   my friend!  How    is it going? What   is Java?";
        System.out.println(s1);
//        s1 = s1.replace("Java", "SQL");
        s1 = s1.replaceAll(" {2,}", " ");
        System.out.println(s1);

    }
}
