abstract class A
{
    abstract void callMe();
    void callMeToo()
    {
        System.out.println("It is a concrete method");
    }
}

class B extends A
{
    void callMe()
    {
        System.out.println("here it is defined");
    }
}

class AbstractClass
{
    public static void main(String[] args) {
        B ob=new B();
        ob.callMe();
        ob.callMeToo();
    }
}