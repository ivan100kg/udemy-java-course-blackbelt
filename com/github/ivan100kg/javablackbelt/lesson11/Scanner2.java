package com.github.ivan100kg.javablackbelt.lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();

        try {
            scanner = new Scanner(new FileReader(new File("test10.txt")));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {
                set.add(scanner.next());
            }
            set.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert scanner != null;
            scanner.close();
        }


    }
}
