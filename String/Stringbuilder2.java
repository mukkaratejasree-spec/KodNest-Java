package String;

public class Stringbuilder2 {
    public static void main(String[] args) {
    StringBuilder sbr = new StringBuilder("Java");
    sbr.ensureCapacity(10);
    System.out.println(sbr.capacity());
    System.out.println(sbr);
    sbr.append("programming");
    System.out.println(sbr);

    }

}
