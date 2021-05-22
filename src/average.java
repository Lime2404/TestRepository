import java.io.BufferedReader;
import java.io.InputStreamReader;

public class average {
        public static void main(String[] args) throws Exception {

            BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
            int a = 0;
            double b = 0.0;
            double c = 0.0;
            while (true) {
                int number = Integer.parseInt(input1.readLine());
                if (number != -1) {
                    a++;
                    b = b + number;
                    c = b / a;
                }
                else
                    break;
            }
            System.out.println(c);

        }

}
