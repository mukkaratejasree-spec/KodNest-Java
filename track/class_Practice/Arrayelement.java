package track.class_Practice;
public class Arrayelement{
    public static void main(String[] args) {

        int[] values = {10, 20, 30, 40, 50};
        int bonus = 5;

        // Update every array element
        for (int index = 0; index < values.length; index++) {
            values[index] = values[index] + bonus;
        }

        // Print updated values
        System.out.print("Updated values: ");

        for (int index = 0; index < values.length; index++) {
            System.out.print(values[index] + " ");
        }
    }
}
class Main {
    public static void main(String[] args) {

        int[] values = {10, 20, 30, 40, 50};
        int bonus = 5;

        // Update every array element
        for (int index = 0; index < values.length; index++) {
            values[index] = values[index] + bonus;
        }

        // Print updated values
        System.out.print("Updated values: ");

        for (int index = 0; index < values.length; index++) {
            System.out.print(values[index] + " ");
        }
    }
}
