package org.example.Homeworks.PA303_4_1ControlFlow;

public class Excersice3 {
    public static void main(String[] args) {
        //Write a program that declares 1 integer variable x, and then assigns 15 to it.
        // Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
        // “Between 10 and 20” if x is greater than 10 but less than 20,
        // and “Greater than or equal to 20” if x is greater than or equal to 20.

        int x = 15;
        if (x < 10) {
            System.out.println("Les than ten");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }

        //Change x to 50 and notice the result.
        int x2 = 50;
        if (x2 < 10) {
            System.out.println("Les than ten");
        } else if (x2 > 10 && x2 < 20) {
            System.out.println("Between 10 and 20");
        } else if (x2 >= 20) {
            System.out.println("Greater than or equal to 20");
        }
    }
}
