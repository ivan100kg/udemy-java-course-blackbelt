package com.github.ivan100kg.javablackbelt.lesson9.programmer2;

import com.github.ivan100kg.javablackbelt.lesson9.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees2.bin"))) {
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
