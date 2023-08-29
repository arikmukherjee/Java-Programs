public class FunctionOverloading1 {
    void f()
    {
        System.out.println("this is without parameter");
    }
    void f(int x)
    {
        System.out.println("this is integer parameter");
    }
    void f(double x)
    {
        System.out.println("this is double parameter");
    }
    void f(char x)
    {
        System.out.println("this is character parameter");
    }

    public static void main(String[] args) {
        FunctionOverloading1 ob=new FunctionOverloading1();
        ob.f();
        ob.f(5);
        ob.f(10.5);
        ob.f('a');
    }
}
