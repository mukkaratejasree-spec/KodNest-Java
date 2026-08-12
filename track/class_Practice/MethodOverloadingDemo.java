package track.class_Practice;
import java.util.Scanner;


class Printer {
        void show(int number) {
            System.out.println("Number: " + number);
        }

        void show(String word) {
            System.out.println("Word: " + word);
        }
    }
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String w = scanner.next();
        Printer p = new Printer();
        p.show(num);
        p.show(w);
    }
}
