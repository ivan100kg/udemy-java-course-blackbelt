package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test10.txt");
        File file2 = new File("testdir\\test20.txt");
        File dir = new File("testdir");
        File dir2 = new File("testdir\\testdir2");
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(dir.isAbsolute());
//        System.out.println(dir.isDirectory());
//        System.out.println(file.createNewFile());

        System.out.println(dir2.mkdir());
        System.out.println(file2.createNewFile());

        System.out.println("file.exists() " + file.exists());
        System.out.println("file2.exists() " + file2.exists());
        System.out.println("dir.exists() " + dir.exists());
        System.out.println("dir2.exists() " + dir2.exists());

        System.out.println(file.length());
        System.out.println(dir.length());

        System.out.println(Arrays.toString(dir.listFiles()));
    }
}
