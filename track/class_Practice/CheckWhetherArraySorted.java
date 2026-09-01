package track.class_Practice;

import java.util.Scanner;

public class CheckWhetherArraySorted {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int res = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    res = 0;
                    break;
                }
            }

            System.out.println(res);
        }
    }

}