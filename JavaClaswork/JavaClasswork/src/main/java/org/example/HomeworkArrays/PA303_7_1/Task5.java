package org.example.PA303_7_1;

public class Task5 {
    //Task 5: Write a program where you create an integer array with a length of 5.
    // Loop through the array and assign the value of the loop control variable (e.g., i)
    // to the corresponding index in the array.
    public static void main(String[] args) {

        int[] integersArray = {13, 5, 7, 68, 2};
        for (int pos = 0; pos <= integersArray.length - 1; ++pos) {
            System.out.println(integersArray[pos]);
        }
    }
}