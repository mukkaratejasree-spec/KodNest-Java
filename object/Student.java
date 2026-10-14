package object;

public class Student {
    int roll;
    String name;
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void display() {
        System.out.println("roll number is" + this.roll);
        System.out.println("name is " + this.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "mukka");
        Student s2 = new Student(2, "Teja");//extends object
        Student s3 = new Student(3, "Sree");
        s1.display();
        s2.display();
        s3.display(); 
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
