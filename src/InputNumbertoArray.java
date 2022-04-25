import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputNumbertoArray {
    public static void main() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(Integer.parseInt(input.readLine()));
        }
        System.out.println(list);
    }
}
