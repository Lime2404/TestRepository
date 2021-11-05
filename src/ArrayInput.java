import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayInput {
//    public class MainClass

        public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] list = new String[4];

            for (int i = 0; i < list.length; i++)
            {
                list[i] = reader.readLine();
            }
//            System.out.println(list[2]);
            for(String pointer:list){
                System.out.println(pointer);
            }
        }

}
