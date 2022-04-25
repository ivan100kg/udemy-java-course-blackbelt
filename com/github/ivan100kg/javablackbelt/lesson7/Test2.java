package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 'm', 39, 5, 9.6));
        students.add(new Student("Egor", 'm', 34, 2, 5.7));
        students.add(new Student("Inna", 'w', 35, 3, 7.3));
        students.add(new Student("Efim", 'm', 23, 4, 5.9));
        students.add(new Student("Elsa", 'w', 45, 5, 8.3));

        System.out.println(Arrays.toString(students.stream().filter(student -> student.sex == 'w').toArray()));
        students.stream().collect(Collectors.toSet());

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5));
        System.out.println(integerList.stream().collect(Collectors.toSet()));
    }
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

