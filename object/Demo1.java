package object;

class Demo1 {
    void display() { // Renamed from disp() to display()
        System.out.println("Display method called");
    }
}

class Main1 { // Removed 'public' modifier
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.display(); // Now matches method definition
    }
}
