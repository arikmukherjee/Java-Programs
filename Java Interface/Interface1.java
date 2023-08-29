interface A
{
    void input();
    void sum();
}

class B implements A
{
    int a,b;
    public void input()
    {
        a=2;
        b=3;
    }
    public void sum()
    {
        int s;
        s=a+b;
        System.out.println("Sum = "+s);
    }
}

public class Interface1
{
   public static void main(String[] args) {
     B ob=new B();
     ob.input();
     ob.sum();
   }
}