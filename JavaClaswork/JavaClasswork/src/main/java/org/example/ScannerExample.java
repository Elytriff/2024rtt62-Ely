package org.example;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        //we are creating (instantiating) an object that will inheritate the characteristics of the class we choose
        //to created
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1= sc1.nextInt();
        System.out.print("The number is: " + num1);
        sc1.close();
    }
}
