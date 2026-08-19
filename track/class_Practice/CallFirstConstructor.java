package track.class_Practice;

public class CallFirstConstructor {
    static class Robot {
        Robot() {
            System.out.println("Beep beep! Robot reporting for Java duty!");
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Robot r = new Robot();
    }
}
