public class MyThrowsKey {
    static void meth1() throws IllegalAccessException
    {
        System.out.println("in meth1");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        try{
            meth1();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught "+e);
        }
    }
}
