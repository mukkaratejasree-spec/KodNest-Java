package object;

public class object1 {
    private int pageNum;
    public void setData(int x){
        pageNum = x;
    }
    public void getData() {
        System.out.println(pageNum);
    }
    public static void main(String[] args) {
        object1 o1 = new object1();
        o1.setData(10);
        o1.getData();
    }
}
