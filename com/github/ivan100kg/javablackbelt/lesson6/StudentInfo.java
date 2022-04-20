package com.github.ivan100kg.javablackbelt.lesson6;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 39, 5, 9.6);
        Student st2 = new Student("Egor", 'm', 34, 2, 5.7);
        Student st3 = new Student("Inna", 'w', 35, 3, 7.3);
        Student st4 = new Student("Efim", 'm', 23, 4, 5.9);
        Student st5 = new Student("Elsa", 'w', 45, 5, 8.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo si = new StudentInfo();
//        si.printStudentOverGrade(students, 8);
//        System.out.println();
//        si.printStudentUnderAge(students, 30);
//        System.out.println();
//        si.printStudentMixConditional(students, 40, 5, 'w');
        si.testStudents(students, new CheckOverGrade());
        System.out.println("----------");
        si.testStudents(students, st -> st.avgGrade > 7);
        System.out.println("----------");
        si.testStudents2(students, st -> st.age > 40);
        System.out.println("----------");

        Predicate<Student> p1 = student -> student.age < 40;
        Predicate<Student> p2 = student -> student.sex == 'w';
        si.testStudents2(students, p1.and(p2));
        System.out.println("----------");
        si.testStudents2(students, p1.or(p2));


    }

//    void printStudentOverGrade(ArrayList<Student> arrayList, double grade) {
//        for (Student st : arrayList) {
//            if (st.avgGrade > grade)
//                System.out.println(st);
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> arrayList, int age) {
//        for (Student st : arrayList) {
//            if (st.age > age)
//                System.out.println(st);
//        }
//    }
//
//    void printStudentMixConditional(ArrayList<Student> arrayList, int age, double grade, char sex) {
//        for (Student st : arrayList) {
//            if (st.age > age && st.avgGrade > grade && st.sex == sex)
//                System.out.println(st);
//        }
//    }

    void testStudents(ArrayList<Student> arrayList, StudentChecks sc) {
        for (Student st : arrayList) {
            if (sc.check(st))
                System.out.println(st);
        }
    }

    void testStudents2(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student st : arrayList) {
            if (predicate.test(st))
                System.out.println(st);
        }
    }

}

interface StudentChecks {
    boolean check(Student st);
}


class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student st) {
        return st.avgGrade > 8;
    }
}