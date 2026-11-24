package object;
import java.util.ArrayList;
import java.util.Scanner;
public class Advanceforloop {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            al.add(element);
        }
        System.out.println("ArrayList: " + al);
        System.out.println();
        System.out.println("Traverse using FOR-LOOP");
        for(int i=0; i <=al.size() -1; i++) {
            System.out.println(al.get(i) + " ");
        }
        System.out.println();
        System.out.println("Traverse using ADVFOR-LOOP");
        for (Object x: al) {
            System.out.println(x + " ");
        }  
    } 
}
