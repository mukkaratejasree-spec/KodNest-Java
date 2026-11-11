package object;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method excecution started");
        divide();
        System.out.println("Main method excecution completed");
    }

    static void divide() {
        try {
            System.out.println("Division started");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a");
            int a = scanner.nextInt();
            System.out.println("Enter b");
            int b = scanner.nextInt();
            int res = a / b;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
