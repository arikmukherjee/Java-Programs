public class SimpleTryCatch
{
    public static void main(String[] args) {
        int d,a;
        try {
          d=Integer.parseInt(args[0]);
          a=2/d;
          System.out.println("hi");
        } 
        catch(ArithmeticException e) {
            System.out.println("Caught "+e);
        }
        System.out.println("after try catch");
    }
}