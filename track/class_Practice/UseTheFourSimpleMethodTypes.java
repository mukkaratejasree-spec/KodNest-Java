package track.class_Practice;

import java.util.Scanner;

public class UseTheFourSimpleMethodTypes {
    static class MethodDemo {
        void sayHello() {
            System.out.println("Hello from a method!");
        }

        void greet(String name) {
            System.out.println("Hello, " + name + "!");
        }

        int getLuckyNumber() {
            return 7;
        }

        int add(int first, int second) {
            return first + second;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            int first = sc.nextInt();
            int second = sc.nextInt();

            MethodDemo md = new MethodDemo();

            md.sayHello();
            md.greet(name);
            System.out.println("Lucky Number: " + md.getLuckyNumber());
            System.out.println("Sum: " + md.add(first, second));
        }
    }
}

