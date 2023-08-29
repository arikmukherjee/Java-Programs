public class NonStaticFunc {
    void f()
    {
        System.out.println("Sunday");
    }
    public static void main(String[] args) {
        NonStaticFunc ob=new NonStaticFunc();
        System.out.println("Monday");
        ob.f();
        System.out.println("Friday");
    }
}
// Static keyword is not used here as object is created.//