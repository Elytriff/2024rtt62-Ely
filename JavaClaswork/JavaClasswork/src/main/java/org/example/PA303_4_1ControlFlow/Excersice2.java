package org.example.PA303_4_1ControlFlow;

public class Excersice2 {
    public static void main(String[] args) {
        //2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
        // Write an if-else statement that prints out “Less than 10” if x is less than 10,
        // and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.

        int x = 7;
        if (x < 10) {
            System.out.println("Les than ten");
        } else if (x > 10) {
            System.out.println("Greater than 10");
        }
        int x2 = 15;
        if (x2 < 10) {
            System.out.println("Les than ten");
        } else if (x2 > 10) {
            System.out.println("Greater than 10");
        }
    }
}
