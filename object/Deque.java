package object;
import java.util.*;
public class Deque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add("Teja");
        ad.add("rekha");
        ad.add("Poori");
        ad.add("Raja");
        System.out.println(ad);
        while(!ad.isEmpty()) {
            System.out.println(ad.poll());
        }
        System.out.println(ad);
    }
    
}
