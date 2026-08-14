package track.class_Practice;

class Mobile {
    int password;
    int pin;
}

class Person {
    Mobile m;
}

public class MobileUnlock {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.m = new Mobile();

        p1.m.pin = 1234;
        p1.m.password = 5678;

        System.out.println(p1.m.pin + " - " + p1.m.password);
    }
}
