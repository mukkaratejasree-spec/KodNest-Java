package String;

public class static3 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        

    }
}
class Demo{
    static {
        System.out.println("static block");
    }
    {
        System.out.println("Instance block");   
    }
  
}

    