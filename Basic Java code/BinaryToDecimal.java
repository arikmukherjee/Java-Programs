import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int i=1,rev=0,r;
        int m,n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        n=sc.nextInt();
        m=n;

        while (m>0)
        {
            r=m%2;
            rev=rev+i*r;
            m=m/2;
            i=i*10;
        }
        System.out.println("Binary = "+rev);
    }
}
