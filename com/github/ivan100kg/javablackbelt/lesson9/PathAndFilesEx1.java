package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path DirectoryPath = Paths.get("C:\\Users\\ivan1\\Desktop\\M");

        System.out.println("filePath.getFileName() "+filePath.getFileName());
        System.out.println("DirectoryPath.getFileName() "+DirectoryPath.getFileName());
        System.out.println("==========================================");

        System.out.println("filePath.getFileName() "+filePath.getParent());
        System.out.println("DirectoryPath.getFileName() "+DirectoryPath.getParent());
        System.out.println("==========================================");

        System.out.println("filePath.getFileName() "+filePath.getRoot());
        System.out.println("DirectoryPath.getFileName() "+DirectoryPath.getRoot());
        System.out.println("==========================================");

        if(!Files.exists(filePath)) {
            Files.createFile(filePath);


        }
        System.out.println(Files.getAttribute(filePath, "creationTime"));




    }
}
