import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Reverse_ArralyList_elements {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> words = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++){
            String x = input.readLine();
            words.add(x);
        }
        words.remove(3);
        Collections.reverse(words);
        for(String s : words)
            System.out.println(s);
    }
}
