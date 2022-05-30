package com.github.ivan100kg.javablackbelt.lesson11.reflection_examples;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> employee1 = Class.forName("com.github.ivan100kg.javablackbelt.lesson11.reflection_examples.Employee");
        Class<Employee> employee2 = Employee.class;
        Class<? extends Employee> employee3 = Employee.class;

        Field field = employee1.getField("id");
        System.out.println(field.getName());
        System.out.println(field.getType());
        System.out.println("------------------------------------");

        for (Field f : employee1.getFields()) {
            System.out.println(f.getName() + ":\t" + f.getType());
        }

        System.out.println("------------------------------------");

        for (Field f : employee1.getDeclaredFields()) {
            System.out.println(f.getName() + ":\t" + f.getType());
        }

        System.out.println("------------------------------------");

        Method method = employee1.getMethod("increaseSalary");
        System.out.println(method.getName());
        System.out.println(method.getReturnType());

        System.out.println("------------------------------------");

        for (Class<?> f : method.getParameterTypes()) {
            System.out.println(f.getName());
        }

    }
}
