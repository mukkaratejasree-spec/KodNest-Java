package String;

public class static2 {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        System.out.println(Demo.j);     

    }
}

class Demo {
    int i;
    static int j;
    Demo(){
        i++;
        j++;
    }
}