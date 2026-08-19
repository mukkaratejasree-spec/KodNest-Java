package track.class_Practice;

public class Array2 {
    static class Freq {
        int count = 0;

        void count(int arr[], int key) {
            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i] == key) {
                    count++;
                }
            }
            System.out.println(key + ": " + count);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 10, 30, 10};
        Freq f = new Freq();
        f.count(arr, 10);
        f.count(arr, 30);
    }
}

