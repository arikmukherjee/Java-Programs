import java.util.*;

public class ScannerEg2 {
    public static void main(String[] args) {
        int n, sq, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n = sc.nextInt();
        sq = n * n;
        System.out.println(sq);
        rem = sq % 10;
        System.out.println(rem);
        if (n == rem) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}