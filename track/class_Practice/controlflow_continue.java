package track.class_Practice;

public class controlflow_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;// stops the current iteration and continues to the next iteration
            }
            System.out.println(i);
        }
    }
    
}
