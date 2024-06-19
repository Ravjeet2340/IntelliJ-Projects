import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string you want to find the reverse of ");
        String str = sc.nextLine();
        System.out.println("Reverse of " + str + " is " + rev(str));
    }

    public static String rev(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        return rev(str.substring(1)) + str.charAt(0);
    }
}
