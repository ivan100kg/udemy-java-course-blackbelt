package com.github.ivan100kg.javablackbelt.lesson6;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Bye");
        arrayList.add("Learn Java");
        System.out.println(arrayList);

        arrayList.removeIf(s -> s.length() < 5);
        System.out.println(arrayList);
    }
}
