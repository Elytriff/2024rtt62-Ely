package org.example;

public class SBAPractice2 {
    public static void main(String[] args){
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // part 1 - create a for loop to print each character of the string s on its own line

        /*
          A
          B
          C
          D
          E
          F
          G
          ...
         */

        for(int pos =0; pos< s.length(); pos++){
            System.out.println(s.charAt(pos));
        }
        // part 2
        // Given the following Strings convert them to integer values
        String ten = "10";
        String hundred = "100";

        int intTen= Integer.parseInt(ten);
        int intHundred= Integer.parseInt(hundred);
        System.out.println("10 + 100 = " + intTen + intHundred);

        // part 3
        // given an integer array find the sum of all the integers in the array
        int[] array = {2, 4, 5, 6, 7, 8, 10};
        int sum= 0;

        for(int x : array){
            sum = sum +x;
            }
        System.out.println(sum);

        // part 4
        // given the array of string covert them to numbers and print the sum
        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};
        int stringSum= 0;

        for( String x : nums){
            int x1 = Integer.parseInt(x);
            stringSum = stringSum + x1;
        }
        System.out.println(stringSum);

    }
}
