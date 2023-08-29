import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReadFloat {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an float value");
        String s=br.readLine();
        float n=Float.parseFloat(s);
        System.out.println(n);
    }
}
