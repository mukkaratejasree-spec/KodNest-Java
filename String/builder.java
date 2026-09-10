package String;

public class builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("hello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Hello Java Programming");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.setLength(5);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("and object oriented");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }

}
