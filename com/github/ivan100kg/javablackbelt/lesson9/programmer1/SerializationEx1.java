package com.github.ivan100kg.javablackbelt.lesson9.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Ivan");
        employees.add("Inna");
        employees.add("Igor");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))) {
            outputStream.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
