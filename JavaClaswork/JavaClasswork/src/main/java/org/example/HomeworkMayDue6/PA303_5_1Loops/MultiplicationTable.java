package org.example.HomeworkMayDue6.PA303_5_1Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Print a Multiplication Table
        //Write a program that uses nested for loops to print a multiplication table.
        int x;
        int f;

        for (x = 1; x <= 12; ++x) {      // outer loop
            for (f = 1; f <= 12; ++f){     // inner loop
                System.out.print(" " + (x * f));
           }
            System.out.println();
        }
    }
}
