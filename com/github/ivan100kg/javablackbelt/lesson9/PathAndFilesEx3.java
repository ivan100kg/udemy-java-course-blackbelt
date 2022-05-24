package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test100.txt");
//        Files.createFile(filePath);
//        String dialog = "Hello!\nHi\nWhat's up?\nFine. How you?\nThe same :)";
//        Files.write(filePath, dialog.getBytes(StandardCharsets.UTF_8));
        List<String> list = Files.readAllLines(filePath);
        list.forEach(System.out::println);
    }
}
