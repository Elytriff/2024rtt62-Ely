package org.example.HomeworkMay7and9.PA303_7_1Arrays;

public class Task4 {
    public static void main(String[] args){
        //Write a program that creates an integer array with 5 elements (i.e., numbers).
        // The numbers can be any integers.
        // Print out the value at the first index and the last index using length - 1 as the index.

        int[] integersArray = {13, 5, 7, 68, 2};

        System.out.println("Number of first index is: " + integersArray[0]);
        System.out.println("Number of last index is: "+ integersArray[integersArray.length -1]);

        // Now try printing the value at index = length (e.g., myArray[myArray.length] ).
        //System.out.println(integersArray[integersArray.length]);

        // Notice the type of exception which is produced.
        // Now try to assign a value to the array index 5. You should get the same type of exception.
        integersArray[5]= 6;
    }
}
