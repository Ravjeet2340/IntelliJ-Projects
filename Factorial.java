import java.util.Scanner;
public class Factorial{
    public int fact(int a){
        if(a==1){
            return 1;
        }
        else{
            return a * fact(a-1);
        }
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit you want to find the factorial of ");
        int input = sc.nextInt();
        System.out.println("Factorial of " + input + " is " + obj.fact(input));
    }
}
