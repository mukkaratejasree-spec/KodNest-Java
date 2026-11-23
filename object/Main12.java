package object;

import java.util.ArrayList;

public class Main12 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(40);
        System.out.println(al);

        al.add("Teja");
        al.add('a');
        al.add(true);
        al.add(23.5);
        System.out.println(al);
    }
}
