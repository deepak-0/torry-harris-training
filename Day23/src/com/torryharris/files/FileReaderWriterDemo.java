package com.torryharris.files;

import java.io.*;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        //FileReader
        File input = new File("text1.txt");
        FileReader reader = new FileReader(input);

        char [] array = new char[(int)input.length()];
        reader.read(array);
        String data = new String(array);
        System.out.println(data);
        reader.close();

        //file Writer
        data ="This is using File Writer in output.txt file ";
        FileWriter writer = new FileWriter("output.txt");
        writer.write(data);
        writer.flush(); // forcefully write content into a file
        writer.close();

    }
}
