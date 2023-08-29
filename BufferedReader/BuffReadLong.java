import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReadLong {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an long value");
        String s=br.readLine();
        long n=Long.parseLong(s);
        System.out.println(n);
    }
}
