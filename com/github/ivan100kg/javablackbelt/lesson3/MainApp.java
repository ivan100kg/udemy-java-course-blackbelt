package com.github.ivan100kg.javablackbelt.lesson3;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        for(String s : list) {
            System.out.println(s.length());
        }

        // Test Number
        List<Number> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(3.14f);
        numbers.add(12e123);
        for (Number n : numbers) {
            System.out.println(n);
        }

        // test our param method
        System.out.println(ParamMethod.getFirstElement(list));

        // MyParamClass
        ParamClass<String> pc = new ParamClass<>("Bla-bla-bla");
        System.out.println(pc);

        // Test my game
        Schoolboy sb1 = new Schoolboy("Katya", 9);
        Schoolboy sb2 = new Schoolboy("Veronica", 7);
        Preschooler ps = new Preschooler("Misha", 5);
        Student st = new Student("Maksim", 13);
        Employee e1 = new Employee("Ivan", 39);
        Employee e2 = new Employee("Andrey", 38);

        Team<Schoolboy> teamA = new Team<>("A");
        Team<Employee> teamB = new Team<>("B");
        Team<Participant> teamC = new Team<>("C");

        teamA.add(sb1);
        teamA.add(sb2);
        teamB.add(e1);
        teamB.add(e2);
        teamC.add(ps);
        teamC.add(st);

        teamA.playWith(teamB);
        teamA.playWith(teamC);
        teamB.playWith(teamA);
        teamB.playWith(teamC);
        teamC.playWith(teamA);
        teamC.playWith(teamB);

        // --- wrong!
//        List<Object> testList= new ArrayList<String>();

        // wildcard <?>
        List<Number> l1 = new ArrayList<>();
        List<?> l2 = new ArrayList<String>();
        List<? super Integer> l3 = new ArrayList<Number>();
        List<? extends Number> l4 = new ArrayList<Double>();
    }
}
