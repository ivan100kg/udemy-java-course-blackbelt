package com.github.ivan100kg.javablackbelt.lesson9.programmer2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))) {
            List<String> employees = new ArrayList<>();
            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
