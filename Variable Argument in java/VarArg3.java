//variable argument with overloading ambiguity in java
// Java program to demonstrate varargs
public class VarArg3 {
    // A method that takes variable number of intger
    // arguments.

    static void f(double x) {
        System.out.println("overloaded function");
        System.out.println(x);
    }

    static void f(int x)

    {

        System.out.println("overloaded function");

        System.out.println(x);

    }

    static void f(int... a) {
        System.out.println("Number of arguments: " + a.length);

        for (int i = 0; i < a.length; i++)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String args[]) {

        f(100); // one parameter
        f(1, 2, 3, 4); // four parameters
        f();
        f(1.1);// no parameter
    }
}