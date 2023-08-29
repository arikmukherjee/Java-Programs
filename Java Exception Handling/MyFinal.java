public class MyFinal {
    static void meth1()
    {
        try{
            System.out.println("in try1");
        }
        finally{
            System.out.println("meth1 finally");
        }
    }
    static void meth2()
    {
        try{
            System.out.println("normal try");
        }
        finally{
            System.out.println("normal finally");
        }
    }
    static void meth3()
    {
        try{
            System.out.println("meth3 try");
            return ;
        }
        finally{
            System.out.println("still finally works");
        }
    }
    public static void main(String[] args) {
        try{
            meth1();
        }
        catch(RuntimeException e)
        {
            System.out.println("caught "+e);
        }
        finally{
            System.out.println("finally in main");
        }
        meth2();
        meth3();
    }
}
