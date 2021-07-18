import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_int_arrays {
       public static void main(String[] args) throws Exception {
           //напишите тут ваш код
           String[] stroki = new String[10];
           int[] chisla = new int[10];
           BufferedReader strochki = new BufferedReader(new InputStreamReader(System.in));

           for (int i = 0; i < stroki.length; i++) {
//            String s = strochki.readLine();
//            s = stroki[i];
               stroki[i] = strochki.readLine();
               String s = stroki[i];
               int dlina = s.length();
//            System.out.println(dlina);
               chisla[i] = dlina;
           }

           for (int i = 0; i < chisla.length; i++) {
               System.out.println(chisla[i]);
           }
       }
}
