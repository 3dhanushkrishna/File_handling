package com.harman.filehandling;

import java.io.*;
import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        Scanner  inp = new Scanner(System.in);
        System.out.println("Enter the name of a Person: ");
        String data = inp.nextLine();

        try
        {
            FileOutputStream object = new FileOutputStream("Name.txt");
            byte b[] = data.getBytes();
            object.write(b);
            object.close();
            System.out.println("File has been Created Successfully !! ");
        }

        catch (IOException e)
        {
            System.out.println(e);
        }

        }
    }
