import java.util.Scanner;
public class ErrorPropogation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Error obj = new Error();
        System.out.println("Enter the length of the rectangle.");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle.");
        int b = sc.nextInt();
        obj.setValues(a, b);
        obj.perimeter();
    }
}
