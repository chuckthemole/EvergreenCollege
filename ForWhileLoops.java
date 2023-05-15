import java.util.Scanner;

/**
 * Program to demonstrate for and while loops
 * 
 * @author Charles Thomas
 */
public class ForWhileLoops {

    public static Scanner scanner = new Scanner(System.in);

    // Note: try decrementing
    public static void myForLoop() {
        System.out.println("  myForLoop()");
        for(int i = 0; i < 10; i++) {
            System.out.println("    iteration: " + i);
        }
    }

    // Note: can we decrement with the while loop?
    public static void myWhileLoop() {
        System.out.println("  myWhileLoop()");

        int i = 0;
        while(i < 10) {
            System.out.println("    iteration: " + i);
            i++;
        }
    }

    public static void isThisNumberEvenForLoop() {
        System.out.println("  isThisNumberEvenForLoop()");
        for(int i = 0; i < 10; i++) {
            System.out.println("    is " + i + " even? " + isThisNumberEven(i));
        }
    }

    public static void isThisNumberEvenWhileLoop() {
        System.out.println("  isThisNumberEvenWhileLoop()");
        int i = 0;
        while(i < 10) {
            System.out.println("    is " + i + " even? " + isThisNumberEven(i));
            i++;
        }
    }

    // How can we fix this sequence?
    public static void sequenceFindAverageOfTwoNumbers() {
        System.out.println("  sequenceFindAverageOfTwoNumbers()");

        int x;
        int y;
        int average;

        System.out.print("     Enter first value: ");
        x = scanner.nextInt();
        System.out.print("     Enter second value: ");
        y = scanner.nextInt();

        average = (x + y) / 2;

        System.out.println("     Average of " + x + " and " + y + " is " + average);
    }

    // Selection example
    public static boolean isThisNumberEven(int i) {
        if(i % 2 == 0) { // what is the '%' symbol
            return true;
        } else {
            return false;
        }
    }

    // When is a while loop better?
    public static void whileLoopIsBetter() {
        System.out.println("  whileLoopIsBetter()");

        int i = 0;
        int continueWhileLoop = 1;
        while(continueWhileLoop == 1) {
            System.out.println("    i = " + i);
            i++;

            System.out.print("    Continue? (1 yes, 0 no): ");
            continueWhileLoop = scanner.nextInt();
        }
    }

    public static void main(String []args) {
        System.out.println("for/while loop demonstration");

        sequenceFindAverageOfTwoNumbers();
        // boolean isEven = isThisNumberEven(5);
        // System.out.println("Is the number even? " + isEven);

        // myForLoop();
        // myWhileLoop();
        
        // isThisNumberEvenForLoop();
        // isThisNumberEvenWhileLoop();

        // whileLoopIsBetter();

        scanner.close();
    }
}
