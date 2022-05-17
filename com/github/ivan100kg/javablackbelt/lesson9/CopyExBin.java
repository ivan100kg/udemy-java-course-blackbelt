package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.*;

public class CopyExBin {
    public static void main(String[] args) {
        String path1 = "C:\\Users\\ivan1\\IdeaProjects\\udemy-java-course-blackbelt\\com\\github\\ivan100kg\\javablackbelt\\lesson9\\bb.jpg";
        String path2 = "C:\\Users\\ivan1\\IdeaProjects\\udemy-java-course-blackbelt\\com\\github\\ivan100kg\\javablackbelt\\lesson9\\bb_copy.jpg";
        try (FileInputStream inputStream = new FileInputStream(path1);
             FileOutputStream outputStream = new FileOutputStream(path2)) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
