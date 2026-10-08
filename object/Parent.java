package object;

public class Parent {
    Parent(int a) {
        System.out.println("Inside the parameterized 1 constructor");
    }
}

class Child extends Parent {
    Child() {
        super(10);
        System.out.println("Inside the child class");
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Child c = new Child();
    }
}

