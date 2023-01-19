package si.flyp.inf030;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo01_ArrayInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        int array[] = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Array: [");
        for (int i : array) {
            System.out.print(" " + i + " ");
        }
        System.out.println("]");
    }
}