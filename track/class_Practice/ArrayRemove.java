package track.class_Practice;

import java.util.Scanner;

public class ArrayRemove {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index at which element to be removed");
        int idx = sc.nextInt();
        
        int[] b = new int[n-1];
        for (int i=0;i<n-1;i++){
            b[i] = a[i];
        }
        if(i < idx){
            b[i] = a[i+1];
        }
        else{
            b[i] = a[i];
        }
    
}
