import java.util.Scanner;

public class Domofon {
    public static void main(String[] args){
        System.out.println("Введите ваше имя");
        Scanner object = new Scanner(System.in);
        String userName = object.nextLine();
        System.out.println("вы ввели " + userName);
        if (userName == "Emil")                     // не понимаю почему не проходит
            System.out.println("Проходите");
            else
                System.out.println("Сорян");
        }

}
