package track.class_Practice;

import java.util.Scanner;

public class MethodOverloadingDemo {
    static class Printer {
        void show(int number) {
            System.out.println("Number: " + number);
        }

        void show(String word) {
            System.out.println("Word: " + word);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            String w = scanner.next();
            Printer p = new Printer();
            p.show(num);
            p.show(w);
        }
    }
}

