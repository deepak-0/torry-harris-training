package com.torryharris.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("text1.txt");
       // System.out.println("The Contents are");
        int ch;
        while((ch=file.read())!=-1){
        //    System.out.print((char)ch);
        }

        file.close();

        FileOutputStream fos = new FileOutputStream("output.txt");
        String str="this is file output\nfile name is output.txt\n123456789";
        char [] arr = str.toCharArray();
        for(char c : arr){
            fos.write((int)c);

        }
        fos.close();
    }
}
