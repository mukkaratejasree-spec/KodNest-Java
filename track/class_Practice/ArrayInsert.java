package track.class_Practice;

import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of elements");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("enter the array elements");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("enter the element to be added");
            int ele = sc.nextInt();
            int[] b = new int[a.length + 1];
            b[0] = ele;
            System.arraycopy(a, 0, b, 1, a.length);
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}