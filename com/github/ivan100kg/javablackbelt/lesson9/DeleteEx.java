package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteEx {
    public static void main(String[] args) throws IOException {
        Path destination = Paths.get("C:\\Users\\ivan1\\Desktop\\M\\A");
        Files.walkFileTree(destination, new MyFileVisitor3());
    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("DEl dir: " + dir);
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Del file: " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }
}