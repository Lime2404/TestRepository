import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenDuplexDigit {

        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            BufferedReader cell = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(cell.readLine());
            if (x % 2 == 0 && ((x < 10) && (x > 0)))
                System.out.printf("четное однозначное число");
            if (x % 2 != 0 && ((x < 10) && (x > 0)))
                System.out.printf("нечетное однозначное число");
            if (x % 2 != 0 && ((x > 9) && (x < 100)))
                System.out.printf("нечетное двузначное число");
            if (x % 2 == 0 && ((x > 9) && (x < 100)))
                System.out.printf("четное двузначное число");
            if (x % 2 != 0 && ((x > 99) && (x < 1000)))
                System.out.printf("нечетное трехзначное число");
            if (x % 2 == 0 && ((x > 99) && (x < 1000)))
                System.out.printf("четное трехзначное число");

        }

}
