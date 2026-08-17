package track.class_Practice;
import java.util.Scanner;

public class Arraydays{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read number of practice days
        int days = scanner.nextInt();

        // Create arrays
        int[] planned = new int[days];
        int[] completed = new int[days];

        // Read the planned question counts
        for (int i = 0; i < days; i++) {
            planned[i] = scanner.nextInt();
        }

        // Read the completed question counts
        for (int i = 0; i < days; i++) {
            completed[i] = scanner.nextInt();
        }

        int completedDays = 0;

        // Compare planned and completed values
        for (int i = 0; i < days; i++) {

            if (completed[i] >= planned[i]) {
                System.out.println("Day " + (i + 1) + ": Completed");
                completedDays++;
            } else {
                System.out.println("Day " + (i + 1) + ": Pending");
            }
        }

        // Print total completed days
        System.out.println("Completed days: " + completedDays);

        scanner.close();
    }
}
