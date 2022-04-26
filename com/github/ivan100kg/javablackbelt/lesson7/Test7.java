package com.github.ivan100kg.javablackbelt.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 39, 5, 9.6);
        Student st2 =  new Student("Egor", 'm', 34, 2, 5.7);
        Student st3 = new Student("Inna", 'w', 35, 3, 7.3);
        Student st4 =  new Student("Efim", 'm', 23, 4, 5.9);
        Student st5 =  new Student("Elsa", 'w', 45, 5, 8.3);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");
        f1.add(st1);
        f1.add(st2);
        f2.add(st3);
        f2.add(st4);
        f2.add(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudents().stream())
                .forEach(System.out::println);
    }
}

class Faculty{
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void add(Student student) {
        students.add(student);
    }
}