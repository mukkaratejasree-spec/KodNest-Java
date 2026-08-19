package track.class_Practice;

import java.util.Scanner;

public class Employee1 {
    static class Employee {
        int id;
        String name;
        String department;

        Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        void displayProfile() {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Department: " + department);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int id = sc.nextInt();
            String name = sc.next();
            String department = sc.next();

            Employee emp = new Employee(id, name, department);

            emp.displayProfile();
        }
    }
}

