import java.util.Scanner;

public class Displayit {
    public static void main(String[] args) {
        boolean isExit = false;
        while (!isExit) {
            Scanner source = new Scanner(System.in);
            String sentence = source.nextLine();
            System.out.println(sentence);
            isExit = sentence.equals("exit");
        }
    }
}
