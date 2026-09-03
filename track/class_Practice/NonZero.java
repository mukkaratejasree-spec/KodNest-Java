package track.class_Practice;

import java.util.Scanner;

public class NonZero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            // Read the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int write = 0;

            // Move all non-zero values to the front
            for (int read = 0; read < n; read++) {
                if (arr[read] != 0) {
                    arr[write] = arr[read];
                    write++;
                }
            }

            // Fill the remaining positions with zeros
            for (int i = write; i < n; i++) {
                arr[i] = 0;
            }

            // Print the array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}