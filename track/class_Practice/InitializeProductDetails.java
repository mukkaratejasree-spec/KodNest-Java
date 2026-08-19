package track.class_Practice;

import java.util.Scanner;

public class InitializeProductDetails {
    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        void display() {
            System.out.println("Product: " + name);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            double price = sc.nextDouble();

            Product p = new Product(name, price);

            p.display();
        }
    }
}

