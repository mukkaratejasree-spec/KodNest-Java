package track.class_Practice;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            }

            System.out.println(min + " " + max);
        }
    }
}