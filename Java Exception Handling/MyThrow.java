public class MyThrow {
    static void meth1(int a)
    {
        try{
            if (a==0)
            {
            throw new ArithmeticException("demo");
            }
        }
        catch(ArithmeticException e)
        {
           System.out.println("caught 1 in meth1 "+e);
           throw e;
        }
    }
    public static void main(String[] args) {
        try
        {
            int a = args.length;
            meth1(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println("caught again");
        }
        System.out.println("In main");
    }
}
