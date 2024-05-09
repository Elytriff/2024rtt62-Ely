package org.example.HomeworkMayDue5.glab_303_2_1;

import org.w3c.dom.ls.LSOutput;

public class AssignmentOperatorsDemo {
    public static void main(String[] args){
        int j = 10;// gets the value 10
        j = 5; // value is overwritten to 5 (j has been recycle)
        int k = j;// k gets 5's value
        System.out.println("j is: " + j);
        System.out.println("k is: " + k);
        //              Multiple Assignments
        k = j = 10; // (k = (j = 10))
        System.out.println("j is: " + j);
        System.out.println("k is: " + k);

    }

}
