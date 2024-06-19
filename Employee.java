public class Employee {
    private String name;
    private int id;
    private int age;
    private double salary;
    private String title;
    private String dept;
    public Employee(){
        this.name = "";
        this.id = 0;
        this.age = 0;
        this.salary = 0.0;
        this.title = "";
        this.dept = "";
    }
    public Employee(String name, int id, int age, double salary, String title, String dept){
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.title = title;
        this.dept = dept;
    }
    public double getSalary(){
        return salary;
    }
    public void print(){
        System.out.println("Name " + name);
        System.out.println("ID " + id );
        System.out.println("Age " + age);
        System.out.println("Salary " + salary);
        System.out.println("Title " + title);
        System.out.println("Department " + dept);
    }
}
