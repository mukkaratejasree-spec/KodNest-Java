package track.class_Practice;

public class Swapnumber {
    public static void main(String[] args) {
            int[] a = {10, 20, 30, 40, 50};
        System.out.print("Original Array: ");
        printArray(a);
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            swap(a, left, right); 
            left++;
            right--;
        }
        System.out.print("Reversed Array: ");
        printArray(a);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
