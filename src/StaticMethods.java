import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StaticMethods {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader1.readLine();
        return sentence;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int digit = Integer.parseInt(reader2.readLine());
        return digit;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner reader3 = new Scanner(System.in);
        double fraction = reader3.nextDouble();
        return fraction;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner reader4 = new Scanner(System.in);
        boolean test = reader4.nextBoolean();
        return test;

    }

    public static void main(String[] args) throws Exception {

    }
}
