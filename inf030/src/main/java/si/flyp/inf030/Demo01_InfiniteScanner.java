package si.flyp.inf030;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo01_InfiniteScanner {

    public static void main(String[] args) {

        int input;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                input = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                // Hier kommt der hin wenn die Eingabe kein Integer ist.
                System.out.println("You did not enter a valid integer!");
            }
        }

        System.out.println("You entered: " + input);
    }
}