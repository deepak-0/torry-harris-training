package com.torryharris.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NameReaderDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();

        FileWriter writer = new FileWriter("name.txt");
        for(int i =0 ; i<n ;i++) {
            writer.write(str);
            writer.write('\n');
        }
        writer.close();


    }
}
