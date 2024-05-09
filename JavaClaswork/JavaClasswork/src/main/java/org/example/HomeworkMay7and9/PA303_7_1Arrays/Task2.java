package org.example.HomeworkMay7and9.PA303_7_1Arrays;

public class Task2 {
    public static void main(String[] args){
        //Task 2: Write a program that returns the middle element in an array.
        // Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

        int[] integersArray = {13, 5, 7, 68, 2};

        int pos = integersArray.length/2;

        System.out.println("The middle element in this array is number: " + integersArray[pos]);
        }
    }
