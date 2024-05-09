package org.example;

import java.util.Arrays;

public class ArrayDeleteFunction {

    public static int[] delete(int[] source, int positionToDelete) {

        int[] result = new int[source.length - 1];
        for(int pos=0; pos < positionToDelete; pos++){
            result [pos] = source [pos];

        }
        for(int pos = positionToDelete +1; pos < source.length; pos++){
            result [pos-1] = source [pos];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        //inserting 9 between 2 and 3
        array = delete(array,  4);
        System.out.println(Arrays.toString(array));

        array = delete(array, 2);
        System.out.println(Arrays.toString(array));

    }
}
