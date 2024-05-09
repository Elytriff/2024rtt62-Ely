package org.example.HomeworkMayDue5.glab_303_2_1;

public class PA303_2_3OperatorsAndNumbers {
    public static void main(String[] args){
        //1-Write a program that declares an integer a variable x, assigns the value 2 to it,
        // and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        // Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
        // Before printing the results, write a comment with the predicted decimal value and binary string.
        // Now, print out x in decimal form and in binary notation.

        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;// ?????
        System.out.println("x (decimal): " + x);
        System.out.println("x (binary): " + Integer.toBinaryString(x));

        //Perform the preceding exercise with the following values: 9, 17, 88
        int x1 = 17;
        System.out.println(Integer.toBinaryString(x1));
        x1 = x1 << 1;// ?????
        System.out.println("x1 (decimal): " + x1);
        System.out.println("x1 (binary): " + Integer.toBinaryString(x1));

       // __________________________________
    //2-Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of the number.
    // Now use the right shift operator (>>) to shift by 2 and assign the result to x.
    // Write a comment indicating what you anticipate the decimal and binary values to be.
    // Now print the value of x and the binary string.
        int x2 = 150;
        System.out.println(Integer.toBinaryString(x2));
        x2 = x2 >> 2;// ?????
        System.out.println("x2 : "+ x2);
        System.out.println("x2 (binary): " + Integer.toBinaryString(x2));

        //3-Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
        // Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
        // Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
        int x3 = 7;
        int y = 17;
        int z = x3 & y;
        System.out.println("x3 & y (decimal): " + z);
        System.out.println("x3 & y (binary): " + Integer.toBinaryString(z));

        //4-Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
        // As before, write a comment that indicates what you predict the values to be before printing them out.
        int z1 = x3 | y;
        System.out.println("x3 | y (decimal): " + z1);
        System.out.println("x3 | y (binary): " + Integer.toBinaryString(z1));

        //5-Write a program that declares an integer variable, assigns a number,
        // and uses a postfix increment operator to increase the value.
        // Print the value before and after the increment operator.
        int f =3;
        int fAumented;
        fAumented = f++;
        System.out.println("f= " + f);//f=4
        System.out.println("f++= " + fAumented);// fAumented = 3

        //6-Write a program that demonstrates at least three ways to increment a variable by 1
        // and does this multiple times.
        // Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1,
        // and then print it again.
        int v = 5;
        System.out.println("v= " + v);
        v++;
        System.out.println("v= " + v);
        v++;
        System.out.println("v= " + v);// it was 7 till this point
    }
}
