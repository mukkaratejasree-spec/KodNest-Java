package track.class_Practice;

import java.util.Scanner;

public class DeliveryChargeOverloading {
    static class DeliveryCalculator {
        // One-parameter overload
        int calculateCharge(int distance) {
            return distance * 5;
        }

        // Two-parameter overload
        int calculateCharge(int distance, int expressFee) {
            return distance * 5 + expressFee;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int distance = scanner.nextInt();
            int expressFee = scanner.nextInt();

            DeliveryCalculator dc = new DeliveryCalculator();

            // Call the one-parameter overload
            System.out.println("Standard Charge: " + dc.calculateCharge(distance));

            // Call the two-parameter overload
            System.out.println("Express Charge: " + dc.calculateCharge(distance, expressFee));
        }
    }
}

