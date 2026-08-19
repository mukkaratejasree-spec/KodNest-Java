package track.class_Practice;

import java.util.Scanner;

public class CreateFoodOrderDetails {
    static class FoodOrder {
        String item;
        int quantity;

        // Constructor 1
        FoodOrder(String item) {
            this.item = item;
            this.quantity = 1;
        }

        // Constructor 2 - overloaded constructor
        FoodOrder(String item, int quantity) {
            this.item = item;
            this.quantity = quantity;
        }

        void display() {
            System.out.println("Order: " + item + ", Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String item = sc.nextLine();
            int quantity = sc.nextInt();

            FoodOrder fd = new FoodOrder(item);
            FoodOrder fd1 = new FoodOrder(item, quantity);

            fd.display();
            fd1.display();
        }
    }
}

