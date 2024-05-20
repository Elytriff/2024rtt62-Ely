package org.example.Homeworks;

import java.util.Scanner;

public class PA303_14_1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] array = new int[n];
        for (int x= 0; x < array.length ; x++){
            array[x] =x+1;
        }

        for (int number : array){
            if(number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");

            }else if(number % 3 == 0 && number % 5 != 0){
                System.out.println("Fizz");

            }else if (number % 3 != 0 && number % 5 == 0){
                System.out.println("Buzz");

            } else {
                System.out.println(number);
            }

        }
        scan.close();
    }

}

