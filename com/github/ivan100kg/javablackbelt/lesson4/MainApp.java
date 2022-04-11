package com.github.ivan100kg.javablackbelt.lesson4;

import java.util.*;
import java.util.function.Predicate;

public class MainApp {
    public static void main(String[] args) {

        // List
        List<Object> list = List.of(12, "13", 3.14);    // immutable
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
            if (it.next().equals("a"))               // получить элемент
                it.remove();                        // удаление элемента
        }
        aList.removeIf(s -> s.equals("a"));         // тоже самое удаление


        // LinkedList
        LinkedList<String> lList = new LinkedList<>();
        lList.add("a");
        lList.add("b");
        lList.add("c");
        System.out.println(lList);
        lList.offerFirst("g");  // вставка в начало листа
        System.out.println(lList);
        System.out.println(lList.peekFirst());
        lList.pop();


        // Vector
        Vector<Integer> vList = new Vector<>();
        vList.add(12);
        vList.set(0, 13);
        System.out.println(vList.firstElement());


        // Stack
        Stack<Integer> sList = new Stack<>();
        sList.push(12);
        sList.push(15);
        sList.pop();
        System.out.println(sList.peek());


        // HashMap
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("Ivan", 39);
        hMap.put("Igor", 42);
        hMap.put("Ilya", 34);
        boolean present42 = hMap.containsValue(42);
        System.out.println(hMap.entrySet());
        Map<Coder, Double> coderMap = new HashMap<>();
        coderMap.put(new Coder("Ivan", "Bond", "Java"), 9.6);
        coderMap.put(new Coder("Igor", "Wing", "C++"), 7.2);
        coderMap.put(new Coder("Ilya", "Bell", "Python"), 4.9);
        System.out.println(coderMap);

    }
}
