public class Greetings {


        public void sayHi(String name) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }

        public static void main(String[] args) {
            Greetings jarvis = new Greetings();
            jarvis.sayHi("Тони Старк");
//            Greetings Emil = new Greetings();
//            Emil.sayHi("Эмиль Исабеков");
            jarvis.sayHi("Another");
        }
    }
