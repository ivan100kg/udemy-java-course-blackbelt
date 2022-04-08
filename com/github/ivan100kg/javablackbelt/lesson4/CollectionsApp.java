package com.github.ivan100kg.javablackbelt.lesson4;

import java.util.*;

public class CollectionsApp {
    public static void main(String[] args) {
        // Collections BinarySearch
        List<Integer> aList = new ArrayList<>(Arrays.asList(12, -23, 0, 9, 13, 903, -890, 24, 67, -4, -29, 0, 1, 34, 978, -2345, -65));
        System.out.println(aList);
        Collections.sort(aList);
        System.out.println(aList);
        System.out.println((Collections.binarySearch(aList, 1)));
        Collections.reverse(aList);
        System.out.println(aList);
        Collections.shuffle(aList);
        System.out.println(aList);

        // Student
        Student s1 = new Student("Ivan", 39);
        Student s2 = new Student("Igor", 34);
        Student s3 = new Student("Ilya", 67);
        Student s4 = new Student("Egor", 23);
        Student s5 = new Student("Efim", 19);

        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
        System.out.println(students);
        students.sort((o1, o2) -> o1.age - o2.age);
        System.out.println(students);
        System.out.println(Collections.binarySearch(students, s2));

        // Arrays BinarySearch
        int[] array = new int[]{12, -23, 0, 9, 13, 903, -890, 24, 67, -4, -29, 0, 1, 34, 978, -2345, -65};
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, -29));
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + name + ": " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
