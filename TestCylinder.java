import java.util.Scanner;
public class TestCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder obj = new Cylinder();
        System.out.println("Please enter the radius of the cylinder.");
        double a = sc.nextDouble();
        System.out.println("Please enter the height of the cylinder.");
        double b = sc.nextDouble();
        obj.setCylinder(a, b);
        System.out.println("The volume of the given cylinder is " + obj.volume());
        System.out.println("The area of side only without top and bottom sides is " + obj.areaSide());
        System.out.println("The area of top, bottom and sides is " + obj.area());

    }
}
