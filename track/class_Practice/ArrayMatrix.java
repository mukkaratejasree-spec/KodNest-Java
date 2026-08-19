package track.class_Practice;

import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            // Reading matrix elements
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Printing matrix elements
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

