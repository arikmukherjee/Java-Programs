// Exception Sub class must come before anyn of their Super class

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
          int a = Integer.parseInt(args[0]);
          int b= 42/a; 
        } 
        catch (Exception e) {
            System.out.println("Super class");
        }
        // catch(ArithmeticException e)           // it is a sub class of the super class 'Exception'. So this catch block is of no use
        // {
        //     System.out.println("Sub class");
        // }
    }
}
