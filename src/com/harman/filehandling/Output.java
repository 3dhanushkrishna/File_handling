package com.harman.filehandling;


import java.io.FileOutputStream;
import java.io.IOException;


public class Output {
    public static void main(String[] args) {
        try {
            FileOutputStream file=new FileOutputStream("Sample.txt");
            String data="Welcome to Java";
            byte b[]=data.getBytes();
            file.write(b);
            file.close();
            System.out.println("File created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
