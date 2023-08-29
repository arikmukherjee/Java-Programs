class MyException extends Exception{
    int p;
    MyException(int a)
    {
        p=a;
    }
    public String toString()
    {
        return "hello"+p;
    }
}
class MyExceptionDemo
{
    public static void main(String[] args) {
        try{
            int a = args.length;
            meth1(a);
        }
        catch(MyException e)
        {
            System.out.println("caught "+e);
        }
    }
    static void meth1(int a)throws MyException
    {
        if(a==1)
        {
            throw new MyException(a);
        }
        System.out.println("normal exit");
    }
}
