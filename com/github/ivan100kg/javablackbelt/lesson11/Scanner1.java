package com.github.ivan100kg.javablackbelt.lesson11;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = scanner.nextInt();
        System.out.println("You entered: " + i);
        if (scanner.hasNext()) System.out.println("Hi");
    }
}
