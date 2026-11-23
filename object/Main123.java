package object;
import java.util.ArrayList;
public class Main123 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(300));
        System.out.println(al.contains(30));
        System.out.println(al.get(3));
        System.out.println(al.indexOf(20));
        System.out.println(al.isEmpty());
        System.out.println(al);
        System.out.println(al.size());
        al.add(99);
        System.out.println(al);
        al.add(30);
        System.out.println(al);
        System.out.println(al.indexOf(30));
        System.out.println(al.lastIndexOf(30));
        System.out.println(al);
        al.remove(6);
        System.out.println(al);
        al.set(2,"Raja");
        System.out.println(al);
        al.add(2, 23.4);
        System.out.println(al);
        ArrayList al2 = new ArrayList();
        al2.add(77);
        al2.add(888);
        al2.add(999);
        System.out.println(al2);
        al.add(al2);
        System.out.println(al);     

        
    }

    
}
