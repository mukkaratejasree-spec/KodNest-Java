package track.class_Practice;

import java.util.Scanner;

public class FoodOrderTotal {
    static class OrderCalculator {
        int calculateSubtotal(int price, int quantity) {
            // Return price multiplied by quantity
            return price * quantity;
        }

        int calculateFinalTotal(int subtotal, int deliveryCharge) {
            // Return subtotal plus delivery charge
            return subtotal + deliveryCharge;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();
            int deliveryCharge = scanner.nextInt();

            OrderCalculator oc = new OrderCalculator();

            int subtotal = oc.calculateSubtotal(price, quantity);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("Final Total: " +
                    oc.calculateFinalTotal(subtotal, deliveryCharge));
        }
    }
}

