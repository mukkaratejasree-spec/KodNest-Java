package String;

import java.util.Scanner;

public class StringChange {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String original = scanner.nextLine();
            System.out.println("Original: " + original);

            // Demonstrates String immutability: method return value is intentionally ignored
            @SuppressWarnings("unused")
            String ignoredResult = original.toUpperCase();
            System.out.println("After ignored call: " + original);

            String upperCaseCopy = original.toUpperCase();
            System.out.println("Uppercase copy: " + upperCaseCopy);
        }
    }
}


