package track.class_Practice;
import java.util.Scanner;
public class MaxElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the array elements");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are :");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println();
        System.out.println("Maximum element is :"+max);
        System.out.println("Minimum element is :"+min);
        sc.close();
    }
    
}
