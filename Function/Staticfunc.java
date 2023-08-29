public class Staticfunc {
    static void f()          //Static keyword is used as the f() is called in main method without object.
    {
        System.out.println("Sunday");
    }
    public static void main(String[] args) {
        System.out.println("Monday");
        f();
        System.out.println("friday");
    }
}
