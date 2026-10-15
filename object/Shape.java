package object;
public abstract class Shape {
    public abstract void input();
    public abstract void display();
}
class Square extends Shape {
    int side;
    @Override 
    public void input() {
        System.out.println("Enter the side of square: ");
    }
    @Override 
    public void display() {
        System.out.println("The side of square is: " + side);
        System.out.println("The area of square is: " + side * side);
    }
}
class Main1{
    public static void main(String[] args) {
        Shape s = new Square();
        s.input();
        s.display();
    }
}
    
