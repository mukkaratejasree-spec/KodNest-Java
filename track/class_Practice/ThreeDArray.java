package track.class_Practice;
import java.util.Scanner;
public class ThreeDArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int arr[][][]= new int[r][c][k];
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                for(int l = 0; l < arr.length-1; l++){
                    arr[i][j][l] = sc.nextInt();
                }
            }

        }
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                for(int l = 0; l < arr.length-1; l++){
                    System.out.print(arr[i][j][l] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
