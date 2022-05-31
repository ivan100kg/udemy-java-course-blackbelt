package com.github.ivan100kg.javablackbelt.lesson11.reflection_examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        System.out.println("The sum of " + a + " " + b + " = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("The sub of " + a + " " + b + " = " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("The mul of " + a + " " + b + " = " + (a * b));
    }

    void dev(int a, int b) {
        System.out.println("The dev of " + a + " " + b + " = " + (a / b));
    }
}

class TestCalc {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("test101.txt"))) {
            String methodName = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();

            Calculator calculator = new Calculator();
            Class<? extends Calculator> cl = calculator.getClass();
            Method method = null;

            Method[] methods = cl.getDeclaredMethods();
            for(Method m: methods) {
                if(m.getName().equals(methodName)) {
                    method = m;
                }
            }

            assert method != null;
            method.invoke(calculator, Integer.parseInt(firstArg), Integer.parseInt(secondArg));

        } catch (IOException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
