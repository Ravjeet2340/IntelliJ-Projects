import java.util.Scanner;
public class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        Validator obj = new Validator();
        if (obj.isValidPassword(password) == true) {
            System.out.println("Password is valid.");
        }
    }
}