import java.util.Date;

public class CheckDate {
    public static void main(String args[]){
        Date current = new Date();
        int hours = current.getHours();
        int minutes = current.getMinutes();
        int seconds = current.getSeconds();
        System.out.print(hours + ":");
        System.out.print(minutes + ":");
        System.out.print(seconds + ":");
    }
}
