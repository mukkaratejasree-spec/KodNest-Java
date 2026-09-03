package track.class_Practice;

import java.util.Scanner;

public class Clockwise {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of array");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("enter the array elements");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Clockwise Rotated array:");
            if (n > 0) {
                int temp = a[n - 1]; 
                for (int idx = n - 1; idx > 0; idx--) {
                    a[idx] = a[idx - 1];
                }
                a[0] = temp;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            sc.close();
        }
    }
}
