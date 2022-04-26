import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i, scan.nextInt());
        }
        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                maxCount = Math.max(maxCount, count);
//                System.out.println("Сейчас count равен " + count);
            }

            else count = 1;
//            System.out.println("Сейчас maxCount равен " + maxCount);


        }
        System.out.println(maxCount);
    }

}
