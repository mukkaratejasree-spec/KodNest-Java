package class_Practice;

import java.util.Scanner;

public class ArrayTwoDimensional {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the elements ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] arr = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Output: ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

