import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input2 {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
//        String name =reader.readLine();
        String age = reader.readLine();
        String name =reader.readLine();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
}
}