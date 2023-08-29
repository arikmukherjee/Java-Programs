import java.util.*;

class BasicShapes
{
    double a;
    void input()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a");
       a=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Area calculation");
    }
}

class Circle extends BasicShapes 
{
    void input1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        a=sc.nextDouble();
    }
    void area1()
    {
        double area = Math.PI*Math.pow(a,2);
        System.out.println("Area of circle = "+area);
    }
}

class Square extends BasicShapes 
{
    void input2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a side");
        a=sc.nextDouble();
    }
    void area2()
    {
        double area = a*a;
        System.out.println("Area of square = "+area);
    }
}

class Rectangle extends BasicShapes 
{
    double b;
    void input3()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and bredth");
        a=sc.nextDouble();
        b=sc.nextDouble();
    }
    void area3()
    {
        double area = a*b;
        System.out.println("Area of rectangle = "+area);
    }
}

class Triangle extends BasicShapes 
{
    double b,c;
    void input4()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 side");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
    }
    void area4()
    {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-b));
        System.out.println("Area of triangle = "+area);
    }
}

public class Inherit1
{
    public static void main(String[] args) {
      Circle ob1=new Circle();
      ob1.input1();
      ob1.area1();

      Square ob2=new Square();
      ob2.input2();
      ob2.area2();

      Rectangle ob3=new Rectangle();
      ob3.input3();
      ob3.area3();

      Triangle ob4=new Triangle();
      ob4.input4();
      ob4.area4();

      System.out.println("All Shapes' areas are calculated");
    }
}