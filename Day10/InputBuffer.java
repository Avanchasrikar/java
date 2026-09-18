import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class InputBuffer {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a value");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
         
        int num = Integer.parseInt(bf.readLine()); // readLine()  is a  IOException
        System.out.println(num);
        bf.close();
    }
}
