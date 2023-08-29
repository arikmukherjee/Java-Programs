import java.util.Scanner;

public class StringPrg2 {
    public static void main(String[] args) {
        String t=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        for (int i=0;i<=s.length();i++)
        {
            char ch= s.charAt(i);
            t=t+ch;
            System.out.println(t);
        }
    }
}
