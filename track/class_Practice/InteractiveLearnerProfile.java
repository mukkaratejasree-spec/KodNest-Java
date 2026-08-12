package track.class_Practice;

import java.util.Scanner;

public class InteractiveLearnerProfile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            int problemsSolved = sc.nextInt();
            double assessment = sc.nextDouble();

            System.out.println("Learner: " + name);
            System.out.println("Problems solved: " + problemsSolved);
            System.out.println("Assessment: " + assessment);
        }
    }
}