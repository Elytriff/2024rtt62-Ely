package org.example.FileExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        try {
            File output = new File("output.txt");
            FileWriter fileW = new FileWriter(output, true);

            for(int count=0; count<10; count++) {
                fileW.write("Line (" + count+ ") This class is going fast.\n");
            }

            fileW.flush();// is saving

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}