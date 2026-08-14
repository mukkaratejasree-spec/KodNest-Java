package track.class_Practice;

class Student {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
public class StudentApplication1{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        s1.input("Raja", 18, 5.5);
        s2.input("Rani", 19, 5.8);
        s1.display();
        s2.display();
    }
}
