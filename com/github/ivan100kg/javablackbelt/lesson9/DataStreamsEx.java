package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        String path = "C:\\Users\\ivan1\\IdeaProjects\\udemy-java-course-blackbelt\\com\\github\\ivan100kg\\javablackbelt\\lesson9\\my_file.bin";
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(path));
             DataInputStream inputStream = new DataInputStream(new FileInputStream(path))) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeDouble(3.14);
            outputStream.writeUTF("Hello");

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
