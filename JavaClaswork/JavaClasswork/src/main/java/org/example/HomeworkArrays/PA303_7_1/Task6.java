package org.example.PA303_7_1;

public class Task6 {
   // Write a program where you create an integer array of 5 numbers.
    // Loop through the array and
    // assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.

    public static void main(String[] args) {

        int[] integersArray = {13, 5, 7, 68, 2};
        for (int pos = 0; pos <= integersArray.length - 1; ++pos) {
            System.out.println(integersArray[pos*2]);
            //Why did not goes through all the array?
        }
    }
}
