package org.example.HomeworkMay7.PA303_7_1Arrays;

import java.util.Arrays;

public class Task10 {
    //Create an array that includes an integer, 3 strings, and 1 double. Print the array.

    public static void main(String[] args){
        Object[] mixedArray = new Object[5];
        mixedArray [0]= 3;
        mixedArray [1] = "David";
        mixedArray [2] = "Pablo";
        mixedArray [3] = "Ely";
        mixedArray [4] = 3.14;

        System.out.println(Arrays.toString(mixedArray));
    }
}
