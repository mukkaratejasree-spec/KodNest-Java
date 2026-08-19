package track.M02.T01;

import java.util.Scanner;

public class LearnerProfileProjectSystem {
    static class Learner {
        int id;
        String name;
        int javaScore;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Learner l1 = new Learner();
            l1.id = sc.nextInt();
            l1.name = sc.next();
            l1.javaScore = sc.nextInt();

            Learner l2 = new Learner();
            l2.id = sc.nextInt();
            l2.name = sc.next();
            l2.javaScore = sc.nextInt();

            System.out.println("Before Update");
            System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
            System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

            l1.javaScore = sc.nextInt();

            System.out.println("After Update");
            System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
            System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);
        }
    }
}

