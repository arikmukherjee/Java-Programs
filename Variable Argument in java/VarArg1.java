public class VarArg1
{
    // A method that takes variable number of intger
    // arguments.
    static void f(int... a) 
    {
        System.out.println("Number of arguments: " + a.length);

        for (int i = 0; i < a.length; i++)
            System.out.print(i + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) 
    {
        // Calling the varargs method with different number
        // of parameters
        f(100); // one parameter
        f(1, 2, 3, 4); // four parameters
        f(); // no parameter
    }
}