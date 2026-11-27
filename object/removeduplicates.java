package object;

import java.util.*;

public class removeduplicates {

    // Defined as static nested class to avoid duplicate conflict with Student.java
    static class Student {
        int roll;
        String name;

        Student(int roll, String name) {
            this.roll = roll;
            this.name = name;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Student s = (Student) obj; // Fixed: proper cast syntax (Student) obj
            return this.roll == s.roll && Objects.equals(this.name, s.name);
        }
        @Override 
        public int hashCode() {
            return Objects.hash(roll, name); // Fixed: Objects.hash(...) with dot and semicolon
        }

        @Override 
        public String toString() {
            return roll + " " + name;
        }

        void display() {
            System.out.println(roll);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(11, "Anu");
        Student s2 = new Student(12, "Raju");
        Student s3 = new Student(11, "Anu"); // Duplicate of s1 (same roll and name)

        HashSet<Student> hs = new HashSet<>(); // Fixed: HashSet instead of Hash
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
