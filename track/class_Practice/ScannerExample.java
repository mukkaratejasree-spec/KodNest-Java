package track.class_Practice;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. byte
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        // 2. short
        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        // 3. int
        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        // 4. long
        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        // 5. float
        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        // 6. double
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        // 7. boolean
        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // Clear the leftover newline
        sc.nextLine();

        // 8. Single word
        System.out.print("Enter one word: ");
        String word = sc.next();

        // Clear the leftover newline
        sc.nextLine();

        // 9. Full line
        System.out.print("Enter a full sentence: ");
        String line = sc.nextLine();

        // Display all values
        System.out.println("\n----- Output -----");
        System.out.println("Byte    : " + b);
        System.out.println("Short   : " + s);
        System.out.println("Int     : " + i);
        System.out.println("Long    : " + l);
        System.out.println("Float   : " + f);
        System.out.println("Double  : " + d);
        System.out.println("Boolean : " + bool);
        System.out.println("Word    : " + word);
        System.out.println("Line    : " + line);

        sc.close();
    }
}
