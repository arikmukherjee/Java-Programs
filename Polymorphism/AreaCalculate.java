class ShapesArea
{
    void area(double r)
    {
        System.out.println(Math.PI*Math.pow(r, 2));//circle
    }
    void area(int a)
    {
        System.out.println(Math.pow(a, 2));//square
    }
    void area(int x,int y)
    {
        System.out.println(x*y);//rectangle
    }
    void area(int p,int q,int r)
    {
        double s = (p+q+r)/2;
        System.out.println(Math.sqrt(s*(s-p)*(s-q)*(s-r)));
    }
}
public class AreaCalculate {
    public static void main(String[] args) {
        ShapesArea ob=new ShapesArea();
        ob.area(9.5);
        ob.area(6);
        ob.area(3, 4);
        ob.area(7, 8, 9);
    }
}
