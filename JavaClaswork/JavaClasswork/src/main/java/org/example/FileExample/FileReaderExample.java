package org.example.FileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args)throws Exception{
        File input = new File("output.txt");
        FileReader read = new FileReader(input);
        BufferedReader br = new BufferedReader(read);

        String line = br.readLine();//
        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
}

