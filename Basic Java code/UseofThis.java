class A
{
    public int x;
    A()
    {
        x=0;
        System.out.println("Default Constructor");
    }
    A(int x)
    {
        this.x=x;
        System.out.println("I am THIS.X");
    }
}

public class UseofThis{
    public static void main(String[] args) {
        A ob1=new A();
        A ob2=new A(5);
    }
}