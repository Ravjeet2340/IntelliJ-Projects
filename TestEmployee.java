public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.print();
        Employee emp2 = new Employee("Ravi Kumar", 202120, 25, 23000.50, "Manager", "Marketing");
        System.out.println("Salary" + emp2.getSalary());
    }
}
