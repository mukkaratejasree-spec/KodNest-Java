package track.class_Practice;

import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();
            int arr[][][] = new int[r][c][k];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    for (int l = 0; l < k; l++) {
                        arr[i][j][l] = sc.nextInt();
                    }
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    for (int l = 0; l < k; l++) {
                        System.out.print(arr[i][j][l] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
