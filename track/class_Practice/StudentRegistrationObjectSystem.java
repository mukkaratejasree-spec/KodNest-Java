package track.class_Practice;

import java.util.Scanner;

public class StudentRegistrationObjectSystem {
    static class Student {
        int registrationId;
        String name;
        double attendancePercentage;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Student s1 = new Student();
            s1.registrationId = sc.nextInt();
            s1.name = sc.next();
            s1.attendancePercentage = sc.nextDouble();

            // Create and populate secondStudent
            Student s2 = new Student();
            s2.registrationId = sc.nextInt();
            s2.name = sc.next();
            s2.attendancePercentage = sc.nextDouble();

            int registrationid = sc.nextInt();
            double newPercentage = sc.nextDouble();

            Student selectedStudent = null;

            if (registrationid == s1.registrationId) {
                selectedStudent = s1;
            } else if (registrationid == s2.registrationId) {
                selectedStudent = s2;
            }

            if (selectedStudent != null) {
                selectedStudent.attendancePercentage = newPercentage;
                System.out.println("Selected Student: " + selectedStudent.name);
            } else {
                System.out.println("Student not found.");
            }

            System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");
            System.out.println(s2.registrationId + " - " + s2.name + " - " + s2.attendancePercentage + "%");
        }
    }
}

