package track.c;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.next();
            int problemsSolved = scanner.nextInt();
            double Assessment = scanner.nextDouble();

            System.out.println("Learner: " + name);
            System.out.println("Problems solved: " + problemsSolved);
            System.out.println("Assessment: " + Assessment);
        }
    }
}
