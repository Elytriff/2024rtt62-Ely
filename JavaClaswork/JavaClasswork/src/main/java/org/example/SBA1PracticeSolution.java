package org.example;

public class SBA1PracticeSolution {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // part 1 - create a for loop to print each character of the string s on its own line
        // you can use the s.charAt(pos) function
        for (int pos = 0; pos < s.length(); pos++){
            System.out.println(s.charAt(pos));}


        // part 2
        // Given the following Strings convert them to integer values   Integer.valueOf()
        String ten = "10";
        String hundred = "100";

        int  convertedTen = Integer.parseInt(ten);
        int convertedHundred = Integer.parseInt(hundred);

        System.out.println("Ten + Hundred =  " + convertedHundred + convertedTen);

        // part 3
        // given an integer array find the sum of all the integers in the array
        int[] array = {2, 4, 5, 6, 7, 8, 10};
        int arraySum =0;

        for (int x : array) {
            arraySum = arraySum + x;
        }
        System.out.println(arraySum);

        // part 4
        // given the array of string covert them to numbers and print the sum

        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};
        int sum1 = 0;
        for ( String nums2 : nums ) {
            int value = Integer.parseInt(nums2);
            sum1 = sum1 + value;
        }
        System.out.println(sum1);

    }

}





