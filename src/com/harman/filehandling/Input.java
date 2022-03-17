package com.harman.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
    public static void main(String[] args) {
        try {
            FileInputStream file=new FileInputStream("Sample.txt");
            int i=0;
            while((i=file.read())!=-1)
            {
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
