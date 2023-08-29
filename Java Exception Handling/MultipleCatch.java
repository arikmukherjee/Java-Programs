public class MultipleCatch {
    public static void main(String[] args) {
        try {
          int a= args.length;
          System.out.println(a);
          int b=2/a;
          int c[]={1};
          c[3]=7;  
        } 
        catch (ArithmeticException e) {
            System.out.println("caught 1 "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("caught 2 "+e);
        }
        System.out.println("after try catch");
    }
}
