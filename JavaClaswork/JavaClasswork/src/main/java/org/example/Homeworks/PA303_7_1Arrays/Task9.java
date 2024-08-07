package org.example.Homeworks.PA303_7_1Arrays;

import java.util.Arrays;

public class Task9 {
    // Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
    // Print the array in ascending order, and print the smallest and the largest element of the array.
    // The output will look like the following:
//Array in ascending order: 0, 1, 2, 4, 9, 13
    //The smallest number is 0
    // The biggest number is 13
    public static void main(String[] args) {
        int[] integers = {4, 2, 9, 13, 1, 0};
        Arrays.sort(integers);
        System.out.println("Array in ascending order: " + Arrays.toString(integers));
        System.out.println("If array sorted length is " + integers.length);
        System.out.println("The smallest number is " + integers[0] + " and the largest is " + integers[5]);
    }
}

