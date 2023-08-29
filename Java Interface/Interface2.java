interface A
{
    void input();
}

interface b
{
    void output();
}

class Cl
{
    int a,b;
    public void input()
    {
        a=2;
        b=3;
    }
    public void output()
    {
        int sum;
        sum=a+b;
        System.out.println("Sum is = "+sum);
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Cl ob=new Cl();
        ob.input();
        ob.output();
    }
}
