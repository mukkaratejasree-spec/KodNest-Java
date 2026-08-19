package track.class_Practice;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[5];
            int total = 0;

            // Taking input
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            // Calculating total
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
            }

            // Printing total
            System.out.println("Total: " + total);
        }
    }
}

