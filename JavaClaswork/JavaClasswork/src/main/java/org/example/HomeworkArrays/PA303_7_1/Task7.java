package org.example.PA303_7_1;

public class Task7 {
    //Task 7: Write a program where you create an array of 5 elements.
    // Loop through the array and print the value of each element, except for the middle (index 2) element.
    public static void main(String[] args) {

        int[] integersArray = {13, 5, 7, 68, 2};
        for (int pos = 0; pos <= integersArray.length - 1; ++pos) {
            if (pos != integersArray.length/2){
                System.out.println(integersArray[pos]);
            }
        }
    }
}
