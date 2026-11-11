package object;
/*ABSTARCT METHOD & ABSTARCT CLASS */
public abstract class Parent2 {
    abstract void disp1();
    abstract void disp2();

    public static void main(String[] args) {
        Parent2 c1 = new Child1();
        c1.disp1();
        c1.disp2();

        Parent2 c2 = new Child2();
        c2.disp1();
        c2.disp2();
    }
}
class Child1 extends Parent2{
    @Override 
    void disp1()
    {
        System.out.println("In chld1 disp1 method");
    }
    @Override
    void disp2()
    {
        System.out.println("In chld1 disp2 method");
    }
}
class Child2 extends Parent2{
    @Override
    void disp1()
    {
        System.out.println("In chld2 disp1 method");
    }
    @Override
    void disp2()
    {
        System.out.println("In chld2 disp2 method");
    }
}