package track.class_Practice;
import java.util.Scanner;

public class MonthlySalesReport {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int m = sc.nextInt();

        int[][] sales = new int[p][m];

        for (int i = 0; i < p; i++) {

            int productTotal = 0;

            for (int j = 0; j < m; j++) {

                sales[i][j] = sc.nextInt();

                productTotal += sales[i][j];
            }

            System.out.println("Product " + (i + 1) + " total: " + productTotal);
        }

        sc.close();
    }
}
