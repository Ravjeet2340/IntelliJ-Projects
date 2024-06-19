public class Error{
    private int a;
    private int b;
    public void setValues(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void perimeter(){
        System.out.println("Perimeter of the given rectangle is " + 2*(a+b));
        try{
            error();
        }
        catch(ArithmeticException e){
            System.out.println();
            System.out.println("Error message " + e.getMessage());
        }
        area();
    }
    public void area(){
        System.out.println("The area of the given rectangle is " + (a*b));
        error();
    }
    public void error(){
        int sum = (a+b)/0;
    }
}
