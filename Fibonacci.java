import java.util.Scanner;
public class Fibonacci{
    private static int a = 1;
    private static int b = 1;
    private int c = 0;
    public void fibo(int count){
        if(count!=0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            fibo(count-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci obj = new Fibonacci();
        System.out.println("Please enter the number of digits you want to print.");
        int input = sc.nextInt();
        System.out.print(a + " " + b + " "); //Printing the first digits in the Fibonacci series
        obj.fibo(input-2);
    }
}
