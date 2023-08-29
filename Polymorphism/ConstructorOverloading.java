class Constructor
{
    Constructor()
    {
        System.out.println("this is without parameter");
    }
    Constructor(int x)
    {
        System.out.println("this is integer parameter");
    }
    Constructor(float x)
    {
        System.out.println("this is float parameter");
    }
    Constructor(char x)
    {
        System.out.println("this is character parameter");
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Constructor ob1=new Constructor();
        Constructor ob2=new Constructor(5);
        Constructor ob3=new Constructor(10.2f);
        Constructor ob4=new Constructor('a');
    }
}
