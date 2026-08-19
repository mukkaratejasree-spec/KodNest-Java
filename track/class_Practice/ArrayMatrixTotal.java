package track.class_Practice;
import java.util.Scanner;

public class ArrayMatrixTotal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Read array size
        int size = sc.nextInt();

        // 2. Create array
        int[] array = new int[size];

        int arrayTotal = 0;

        // 3. Read array elements and calculate total
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            arrayTotal += array[i];
        }

        // 4. Read matrix rows and columns
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // 5. Create matrix
        int[][] matrix = new int[rows][columns];

        int matrixTotal = 0;

        // 6. Read matrix elements and calculate total
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                matrix[i][j] = sc.nextInt();
                matrixTotal += matrix[i][j];
            }
        }

        // 7. Print results
        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);

        sc.close();
    }
}