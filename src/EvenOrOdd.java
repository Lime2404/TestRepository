import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOrOdd {

        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            BufferedReader cell = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(cell.readLine());
            if (x < 0 && x % 2 == 0)
                System.out.println("отрицательное четное число");
            if (x < 0 && x % 2 != 0)
                System.out.println("отрицательное нечетное число");
            if(x == 0)
                System.out.println("ноль");
            if (x > 0 && x % 2 == 0)
                System.out.println("положительное  четное число");
            if (x > 0 && x % 2 != 0)
                System.out.println("положительное  нечетное число");

        }

}
