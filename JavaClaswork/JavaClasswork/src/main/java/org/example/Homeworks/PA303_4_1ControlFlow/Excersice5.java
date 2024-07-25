package org.example.Homeworks.PA303_4_1ControlFlow;

import java.util.Scanner;

public class Excersice5 {
    public static void main(String[] args) {
        //Write a program that uses if-else-if statements to print out grades A, B, C, D, F,
        // according to the following criteria:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: <60
        //Use the Scanner class to accept a number score from the user to determine the letter grade.
        // Print out “Score out of range” if the score is less than 0 or greater than 100.
        Scanner gradesScanner = new Scanner(System.in);
        System.out.println("Please enter grade:");
        double grade = gradesScanner.nextDouble();

        if (grade < 60){
            System.out.println("Grade is F");// F
        } else if (grade >=60 && grade<=69 ) {
            System.out.println("Grade is D");// D
        }else if (grade >=70 && grade<=79 ) {
            System.out.println("Grade is C");// C
        }else if (grade >=80 && grade<=89 ) {
            System.out.println("Grade is B");// B
        }else if (grade >=90 && grade<=100) {
            System.out.println("Grade is A");// A
        }else if (grade<0 || grade>100){
            System.out.println("Score out of range");
        }
        gradesScanner.close();
    }
}
