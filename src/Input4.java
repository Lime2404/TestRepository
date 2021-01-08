import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Input4 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\temp\\1.txt")));
        String s = reader.readLine();
        System.out.println(s);
    }
}
