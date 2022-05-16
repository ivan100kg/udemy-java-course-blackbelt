package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        String path = "C:\\Users\\ivan1\\IdeaProjects\\udemy-java-course-blackbelt\\com\\github\\ivan100kg\\javablackbelt\\lesson9\\rubai.txt";
        try (FileReader reader = new FileReader(path)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
