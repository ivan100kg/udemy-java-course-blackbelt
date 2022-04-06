package com.github.ivan100kg.javablackbelt.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Hello!");
        MyClass[] arr = {new MyClass(1), new MyClass(6), new MyClass(3)};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<MyClass> list = new ArrayList<>(Arrays.asList(arr));
        list.add(new MyClass(1));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(Integer.compare(2, 5));
        System.out.println("123".compareTo("234"));

    }
}
