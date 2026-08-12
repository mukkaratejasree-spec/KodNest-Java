class Employee{
    int id;
    String name;
    double salary;
    void work(){
        System.out.println("Coding");
    }
    public static void main(String[] args) {
        Employee e1=new Employee();

        e1.work();
        e1.id = 11;
        e1.name="Teja";
        e1.salary=25000;
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);
        
        Employee e2=new Employee();
        e2.work();
        e2.id = 12;
        e2.name="Sree";
        e2.salary=35000;
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e2.salary);
    }
}
    
