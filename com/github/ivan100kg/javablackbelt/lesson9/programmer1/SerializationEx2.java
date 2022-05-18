package com.github.ivan100kg.javablackbelt.lesson9.programmer1;

import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Backend", 39, 600000, new Car("Ford", "black"));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))) {
            outputStream.writeObject(employee1);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
