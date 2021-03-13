import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CyclePlay {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(sc.readLine());
        int n = Integer.parseInt(sc.readLine());
//        int j = 8;
        for(int i = 1; i <= m; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(8);
            }
            System.out.println(8);
        }
    }
}

