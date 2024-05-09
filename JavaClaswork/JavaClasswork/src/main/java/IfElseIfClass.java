public class IfElseIfClass {
    public static void main(String[] args) {
        int x = 8;
        if (x < 10) {
            System.out.println("You don't have 10 years yet " + (x < 10));
        } else if (x == 10) {
            System.out.println("Hey !! You are 10");
        } else {
            System.out.println("You are to big for this sit");
        }
    }
}
