package org.example.HomeworkMay7.PA303_7_1Arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //Write a program that creates an array of String
        // type and initializes it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length.

        String[] colorsArray = {"red" ,"green", "blue", "yellow"};
        System.out.println("This arrays length is: " + colorsArray.length + " elements.");

        // Make a copy using the clone( ) method.
        String[] copyOfString = colorsArray.clone();

        // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
        String arrayVerify = Arrays.toString(copyOfString);
        System.out.println(arrayVerify);
    }
}
