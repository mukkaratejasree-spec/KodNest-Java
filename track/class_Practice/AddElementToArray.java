package track.class_Practice;

import java.util.Scanner;

public class AddElementToArray {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of array");
            int n = sc.nextInt();
            int a[] = new int[n];
            System.out.println("enter the array elements");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Enter the element to be added");
            int ele = sc.nextInt();
            int[] b = new int[n + 1];
            System.arraycopy(a, 0, b, 0, n);
            b[n] = ele;
            System.out.println("Updated array: ");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}


