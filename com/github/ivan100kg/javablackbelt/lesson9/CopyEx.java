package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        String path1 = "C:\\Users\\ivan1\\IdeaProjects\\udemy-java-course-blackbelt\\com\\github\\ivan100kg\\javablackbelt\\lesson9\\rubai.txt";
        String path2 = "C:\\Users\\ivan1\\IdeaProjects\\udemy-java-course-blackbelt\\com\\github\\ivan100kg\\javablackbelt\\lesson9\\rubai2.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(path2))) {
            String line;
            while ((line= reader.readLine()) !=null){
                writer.write(line);
                writer.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
