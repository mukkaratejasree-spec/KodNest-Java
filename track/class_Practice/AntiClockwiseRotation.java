package track.class_Practice;
import java.util.Scanner;

public class AntiClockwiseRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the array elements");
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Anti-Clockwise Rotated array");
        int temp = a[0];
        for(int i=1; i<n; i++) {
            a[i-1] = a[i];
        }
        a[n-1] = temp;
        
        for(int i=0 ; i<n; i++){
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
    
}
