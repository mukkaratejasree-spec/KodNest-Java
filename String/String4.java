package String;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "JavA";
        String s2 = "Java";
        if (s1 == s2) {
            System.out.println("Ref are same");
        } else {
            System.out.println("Ref are not same");
        }
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Strings are same");
        }
         else {
            System.out.println("Strings are not same");
         }
        }
    }

