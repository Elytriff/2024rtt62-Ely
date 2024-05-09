package org.example;

public class StringExample {
    public static void main(String[] args){
        String str = "This is a java lesson";
        System.out.println("length of the string= "+ str.length());

        String str2 = str.toUpperCase();// this function does not alter the original string
        System.out.println(str2);
    }
}
