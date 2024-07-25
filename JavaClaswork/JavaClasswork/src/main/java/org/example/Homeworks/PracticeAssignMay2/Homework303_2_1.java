package org.example.Homeworks.PracticeAssignMay2;

import static java.lang.String.format;

public class Homework303_2_1 {
    public static void main(String[] args) {
        //Write a program that declares two integer variables,
        // assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result.

        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println( "The sum is " + sum);

       // Write a program that declares two double variables,
        // assigns a number to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        double d1= 15.3;
        double d2 = 15.7;
        double sum2 = d1 + d2;
        System.out.println( "The sum is " + sum2);

        //Write a program that declares an integer variable and a double variable,
        // assigns numbers to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        // What variable type must the sum be?
        int variable1 = 15;
        double variable2 = 15.8;
        double sum3 = variable1 + variable2;
        System.out.println( "The sum is " + sum3);

        //Write a program that declares two integer variables,
        // assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable.
        // Print out the result. Now change the larger number to a decimal.
        // What happens? What corrections are needed?
        int v1 = 30;
        int v2 = 10;
        double division = v1/ v2;
        System.out.println( "The division is " + division);

        Double v3 = 32.44; // The type of primitive type must change from "int" to "double"
        double division2 = v3/v2;
        System.out.println( "The division is " + division2);

        //Write a program that declares two double variables,
        // assigns a number to each, and divides the larger by the smaller number.
        // Assign the result to a variable.
        // Print out the result. Now, cast the result to an integer. Print out the result again.
        double x = 4.55;
        double y = 10.67;
        double division3 = y/x;
        System.out.println("The division is "+ division3);
        System.out.println("The division is "+ (int)division3);

        //Write a program that declares two integer variables, x and y,
        // and assigns the number 5 to x and the number 6 to y.
        // Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign it to q. Print q again.
        int x2 = 5;
        int y2 = 6;
        double q = x2/y2;
        System.out.println("The division is "+ q);
        double q2 = x2/(double)y2;
        System.out.println("The division is "+ q2);

        //Write a program that declares a named constant and uses it in a calculation. Print the result.
        final int SPEED_OF_LIGHT = 299792458;
        double mass = 0.5;
        double energy = mass * Math.pow(SPEED_OF_LIGHT,2);
        System.out.println("The energy is  "+ energy + " joules");// output 4.493775893684088E16 means 4.493775893684088×10 pow 16

        //Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product.
        // Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product,
        // four items of the second product, and two items of the third product. Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to two decimal places.
        double coffee = 1.50;
        double tea = 2.0;
        double smoothie = 5.0;

        System.out.println("3 coffee \n4 tea \n2 smoothie");
        double subtotal = 3*coffee + 4*tea + 2*smoothie;
        System.out.println("Subtotal: "+ subtotal);

        final double SALES_TAXES = 0.07;
        System.out.println("Sale Tax: "+ SALES_TAXES);

        double totalSales = ((subtotal * SALES_TAXES)+ subtotal);
       // String formattedNumber = String.format("%.2f", totalSales);

        System.out.println("Total: "+ String.format("%.2f", totalSales));
    }
}
