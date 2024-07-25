package org.example.Homeworks.PA303_4_1ControlFlow;

import java.util.Scanner;

public class Excersice6 {
    public static void main(String[] args) {
        //Write a program that accepts an integer between 1 and 7 from the user.
        // Use a switch statement to print out the corresponding weekday.
        // Print “Out of range” if the number is less than 1 or greater than 7.
        // Do not forget to include “break” statements in each of your cases.
        Scanner weekScanner = new Scanner(System.in);
        System.out.println("Please enter number between 1 and 7 to know the day of the week:");
        int weekCounter = weekScanner.nextInt();


        switch (weekCounter) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Out of rank");
        }
        weekScanner.close();
    }
}
