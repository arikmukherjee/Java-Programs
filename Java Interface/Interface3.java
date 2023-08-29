interface A 
{
    void input();
}

interface B extends A 
{
    public void output();
}

class cl implements B 
{
    int a, b;

    public void input() 
    {

        a = 2;
        b = 3;
    }

    public void output() 
    {
        int sum;
        sum = a + b;
        System.out.println(sum);
    }
}

public class Interface3 
{
    public static void main(String args[]) 
    {
        cl ob = new cl();
        ob.input();
        ob.output();
    }
}