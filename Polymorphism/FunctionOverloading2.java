class Func
{
   void f()
    {
        System.out.println("this is without parameter");
    }
    void f(int x)
    {
        System.out.println("this is integer parameter");
    }
    void f(float x)
    {
        System.out.println("this is float parameter");
    }
    void f(char x)
    {
        System.out.println("this is character parameter");
    }
}
public class FunctionOverloading2 {
    public static void main(String[] args) {
         Func ob=new Func();
         ob.f();
        ob.f(5);
        ob.f(10.5f);
        ob.f('a');
    }
}
