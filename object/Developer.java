package object;

public class Developer {
    void work() {
        System.out.println("Dev is working");
    }
    void project() {
        System.out.println("Dev is working on project");
    }
    public static class JavaDeveloper extends Developer {
        @Override
        void work() {
            System.out.println("Java Dev is working");
        }
        @Override
        void project() {
            System.out.println("Java Dev is working on java project");
        }
    }

    public static void main(String[] args) {
        Developer d = new Developer();
        Developer d1 = new JavaDeveloper();
        d.work();
        d.project();
        d1.work();
        d1.project();
    }
}
