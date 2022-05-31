package com.github.ivan100kg.javablackbelt.lesson11.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Employee> empClass = Employee.class;

        Object o = empClass.newInstance();
        System.out.println(o);

        Constructor<Employee> constructor = empClass.getConstructor();
        Employee emp1 = constructor.newInstance();


        Constructor<Employee> constructor2 = empClass.getConstructor(int.class, String.class, String.class);

        Method method = empClass.getMethod("setSalary", double.class);
        method.invoke(emp1, 10);
        System.out.println(emp1);
    }
}
