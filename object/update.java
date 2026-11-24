package object;
import java.util.*;
public class update {
    public static void main(String[] args) {
        //Insert, update, and Remove List elements
        List<String> name = new ArrayList();
        name.add("Poori");
        name.add("Teja");
        System.out.println(name);
        name.add(1, "Ravi");
        System.out.println(name);
        name.set(1,"ravi mukkara");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
    }
    
    
}
