package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye");
        list.add("Ok");
        list.add("Always");

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        System.out.println(list.stream());
        System.out.println(list.stream().map(element -> element.length()).toList());
        System.out.println(list.stream().map(element -> element.length()).collect(Collectors.toList()));
        list.stream().map(String::length);

        System.out.println(list);

        int[] array = {1,6,3,0,5};
        Arrays.stream(array);
        Arrays.stream(array).map(el -> el*el);   // новый поток с результами
        System.out.println(Arrays.toString(Arrays.stream(array).map(el -> el * el).toArray()));   // новый поток с результами

    }

}
