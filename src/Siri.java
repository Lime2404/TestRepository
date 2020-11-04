import javax.swing.*;

public class Siri {
    public void sayHi(String...names){
        for (String name: names){
            System.out.println("Я умею говорить " + name + " уже очень хорошо");
        }
    }
    public static void main(String [] args){
//        Siri Emil = new Siri();
//        Siri Jenny = new Siri();
//        Siri Leeza = new Siri();
//        Emil.sayHi("привет");
//        Jenny.sayHi("Hi");
//        Leeza.sayHi("ПриHi");

        Siri siri = new Siri();
        siri.sayHi("Примвет 1", "привет 2", "Привет3");
    }
}
