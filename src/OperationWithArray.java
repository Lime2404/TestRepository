import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OperationWithArray {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int eveN = 0;
        int Neven = 0;
        for(int i = 0; i < 15; i++){
            int s = Integer.parseInt(reader.readLine());
            list.add(i, s);
            if(i%2 == 0){
                eveN += list.get(i);
            }
            if(i%2 != 0){
                Neven += list.get(i);
            }

        }
        if (eveN > Neven)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }

}
