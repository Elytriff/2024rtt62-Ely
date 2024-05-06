package org.example;

import java.util.Scanner;

public class PA303_5_1GCDivisor {
    public static void main(String[] args) {
        //Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
        //Examples:
        //Enter 2 and 4. The gcd is 2.
        //Enter 16 and 24.  The gcd is 8.
        //How do you find the gcd?
        //Name the two input integers n1 and n2.
        //You know number 1 is a common divisor, but it may not be the gcd.
        //Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
        Scanner intnumScan = new Scanner(System.in);
        System.out.println("Please enter a positive integer number1: ");
        int n1 = intnumScan.nextInt();
        System.out.println("Please enter a positive integer number2: ");
        int n2 = intnumScan.nextInt();

        int k = 1;
        int minInputNum = Math.min(n1, n2);
        int gcd = 0;

        for (k = 1; k <= minInputNum; ++k) {
            int result1 = n1 % k;
            int result2 = n2 % k;
            if (result1 == 0 && result2 == 0) {
                gcd = k;
            }
        }
        System.out.println("Gratest conmond divisor is: " + gcd);
        intnumScan.close();
    }
}
