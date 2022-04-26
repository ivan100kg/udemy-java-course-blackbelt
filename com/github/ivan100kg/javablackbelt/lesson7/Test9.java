package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 'm', 39, 5, 9.6));
        students.add(new Student("Egor", 'm', 34, 2, 5.7));
        students.add(new Student("Inna", 'w', 35, 3, 7.3));
        students.add(new Student("Efim", 'm', 23, 4, 5.9));
        students.add(new Student("Elsa", 'w', 45, 5, 8.3));

//        Student min = students.stream().min((st1, st2) -> st1.getAge() - st2.getAge()).get();
//        Student max = students.stream().min((st1, st2) -> st2.getAge() - st1.getAge()).get();
//        System.out.println(min);
//        System.out.println(max);

        students.stream().filter(st->st.getAge()>30).limit(2).skip(1).forEach(System.out::println);
    }
}
