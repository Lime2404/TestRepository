import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("введите ваши пароль");
        String userName = obj.nextLine();
        System.out.println("подтверждаю " + userName);
    }
}
