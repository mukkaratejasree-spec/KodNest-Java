package track.class_Practice;

import java.util.Scanner;

class Employee {
    String name;
    String role;

    // No-argument constructor
    Employee() {
        role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read employee name
            String name = sc.nextLine();

            // Create exactly one object
            Employee e = new Employee();

            // Store name
            e.name = name;

            // Display profile
            e.displayProfile();
        }
    }
}


