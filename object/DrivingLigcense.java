package object;

import java.util.Scanner;

public class DrivingLigcense {
    int age;

    void takeUserAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your AGE");
        age = sc.nextInt();
    }

    void checkEliglibility() {
        if (age >= 18) {
            System.out.println("Eligible for DL");
        } else {
            System.out.println("Not Eligible for DL");
        }
    }

    public static void main(String[] args) {
        DrivingLigcense dl = new DrivingLigcense();
        dl.takeUserAge();
        dl.checkEliglibility();
    }
}
