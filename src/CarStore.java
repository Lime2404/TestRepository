/*
import java.util.ArrayList;
import java.util.Collections;

public class CarStore {
public static void main(String[] args){
    try {                                   // здесь мы начинаем смотреть на код с целью убедиться что ошибок нет (утверждение)
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Жигули");
        for (String i : cars) {
            System.out.println(i);
        }
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
        cars.set(12, "Opel");
        System.out.println(cars.get(1));
        cars.clear();
        System.out.println(cars);
    } catch (Exception_test e){                          // Здесь мы вводим кусок кода, который запустится если ошибка всёё же возниктнет
        System.out.println("что-то пошло не так"); // сам код на случай ошибки
    } finally {
        System.out.println("здесь идет какой-то код");
    }
}
}
*/