import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
         String t=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        for (int i=0;i<=s.length()-1;i++)
        {
            char ch= s.charAt(i);
            t=t+ch;
            System.out.println(t);
        }
        if(s.equalsIgnoreCase(t))
        {
            System.out.println("palindrome number");
        }
        else
        {
            System.out.println("not a palindrome number");
        }
    }
}
