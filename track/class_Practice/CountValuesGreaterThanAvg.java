package track.class_Practice;

import java.util.Scanner;

public class CountValuesGreaterThanAvg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            double average = (double) sum / n;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > average) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}