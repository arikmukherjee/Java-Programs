import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReadInt {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer value");
        String s=br.readLine();
        int n=Integer.parseInt(s);
        System.out.println(n);
    }
}
