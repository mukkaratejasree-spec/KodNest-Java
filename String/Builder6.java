package String;

import java.util.Scanner;

public class Builder6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System. in);
String text = scanner.nextLine();

StringBuilder builder = new StringBuilder(text);
builder.append("!");
String finalText = builder. toString();
System.out.println("Builder: " + builder);
System. out.println("String: " + finalText);

// Append ! and convert the builder to String.

}
    
}
