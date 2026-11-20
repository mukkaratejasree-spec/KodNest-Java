package object;

class Counter {
    int count = 0;

    // 'synchronized' ensures only one thread can increment count at a time
    synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {
    Counter c;

    MyThread(Counter c) {
        this.c = c;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " has started incrementing.");
        for (int i = 1; i <= 10000; i++) {
            c.increment();
        }
        System.out.println(Thread.currentThread().getName() + " has finished incrementing.");
    }
}

public class synchronize {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread execution started.");

        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        System.out.println("Starting " + t1.getName() + " and " + t2.getName() + "...");
        t1.start();
        t2.start();

        System.out.println("Main thread is waiting for child threads to finish...");
        t1.join();
        t2.join();

        System.out.println("All threads finished.");
        System.out.println("Final Count: " + c.count);
        System.out.println("Main thread execution completed.");
    }
}
