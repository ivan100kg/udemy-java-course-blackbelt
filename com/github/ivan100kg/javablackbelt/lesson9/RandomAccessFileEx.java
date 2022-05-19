package com.github.ivan100kg.javablackbelt.lesson9;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file =  new RandomAccessFile(
                "test10.txt",
                "rw")){
            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(0);
            String s2 = file.readLine();
            System.out.println(s2);

            System.out.println(file.getFilePointer());

            file.seek(0);
            file.writeBytes("Hello");
            file.seek(0);
            System.out.println(file.readLine());



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
