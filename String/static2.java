package String;

public class static2 {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2();
        Demo2 d3 = new Demo2();

        // Instance variable 'i' is unique to each object (value will be 1 for each)
        System.out.println("d1.i = " + d1.i);
        System.out.println("d2.i = " + d2.i);
        System.out.println("d3.i = " + d3.i);

        // Static variable 'j' is shared across all instances (value will be 3)
        System.out.println("Static Demo2.j = " + Demo2.j);
    }
}

class Demo2 {
    int i;
    static int j;
    Demo2(){
        i++;
        j++;
    }
}