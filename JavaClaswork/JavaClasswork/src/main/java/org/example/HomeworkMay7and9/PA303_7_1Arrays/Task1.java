package org.example.HomeworkMay7and9.PA303_7_1Arrays;

public class Task1 {
    public static void main(String[] args){
        //Task 1: Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.
        int[] arrayOfInteger = new int[3];
        arrayOfInteger[0]= 1;
        arrayOfInteger[1]= 2;
        arrayOfInteger[2]= 3;

//        for(int pos = 0; pos <= 2; ++pos)
//        System.out.println( "this is an element in an array:  " + arrayOfInteger[pos]);

        for (int array : arrayOfInteger){
            System.out.println("this is an element in an array:  " + array);
        }
    }
}
