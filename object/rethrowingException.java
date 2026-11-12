package object;

import java.util.Scanner;

public class rethrowingException {
    public static void main(String[] args) {
        System.out.println("Main method execution started");
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
        System.out.println("Main method execution completed");
    }

    static void divide() throws Exception {
        System.out.println("Divide method execution started");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a");
            int a = scanner.nextInt();
            System.out.println("Enter b");
            int b = scanner.nextInt();
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Exception caught in divide method, rethrowing...");
            throw e; // Rethrowing the exception to the caller (main method)
        } finally {
            System.out.println("Divide method execution completed");
        }
    }
}
