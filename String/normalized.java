package String;

import java.util.Scanner;

public class normalized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();
        String normalizedSentence = sentence.trim().toLowerCase();
        String normalizedKeyword = keyword.trim().toLowerCase();
        System.out.println("Normalized text: " + normalizedSentence);
        System.out.println("Contains keyword: " + normalizedSentence.contains (normalizedKeyword));
    }
}
