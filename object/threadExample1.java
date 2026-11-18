package object;

public class threadExample1 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1);

        t1.setName("Ajay");
        t1.setPriority(7);

        System.out.println("After modification: " + t1);
        System.out.println("Thread Name: " + t1.getName());
        System.out.println("Thread Priority: " + t1.getPriority());
    }
}
