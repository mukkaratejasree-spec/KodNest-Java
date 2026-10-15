package object;
/*ABSTARCT METHOD & ABSTARCT CLASS */
abstract class Parent2 {
    abstract void disp1();
    abstract void disp2();
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
class main
{
    public static void main(String[] args) {
        Parent2 c = new Child1();
        c.disp1();
        c.disp2();
        
    }
}