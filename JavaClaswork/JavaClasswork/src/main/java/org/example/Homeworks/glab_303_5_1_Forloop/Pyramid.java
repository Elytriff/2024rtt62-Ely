package org.example.Homeworks.glab_303_5_1_Forloop;

public class Pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}
