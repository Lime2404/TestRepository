import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class FillingTime {
/*
Время для 10 тысяч вставок
*/
        public static void main(String[] args) {
            System.out.println(getInsertTimeInMs(new ArrayList()));
            System.out.println(getInsertTimeInMs(new LinkedList()));
        }

        public static long getInsertTimeInMs(List list) {
            // напишите тут ваш код
            Date beginning = new Date();

            insert10000(list);

            // напишите тут ваш код
            Date end = new Date();
            long difference = end.getTime() - beginning.getTime();
            return difference;

        }

        public static void insert10000(List list) {
            for (int i = 0; i < 10000; i++) {
                list.add(0, new Object());
            }
        }
}
