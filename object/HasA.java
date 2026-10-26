package object;
class OS
{
    OS() {
        System.out.println("OS constructor");
    }
    void checkOS() {
        System.out.println("i am checking os now");
    }
}
class MobilePhone
{
    OS o = new OS();
    void checkOS() {
        System.out.println("i am checking mobile os now");
    }
    void makeCall() {
        System.out.println("calling....");
    }
}
public class HasA {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone();
        mp.checkOS();
        mp.makeCall();
    }
}