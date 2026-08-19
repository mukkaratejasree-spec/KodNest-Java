package track.class_Practice;

import java.util.Scanner;

public class ArrayMatching {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read the array size
            int size = scanner.nextInt();

            // Create the array
            int[] arr = new int[size];

            // Read the array elements
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            // Read target and replacement values
            int target = scanner.nextInt();
            int replacement = scanner.nextInt();

            // Replace matching values and count changes
            int count = 0;

            for (int i = 0; i < size; i++) {
                if (arr[i] == target) {
                    arr[i] = replacement;
                    count++;
                }
            }

            // Display the result
            System.out.println("Changes: " + count);

            System.out.print("Updated array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i]);

                if (i < size - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}

