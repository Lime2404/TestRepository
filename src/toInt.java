import java.io.BufferedReader;
import java.io.InputStreamReader;

public class toInt {


//    public class Solution {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String x  = reader.readLine();
//        int foo = Integer.parseInt(x);
            int foo;

            try {
                foo = Integer.parseInt(x);
            }
            catch (NumberFormatException e)
            {
                foo = 0;
            }
            int secondsAfter15 = foo * 3600;


            System.out.println("Прошло " + secondsAfter15 + " секунд");

        }
}

