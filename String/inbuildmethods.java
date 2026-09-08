package String;

public class inbuildmethods {
    public static void main(String[] args){
        String s1 = "I am a java developer";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.startsWith("I"));
        System.out.println(s1.endsWith("r"));
        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.replace('a','x'));
        System.out.println(s1.replaceFirst("a","A"));
        System.out.println(s1.replaceAll("a","A"));
    }
}
