import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Min_number {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());

        int minimum1 = min(a, b, c, d, f);


        System.out.println("Minimum = " + minimum1);
    }


    public static int min(int a, int b, int c, int d, int f) {

        int min1 = Math.min(a, b);
        int min2 = Math.min(min1, c);
        int min3 = Math.min(min2, d);
        int min4 = Math.min(min3, f);
        return min4;

    }
}
