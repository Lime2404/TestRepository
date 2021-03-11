import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ShortScanner {
    public static void main(String[] args) {
        boolean isExit = false;
        while (!isExit) {
            Scanner x = new Scanner(System.in);
            String word = x.nextLine();
            System.out.println(word);
            isExit = word.equals("exit");
        }
    }
}
