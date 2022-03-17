package com.harman.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("Sample.txt");
            writer.write("Hello Dhanush");
            writer.close();
            System.out.println("File has successfully created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
