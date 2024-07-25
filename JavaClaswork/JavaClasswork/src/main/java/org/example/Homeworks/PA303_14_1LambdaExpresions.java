package org.example.Homeworks;

import java.util.Scanner;

public class PA303_14_1LambdaExpresions {
    public static void fizzBuzz(int n) {
        // Write your code here
        for (int number = 1; number <= n; number++) {

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (number % 3 == 0 && number % 5 != 0) {
                System.out.println("Fizz");

            } else if (number % 3 != 0 && number % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(number);
            }

        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fizzBuzz(n);
        scan.close();
    }
}


