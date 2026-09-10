package String;

import java.util.Scanner;

public class TextMatch {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String expectedText = scanner.nextLine();
String enteredText = scanner.nextLine();
boolean isMatch = expectedText.equals(enteredText);
System.out.println("Match: " + isMatch);
scanner.close();
}

}