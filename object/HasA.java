package object;
class Heart
{
    Heart() {
        System.out.println("Heart constructor");
    }
    void checkHeart() {
        System.out.println("i am checking heart now");
    }
}
class Human 
{
    Heart h = new Heart();
    void checkHumanHeart() {
        System.out.println("i am checking human heart now");
    }
    void human() {
        System.out.println("Human constructor");
    }
}
public class HasA {
    public static void main(String[] args) {
        Human h = new Human();
        h.checkHumanHeart();
        h.human();
    }
}