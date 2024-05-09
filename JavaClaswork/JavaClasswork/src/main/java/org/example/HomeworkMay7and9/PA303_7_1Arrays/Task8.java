package org.example.HomeworkMay7and9.PA303_7_1Arrays;

import java.util.Arrays;

public class Task8 {
    //Write a program that creates a String array of 5 elements
    // and swaps the first element with the middle element without creating a new array.
    public static void main(String[] args) {

        int[] integersArray = new int[5];
        for(int x = 0; x < 5; x++){
            integersArray[x] = (int) Math.round(Math.random()*10);
        }
        System.out.println("Original array: " + Arrays.toString(integersArray));

        int y = integersArray[0];
        integersArray[0]= integersArray[2];
        integersArray[2]= y;

        System.out.println("Modified array: " + Arrays.toString(integersArray));
    }

}
