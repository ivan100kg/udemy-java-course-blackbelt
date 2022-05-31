package com.github.ivan100kg.javablackbelt.lesson11.reflection_examples;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee emp = new Employee(10, "Ivan", "Backend");
        Field field = Employee.class.getDeclaredField("salary");
        field.setAccessible(true);
        System.out.println(field.get(emp));
        field.set(emp, 1200);
        System.out.println(field.get(emp));
    }
}
