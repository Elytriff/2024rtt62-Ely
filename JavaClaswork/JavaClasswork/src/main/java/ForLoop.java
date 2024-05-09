public class ForLoop {
    public static void main(String[] Args) {
        for (int count = 0; count < 10; count++) {
            System.out.println("Count is: " + count);
        }
        // ---outer loop---
        for (int i = 1; i <= 5; ++i) {
            System.out.println("i is: " + i);
            // codes in the body of the outer loop
            // ---inner loop--
            for (int j = 1; j <= 2; ++j) {
                System.out.println("i is: " + i); // code in the body of both outer and inner loops
            }
        }
        for (int count = 10; count > 0; count--) {
            if ( count % 2 == 0 ) {
                System.out.println("This is an even number");

                for (int d = 0 ; d < 5 ; d++ ) {
                    System.out.println("The count = " + count + "." + d);
                }
            }
        }
    }
}
