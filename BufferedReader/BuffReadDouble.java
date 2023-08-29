import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReadDouble {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an double value");
        String s=br.readLine();
        double n=Double.parseDouble(s);
        System.out.println(n);
    }
}
