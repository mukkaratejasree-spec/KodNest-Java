package object;

public class agreegate {
    class OS{
        OS(){
            System.out.println("OS is installed");
        }
        void osFun(){
            System.out.println("OS is running");
        }
    }
    class charger{
        charger() {
            System.out.println("charger is plugged");
        }
        void getcharger(){
            System.out.println("device is charging");
        }
    }
    class mobile{
        OS o = new OS();
        mobile(){
            System.out.println("mobile is created");
        }
        void hasA(){
            System.out.println("mobile is running");
        }
    }
    class main {
        public static void main(String[] args) {
        mobile m;
        charger c;
        m = new mobile();
        c=new charger();
        m.hasA();   
        m=null;
        c.getcharger();
        m.o.checkOS();
        c.getcharger();
        }
    }
}
    