package org.example.KBAquestion;

public class FunctionalKBA {
    public static void main(String[] args){
        MyFunctinalInterfaceKBA fi = n -> {
            return n * n;
        };
        System.out.println(fi.sqr(5));
    }
}
