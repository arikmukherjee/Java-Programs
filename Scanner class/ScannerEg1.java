import java.util.Scanner;

public class ScannerEg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        double sq = a * a;
        double rem = sq % 10;
        System.out.println("square is" + sq);
        System.out.println("Last Digit is" + rem);
    }
}
