public class Propogation
{
    //-----------------------------------------------------------------
    //  Invokes the level1 method to begin the exception demonstration.
    //-----------------------------------------------------------------
    static public void main(String[] args)
    {
        ExceptionScope demo = new ExceptionScope();

        System.out.println("Program beginning.");
        demo.level1();
        System.out.println("Program ending.");
    }
}

