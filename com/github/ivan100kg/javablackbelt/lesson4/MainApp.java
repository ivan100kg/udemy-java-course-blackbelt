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


        // TreeMap
        TreeMap<String, Integer> tMap = new TreeMap<>();
        tMap.put("Ivan", 39);
        tMap.put("Igor", 42);
        tMap.put("Ilya", 34);
        System.out.println(tMap.get("Ivan"));
//        System.out.println(tMap.firstEntry());
//        System.out.println(tMap.pollFirstEntry());
        System.out.println(tMap.tailMap("Ilya"));


        // LinkedHashMap
        LinkedHashMap<String, Integer> lhMap = new LinkedHashMap<>(16, 0.75f, true);
        lhMap.put("Ivan", 39);
        lhMap.put("Igor", 42);
        lhMap.put("Ilya", 34);
        System.out.println(lhMap);
        lhMap.get("Igor");
        System.out.println(lhMap);


        // HashTable
        Hashtable<String, Integer> htMap = new Hashtable<>();
        htMap.put("Ivan", 39);
        htMap.put("Igor", 42);
        htMap.put("Ilya", 34);
        System.out.println(htMap.contains(42));
        System.out.println(htMap);


        // HashSet
        HashSet<Integer> hSet1 = new HashSet<>();
        hSet1.add(1);
        hSet1.add(2);
        hSet1.add(3);
        HashSet<Integer> hSet2 = new HashSet<>();
        hSet2.add(1);
        hSet2.add(9);
        hSet2.add(3);
        System.out.println(hSet1);
        System.out.println(hSet2);
        HashSet<Integer> union = new HashSet<>(hSet1);
        union.addAll(hSet2);
        System.out.println(union);
        HashSet<Integer> intersect = new HashSet<>(hSet1);
        intersect.retainAll(hSet2);
        System.out.println(intersect);


        // TreeSet
        TreeSet<String> tSet = new TreeSet<>((o1, o2) -> o2.hashCode() - o1.hashCode());
        tSet.add("Ivan");
        tSet.add("Igor");
        tSet.add("Ilya");
        System.out.println(tSet.descendingSet());
        System.out.println(tSet);


        // LinkedHashSet
        LinkedHashSet<String> lhSet = new LinkedHashSet<>();
        lhSet.add("Ivan");
        lhSet.add("Igor");
        lhSet.add("Ilya");
        System.out.println(lhSet.contains("Igor"));
        System.out.println(lhSet);

    }
}
