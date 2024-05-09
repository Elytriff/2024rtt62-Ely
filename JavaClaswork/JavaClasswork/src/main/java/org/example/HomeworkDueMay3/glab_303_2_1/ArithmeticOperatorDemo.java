package org.example.HomeworkDueMay3.glab_303_2_1;

public class ArithmeticOperatorDemo {
    public static void main(String[] args) {

        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;// gives me the remainder
        System.out.println("% operator resulted in " + x);

        x = y++;//Assigns the current value of y to x,
        // and then increments y by 1.
        // So, x gets the value 10, and y becomes 11.
        System.out.println("Postfix ++ operator resulted in " + x);
        //System.out.println("y ++ operator resulted in " + y++);

        x = ++z;// Increments z by 1 and then assigns the incremented value to x.
        // So, z becomes 6, and x gets the value 6.
        System.out.println("Prefix ++ operator resulted in " + x);
        //System.out.println("++z operator resulted in " + ++z);

        x = -y;
        System.out.println("Unary operator resulted in " + x);

        // Some examples of special Cases
        int tooBig = Integer.MAX_VALUE + 1; // -2147483648 which is
        // Integer.MIN_VALUE.
        int tooSmall = Integer.MIN_VALUE - 1; // 2147483647 which is
        // Integer.MAX_VALUE.
        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        System.out.println(4.0 / 0.0); // Prints: Infinity
        System.out.println(-4.0 / 0.0); // Prints: -Infinity
        System.out.println(0.0 / 0.0); // Prints: NaN
        double d1 = 12 / 8; // result: 1 by integer division. The value of d1 becomes 1.0.
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);

        //String message = 100 + "Messages"; //"100 Messages"??

    }
}
