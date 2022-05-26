package com.github.ivan100kg.javablackbelt.lesson10;

import java.util.stream.Stream;

public class Regex6 {
    void checkIP(String ip) {
        String regex = "\\b((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\b";
        System.out.println(ip.matches(regex));
    }

    public static void main(String[] args) {
        // 0-255.0-255.0-255.0-255
        String ip1 = "127.0.0.1";
        String ip2 = "255.255.255.255";
        String ip3 = "0.0.0.0";
        String ip4 = "32.0.122.199";
        String ip5 = "32.0.122.399";
        Stream.of(ip1,ip2,ip3,ip4,ip5).forEach((ip) -> new Regex6().checkIP(ip));
    }
}
