package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! —\n" +
                "Вот последняя правда, открытая мной.";
        String s = "\nHello";
        try (FileWriter writer = new FileWriter("C:\\Users\\ivan1\\IdeaProjects\\udemy-java-course-blackbelt\\com\\github\\ivan100kg\\javablackbelt\\lesson9\\rubai.txt")) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            writer.write("\n\n" + rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
