public class NestedLoopExpl {
    public static void main(String[] args) {

        int outer = 1; // outer loop control variable

        while (outer <= 3) {// the outer controls the columns
            int inner = 1; // inner loop control variable, it establishes the rows

            while (inner <= 5) {
                System.out.print(outer + "." + inner + " "); // print combination of outer and inner with dot
                inner++; // increment inner loop control variable
            }

            System.out.println(); // move to the next line after inner loop completes
            outer++; // increment outer loop control variable
        }
    }
}
