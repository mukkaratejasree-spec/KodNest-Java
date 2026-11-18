package object;

// Thread task 1: Extending Thread class
class Task1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 ms
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

// Thread task 2: Extending Thread class
class Task2 extends Thread {
    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println(Thread.currentThread().getName() + " - Character: " + ch);
            try {
                Thread.sleep(500); // Sleep for 500 ms
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        System.out.println("Main method execution started: " + Thread.currentThread().getName());

        // Creating thread instances
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        // Setting custom names for threads
        t1.setName("NumberThread");
        t2.setName("CharThread");

        // Starting threads concurrently (invokes run() method in separate threads)
        t1.start();
        t2.start();

        System.out.println("Main method execution completed");
    }
}
