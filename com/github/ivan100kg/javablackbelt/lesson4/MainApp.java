package com.github.ivan100kg.javablackbelt.lesson4;

import java.util.*;
import java.util.function.Predicate;

public class MainApp {
    public static void main(String[] args) {

        // List
        List<Object> list = List.of(12, "13, 3.14");    // immutable
        System.out.println(list);


        // ArrayList
        ArrayList<String> aList = new ArrayList<>();
        aList.add("a");
        aList.add("b");
        aList.add("c");
        System.out.println(aList);
//        aList.retainAll(new ArrayList<>(Arrays.asList("a", "b")));
//        aList.removeAll(new ArrayList<>(Arrays.asList("a", "b")));
        System.out.println(aList);
        String[] sArray = aList.toArray(new String[0]);
        for (String s : sArray) System.out.println(s);
        List<String> list2 = List.copyOf(aList);    // immutable
        Iterator<String> it = aList.listIterator();
        while (it.hasNext()) {                      // есть след элемент?
            if(it.next().equals("a"))               // получить элемент
                it.remove();                        // удаление элемента
        }
        aList.removeIf(s -> s.equals("a"));         // тоже самое удаление


        // LinkedList
        LinkedList<String> lList = new LinkedList<>();
    }
}
