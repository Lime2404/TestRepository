public class Machinetime {
    int age;
    public void forward(Barbos barbos){ // здесь не говорится о том что новый обхект был создан, но что когда создастся новый объект
        barbos.age += 5;    // мы поменяли знаение объекта в области памяти java перейдя по ссылке
        System.out.println("Барбосу испольнилось " + barbos.age);
    }
     public void back(Barbos barbos){
        barbos.age -= 5; // мы  обращаемся к тому же объекту, который мы изменили выше
        System.out.println("Срочно вернуть барбоса обратно " + barbos.age);
     }
     public static void main(String[] args){
       Machinetime machinetime = new Machinetime();
        Barbos dog = new Barbos(20);
         System.out.println("нашей собачке сейчас " + dog.age);
         machinetime.forward(dog);
         System.out.println("нашей собачке сейчас " + dog.age);
         machinetime.back(dog);  // теперь мы передаем в класс back как он и ожидает новый объект, который в свою очередь ожидает int age
         System.out.println("нашей собачке сейчас " + dog.age);

     }
}
