package object;
import java.util.*;
public class Stack {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.push(10);
        ad.push(20);
        ad.push(30);
        ad.push(40);
        ad.push(50);
        System.out.println(ad);
        System.out.println(ad.pop());
        System.out.println(ad.pop());
        System.out.println(ad.pop());
        System.out.println(ad.pop());
        System.out.println(ad.pop());
        // System.out.println(ad.remove()); // NoSuchElementException
        // System.out.println(ad.pop());    // NoSuchElementException (stack is now empty)

        // To safely pop without exception, check isEmpty() first:
        if (!ad.isEmpty()) {
            System.out.println(ad.pop());
        } else {
            System.out.println("Stack is empty");
        }
        
    }
    
}
