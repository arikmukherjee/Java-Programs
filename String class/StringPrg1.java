import java.util.Scanner;

public class StringPrg1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        int c=0;
        String s=sc.nextLine();
        for (int i=0;i<=s.length();i++)
        {
            char ch= s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                c++;
                System.out.println(ch);
            }
        }
    }
}
