package object;
import java.util.Scanner;
public class trywithresources {
    public static void main(String args[]) {
        try(Scanner scan = new Scanner(System.in))                  {
    
        System.out.println("Enter the value of a and b");
            int a=scan.nextInt();
            int b=scan.nextInt();
            System.out.println("The value of a is: "+a);
            System.out.println("The value of b is: "+b);
        }
    }
}