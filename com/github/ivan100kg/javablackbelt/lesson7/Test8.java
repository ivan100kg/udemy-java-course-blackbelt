package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 'm', 39, 5, 9.6));
        students.add(new Student("Egor", 'm', 34, 2, 5.7));
        students.add(new Student("Inna", 'w', 35, 3, 7.3));
        students.add(new Student("Efim", 'm', 23, 4, 5.9));
        students.add(new Student("Elsa", 'w', 45, 5, 8.3));

        Map<Character, List<Student>> map1 =  students.stream()
                .collect(Collectors.groupingBy(student -> student.getSex()));


        Map<Boolean, List<Student>> map2 =  students.stream()
                .collect(Collectors.partitioningBy(el->el.getAvgGrade()>7));

        map1.forEach((el, list) -> System.out.println(el + ": " + list));
        map2.forEach((el, list) -> System.out.println(el + ": " + list));

    }
}
