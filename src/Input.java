import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("введите цифорный пароль");

        if (obj.hasNextInt()) {
            String userName = obj.nextLine();
            System.out.println("подтверждаю " + userName);

        } else
        System.out.println("вы введи буквы, попробуйте ещё раз ");

        Scanner obj1 = new Scanner(System.in);
        System.out.println("введите цифорный пароль");
        while (obj1.hasNextInt()) {
            String userName = obj1.nextLine();
            System.out.println("подтверждаю " + userName);
        }
        System.out.println("вы первысили максимальное количество попыток ");
    }
}
