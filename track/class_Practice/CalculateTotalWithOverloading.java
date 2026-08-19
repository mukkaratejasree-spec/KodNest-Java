package track.class_Practice;

import java.util.Scanner;

public class CalculateTotalWithOverloading {
    static class ResultCalculator {
        int getTotal(int first, int second) {
            return first + second;
        }

        int getTotal(int first, int second, int third) {
            return first + second + third;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();

            ResultCalculator rc = new ResultCalculator();

            System.out.println("Two-Mark Total: " + rc.getTotal(first, second));
            System.out.println("Three-Mark Total: " + rc.getTotal(first, second, third));
        }
    }
}

