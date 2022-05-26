package com.github.ivan100kg.javablackbelt.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String myString = "12345678901343531225666;" +
                "98765432198756230127335;" +
                "23432433555666220524907";
        // mm/yy 1234 5678 8765 4321 (987)
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

//        String result = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
////        String result = matcher.replaceAll("$2-($3)");
//        System.out.println(result);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
