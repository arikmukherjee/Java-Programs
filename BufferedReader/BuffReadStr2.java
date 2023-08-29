import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReadStr2 {
    public static void main(String[] args)throws IOException {
       InputStreamReader ob=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(ob);
       System.out.println("Enter a string");
       String s = br.readLine();
       System.out.println(s); 
    }
}
