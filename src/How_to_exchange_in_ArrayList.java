import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class How_to_exchange_in_ArrayList {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainlist = new ArrayList<>();
        ArrayList<Integer> threven = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> therest = new ArrayList<>();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++){
            int x = Integer.parseInt(input.readLine());
            mainlist.add(x);
        }
        for(int i = 0; i < mainlist.size(); i++){
            int a = mainlist.get(i);
            if(a % 3 ==0)
                threven.add(a);
        }
        for (int i =0; i < mainlist.size(); i++){
            int b = mainlist.get(i);
            if (b % 2 == 0)
                even.add(b);
        }
        for(int i =0; i < mainlist.size(); i++){
            int c = mainlist.get(i);
            if(c % 2 != 0 && c % 3 !=0)
                therest.add(c);
        }
        printList(threven);
        printList(even);
        printList(therest);
    }


    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        System.out.println(list);
    }
}
