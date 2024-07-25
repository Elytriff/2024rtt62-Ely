package org.example;

public class ResultTest {
    public static int getDigitsSum(int largeNumber) {

        int[] numberArray = {largeNumber};

        int sum =0;
        for(int x : numberArray){
            sum = sum +x;

        }
        return sum;

    }
}
