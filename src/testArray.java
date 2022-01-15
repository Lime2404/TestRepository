import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.util.ArrayList;

public class testArray {
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
//            list1.add(i, list.get(i));
            String x = list.get(i);
            list1.add(x);
        }
        System.out.println(list1);

//        ArrayList<String> list1 = new ArrayList<>();
//        for (int i = 0; i < )



    }

}
