import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array_Get_Lenght_longest {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5 ; i++){
            list.add(i, reader.readLine());  // можно и без i
            int s = 0;
            s = list.get(i).length();
            System.out.println(s);
        }  // for each
        for(String test: list){
            System.out.println(test);
        }
            // kolhoz
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

//        System.out.println(s);
    }

}
