package org.example.Homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class PA303_11_1Lists {
    public static void main(String[] args) {
        Scanner scanList = new Scanner(System.in);
        int listLength = scanList.nextInt();

        ArrayList<Integer> L = new ArrayList<>();

        for (int x=0; x < listLength; x++){
            L.add(x, scanList.nextInt());
        }

        int nQueries = scanList.nextInt();
        for (int x2 = 0; x2 < nQueries; x2++){
            String instruccion = scanList.next();
            if(instruccion.equals("Insert")){
                int index =scanList.nextInt();
                int value =scanList.nextInt();
                L.add(index, value);

            }else if (instruccion.equals("Delete")){
                int index = scanList.nextInt();
                L.remove(index);
            }else{
                System.out.println("Wrong Input");
            }
        }

        for(int x3 : L){

            System.out.print(x3 + " ");
        }

        System.out.println();
        scanList.close();

    }

}

