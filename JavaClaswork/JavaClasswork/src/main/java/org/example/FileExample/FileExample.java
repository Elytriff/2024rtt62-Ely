package org.example.FileExample;

import java.io.File;
import java.io.IOException;

import static java.awt.PageAttributes.MediaType.C;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\oscar\\Documents\\new file.txt");// absolut path to the file
        File file2 = new File("C:\\..\\..\\Documents\\new file.txt");// relative path

        // .. means go up one directory from where I am
        //. means current directory where I am right now

        File f3 = new File(".");
        System.out.println(f3.getAbsolutePath());

        File[] file4 = f3.listFiles();
        for (File file : file4) {
            System.out.print(file.getAbsolutePath());

            if (file.isDirectory()) {
                System.out.println(" is directory");
            } else {
                System.out.println(" is file");
            }
        }

        try {

            File file5 = new File("C:\\Users\\oscar\\Development\\Java rtt62 Ely\\JavaClaswork\\JavaClasswork");
            file5.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
