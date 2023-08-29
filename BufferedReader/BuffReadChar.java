import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReadChar {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an character value");
        char ch=(char)br.read();
        System.out.println(ch);
    }
}
