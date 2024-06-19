import java.util.Scanner;
public class Reverse {
    private int lastdigit = 0;
    private int quotient = 1;
    public void rev(int a){
        if(quotient!=0){
            System.out.print(a%10);
            quotient = a/10;
            rev(quotient);
        }
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the reverse of ");
        int input = sc.nextInt();
        System.out.print("Reverse of " + input + " is ");
        obj.rev(input);
    }
}
