package org.example.HomeworkMay7and9.PA303_7_1Arrays;

import java.util.Arrays;

public class HomeworkArrays {
   public static void main(String[] args) {

//1) Create an int array of length 10
//2) Initialize the array to random integers

       int[] integersArray = new int[10];
        for(int x = 0; x < 10; x++){
        integersArray[x] = (int) Math.round(Math.random()*100);
        }
       System.out.println(Arrays.toString(integersArray));
       //3) get the smallest integer in the array
       int smallest = Integer.MAX_VALUE;
       for (int y = 0; y < integersArray.length; y++) {
           if (integersArray[y] < smallest) {
               smallest = integersArray[y];
           }
       }
       System.out.println("Smallest element is: " + smallest);

//4) I want you to get the largest integer in the array
       int largest = Integer.MIN_VALUE;
       for (int y = 0; y < integersArray.length; y++) {
           if (integersArray[y] > largest) {
               largest = integersArray[y];
           }
       }
       System.out.println("Largest element is: " + largest);

//5) I want you to calculate the average value in the array as a double.
// Average is the sum of all elements in the array divided by the length of the array
       double average = 0;
       for (int array : integersArray) {
           average = (average + array)/2;
       }
       System.out.println( "Average is  " + average);

//You can only use a single for loop

   }
}

